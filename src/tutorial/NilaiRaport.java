package tutorial;

public class NilaiRaport {
    private String nama,nim;
    double kehadiran,tugas,uts,uas,nilaiAkhir;

    public double getNilaiAkhir() {
        nilaiAkhir = getKehadiran() + getTugas() + getUts()+getUas();
        return nilaiAkhir;
    }

    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getKehadiran() {
        double nilaiKehadiran = 0.1 * kehadiran;
        return nilaiKehadiran;
    }

    public void setKehadiran(double kehadiran) {
        this.kehadiran = kehadiran;
    }

    public double getTugas() {
        double nilaiTugas = 0.2 * tugas;
        return nilaiTugas;
    }

    public void setTugas(double tugas) {
        this.tugas = tugas;
    }

    public double getUts() {
        double hasilUts = 0.3 * uts;
        return hasilUts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        double hasilUas = 0.4 * uas;
        return hasilUas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }
    public String getGrade(){
        String grade;
        if (nilaiAkhir < 50){
            grade= "IPK E";
        } else if (nilaiAkhir < 60){
            grade = "IPK D";
        } else if (nilaiAkhir < 70){
            grade = "IPK C";
        } else if (nilaiAkhir< 80) {
            grade = "IPK B";
        }else {
            grade = "A";
        }
        return grade;
    }
}
