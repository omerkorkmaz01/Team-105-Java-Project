package ders32_inheritanceConstructorCall;

public class DCamry extends BToyota{
    DCamry(String pc){
        super("Deniz");
        System.out.println("String parametreli Camry");
    }
    DCamry(){
    }

    public static void main(String[] args) {
        // eger kullanilan argğmente uygun bir conrtructor
        // parent class'da yoksa CTE olur
        DCamry camry2= new DCamry("celal");

        System.out.println("=======");
        DCamry camry1= new DCamry();
        // Parametresiz Araba constructor
        // Parametresiz Toyota constructor
    }
}
