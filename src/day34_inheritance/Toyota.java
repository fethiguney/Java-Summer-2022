package day34_inheritance;

public class Toyota {
    protected String marka="Toyota";
    protected String model="Model belirtilmedi";
    protected String yakit="Yakit belirtilmedi";



    protected void motor(){
        System.out.println("Toyota cevreci motor kullanir");
    }

    protected void aku(){
        System.out.println("Toyota modellerinde aku kullanir");
    }

}
