package ReviseSortingComparableComperator;

public class MethodOverloadingDemo {

    void show(int... x) {
        System.out.println("A");
    }

    void show(int x) {
        System.out.println("B");
    }

    public static void main(String[] args) {
        MethodOverloadingDemo methodOverloadingDemo = new MethodOverloadingDemo();
        methodOverloadingDemo.show(10);
    }
}
