
import java.util.Arrays;

public class revstring {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        StringBuilder str = new StringBuilder();

        String[] split = s.split(" ");

        System.out.println(Arrays.toString(split));

    }
}
