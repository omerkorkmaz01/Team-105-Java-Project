package ders39_AbstractClass;

public abstract class Araba {

    // araba classını inherit eden tum classlar
    // motor, kasa ve tekerlek methodlarını override etmek zorunda kalsin
    // ancak abs, klima method'lari opsiyonel olsun
    // isteyen child bu method'lari override etsin, isteyen override etmesin

    public abstract void motor();

    public abstract void marka();

    public abstract void kasa();

    public abstract void tekerlek();

    public void abs(){
        System.out.println("Guvenlik artirmak isteyen arabalar abs kullanmali");
    }

    public void klima(){
        System.out.println("Konfor artirmak isteyen arabalar klima kullanmali");
    }


}
