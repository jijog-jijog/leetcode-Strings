public class prefix {
    public static void main(String[] args) {
               StringBuilder res = new StringBuilder("");
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return res.toString();
                }  
            }
            res.append(ch);
        }
        return res.toString();
        
    }
}
    }
}
