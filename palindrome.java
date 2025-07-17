
import javax.swing.text.AsyncBoxView;



public class palindrome {
    public static void main(String[] args) {
        
        String str = "A man, a plan, a cnal: Panama";


        String rep = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i = 0;


        int j = rep.length()-1;


        boolean ans = true;

        while (i < j) {

            if (rep.charAt(i) == rep.charAt(j)) {

                i++;

                j--;

            }else{

                ans = false;

                break;
          }
        }
        System.out.println(ans);

        AsyncBoxView

    }
}
