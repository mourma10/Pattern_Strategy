package strategy;

import java.io.File;

/**
 * Created by mamour on 02/07/16
 * 17:16.
 */
public class CompressionZip implements Compression {
    public void compressFile(File file) {
        /**
         * Code Compression ZIP
         */
        System.out.println("Compression ZIP de " + file.getName() + " terminee! ");
    }
}
