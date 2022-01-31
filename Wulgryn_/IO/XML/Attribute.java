package Wulgryn.IO.XML;

public class Attribute {
    private String name;
    private String value;

    Attribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String Name() {return name;}
    public String Value() {return value;}

    public static Attribute New(String name, String value)
    {
        return new Attribute(name, value);
    }
}
