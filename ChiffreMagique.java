package projet;
import java.util.Scanner;
public class ChiffreMagique {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int lower =0;
        int higher=1000;
        int random = (int)(Math.random() * (higher-lower)) + lower;
        System.out.println("Le nombre magique est compris entre " + lower + " et " + higher );
        for(int i=0; i<100;i++)
        {
            System.out.println("Entrez un nombre.");
            int nombre=sc.nextInt();
            if (nombre<random)
            {
                System.out.println("C'est plus");
            }
            if (nombre>random)
            {
                System.out.println("C'est moins");
            }
            if(nombre==random)
            {
                System.out.println("Bravo vous avez gagné en " + i + " coups.");
                break;
            }
            if (i>10) {    //Si le joueur dépasse 10 coups
                System.out.println("Vous avez épuisé tous vos coups. Perdu.");
                break;
            }
        }
    }
}
