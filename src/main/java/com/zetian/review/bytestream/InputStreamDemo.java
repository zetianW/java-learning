package com.zetian.review.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/22
 **/
public class InputStreamDemo {
    public static void main(String[] args) {
        File file = new File("E:" + File.separator + "demo" + File.separator + "my.txt");
        //需要判断文件是否存在，假设文件存在
        if (file.exists()) {
            try {
                //使用InputStream进行读取 ，InputStream是一个抽象类，
                // 所以想要进行文件读取使用FileInputStream子类
                InputStream input = new FileInputStream(file);
                //进行数据读取
                byte[] data = new byte[15];
                //将内容保存到字节数组中
                input.read(data);
                //关闭输入流
                input.close();
                System.out.println(new String(data));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
