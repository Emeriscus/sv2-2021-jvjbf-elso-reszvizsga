package stringmanipulation;

public class StringManipulation {

    public String everyEvenCharacter(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result = result + s.charAt(i);
            }
        }
        return result;
    }
}
