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
        System.out.println("Aan het sproeien.");  
    }
    
    public void sproeierAan() {
		//zet de sproeier aan
	}
    
    public void sproeierUit() {
		//zet de sproeier uit
	}
}
