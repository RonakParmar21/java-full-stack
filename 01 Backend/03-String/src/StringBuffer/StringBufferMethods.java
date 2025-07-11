package StringBuffer;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Ronak");
        stringBuffer.append("Parmar");
        System.out.println(stringBuffer);

        stringBuffer.insert(2, 123);
        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);

        stringBuffer.replace(6, 11, "hello");
        System.out.println(stringBuffer);

        StringBuffer stringBuffer1 = new StringBuffer("sdfkljsdklf lksd");
        System.out.println(stringBuffer.capacity());
    }
}
