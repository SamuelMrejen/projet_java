package projet_smcl;
import java.util.Scanner;
public class NombreMagiqueIllimite {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int lower =0;
		int higher=1000;
		int random = (int)(Math.random() * (higher-lower)) + lower;
		int compteur=0;
		int nombre=0;
		while(nombre!=random)
		{
			System.out.println("Veuillez rentrer le nombre magique");
			 nombre = sc.nextInt();
			
			if (nombre<random)
			{
				System.out.println("c'est plus");

			}
			if (nombre>random)
			{
				System.out.println("c'est moin");

			}
			if (nombre==random)
			{
				System.out.println("Bravo vous avez gagné");
			}
		compteur++;
			
		}
		System.out.println(compteur);
		
	}

}
