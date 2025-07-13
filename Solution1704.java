public class Solution1704 {
	public static void main(String[] args) {
        String s = "book";
        char[] vowel ={'a','e','i','o','u','A','E','I','O','U'};

        int mid = s.length() / 2;
        String firstHalf = s.substring(0, mid);
        String secondHalf = s.substring(mid,s.length());
  
        // System.out.println(firstHalf);
        // System.out.println(secondHalf);

        int count = 0;
        for(int i=0; i<firstHalf.length(); i++){
            char ch = firstHalf.charAt(i);
            if (vowel[i] == ch) {
                count++;
            }
        }

        int count2 = 0;
        for(int j=0; j<secondHalf.length(); j++){
            char ch = secondHalf.charAt(j);
            if (vowel[j] == ch) {
                count2++;
            }
        }

        boolean res = false;
        if (count == count2) {
            res = true;
        }
        System.err.println(res);
   
    }

}
