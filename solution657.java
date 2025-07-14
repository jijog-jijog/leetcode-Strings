public class solution657 {
    public static void main(String[] args) {
        
        String moves = "LLRLUDRLLL";

        int x=0, y=0;

        for(char a : moves.toCharArray()){
            
            if (a == 'U') {
                x++;
            }else if (a == 'D') {
                x--;
            }else if (a == 'L') {
                y--;
            }else if (a == 'R') {
                y++;
            }
        }

        boolean ans = false;
        if (x==0 && y== 0) {
            ans = true;
        }

        System.out.println(ans);
    }
}
