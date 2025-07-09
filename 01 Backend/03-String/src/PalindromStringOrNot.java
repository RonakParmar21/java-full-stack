import javax.sound.midi.Soundbank;

public class PalindromStringOrNot {
    public static void main(String[] args) {
        String string = "madam";
        String revString = "";

        for(int i = string.length()-1;i>=0; i--) {
            revString += string.charAt(i);
        }

        System.out.println(string);
        System.out.println(revString);

        if(string.equals(revString)) {
            System.out.println(string + " is palindrom string");
        } else {
            System.out.println(string + " is not palindrom string");
        }
    }
}
