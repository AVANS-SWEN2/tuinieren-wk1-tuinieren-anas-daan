public class Sproeier {
    private String merk ;
    public Sproeier() {
        super();
        merk = "Gardena";
    }
    public String getHoseBrand() {
        return merk;
    }

    public void sproeien ()
    {
    	//domotica op automatisch? sproei dan van 20:00 tot 5:00
        System.out.println("Aan het sproeien.");  
    }
}
