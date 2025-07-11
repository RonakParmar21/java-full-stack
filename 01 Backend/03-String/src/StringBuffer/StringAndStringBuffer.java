package StringBuffer;

public class StringAndStringBuffer {
    public static void main(String[] args) {
        // String
        String string1 = "hello";
        String string2 = string1.concat("world");
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string1 == string2);

        // String Buffer
        StringBuffer stringBuffer = new StringBuffer("ronak");
        stringBuffer.append("parmar");
        System.out.println(stringBuffer);
    }
}
