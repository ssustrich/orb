package engine.gamePlay;

import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.*;


import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException; 


public class Encounter {

		public static void test() {
			
		try {

		        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		        Document doc = docBuilder.parse (new File("xml/encounterConfig.xml"));

		        // normalize text representation
		        doc.getDocumentElement ().normalize ();
		        NodeList nodeLst = doc.getElementsByTagName("monster");
		        int totalMonsters = nodeLst.getLength();
		        System.out.println("Total no of monsters : " + totalMonsters);
				System.out.println("***");

		        for (int s = 0; s < nodeLst.getLength(); s++) {

		            Node monsterNode = nodeLst.item(s);
		            
		            if (monsterNode.getNodeType() == Node.ELEMENT_NODE) {
		          
		              Element Type = (Element) monsterNode;
		              NodeList TypeLst = Type.getElementsByTagName("type");
		              Element typeElmnt = (Element) TypeLst.item(0);
		              NodeList type = typeElmnt.getChildNodes();
		              System.out.println("type : "  + ((Node) type.item(0)).getNodeValue());

		              
		              Element Realm = (Element) monsterNode;
		              NodeList realmLst = Realm.getElementsByTagName("realm");
		              Element realmElmnt = (Element) realmLst.item(0);
		              NodeList realm = realmElmnt.getChildNodes();
		              System.out.println("realm : "  + ((Node) realm.item(0)).getNodeValue());
		              
		              System.out.println("***");

		            }//end of if clause


		        }//end of for loop with s var


		    }catch (SAXParseException err) {
		    System.out.println ("** Parsing error" + ", line " + err.getLineNumber () + ", uri " + err.getSystemId ());
		    System.out.println(" " + err.getMessage ());

		    }catch (SAXException e) {
		    Exception x = e.getException ();
		    ((x == null) ? e : x).printStackTrace ();

		    }catch (Throwable t) {
		    t.printStackTrace ();
		    }
		    //System.exit (0);
		}
	}


