package com.zetian.fourvreview;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2020/02/29
 **/
public class InPutStream {
    public static void main(String[] args) {
        File file = new File("D:" + File.separator + "InPutDemoStream" + File.separator + "wangbaba.txt");
        //判断文件是否存在
        if (file.exists()) {
            try {
                //使用InputStream进行读取
                InputStream input = new FileInputStream(file);
                //换成字节数组保存数据
                byte[] zijie = new byte[60];
                //将内容保存到字符数组上
                input.read(zijie);
                //关闭输入流
                input.close();
                System.out.println(new String(zijie));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
