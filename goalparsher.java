public class goalparsher {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";

        StringBuilder Build = new StringBuilder();

        for(int i=0; i<command.length(); i++){

            char ch = command.charAt(i);

            if (ch == "(al)") {
                Build.append("al");
            }else if (ch == "()") {
                Build.append("o");
            }else{
                Build.append(ch);
            }
        }
    }
}
