public class ParameterizedConstructor {

    String name;
    int duration;

    ParameterizedConstructor(String name, int duration) {
        System.out.println(name);
        this.name = name;
        this.duration = duration;
        //System.out.println("Parameterized Constructor called...");
    }

    public static void main(String[] args) {
        ParameterizedConstructor parameterizedConstructor1 =
                new ParameterizedConstructor("Java", 4);
        ParameterizedConstructor parameterizedConstructor2 =
                new ParameterizedConstructor("DSA", 3);
        ParameterizedConstructor parameterizedConstructor3 =
                new ParameterizedConstructor("Devops", 5);

        System.out.println(parameterizedConstructor1.name);
        System.out.println(parameterizedConstructor1.duration);
        System.out.println(parameterizedConstructor2.name);
        System.out.println(parameterizedConstructor2.duration);
        System.out.println(parameterizedConstructor3.name);
        System.out.println(parameterizedConstructor3.duration);
    }
}
