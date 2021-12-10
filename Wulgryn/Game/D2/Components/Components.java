package Wulgryn.Game.D2.Components;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class Components {
    private ArrayList<Object> components = new ArrayList<>();

    public void Add(Class<?> component_class)
    {
        try {
            Constructor<?> co = component_class.getDeclaredConstructor();
            co.setAccessible(true);
            Object c = co.newInstance();
            if(components.contains(c)) 
            {
                components.set(components.indexOf(c),c);
                return;
            }
            components.add(c);
        } catch (Exception e) {}
    }

    public <T> Object Get(Class<? extends T> component_class)
    {
        for (Object o : components)
        {
            if(o.getClass() == component_class) return o;
        }
        return null;
    }

    public <T> void Remove(Object constructor)
    {
        components.remove(constructor);
    }
}
