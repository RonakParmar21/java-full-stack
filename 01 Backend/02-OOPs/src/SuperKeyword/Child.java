package SuperKeyword;

import javax.swing.*;
import java.util.Locale;

class Parent {
    String name;
    void details() {
        System.out.println("Name : " + name.toUpperCase());
    }
}
public class Child extends Parent {
    String name;

    void details() {
        super.name = "Parent";
        name = "child";
        System.out.println(super.name + " and " + name);
        super.details();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.details();
    }
}
