

public class ipv4 {
    public static void main(String[] args) {
        String address = "255.100.50.0";

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            int val = address.charAt(i);
            if (val == '.') {
                  builder.append("[.]");
            }else{
                 builder.append(val);
            }
        }
        System.out.println(builder);

    }
}
