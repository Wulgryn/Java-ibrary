package Wulgryn.Properties;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Action {
    private List<Object> c_list = new ArrayList<>();

    private Consumer<Object> cons = x -> {};

    public Action(Object variable)
    {
        c_list.add(variable);
    }

    public Action(List<Object> list)
    {
        c_list = list;
    }

    @SafeVarargs
    public Action(Object... args)
    {
        for (Object t : args) {
            c_list.add(t);
        }
    }

    public Action(Object variable,Consumer<Object> consumer)
    {
        c_list.add(variable);
        SetAction(consumer);
        Invoke();
    }

    public Action(List<Object> list,Consumer<Object> consumer)
    {
        c_list = list;
        SetAction(consumer);
        Invoke();
    }

    @SafeVarargs
    public Action(Consumer<Object> consumer,Object... args)
    {
        for (Object t : args) {
            c_list.add(t);
        }
        SetAction(consumer);
        Invoke();
    }

    public void Invoke(Consumer<Object> consumer)
    {
        for (Object t : c_list) {
            consumer.accept(t);
        }
    }

    public void Invoke()
    {
        for (Object t : c_list) {
            cons.accept(t);
        }
    }

    public void SetAction(Consumer<Object> consumer)
    {
        cons = consumer;
    }
}
