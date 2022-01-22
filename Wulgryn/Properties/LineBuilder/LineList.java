package Wulgryn.Properties.LineBuilder;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class LineList {
    List<Line> lines = new LinkedList<Line>();

    public Line get(int index) {return lines.get(index);}
    public int size() {return lines.size();}
    public Line add(Line line,int id)
    {
        Line l = new Line().SetParent(line).SetId(id + 1);
        lines.add(l);
        return l;
    }
    public Line add(Line line,int id,String text)
    {
        Line l = new Line().SetParent(line).SetId(id + 1).SetText(text);
        lines.add(l);
        return l;
    }
    public void remove(int index) {lines.remove(index);}
    public void forEach(Consumer<Line> c) {lines.forEach(c);}
}
