
public class Main {

    public static void main(String[] args) {
        // Beispielprojekt, das eine "Generic Box" Klasse nutzt für entweder ein ArrayMaker Objekt ODER ein Nummernarray

        //die Objekte fürs spätere assigne
        ArrayMaker arrio = new ArrayMaker();
        NumbersMaker numberio = new NumbersMaker();

        //ich spezifiziere die GenericBox als für eine der beiden Objekt-Klassen geeignet
        GenericContainer<ArrayMaker> generio = new GenericContainer<>();


        //ich stelle fest, nur ArrayMaker-Objekte werden beim beschreiben des GenericContainers akzeptiert
        generio.t = arrio;

        //ich habe einen generic Container, von dem ich sicher sein kann, was er enthält
    }

}