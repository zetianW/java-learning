package com.zetian.review.bytestream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/21
 **/
public class OutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("E:"+File.separator+"demo"+File.separator+"testdemo");
        //文件目录不存在
        if(!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();   //创建目录
            try{
                OutputStream output = new FileOutputStream(file);
                //进行文件内容输出
                String str ="输出流的例子";
                //将字符串变为字节数组
                byte[] data  = str.getBytes();
                //将内容输出
                output.write(data);
                //资源的最后一定要进行关闭
                output.close();

            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
