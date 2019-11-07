package test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Random {
    public static void main(String[] args) throws IOException {
            /*String filename=(int) (1 + Math.random() * 10000)+".jpg";
            System.out.println(filename);
            String realPath="D:\\programme\\java\\project\\web\\photo";
            File fileupload=new File(realPath);
            if (fileupload.exists()){
                File saveFile=new File(realPath,filename);
                RandomAccessFile randomAccessFile=new RandomAccessFile(saveFile,"rw");
            }
            if (!fileupload.exists()){
                fileupload.mkdir();
            }
            File saveFile=new File(realPath,filename);
            RandomAccessFile randomAccessFile=new RandomAccessFile(saveFile,"rw");

        //关闭输入，输出流，删除临时文件
        randomAccessFile.close();*/


        String realPath = "D:\\programme\\java\\project\\web\\photo";
        File file = new File(realPath);
        int id = (int) (1 + Math.random() * 10000);
        //String filename=getServletContext().getAttribute("id")+".jpg";
        String filename = id + ".jpg";
        System.out.println(filename);
        if (file.isDirectory()) {
            File[] files = file.listFiles();//获取此目录下的文件列表
            for (File fileFrom : files) {
                String fileName = fileFrom.getName();//得到单个文件名
                if (fileName.equals("photo4.jpg")) {
                    fileFrom.renameTo(new File(realPath,filename));
                }

            }
        }
    }
}





