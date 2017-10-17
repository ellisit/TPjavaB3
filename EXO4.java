import java.io.*;
import java.util.*;
import java.io.File;
import java.io.IOException;



public class EXO4 {


    public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);
            File file=new File("C:\\Users\\eliot\\Desktop\\test.txt"); // définir l'arborescence
            file.createNewFile();
            FileWriter ffw=new FileWriter(file);

            System.out.println("Veuillez ecrire :");
            String str = sc.nextLine();


            while (!str.toLowerCase().equals("quit")){// on ecrit tant que quit n'est pas la derniere ligne tapée
                ffw.write(str+System.getProperty("line.separator")); // ligne par ligne
                str = sc.nextLine();
            }
            ffw.close();



    }
}
