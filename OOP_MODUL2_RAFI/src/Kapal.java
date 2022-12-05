public class Kapal extends TransportasiAir {
    //attribute
    protected String mesin;

    //constructor
    public Kapal(int JumlahKursi, int Biaya, String mesin){
        super(JumlahKursi, Biaya);
        this.mesin = mesin;
    }

    //public method 
    public void informasi(){
        System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah" + JumlahKursi + "ditetapkan dengan biaya sebesar" + Biaya);
    }
    
    public void berlayar(){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin" + mesin + "dengan kecepatan tidak stabil");
    }
    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin" + mesin + "dengan kecaptan stabil di kisaran" + kecepatan + "knot");
    }
}
