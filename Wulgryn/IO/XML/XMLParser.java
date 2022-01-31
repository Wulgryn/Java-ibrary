package Wulgryn.IO.XML;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLParser {
    private Document doc;

    private String version;
    private String encoding;
    private String uri;
    private int type;
    private String prefix;

    private String root_name;

    private XMLNode root;

    public XMLParser(String path)
    {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            doc = builder.parse(path);
            root_name = doc.getDocumentElement().getNodeName();
            version = doc.getXmlVersion();
            encoding = doc.getXmlEncoding();
            uri = doc.getBaseURI().split("file:/")[1];
            type = doc.getNodeType();
            prefix = doc.getPrefix();

            root = new XMLNode(doc.getDocumentElement());
            root.setDom(doc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public XMLNode GetRootNode(){return root;}

    public String Version(){return version;}

    public String Encoding(){return encoding;}

    public String Path(){return uri;}

    public int Type(){return type;}

    public String Prefix(){return prefix;}

    public String RootName(){return root_name;}

    public static void Save(XMLNode rootNode,String path)
    {
        try {
            Transformer factory = TransformerFactory.newInstance().newTransformer();
            factory.setOutputProperty(OutputKeys.INDENT, "yes");
            factory.setOutputProperty(OutputKeys.METHOD, "xml");
            factory.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            factory.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            DocumentBuilderFactory factory2 = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory2.newDocumentBuilder();

            Document dom = builder.newDocument();

            dom.appendChild(CreateElement(rootNode,dom));
            dom.normalize();
            dom.getDocumentElement().normalize();
            factory.transform(new DOMSource(dom), new StreamResult(new FileOutputStream(path)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Element CreateElement(XMLNode root,Document doc)
    {
        Element e = doc.createElement(root.Name());
        root.Attributes().forEach(a -> e.setAttribute(a.Name(), a.Value()));
        if(root.Children().size() == 0)e.setTextContent(root.Content());
        root.Children().forEach(c -> e.appendChild(CreateElement(c, doc)));
        return e;
    }
}
