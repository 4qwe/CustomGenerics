import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMaker {

    public ArrayList stringArray;

    public ArrayMaker() {
        stringArray = createAL(promptWieviele());
    }

    public int promptWieviele() {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Wieviele Elemente bekommt die ArrayList?");
        return scanObj.nextInt();
    }

    public ArrayList<String> createAL(int i) {
        ArrayList<String> lisi = new ArrayList<>();
        while (i > 0) {
            lisi.add("a String");
            i--;
        }
        return lisi;
    }

    public ArrayList get() {
        return stringArray;
    }
}
