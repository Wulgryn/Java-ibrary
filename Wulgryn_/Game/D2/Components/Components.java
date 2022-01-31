package Wulgryn.Game.D2.Components;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

import Wulgryn.Game.D2.GameObjects.GameObject;

public class Components {
    private ArrayList<Object> components = new ArrayList<>();

    GameObject go_;
    public Components(GameObject go){go_ = go;}

    public void Add(Class<?> component_class)
    {
        try {
            Constructor<?> co = component_class.getDeclaredConstructor(GameObject.class);
            co.setAccessible(true);
            Object c = co.newInstance(go_);
            if(components.contains(c)) 
            {
                components.set(components.indexOf(c),c);
                return;
            }
            components.add(c);
        } catch (Exception e) {e.printStackTrace();}
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
