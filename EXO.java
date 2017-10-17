import java.io.*;
import java.util.Scanner;

public class EXO {

    public static void main(String[] args) {

        //on recupere dans le scanner le chemin que l'on veut pour lister les fichier
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un chemin :");
        String str = sc.nextLine();
        File repertoire = new File(str);

        // creation de la liste des fichiers
        File[] files = repertoire.listFiles();

        // affichage de la liste
        for (int i = 0 ; i < files.length; i++){
            System.out.println(files[i]);
        }
    }
}



