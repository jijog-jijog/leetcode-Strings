

public class revstring {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        StringBuilder str = new StringBuilder();

        String[] split = s.split(" ");

        for(String a : split){
            String rev = new StringBuilder(a).reverse().toString();
            str.append(rev + " ");
        }

        System.out.println(str.toString());

    }
}
