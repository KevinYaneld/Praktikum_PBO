package posttest1;

public abstract class RumahSakit {
    protected String nama;
    protected String jenis_kelamin;
    protected int umur;
    protected String alamat;
    
    public RumahSakit(String nama,String jenis_kelamin,int umur,String alamat){
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.umur = umur;
        this.alamat = alamat;
        
    }
    
// AKAN DIOVERRIDE DI SUBCLASS
// MERUPAKAN ABSTRACT CLASS
    public abstract void terdata();
    public abstract void update();

    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}

