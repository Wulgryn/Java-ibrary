package Wulgryn.IO;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;

public class FileManager {

    public static void Create(String path)
    {
        try
        {
            new File(path);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static void Create(String path,String txt)
    {
        try
        {
            File file = new File(path);
            FileWriter fw = new FileWriter(file);
            fw.write(txt);
            fw.flush();
            fw.close();
        }
        catch(Exception ex)
        {
            
        }
    }

    public static void Delete(String path)
    {
        try
        {
            Files.delete(Path.of(path));
        }
        catch(Exception ex)
        {
            
        }
    }

    public static String ReadString(String path)
    {
        try {
            return Files.readString(Path.of(path));
        } catch (Exception e) {
            
        }
        return "";
    }

    public static byte[] ReadBytes(String path)
    {
        try {
            return Files.readAllBytes(Path.of(path));
        } catch (Exception e) {
            
        }
        return null;
    }

    public static List<String> ReadAllLines(String path)
    {
        try {
            return Files.readAllLines(Path.of(path));
        } catch (Exception e) {
            
        }
        return null;
    }

    public static void WriteString(String path,String txt)
    {
        try {
            FileWriter fw = new FileWriter(path);
            fw.write(txt);
            fw.flush();
            fw.close(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void WriteBytes(String path,byte[] bytes)
    {
        try {
            Files.write(Path.of(path), bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void SaveImage(String path,BufferedImage image)
    {
        try {
            File file = new File(path);
            String[] str = path.split("\\.");
            String extension = str[str.length - 1];
            ImageIO.write(image, extension, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static BufferedImage LoadImage(String path) {
        try {
            return ImageIO.read(new File(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static BufferedImage ToImage(File file)
    {
        try {
            return ImageIO.read(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static BufferedImage[] ToImages(File[] files) {
        try {
            BufferedImage[] bi = new BufferedImage[files.length];
            for(int i = 0; i < files.length; i++)
            {
                bi[i] = ImageIO.read(files[i]);
            }
            return bi;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
