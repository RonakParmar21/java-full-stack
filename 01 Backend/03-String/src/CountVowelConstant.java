public class CountVowelConstant {
    public static void main(String[] args) {
        String s1 = "Ronak";
        int v = 0, c = 0;

        for(char c1 : s1.toCharArray()) {
            if("aeiou".indexOf(c1) != -1)
                v++;
            else
                c++;
        }

        System.out.println("Total Vowel is : " + v);
        System.out.println("Total Constant is : " + c);
    }
}
