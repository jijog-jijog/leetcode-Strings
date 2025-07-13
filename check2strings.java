public class check2strings {
    public static void main(String[] args) {
        
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a","c"};

        String add = "";
        for(String a : word1){
            add = add + a;
        }

        String add2 = "";
        for(String b : word2){
            add2 = add2 + b;
        }

        boolean res = false;
        if (add.equals(add2)) {
           res = true;
        }

        System.out.println(res);
    }
}
