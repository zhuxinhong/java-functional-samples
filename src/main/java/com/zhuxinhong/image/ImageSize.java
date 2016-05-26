package com.zhuxinhong.image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by zhuxh on 15-10-29.
 */
public class ImageSize {

    public static BufferedImage getImageFromCdn(String imageCdnUrl) {
        URL url = null;
        InputStream is = null;
        BufferedImage img = null;

        try {
            url = new URL(imageCdnUrl);
            is = url.openStream();
            img = ImageIO.read(is);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return img;
    }

    public static void main(String[] args) {
        String url = "http://i2.hdslb.com/u_user/58b6ce99b70bd721e25c2b0d1258146b.jpg";
        BufferedImage img = getImageFromCdn(url);
        System.out.println(img.getHeight());
        System.out.println(img.getWidth());
    }
}
