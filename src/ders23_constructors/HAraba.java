package ders23_constructors;

public class HAraba {
    String marka="Marka belirtilmedi";
    String modeli="Model belirtilmedi";
    String yakit;
    int yıl;
    int fiyat;

    public HAraba(String mrk,String mdl,String ykt,int yl,int fyt){

        marka=mrk;
        modeli=mdl;
        yakit=ykt;
        yıl=yl;
        fiyat=fyt;
    }

    public HAraba(String mrk,String mdl,int yl){
        // istersek parametreleri azaltarak da constructor olusturabiliriz

        marka=mrk;
        modeli=mdl;
        yıl=yl;

    }
    public HAraba(){
        // Dorunur durumdaki parametresiz constructor
        // Default constructor degildir
        // Default constructor'ın bodysi'de bos olur
        // Ancak parametresiz construcktor'da body'e kod yazilabilir

        // Parametresiz constructor'ın body'sinde kod yoksa default construcktor ile ayni iskevi gorur
        // Ama yinede gorunur durumda ise default constructor denmez
    }

        // biz gozle gorulur herhangi bir constructor olusturdugumuzda
        // java default constructor'ı siler
        // bu durumda daha once olusturulmus olan objelerin sorun olmamasi icin
        // class'a parametresiz bir constructor eklememiz faydali olur

    @Override
    public String toString() {
        return "Araba Ozellikleri " +
                "\nMarka : " + marka +
                "\nmodeli : " + modeli +
                "\nyakit : " + yakit +
                "\nyıl : " + yıl +
                "\nfiyat : " + fiyat;

    }

    public int maxHiz(String yakit){
        int maxHiz=120;

        if (yakit.equalsIgnoreCase("dizel")) {
            maxHiz = 200;
        }else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz = 230;
        }else if (yakit.equalsIgnoreCase("elektrikli")){
            maxHiz=180;
        }
        return maxHiz;
    }

}
