

public class lenoflast {
    public static void main(String[] args) {
        
        String s = "Hello World";

        String[] split = s.split(" ");

        int last = split.length-1;

        System.out.println(split[last].length());
    }
}
