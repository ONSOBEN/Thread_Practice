package Practice;

public class Main {
    public static void main(String[] args) {
        String text = """
                Welcome to CSTAD!
                ***************************************************
                Don't Give up this opportunity, do your best first
                ---------------------------------------------------
                Downloading.............
                """ ;

        int i=0;
        for (char letter : text.toCharArray()) {

            System.out.print(letter);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i==text.length()-2){
                System.out.print("Completed 100%.");
            }
            i++;
        }


    }
}
