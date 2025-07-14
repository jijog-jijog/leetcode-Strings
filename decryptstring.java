public class decryptstring {
    public static void main(String[] args) {
        
        String s = "10#11#12";
        StringBuilder str = new StringBuilder();
         int i = s.length()-1;

         while (i >= 0) {
            char ch = s.charAt(i);
            if (ch == '#') {
                int change = Integer.parseInt(s.substring(i-2,i));

                char  value = (char)('a' + change-1);

                str.append(value);

                i = i - 3;
            }else{
                char ch2 = s.charAt(i);

                int num = (ch2) - '0';

                char val2 = (char)(num-1 + 'a');

                str.append(val2);
                i = i - 1;

            }
         }

         System.out.println(str.reverse().toString());
      
         
    }
}
