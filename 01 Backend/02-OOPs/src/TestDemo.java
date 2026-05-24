public class TestDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = s1.concat(" World");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        StringBuffer sb = new StringBuffer("Ronak");
        sb.append(" Parmar");
        System.out.println(sb);
    }
}