package Wulgryn.IO.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

public class XMLNode {
    private XMLNode parent;
    private org.w3c.dom.Node node;
    private Document document;

    private String name;
    private String value;
    private int type;
    private String content;
    private Attributes attributes = new Attributes();
    NodeChildrenList children = new NodeChildrenList();

    XMLNode(Element element){this.node = element;Initialize();}
    public XMLNode(XMLNode parent,Element element){this.parent = parent;this.node = element;Initialize();}

    private void Initialize()
    {
        name = node.getNodeName();
        value = node.getNodeValue();
        type = node.getNodeType();
        content = node.getTextContent().trim();
        NamedNodeMap nl = node.getAttributes();
        for (int i = 0; i < nl.getLength(); i++)
        {
            org.w3c.dom.Node n = nl.item(i);

            if(n.getNodeType() != org.w3c.dom.Node.TEXT_NODE)
            {
                String att_name = n.getNodeName();
                String att_val = ((Element) node).getAttribute(att_name);
                attributes.Add(att_name, att_val);
            }
        }

        NodeList cn = node.getChildNodes();
        for(int i = 0; i < cn.getLength(); i++)
        {
            org.w3c.dom.Node node = cn.item(i);
            if(node.getNodeType() != org.w3c.dom.Node.TEXT_NODE)
            {
                Element child = (Element) node;
                children.add(new XMLNode(this,child));
            }
        }
    }

    public String Name() { return name; }
    public String Value() { return value; }
    public String Content() { return content; }
    public int Type() { return type; }
    public XMLNode Parent() { return parent; }
    public Attributes Attributes() { return attributes; }
    public NodeChildrenList Children() { return children; }
    public NodeChildrenList ChildrenByName(String name)
    {
        NodeChildrenList children_ = new NodeChildrenList();
        children.forEach(c -> 
        {
            if(c.name.equals(name))children_.add(c);
        });
        return children_;
    }


    void SetParent(XMLNode parent){this.parent = parent;}

    @Override
    public String toString()
    {
        String str = "";
        str += name;
        for(int i = 0; i < attributes.Count(); i++) str += " " + attributes.NameAt(i) + "=\"" + attributes.ValueAt(i) + "\"";
        if(children.size() == 0) str += " <" + content + ">";
        return str;
    }

    public String Tree()
    {
        String str = "";
        
        XMLNode p = this;
        while(p.parent != null)
        {
            str += "|  ";
            p = p.parent;
        }
        str += "<" + name;
        for(int i = 0; i < attributes.Count(); i++) str += " " + attributes.NameAt(i) + "=\"" + attributes.ValueAt(i) + "\"";
        if(children.size() == 0) str += ">" + content + "</" + name + ">";
        else str += "/>";
        for(XMLNode child : children.children)
        {
            str += "\n" + child.Tree();
        }
        return str;
    }

    public void TreeOut(){System.out.println(Tree());}

    public void Out()
    {
        System.out.println(toString());
    }

    org.w3c.dom.Node getNode(){return node;}
    void setDom(Document document){this.document = document;}
    Document getDocument(){return document;}
}
