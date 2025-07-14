

public class firstoccurence {
    public static void main(String[] args) {
        
        String hays = "jijoleetcode";
        String needle = "leetco";

        int val = -1;

        String[] split = hays.split(" ");

        for(int i =0; i <split.length; i++){
            if (split[i].contains(needle)) {
                val = hays.indexOf(needle);
            }
        }

        System.out.println(val);

    }
}
