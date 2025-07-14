public class decryptstring {
    public static void main(String[] args) {
        
        String s = "10#11#12";

         for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);

            if (ch >= 'a' && ch<= 'i') {
                
            }
            System.out.println(ch);
         }
    }
}
