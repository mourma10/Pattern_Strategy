/**
 * Created by mamour on 02/07/16
 * 17:13.
 */

import context.CompressionContext;

import java.io.File;
import java.util.Scanner;

class Client {
    CompressionContext context;

    void setContext(CompressionContext context) {
        this.context = context;
    }

    File[] getFiles() {
        File dirFile;
        Scanner sc = new Scanner(System.in);
        String chemin;
        System.out.print("\n Donner le chemin du dossier : ");
        chemin = sc.nextLine();
        dirFile = new File(chemin);
        return dirFile.listFiles();
    }
}
