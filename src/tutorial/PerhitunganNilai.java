package tutorial;

public class PerhitunganNilai {
    private String nim,nama;
    double uts,uas,nilaiAkhir;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(float uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(float uas) {
        this.uas = uas;
    }
    public double getNilaiAkhir (){
         nilaiAkhir = (uts+uas)/2;
        return nilaiAkhir;
    }

    public String getGrade(){
        String grade;
        if (nilaiAkhir < 50){
            grade = "E";
        } else if (nilaiAkhir < 60){
            grade = "D";
        } else if (nilaiAkhir < 70){
            grade = "C";
        } else if (nilaiAkhir < 80){
            grade= "B";
        } else {
            grade = "A";
        }
        return grade;
    }


}
