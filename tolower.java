public class tolower {
    public static void main(String[] args) {
        String s = "LovEly";
        String result ="";

        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                
                ch = (char)(ch + 32);
            }
            
             result = result + ch;
        }

        System.out.println(result);
    }
}
