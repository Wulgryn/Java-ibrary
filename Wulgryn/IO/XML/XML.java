package Wulgryn.IO.XML;

import java.awt.*;
import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import Wulgryn.IO.DirectoryManager;
import Wulgryn.IO.FileManager;
import Wulgryn.Properties.Common;
import Wulgryn.Properties.LineBuilder.Line;
public class XML {
    private String filename;

    public XML(String path)
    {
        filename = path;
    }
    
    public void Own()
    {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(DirectoryManager.GetFile(filename));

            doc.getDocumentElement().normalize();

            NodeList nodes = doc.getElementsByTagName("message");
            Common.Out(nodes.getLength(),"-----------------------------------");

            for (int i = 0; i < nodes.getLength(); i++)
            {
                Node node = nodes.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element element = (Element) node;

                    String from = element.getElementsByTagName("from").item(0).getTextContent();
                    String to = element.getElementsByTagName("to").item(0).getTextContent();
                    String text = element.getElementsByTagName("text").item(0).getTextContent().trim();

                    Element usr = (Element) element.getElementsByTagName("usr").item(0);
                    String Afrom = usr.getAttribute("from");
                    String Ato = usr.getAttribute("to");

                    Element message = (Element) element.getElementsByTagName("msg").item(0);
                    String msg = message.getTextContent().trim();
                    String id = message.getAttribute("id");

                    Line line = new Line();
                    line.SetText("message");

                    line
                    .AddLine(Afrom).GetParent()
                    .AddLine(Ato).GetParent()
                    .AddLine(text).GetParent()
                    .AddLine("usr")
                        .AddLine(from).GetParent()
                        .AddLine(to).GetParent(1)
                    .AddLine("msg")
                        .AddLine(id)
                            .AddLine(msg);
                    line.Out();
                }
            }


        } catch (Exception e) {e.printStackTrace();}
    }
}
