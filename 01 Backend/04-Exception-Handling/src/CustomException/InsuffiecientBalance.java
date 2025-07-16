package CustomException;

public class InsuffiecientBalance extends Exception {
    public InsuffiecientBalance(String msg) {
        super(msg);
    }
}
