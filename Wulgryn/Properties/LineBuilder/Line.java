package Wulgryn.Properties.LineBuilder;

public class Line {
    public String text = "";
    private Line parent;
    private int line_id = 0;

    LineList children_list = new LineList();

    public LineList GetChildrenLines() {return children_list;}

    public Line SetText(String text)
    {
        this.text = text;
        return this;
    }

    public Line AddLine()
    {
        return children_list.add(this,line_id);
    }

    public Line AddLine(String text)
    {
        return children_list.add(this,line_id,text);
    }

    public Line RemoveLine(int index)
    {
        children_list.remove(index);
        return this;
    }

    public Line GetChild(int index)
    {
        return children_list.get(index);
    }
    private String txt;
    private String tabs;
    public String GetText()
    {
        tabs = "";
        for(int i = 0; i < line_id; i++) tabs += "|  ";
        txt = tabs + text + (children_list.size() > 0 ? " =>" : "");
        children_list.forEach(l -> 
        {
            txt += "\n" + l.GetText();
        });
        return txt;
    }

    public Line GetParent()
    {
        return parent;
    }

    public Line GetParent(int number)
    {
        Line p = parent;

        for(int i = 0; i < number; ++i)
        {
            if(p.GetParent() == null) return p;
            p = p.GetParent();
        }
        return p;
    }

    public Line Out()
    {
        System.out.println(GetText());
        return this;
    }

    Line SetParent(Line line){parent = line; return this;}
    Line SetId(int id){line_id = id; return this;}
}
