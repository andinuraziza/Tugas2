/* Andi Nur Aziza
* 13020210284
* B1
* Kamis,23 Maret
*/

package kasusswitch;
import java.util.Scanner;
public class KasusSwitch {
    
    /**
     * @param args */
    public static void main(String[] args) {
        // TODO Auto-generated method stub 
        /* Kamus */
        char cc;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Ketikkan sebuah huruf, akhiri dengan RETURN \n"); 
        cc=masukan.next().charAt(0);
        switch(cc) {
            case 'a' ->   { System.out.print ("Yang anda ketik adalah a\n"); }
            case 'u' ->   { System.out.print ("Yang anda ketik adalah u\n"); }
            case 'e' ->   { System.out.print ("Yang anda ketik adalah e\n"); }
            case 'i' ->   { System.out.print ("Yang anda ketik adalah i\n"); }
            case 'o' ->   { System.out.print ("Yang anda ketik adalah o\n"); }
            default -> System.out.print ("Yang anda ketik adalah huruf mati\n");
        }
        
    }
    
}