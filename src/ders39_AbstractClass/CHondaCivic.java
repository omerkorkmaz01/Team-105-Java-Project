package ders39_AbstractClass;

public class CHondaCivic extends  BHonda{

    @Override
    public void motor() {
        System.out.println("Honda civic araclar vtec teknoloji cevirici motorlar kullanir");
    }

    @Override
    public void kasa() {
        System.out.println("Honda civic araclar sedan veya hb kasa kullanir");

    }

    @Override
    public void tekerlek() {
        System.out.println("Honda civic araclar 205*16*55 teker kullanir");

    }

    @Override
    public void yakit() {
        System.out.println("Honda civic araclar benzinlidir");

    }

    @Override
    public void abs() {
        System.out.println("Honda civic araclar standart olarak abs kullanir");
    }

    @Override
    public void klima() {
        System.out.println("Honda civic araclar standart olarak klima kullanir");
    }

    @Override
    public void guvenlik() {
        System.out.println("Honda civic araclar guvenlik standartidir");

    }

    /*
    Abstract parent class'lardaki abstract method'lar
    concrete child'lar tarafindan mecburen override edilie

    Ancak abstract parent'lardaki concrete method'lari
    override etmek mecburi degildir
    Eger child class'a uyarlamak isterseniz override edebilirsiniz
    veya override etmeyip class'daki haliyle kullanabilirsiniz
     */

    public static void main(String[] args) {
        CHondaCivic civic1=new CHondaCivic();
        civic1.abs();//civic
        civic1.klima();//civic
        civic1.marka();//honda
        civic1.ozelTeknoloji();//honda
    }
}
