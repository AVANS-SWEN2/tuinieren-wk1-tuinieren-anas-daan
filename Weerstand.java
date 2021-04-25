
public class Weerstand {

    int weerstand;
    
    public enum Weerstandschakelaar {
    OPEN,
    DICHT
    }

    public Weerstandschakelaar schakelaar;

    public Weerstand() {
        super();
        schakelaar = Weerstandschakelaar.OPEN;
    }

}