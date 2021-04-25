
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

    public setWeerstand() {

        if (regen == 0) {
            weerstand = System.out.println("Het regent niet");
        }
        else if (regen == 1) {
            weerstand = System.out.println("Het regent");
        }
        else if (daglicht == 0) {
            weerstand = System.out.println("Het is donker buiten");
        }
        else if (daglicht == 1) {
            weerstand = System.out.println("Het is licht buiten");
        }


    }

    public getWeerstand() {
        return weerstand;
    }
}