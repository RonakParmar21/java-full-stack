package OptionalClass.EngineeringDigest;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> name = getName(1);
        if(name.isPresent())
            System.out.println(name.get());

        name.ifPresent(System.out::println);

    }

    private static Optional<String> getName(int id) {
        // get from db
        String name = null;

        return Optional.ofNullable(name);
    }
}
