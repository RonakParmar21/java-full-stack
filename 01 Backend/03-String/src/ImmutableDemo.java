public class ImmutableDemo {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = s1.concat(" Full Stack.");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}
