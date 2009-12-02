package util;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;


public class ConfigReader {

    Document doc;
    List listData;
    
	public ConfigReader(){
		//create a list to hold the employee objects
		listData = new ArrayList();
	}

	public void parseXmlFile(String configFile){
		//get the factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {
			
			//Using factory get an instance of document builder
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			//parse using builder to get DOM representation of the XML file
			doc = db.parse(configFile);
			

		}catch(ParserConfigurationException pce) {
			pce.printStackTrace();
		}catch(SAXException se) {
			se.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}


	public void parseDocument(String elementTagName){
		//get the root element
		Element docEle = doc.getDocumentElement();
		System.out.println(docEle.toString());
		//get a nodelist of  elements
		NodeList nl = docEle.getElementsByTagName(elementTagName);
		
		if(nl != null && nl.getLength() > 0) {
			for(int i = 0 ; i < nl.getLength();i++) {

				//get the employee element
				Element el = (Element)nl.item(i);
				
			}
		}
	}
	
	public void printData(){

		System.out.println("No of Employees '" + listData.size() + "'.");

		Iterator it = listData.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
	
//		public static void test() {
//			
//		try {
//
//		        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
//		        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
//		        doc = docBuilder.parse (new File("xml/characterConfig.xml"));
//
//		        // normalize text representation
//		        doc.getDocumentElement().normalize();
//		        NodeList nodeLst = doc.getElementsByTagName("*");
//		        System.out.println("Total nodes: " + nodeLst.getLength());
//		        int totalMonsters = nodeLst.getLength();
//		        System.out.println("Total no of monsters : " + totalMonsters);
//				System.out.println("***");
//		        
//		        for (int s = 0; s < nodeLst.getLength(); s++) {
//		        
//		            Node monsterNode = nodeLst.item(s);
//		            
//		            if (monsterNode.getNodeType() == Node.ELEMENT_NODE) {
//		          
//		              Element Type = (Element) monsterNode;
//		              NodeList TypeLst = Type.getElementsByTagName("type");
//		              Element typeElmnt = (Element) TypeLst.item(0);
//		              NodeList type = typeElmnt.getChildNodes();
//		              System.out.println("type : "  + ((Node) type.item(0)).getNodeValue());
//
//		              
//		              Element Realm = (Element) monsterNode;
//		              NodeList realmLst = Realm.getElementsByTagName("realm");
//		              Element realmElmnt = (Element) realmLst.item(0);
//		              NodeList realm = realmElmnt.getChildNodes();
//		              System.out.println("realm : "  + ((Node) realm.item(0)).getNodeValue());
//		              
//		              System.out.println("***");
//
//		            }//end of if clause
//
//
//		        }//end of for loop with s var
//
//
//		    }catch (SAXParseException err) {
//		    System.out.println ("** Parsing error" + ", line " + err.getLineNumber () + ", uri " + err.getSystemId ());
//		    System.out.println(" " + err.getMessage ());
//
//		    }catch (SAXException e) {
//		    Exception x = e.getException ();
//		    ((x == null) ? e : x).printStackTrace ();
//
//		    }catch (Throwable t) {
//		    t.printStackTrace ();
//		    }
//		    //System.exit (0);
//		}
}


