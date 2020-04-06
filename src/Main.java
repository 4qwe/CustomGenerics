import java.lang.reflect.Array;
import java.util.Collection;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        // Beispielprojekt, das eine "Generic Box" Klasse nutzt für entweder ein ArrayMaker Objekt ODER ein Nummernarray
        //specialised: die generische Klasse bietet eine Methode zum instantiieren der gespeicherten Klasse. die Wildcard T wird
        // nicht mehr im Feld der Klasse verwendet, sondern nur in dieser Methode, als Ausgabetyp und zum casten

        GenericContainer<ArrayMaker> generio = new GenericContainer(ArrayMaker.class); //ab hier hab ich ein Objekt GenCon das
        //die Variable eineKlasse beinhaltet, vom Typ ArrayMaker
        ArrayMaker objektAM = generio.erstellInstanz(); //Klasse wurde aus Variable gelesen und zum Objekt gemacht

        Collection endlichColl = objektAM.stringArray; //Methode aus Objekt wurde zum erstellen des Arrays genutzt

        for (Object stringis : endlichColl) {
            System.out.println(stringis);
        }
    }

}