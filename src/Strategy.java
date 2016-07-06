import context.CompressionContext;
import strategy.CompressionRar;
import strategy.CompressionZip;

import java.io.File;

/**
 * Created by mamour on 06/07/16
 * 16:39.
 */
public class Strategy {

    public static void main(String[] args) {
        CompressionContext context = new CompressionContext();
        Client client1 = new Client();
        Client client2 = new Client();
        client1.setContext(context);
        client2.setContext(context);

        File[] client1Files = client1.getFiles();
        if (client1Files != null) {
            for (File file : client1Files) {
                if ((float) file.length() / (float) (1000 * 1000) <= 3.0)
                    client1.context.setCompression(new CompressionZip());
                else
                    client1.context.setCompression(new CompressionRar());
                client1.context.createArchive(file);
            }
        }

        File[] client2Files = client2.getFiles();
        if(client2Files != null){
            for(File file : client2Files){
                if (file.getName().endsWith(".jpg"))
                    client2.context.setCompression(new CompressionZip());
                else
                    client2.context.setCompression(new CompressionRar());
                client2.context.createArchive(file);
            }
        }
    }
}
