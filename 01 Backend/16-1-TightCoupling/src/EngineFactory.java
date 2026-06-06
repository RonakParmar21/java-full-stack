public class EngineFactory {
    public static Engine getEngine(String type) {
        if(type.equalsIgnoreCase("Diesel")) {
            return new DieselEngine();
        } else if(type.equalsIgnoreCase("Petrol")) {
            return new PetrolEngine();
        }
        else {
//            return throw new IllegalAccessException("Invalid Engine Type");
            throw new IllegalArgumentException("Invalid engine type");
        }
    };
}
