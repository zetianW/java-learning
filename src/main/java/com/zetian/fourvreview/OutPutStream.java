package com.zetian.fourvreview;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2020/03/01
 **/
public class OutPutStream {
    public static void main(String[] args) {
        File file = new File("E:" + File.separator + "OutPutDemoStream" + File.separator + "wangbaba");
        //判断文件目录是否存在
        if (!file.getParentFile().exists()) {
            //创建目录
            file.getParentFile().mkdirs();
            try {
                OutputStream output = new FileOutputStream(file);
                //创建文件内容
                String str = "字符流输入的简单例子";
                //将字符转换为字符数组
                byte [] all = str.getBytes();
                //打印出字符串
                output.write(all);
                //关闭字符流
                output.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
