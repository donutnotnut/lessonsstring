public class task1 {
    public static void main(String[] args) {
        String hehe = "my name is sveta";
        System.out.println(CountWords(hehe));
    }

    private static int CountWords(String hehe) {
        String[] test = hehe.split("\\s+");
        int bebe;
        bebe = test.length;
        return bebe;
    }
}
