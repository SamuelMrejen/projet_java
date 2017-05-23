/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package projet;
import java.util.Scanner;
/**
 *
 * @author bx
 */
public class motmagik {
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String listdemot[] = {"four","sirs","crin","ioda","voeu","seps","sala","faxa","cire","pane","créa","pipa","uvée","arcs","gros","émir","axez","rima","buée","aile","krak","peut","luxe","cava","fris","lois","pais","toit","vies","tuez","gère","taxé","dise","kart","laid","lacs","jasé","ragé","réée","bouc","vécu","rois","prix","bort","elle","agis","scié","joug","cula","mita","fret","joli","coda","naît","gréa","niez","visa","cita","fort","liés","riva","pies","suie","êtes","slow","levé","pile","oral","noya","olim","hâla","pair","liai","pifa","ales","repu","rasé","parc","dupe","pals","émie","jubé","luxa","tais","loba","tâte","rodé","sils","ailé","gara","holà","bloc","item","barn","bâté","elfe","ripé","ixia","grée","néné","froc","pive","gels","dore","crus","aère","duos","pain","base","hure","vamp","titi","voit","féal","soya","mois","pois","part","héla","dais","mils","raye","guru","vols","vagi","ôtés","scat","béni","thym","sels","moka","gaur","muas","jupe","bégu","cime","nuée","hâte","brie","rasa","veut","nova","nome","saxe","erré","sont","lacé","fiée","roba","eaux"};
        int random = (int)(Math.random() * (150-0)) + 0;
        String mot = listdemot[random];
        int taillemot = listdemot[random].length();
        char motenlettre[] = new char[listdemot[random].length()];
        for(int i = 0; i < taillemot; i++){
            
            motenlettre[i] = listdemot[random].charAt(i);
            
        }
        System.out.println("Voici le mot a trouver. Vous avez 10 erreurs possibles avant de perdre. \nVeuillez suggerer un mot, S'il est correct vous avez gagné.\n\n"+motenlettre[0] + " _ _ " + motenlettre[3]);
        System.out.println(mot);
        for(int e = 1; e < 11; e++){
            System.out.println("Votre suggestion ?");
            String x = sc.nextLine();
            if(mot.equals(x)){
                System.out.println("Vous avez gagné, vous etes fort.");
                e = 10;
            }else{
                System.out.println("Vous avez perdu, vous etes nul.\n Vous en etes à " + e + " essais\n\n");
            }
        }
        
    }
}
