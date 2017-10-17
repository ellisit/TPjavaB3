import java.io.*;
import java.util.*;
import java.io.File;

public class EXO3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un chemin :");
        String str = sc.nextLine();
        File repertoire = new File(str);
        // si le repertoire existe pas
        if (!repertoire.exists()) {
            System.out.println(String.format("Directory %s does not exist", str));

        }
        else{ // si le chemin est un dossier
            if (repertoire.isDirectory()) {
                System.out.println(String.format("c'est un repertoire", str));

            } // si le chemin est un ficher
            else if (repertoire.isFile()){
                System.out.println(String.format("c'est un fichier", str));
            }
            else{
                System.out.println(String.format("Ce n'est ni un fichier ni un repertoire "));
            }
      }
    }
}
