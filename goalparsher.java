public class goalparsher {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";

        StringBuilder Build = new StringBuilder();

        for(int i=0; i<command.length(); i++){

            char ch = command.charAt(i);

            if (ch == '(' && command.charAt(i +1) == ')') {
                Build.append("o");
                i = i + 1;
            }else if (ch == '(' && command.charAt(i+1) == 'a') {
                Build.append("al");
                i = i+3;
            }else{
                Build.append(ch);
            }
        }

        System.out.println(Build.toString());
    }
}
