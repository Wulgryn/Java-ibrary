package Wulgryn.IO.AudioVideo;

import Wulgryn.IO.FileManager;

public class Video {

    public Video()
    {
        byte [] byteArr = FileManager.ReadBytes("1.mp4");
        System.out.println(byteArr.length);
    }
    
}
