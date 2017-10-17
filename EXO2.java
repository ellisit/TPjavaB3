import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileFilter;

public class EXO2 {
    // on recupère la liste des fichiers dans le chemin "dir"
    public void myListFiles(String dir) {

        File directory = new File(dir);

        File[] files = directory.listFiles(filefilter);

        for (File f : files) {
            System.out.println(f.getName());
        }
    }

    //création de la methode filefilter
    FileFilter filefilter = new FileFilter() {

        public boolean accept(File file) {
            //si l'extension est un .txt on retourne true sinon c'est false
            if (file.getName().endsWith(".txt")) {
                return true;
            }
            return false;
        }
    };

    public static void main(String[] args) {

        EXO2 filter = new EXO2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un chemin :");
        String str = sc.nextLine();
        File repertoire = new File(str);
        filter.myListFiles(str);
    }
}