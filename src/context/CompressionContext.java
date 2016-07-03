package context;

import strategy.Compression;

import java.io.File;

/**
 * Created by mamour on 02/07/16
 * 17:17.
 */
public class CompressionContext {
    private Compression compression;

    public void setCompression(Compression compression) {
        this.compression = compression;
    }

    public void createArchive(File file) {
        compression.compressFile(file);
    }
}

