/**
 * Created by mamour on 02/07/16
 * 17:16.
 */

package strategy;

import java.io.File;

public class CompressionRar implements Compression {
    public void compressFile(File file) {
        /**
         * Code Compression RAR
         */
        System.out.println("Compression RAR de " + file.getName() + " terminee! ");
    }
}
