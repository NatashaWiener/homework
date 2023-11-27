package homework33;

public class Main02 {
    public static char[] englishAlphabet() {
        char[] alphaBet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphaBet[i] = (char) ('a' + i);

        }
        return alphaBet;
    }

    public static void main(String[] args) {
       englishAlphabet();


    }
}
