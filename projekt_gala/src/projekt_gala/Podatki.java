package projekt_gala;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

class Podatki {

	public static void beri() {
 
	  try {
 
		File fXmlFile;
                fXmlFile = new File("src/projekt_gala/podatki.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
 
		System.out.println("Podatki o maksimalnem letnem pretoku :" + doc.getDocumentElement().getNodeName());
		NodeList nList = doc.getElementsByTagName("podatki");
		System.out.println("-----------------------");
 
		for (int temp = 0; temp < nList.getLength(); temp++) {
 
		   Node nNode = nList.item(temp);
		   if (nNode.getNodeType() == Node.ELEMENT_NODE) {
 
		      Element eElement = (Element) nNode;
 
		      System.out.println("Leto : " + getTagValue("leto", eElement));
		      System.out.println("Maksimalni letni pretok : " + getTagValue("maxpretok", eElement));
		   }
		}
	  } catch (Exception e) {
		e.printStackTrace();
	  }
  }
 
  private static String getTagValue(String sTag, Element eElement) {
	NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
 
        Node nValue = (Node) nlList.item(0);
 
	return nValue.getNodeValue();
  }
 
}