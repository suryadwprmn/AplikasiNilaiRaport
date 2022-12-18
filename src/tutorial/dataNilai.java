package tutorial;

import java.util.Scanner;

public class dataNilai {
    public static Scanner scanner = new Scanner(System.in);
    private static double nilaiakhir;
    private static String grade;


    public static void main(String[] args) {
        PerhitunganNilai[] NilaiMhs = new PerhitunganNilai[10];
        int jumlah,i,pilihan;
        double nilaiUts,nilaiUas;
        do {
            System.out.println("==================================================");
            System.out.println("        PROGRAM INPUT NILAI MAHASISWA             ");
            System.out.println("==================================================");
            System.out.println("PILIH MENU :");
            System.out.println("1. Input Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Exit Program");

            System.out.print("Pilihan Menu : ");
            pilihan =scanner.nextInt();

            switch (pilihan){
                case 1 :
                    System.out.println("Berapa data Mahasiswa yang ingin diinput? :");
                    jumlah = scanner.nextInt();

                    NilaiMhs = new PerhitunganNilai[jumlah];
                    for (i = 0; i< jumlah;i++){
                        NilaiMhs[i] = new PerhitunganNilai();
                        System.out.println("Data ke " + (i+1));

                        System.out.println("NIM : " );
                        NilaiMhs[i].setNim(scanner.next());

                        System.out.println("Nama :");
                        NilaiMhs[i].setNama(scanner.next());

                        System.out.println("Nilai UTS :");
                        nilaiUts = scanner.nextFloat();

                        System.out.println("Nilai UAS");
                        nilaiUas=scanner.nextFloat();

                        NilaiMhs[i].setUts((float) nilaiUts);
                        NilaiMhs[i].setUas((float) nilaiUas);

                    }
                    break;
                case 2:
                    System.out.println("=====================");
                    System.out.println("Tampilan Nilai Data :");
                    System.out.println("=====================");
                    i= 0;
                    while (i<NilaiMhs.length){
                        System.out.println("Data :" + (i+1));
                        System.out.println("NIM :" + NilaiMhs[i].getNim());
                        System.out.println("Nama : " + NilaiMhs[i].getNama());
                        System.out.println("NIlai UTS : "+NilaiMhs[i].getUts());
                        System.out.println("Nilai UAS : "+NilaiMhs[i].getUas());
                        System.out.println("Nilai UAS : " +"("+ NilaiMhs[i].getUts() + " + "+ NilaiMhs[i].getUas() +")"+ "/2 = " + NilaiMhs[i].getNilaiAkhir() );
                        System.out.println("IPK AKHIR :" + NilaiMhs[i].getGrade());
                        System.out.println("=================================");
                        i++;
                    }
                    break;
                case 3:
                    System.out.println(" \\EXITING PROGRAM.....");
                    break;

                default:
                    System.out.println("Pilihan Anda tidak tersedia!!!");



            }

        } while (pilihan != 3);


    }
}
