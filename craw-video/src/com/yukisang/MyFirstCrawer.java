package com.yukisang;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @Auther: XinPingQiu
 * @Date: 2018/11/29
 */
public class MyFirstCrawer {

    public static void main(String[] args) {
        try {
            String fileName = System.currentTimeMillis() + ".mp4";
            File file = new File("D:\\" + fileName);
            // 构造URL
            URL url = new URL("http://m.tlp66.pw/video/AV/%E6%97%A5%E6%9C%AC%E6%97%A0%E7%A0%81/%E6%95%B4%E7%89%87/20180918_1000kb/042112_322%E3%83%92%E3%83%A1%E3%82%B3%E3%83%AC%E9%AB%98%E7%B4%9A%E3%82%BD%E3%83%BC%E3%83%97%E3%81%B8%E3%82%88%E3%81%86%E3%81%93%E3%81%9D19/042112_322%E3%83%92%E3%83%A1%E3%82%B3%E3%83%AC%E9%AB%98%E7%B4%9A%E3%82%BD%E3%83%BC%E3%83%97%E3%81%B8%E3%82%88%E3%81%86%E3%81%93%E3%81%9D19.mp4?nimblesessionid=38772");
            // 打开连接
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setConnectTimeout(1000 * 60);
            con.setReadTimeout(1000 * 60 * 60);
            con.connect();
            // 输入流
            InputStream is = con.getInputStream();
            // 1K的数据缓冲
            byte[] bs = new byte[1024];
            // 读取到的数据长度
            int len;
            // 输出的文件流

            File file2 = new File(file.getParent());
            file2.mkdirs();
            if (file.isDirectory()) {

            } else {
                file.createNewFile();//创建文件
            }
            OutputStream os = new FileOutputStream(file);
            // 开始读取
            while ((len = is.read(bs)) != -1) {
                os.write(bs, 0, len);
            }
            // 完毕，关闭所有链接
            os.flush();
            os.close();
            is.close();
            System.out.println("下载完成");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("下载失败");
        }

    }

}