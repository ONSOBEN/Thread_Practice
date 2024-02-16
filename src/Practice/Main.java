package Practice;

public class Main {
    public static void main(String[] args) {
        String text = """
                Welcome to CSTAD!
                ***************************************************
                Don't Give up this opportunity, do your best first
                ---------------------------------------------------
                Downloading.............Completed 100%.
                """;


        for (char letter : text.toCharArray()) {
            System.out.print(letter);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
