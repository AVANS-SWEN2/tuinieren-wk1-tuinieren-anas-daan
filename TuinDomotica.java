public class TuinDomotica {
    private Boolean daglicht;
    private Boolean regen;
    private Schakelaar slimmeschakelaar;
    private int tijdstip;
    

    public TuinDomotica() {
        super();
        slimmeschakelaar = Schakelaar.AUTOMATISCH;
        tijdstip = 21;
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
