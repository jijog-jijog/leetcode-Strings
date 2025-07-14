public class longpressed925 {
    public static void main(String[] args) {
        
        String name = "saeed";
        String typed = "saaaeedd";

        boolean ans = false;
        int i =0; int j=0;

        while(j < typed.length()){
            char ch1 = i< name.length() ?name.charAt(i) : '#';
            char ch2 =  typed.charAt(j);

            if (ch1==ch2) {
                i++;
                j++;
            }else if (j>0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            }else{
                ans = false;
                break;
            }
        }
        if (i == name.length()) {
            ans = true;
        }
        System.out.println(ans);
    }
}
