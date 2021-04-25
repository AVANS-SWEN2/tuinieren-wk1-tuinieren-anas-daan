public class TuinDomotica {
    private Boolean daglicht;
    private Boolean regen;
    private Schakelaar slimmeschakelaar;
    private int tijdstip;
    
    tijdstip = 21;

    public TuinDomotica() {
        super();
        slimmeschakelaar = Schakelaar.AUTOMATISCH;
        
    }
    
    public Aansturing() {

        // Als de schakelaar op AAN staat zal de verlichting worden aangezet samen met de sproeier
        // Als de schakelaar op UIT staat zal de verlichting worden uitgezet samen met de sproeier
        // Als de schakelaar op AUTOMATISCH staat zal de verlichting aan gaan tussen 20:00 en 05:00, en de sproeier tussen 20:00 en 05:00 als het niet regent.
    }
        
    public Boolean getDaglicht() {
        return daglicht;
    }

    public Boolean getRegen() {
        return regen;
    }
    public void setRegen(Boolean regen) {
        this.regen = regen;
    }

    public Schakelaar getSlimmeschakelaar() {
        return slimmeschakelaar;
    }

    public void setSlimmeschakelaar(schakelaar slimmeschakelaar) {
        this.slimmeschakelaar = slimmeschakelaar;
    }
}
