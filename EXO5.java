import java.io.*;
import java.nio.*;
import java.nio.channels.*;


public class EXO5 {


    public static void main (String[] args)throws Exception
    {
        String in_File="C:\\Users\\eliot\\Desktop\\test.txt";
        String out_File="C:\\Users\\eliot\\Desktop\\test2.txt";

        copier(in_File,out_File);
    }
    private static void copier(String fichier_source, String fichier_dest)throws IOException
    {
        FileInputStream src = new FileInputStream(fichier_source);// on cree un input du fichier source
        FileOutputStream dest = new FileOutputStream(fichier_dest);// on cree un output du fichier cible
        // on cree des channels pour le buffer
        FileChannel inChannel = src.getChannel();
        FileChannel outChannel = dest.getChannel();
            // grace au channel on copie les données du fichier source pour les mettre dans le ficher cible
        for (ByteBuffer buffer = ByteBuffer.allocate(1024*1024);
             inChannel.read(buffer) != -1;//buffer non nul
             buffer.clear()) {
            buffer.flip();
            while (buffer.hasRemaining()) outChannel.write(buffer);
        }

        inChannel.close();
        outChannel.close();
    }
}