package StopgninnipSMysdroW;

public class SpinWords {

    public String spinWords(String sentence) {
        String[] egg = sentence.split("\\s");
        for (int i = 0; i!=egg.length; i++){
            if (egg[i].length() >= 5){
                egg[i] = new StringBuilder(egg[i]).reverse().toString();
            }
        }

        return String.join(" ", egg);
    }

    public static void main(String[] args) {
        SpinWords spin = new SpinWords();
        System.out.println(spin.spinWords("This is another test"));

    }
}
