package tutorial;

import java.util.Scanner;

public class NilaiRaportApp {
    public static Scanner scanner = new Scanner(System.in);
    public static Integer i,jumlah;
    private static NilaiRaport[] NilaiMhs;


    public static boolean getYesorNo(String msg) {
        System.out.println(msg + "y/n :");
        String userinput = scanner.nextLine();

        while (!userinput.equalsIgnoreCase("y")&& !userinput.equalsIgnoreCase("n")){
            System.err.println("PILIHAN ANDA BUKAN y atau n");
            userinput = scanner.nextLine();
        }
        return userinput.equalsIgnoreCase("y");

    }

    public static void main(String[] args) {
        boolean isLooping = true;
        String pilihan;
        label:
        while (true) {
            System.out.println("===========================================");
            System.out.println("        APLIKASI MENU E-RAPORT             ");
            System.out.println("===========================================");
            System.out.println("MENU PILIHAN :");
            System.out.println("1. INPUT NILAI MAHASISWA");
            System.out.println("2. TAMPILKAN NILAI DATA MAHASISWA");
            System.out.println("x. EXIT PROGRAM");
            System.out.println("Pilihan : ");
            pilihan = scanner.next();
            if (pilihan.equals("1")){
                Raport();
            } else if (pilihan.equals("2")) {
                ViewRaport();
            } else if (pilihan.equals("x")){
                System.out.println("\\EXITING PROGRAM.....");
              break label;
            } else {
                System.err.println("Pilihan Anda tidak ada");
            }

        }
    }

        public static void Raport (){

        double nilaiHadir,nilaiTugas,nilaiUts,nilaiUas;
            System.out.println("Berapa data mahasiswa yang ingin diinput?");
            jumlah = scanner.nextInt();
            NilaiMhs = new NilaiRaport[jumlah];
            for (i = 0 ; i< jumlah; i++){
                NilaiMhs[i]= new NilaiRaport();
                System.out.println("Data ke " + (i+1));

                System.out.println("NIM :");
                NilaiMhs[i].setNim(scanner.next());

                System.out.println("Nama :");
                NilaiMhs[i].setNama(scanner.next());

                System.out.println("Nilai Kehadiran :");
                NilaiMhs[i].setKehadiran(scanner.nextInt());

                System.out.println("Nilai Tugas : ");
                NilaiMhs[i].setTugas(scanner.nextInt());

                System.out.println("Nilai UTS : ");
                NilaiMhs[i].setUts(scanner.nextInt());

                System.out.println("NIlai UAS");
                NilaiMhs[i].setUas(scanner.nextInt());

            }
        }

        public static void ViewRaport(){
            System.out.println("  Tampilkan Nilai Data  ");
            i=0;
            while (i<NilaiMhs.length){
                System.out.println("Data ke- : "  + (i+1));
                System.out.println("NIM " + NilaiMhs[i].getNim());
                System.out.println("Nama " + NilaiMhs[i].getNama());
                System.out.println("Nilai Kehadiran " +NilaiMhs[i].getKehadiran() );
                System.out.println("Nilai Tugas " + NilaiMhs[i].getTugas());
                System.out.println("Nilai UTS " + NilaiMhs[i].getUts());
                System.out.println("Nilai UAS " + NilaiMhs[i].getUas());
                System.out.println("NIlai Akhir = " + NilaiMhs[i].getKehadiran() + " + " + NilaiMhs[i].getTugas()+ " + "
                        + NilaiMhs[i].getUts() +" + "  + NilaiMhs[i].getUas() + " = " + NilaiMhs[i].getNilaiAkhir());
                System.out.println("IPK AKHIR " + NilaiMhs[i].getGrade());
                i++;
            }
        }
}
