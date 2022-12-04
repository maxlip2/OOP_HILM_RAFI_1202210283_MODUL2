public class Laptop extends Perangkat{
    //attribute
    protected boolean webcam;

    //constructor
    public Laptop(String drive, int ram, double processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    public void information(){
        System.out.println("Laptop ini memiliki drive" + drive + "dengan ram " + ram + "dan memiliki processor" + processor);
    }

    public void bukagames(String nama_games){
        System.out.println("Laptop ini membuka games" + nama_games);
    }

    public void kirimemail(String email){
        System.out.println("Berhasil mengirim email ke" + email);
    }

    public void kirimemail(String email, String email2){
        System.out.println("Berhasil mengirim email ke" + email + "dan ke" + email2);
    }
}