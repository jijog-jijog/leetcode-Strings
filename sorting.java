

public class sorting {
    public static void main(String[] args) {
        
        String s = s = "is2 sentence4 This1 a3";

        String[] split = s.split(" ");
        String[] res = new String[split.length];

        for(String a : split){
            int len = a.length();
            int pos = a.charAt(len - 1) - '0';

            res[pos-1] = a.substring(0,len-1);
        }
        // System.out.println(String.join(" ", res));
        // System.out.println(new String(res));
    }
}
