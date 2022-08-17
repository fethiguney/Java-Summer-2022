package day09_ternary;


public class C06_SwithCase {
    public static void main(String[] args) {
        //Kullanicidan gun ismini alin hafta ici veya
        //haftasonu oldugunu yazdirin

       String input = "PAZAR";
       input=input.toLowerCase();

       switch (input) {
           case "pazartesi" :
               System.out.println("haftaici");
               break;
           case "sali" :
               System.out.println("haftaici");
               break;
           case "carsamba" :
               System.out.println("haftaici");
               break;
           case "persembe" :
               System.out.println("haftaici");
               break;
           case "cuma" :
               System.out.println("haftaici");
               break;
           case "cumartesi" :
               System.out.println("haftasonu");
               break;
           case "pazar" :
               System.out.println("haftasonu");
               break;
           default:
               System.out.println("lutfen gecerli bir gun girin");
       }

        switch (input) {
            case "pazartesi" :
            case "sali" :
            case "carsamba" :
            case "persembe" :
            case "cuma" :
                System.out.println("haftaici");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("lutfen gecerli bir gun girin");
        }




    }
}
