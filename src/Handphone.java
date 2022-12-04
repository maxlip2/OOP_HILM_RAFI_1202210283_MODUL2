public class Handphone extends Perangkat {
    //attribute
    protected boolean fingerprint;

    //constuctor
    public Handphone(String drive, int ram, double processor, boolean fingerprint){
        super(drive,ram,processor);
        this.fingerprint = fingerprint;
    }

    //overrding method information
    public void information(){
        System.out.println("Handphone memiliki drive tipe " + drive + "dengan ram sebesar" + ram + "dan memiliki processor" + processor);

    }

    public void telpon (int no_handphone){
        System.out.println("Handphone ini berhasil menyambungkan no telpon ke no" + no_handphone);
    }

    public void kirimSMS(int no_handphone){
        System.out.println("Handphone ini berhasil mengirimkan SMS ke no" + no_handphone);
    }

    public void kirimSMS(int no_handphone, int no_handphone2){
        System.out.println("Handphone ini berhasil mengirimkan SMS ke no" + no_handphone + "dan" + no_handphone2);
        
    }
}