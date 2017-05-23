package projet;
import java.util.Scanner;
public class ChiffreMagique {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int lower =0;
	int higher=1000;
	int random = (int)(Math.random() * (higher-lower)) + lower;
 for(int i=0; i<10;i++)
 {
	 System.out.println("Veuillez rentrer le nombre magique.\nIl est compris entre " + lower + " et " + higher );
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
		 System.out.println("Bravo vous avez gagné.");
		 break;
	 }
 }
	System.out.println("Vous avez épuisé tous vos coups. Perdu.");
	
	}

}
