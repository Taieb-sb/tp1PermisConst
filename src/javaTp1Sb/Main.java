package javaTp1Sb;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir le nom de l'architecte : \n");
        String nom = sc.nextLine();

        System.out.println("saisir sa prenom : \n");
        String prenom = sc.next();

        System.out.println("Quelle est la civilité : \n");
        String civilite = sc.next();

        System.out.println("saisir le mail : \n");
        String mail = sc.next();

        System.out.println("quel est le conseil reg : \n");
        String conseilRegional = sc.next();

        System.out.println("inscit à l'ordre (saisir true ou false) : \n");
        boolean inscriptionOrdre = sc.nextBoolean();

        System.out.println("quelle est la rue : \n");
        String rue = sc.next();

        System.out.println("Quelle est la ville de l'architecte : \n");
        String ville = sc.next();

        System.out.println("quelle est le code postale de l'architecte : \n");
        String cP = sc.next();

        System.out.println("Enfin saisir son num de tel : ");
        String telephone = sc.next();


        Adresse adresse = new Adresse(rue, ville, cP);
        Architecte architecte = new Architecte(nom, prenom, civilite, mail, conseilRegional, inscriptionOrdre, adresse, telephone);
        System.out.println(architecte);
    }
}