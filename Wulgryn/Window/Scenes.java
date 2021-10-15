package Wulgryn.Window;

import java.lang.reflect.Method;
import java.util.ArrayList;

import Wulgryn.Properties.Application;

public class Scenes {
    static int sceneID = 0;
    static ArrayList<Class<?>> scenes = new ArrayList<>();
    static Class<?> loadedScene;

    public static void Add(Class<?> classname)
    {
        scenes.add(classname);
        loadedScene = scenes.get(0);
    }

    public static void LoadNext()
    {
        sceneID++;
        loadedScene = scenes.get(sceneID);
        LoadSetup();
        LoadStart();
    }

    public static void LoadePrevious()
    {
        sceneID--;
        if(sceneID < 0) sceneID = 0;
        loadedScene = scenes.get(sceneID);
        LoadSetup();
        LoadStart();
    }

    public static void LoadScene(int ID)
    {
        sceneID = ID;
        if(sceneID < 0) sceneID = 0;
        if(sceneID > scenes.size()) sceneID = scenes.size() - 1;
        loadedScene = scenes.get(sceneID);
        LoadSetup();
        LoadStart();
    }

    public static void LoadFirst()
    {
        sceneID = 0;
        loadedScene = scenes.get(sceneID);
        LoadSetup();
        LoadStart();
    }

    public static void LoadLast()
    {
        sceneID = scenes.size() - 1;
        loadedScene = scenes.get(sceneID);
        LoadSetup();
        LoadStart();
    }

    private static void LoadSetup()
    {
        Method m = null;
        int i = 0;
        while(m == null)
        {
            if(i > 5) break;
            try {
                m = loadedScene.getMethod("Setup");
            } catch (Exception e) {}
            i++;
        }
        try {
            if(m == null) return;
            m.invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Application.ClearUnusedRam();
    }

    private static void LoadStart()
    {
        Method m = null;
        int i = 0;
        while(m == null)
        {
            if(i > 5) break;
            try {
                m = loadedScene.getMethod("Start");
            } catch (Exception e) {}
            i++;
        }
        try {
            if(m == null) return;
            m.invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Application.ClearUnusedRam();
    }

    public static void UpdateScene()
    {
        Method m = null;
        try {
            m = loadedScene.getMethod("Update");
        } catch (Exception e) {}
        try {
            
            if(m == null) return;
            m.invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void LateUpdateScene()
    {
        Method m = null;
        try {
            m = loadedScene.getMethod("LateUpdate");
        } catch (Exception e) {}
        try {
            
            if(m == null) return;
            m.invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
