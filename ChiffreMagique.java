package projet_smcl;
import java.util.Scanner;
public class ChiffreMagique {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int lower =0;
	int higher=1000;
	int random = (int)(Math.random() * (higher-lower)) + lower;
 for(int i=0; i<10;i++)
 {
	 System.out.println("Veuillez rentrer le nombre magique");
	 int nombre=sc.nextInt();
	 if (nombre<random)
	 {
		 System.out.println("c'est plus");
	 }
	 if (nombre>random)
	 {
		 System.out.println("c'est moin");
	 }
	 if(nombre==random)
	 {
		 System.out.println("Bravo vous avez trouver le nombre magique");
		 break;
		 
	 }
 }

	
	
	}

}
