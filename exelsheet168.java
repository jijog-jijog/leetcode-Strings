public class exelsheet168 {
    public static void main(String[] args) {
        
        int colno = 701;

        StringBuilder build = new StringBuilder();

        while (colno > 0) {
            colno--;
            int div = colno % 26;
            char ap = (char)(div + 'a');
            build.append(ap);
            colno = colno / 26;
        }

        System.out.println(build.reverse().toString());
    }
}
