public class Main {
    public static void main(String[] args){
        System.out.println("Laptop");
        Laptop laptop = new Laptop( "Camel drive", 128,  7.00, true);
        laptop.information();
        laptop.bukagames("Dota2");
        laptop.kirimemail("rafiabdulf18.yoho.com");
        laptop.kirimemail("rafiabdulf18.yoho.com", "rafiabdulf08.yoho.com");
    
        System.out.println();
    
        System.out.println("Handphone");
        Handphone hp = new Handphone( " Samsul New",  8,  5.50,  false);
        hp.information();
        hp.telpon(92193);
        hp.kirimSMS(92183);
        hp.kirimSMS(92193,123456);
    }
    
}
