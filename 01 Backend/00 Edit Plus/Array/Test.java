public class Test {
    public static void main(String[] args) {
        int a= 5;
        if(a++ == 5 && ++a == 7) {
            System.out.println("Value of a is : " + a);
        } else {
            System.out.println(++a);
        }
    }
}