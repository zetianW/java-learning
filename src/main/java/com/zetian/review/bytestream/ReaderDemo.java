package com.zetian.review.bytestream;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/**
 * Description
 *   使用Reader读取数据   (跟字节输入流机构相同，只是数据类型由byte变成了char)
 * @author Zetian Wang
 * @date 2019/11/23
 **/
public class ReaderDemo {
    public static void main(String[] args) {
        File file = new File("E:" + File.separator + "demo" + File.separator + "my.txt");
        try {
            if (file.exists()) {
                Reader in = new FileReader(file);
                //进行数据读取
                char[] data = new char[1024];
                int len = in.read(data);
                //关闭输入流
                in.close();
                System.out.println(new String(data, 0, len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
