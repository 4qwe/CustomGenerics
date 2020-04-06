
public class GenericContainer<T> {

    public Class eineKlasse;

    public GenericContainer(Class o) { //parametrisierter Konstruktor. Benutzung wird damit sein: GenCon<Classentyp> xyz = new GenCon(Klassentyp)
        this.eineKlasse = o;
    }

    public T erstellInstanz() throws IllegalAccessException, InstantiationException {
        return (T) this.eineKlasse.newInstance();
    }



}
