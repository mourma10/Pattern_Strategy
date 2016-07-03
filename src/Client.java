/**
 * Created by mamour on 02/07/16
 * 17:13.
 */

import context.CompressionContext;
import strategy.CompressionRar;
import strategy.CompressionZip;

import java.io.File;

public class Client {
    public static void main(String[] args) {
        CompressionContext context = new CompressionContext();
        File dirFile = new File("/home/mamour/Pictures");
        File[] files = dirFile.listFiles();
        if (files != null) {
            for (File file : files) {
                if ((float) file.length() / (float) (1000 * 1000) <= 3.0)
                    context.setCompression(new CompressionZip());
                else
                    context.setCompression(new CompressionRar());
                context.createArchive(file);
            }
        }
    }
}
