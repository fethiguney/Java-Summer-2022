package day33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogr=new Ogretmen();

        ogr.setIsim("Tulay");
        System.out.println(ogr.getIsim());
          /*
        Bu yontemde data hiding degil
        daha anlasilir bir kod amaclanmis olur
         */




    }
}
