package DisemvowelTrolls;

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeoiuAEIOU]", "");
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("\"No offense but,\\nYour writing is among the worst I've ever read\""));
    }
}
