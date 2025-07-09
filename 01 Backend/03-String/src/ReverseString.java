public class ReverseString {
    public static void main(String[] args) {
        String s = "Ronak";
        for(int i=0;i<s.length(); i++) {
            System.out.print(s.charAt(i));
        }

        System.out.println();

        for(int i=s.length()-1;i>=0;i--) {
            System.out.print(s.charAt(i));
        }

        // store reverse string in variable
        System.out.println();
        String revString = "";
        for(int i=s.length()-1;i>=0;i--) {
            revString += s.charAt(i);
        }
        System.out.println(revString);
    }
}
