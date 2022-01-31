package Wulgryn.IO.XML;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Attributes {
    private List<Attribute> attributes = new ArrayList<Attribute>();

    Attributes(){}

    void Add(String name, String value)
    {
        attributes.add(new Attribute(name, value));
    }

    public void Add(Attribute attribute)
    {
        attributes.add(attribute);
    }

    public Attribute Get(int index)
    {
        return attributes.get(index);
    }

    public String ValueOf(String name)
    {
        for(int i = 0; i < attributes.size(); i++)
        {
            if(attributes.get(i).Name().equals(name)) return attributes.get(i).Value();
        }
        return null;
    }

    public String ValueAt(int index)
    {
        return attributes.get(index).Value();
    }

    public List<String> Values()
    {
        List<String> vals = new ArrayList<>();
        attributes.forEach(a ->
        {
            vals.add(a.Value());
        });
        return vals;
    }

    public int Count()
    {
        return attributes.size();
    }

    public String NameAt(int index)
    {
        return attributes.get(index).Name();
    }

    public List<String> Names()
    {
        List<String> names = new ArrayList<>();
        attributes.forEach(a ->
        {
            names.add(a.Name());
        });
        return names;
    }

    public void forEach(Consumer<Attribute> action)
    {
        attributes.forEach(action);
    }
}
