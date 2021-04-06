
package Latihan;

public class Siswa {
    String Nama,Kelamin;
    int Umur,TahunKelahiran,Nisn;

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setKelamin(String Kelamin) {
        this.Kelamin = Kelamin;
    }

    public void setUmur(int Umur) {
        this.Umur = Umur;
    }

    public void setTahunKelahiran(int TahunKelahiran) {
        this.TahunKelahiran = TahunKelahiran;
    }

    public void setNisn(int Nisn) {
        this.Nisn = Nisn;
        
    }

    public String getNama() {
        return Nama;
    }

    public String getKelamin() {
        return Kelamin;
    }

    public int getUmur() {
        return Umur;
    }

    public int getTahunKelahiran() {
        return TahunKelahiran;
    }

    public int getNisn() {
        return Nisn;
    }

    String getNama(String rayhan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
