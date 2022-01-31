package Wulgryn.IO.XML;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class NodeChildrenList {
    List<XMLNode> children = new ArrayList<XMLNode>();

    NodeChildrenList() {}
    public void add(XMLNode child) {
        children.add(child);
    }
    public XMLNode get(int index) {return children.get(index);}
    public int size() {return children.size();}
    public void forEach(Consumer<XMLNode> consumer) {children.forEach(consumer);}
}
