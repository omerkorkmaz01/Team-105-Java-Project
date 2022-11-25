package ders31_Inheritance;

public class FToyota extends EAraba{

    FToyota(){
        super();
        System.out.println("Toyota cons. calisti");
    }

    protected String marka="Toyota";
    protected String motor=("Toyota araclar cevreci motor kullanir");
    protected String uretimYeri = "Uretim yeri belirtilmemis";
    protected int hiz= 140;

}
