package ReviseWrapperClasses;

public class Demo {
    public static void main(String[] args) {
//        Integer i = new Integer(10); // it is deprecated since java 9
        Integer i = Integer.valueOf(20); // it is static type because used with class name and wrapper object
        Integer i2 = Integer.valueOf("123");
        System.out.println(i);
        System.out.println(i2);

        int obj1 = Integer.parseInt("1234");
        boolean aTrue = Boolean.parseBoolean("true");

        System.out.println(obj1);
        System.out.println(aTrue);

        Double d = 9.88;
        int i3 = d.intValue();
        System.out.println(i3);

        Integer k = 66;
        System.out.println(k.toString());

        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
