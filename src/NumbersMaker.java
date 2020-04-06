import java.util.Scanner;

public class NumbersMaker {

    public int[] einArray;

    public NumbersMaker() {
        einArray = bauArray(promptWieviel());
    }

    public int promptWieviel() {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Wieviele Elemente bekommt das Stringarray?");
        return scanObj.nextInt();
    }

    public int[] bauArray(int soviel) {
        int[] bubu = new int[soviel];
        for (int i = 0; i < soviel; ++i) {
            bubu[i] = (int) (Math.random() * 100 + 1);
        }
        return bubu;
    }

    public int[] get() {
        return einArray;
    }
}

