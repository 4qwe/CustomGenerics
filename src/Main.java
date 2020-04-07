import java.util.Collection;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        // Beispielprojekt, das eine "Generic Box" Klasse nutzt für entweder ein ArrayMaker Objekt ODER ein Nummernarray
        //specialised: die generische Klasse bietet eine Methode zum instantiieren der gespeicherten Klasse. die Wildcard T wird
        // nicht mehr im Feld der Klasse verwendet, sondern nur in dieser Methode, als Ausgabetyp und zum casten

        GenericContainer<ArrayMaker> generio = new GenericContainer(ArrayMaker.class); //ab hier hab ich ein Objekt GenCon das
        //die Variable für eine Klasse beinhaltet, vom Typ ArrayMaker <-- ab hier steht die Entscheidung für ArrayMaker

        ArrayMaker objektArray = generio.erstellInstanz(); //Klasse wurde aus Variable gelesen und zum Objekt gemacht
        //Methode aus Objekt wurde zum erstellen des Arrays genutzt

        GenericContainer<NumbersMaker> generioNum = new GenericContainer(NumbersMaker.class);

        NumbersMaker objektNumArray = generioNum.erstellInstanz();

        Collection arrColl = objektArray.einArray;

        System.out.println("Elemente der Arraylist:\n");
        for (Object stringis : arrColl) {
            System.out.println(stringis);
        }

        System.out.println("Elemente des Stringarrays:\n");
        for (int xy : objektNumArray.einArray) {
            System.out.println(xy);
        }
    }

}