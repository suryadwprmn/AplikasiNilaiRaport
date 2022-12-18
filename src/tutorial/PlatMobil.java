package tutorial;
import java.util.Scanner;
public class PlatMobil {
    public static Scanner inputUser = new Scanner(System.in);
    public static int kudus, jakarta, jogja, karawang, solo, ganjil, genap, hitungGanjilGenap = 0;

    public static String outputScan(String index){
        System.out.print(index + " : ");
        return inputUser.nextLine();
    }

    public static void viewFrontApp(){
        label:
        while (true){
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("    PROGRAM JAVA INVENTARISASI KENDARAAN");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1. Menu Inventarisasi");
            System.out.println("2. Menu Informasi");
            System.out.println("x. Exit Aplikasi");
            String choose = outputScan("\nMasukkan Pilihan Anda");

            switch (choose){
                case "1" -> menuInventarisasi();
                case "2" -> menuInformasi();
                case "x" -> {
                    break label;
                }
                default -> System.out.println("Pilihan Tidak Tersedia");
            }
        }
    }

    public static void menuInventarisasi(){
        System.out.println("\n  SELAMAT DATANG DI MENU INVENTARISASI");
        System.out.println("========================================");
        String nameCar = outputScan("Masukkan Nama Mobil");
        String platMobil = outputScan("Masukkan Plat Mobil (Huruf Kapital)");
        int platMobilAngka = Integer.parseInt(outputScan("Masukkan Nomor Plat Mobil"));

        if (nameCar.isBlank() || platMobil.isBlank()){
            System.out.println("\nLengkapi Identitas Mobil");
        } else {
            System.out.println("\nPROCESSING............");
            cekInventarisMobil(nameCar, platMobil, platMobilAngka);
        }
    }

    public static void cekInventarisMobil(String nameData, String platMobilData, int platMobilAngka){
        if (platMobilData.startsWith("K")){
            System.out.println("Nama Mobil : " + nameData);
            System.out.println("Plat Mobil : " + platMobilData + " " + platMobilAngka);
            System.out.println("Mobil Berasal Dari Kudus");
            cekInventarisMobil(platMobilAngka);
            semuaDataInventarisasi(platMobilData, platMobilAngka);
        } else if (platMobilData.startsWith("B")) {
            System.out.println("Nama Mobil : " + nameData);
            System.out.println("Plat Mobil : " + platMobilData + " " + platMobilAngka);
            System.out.println("Mobil Berasal Dari Jakarta");
            cekInventarisMobil(platMobilAngka);
            semuaDataInventarisasi(platMobilData, platMobilAngka);
        } else if (platMobilData.startsWith("AB")) {
            System.out.println("Nama Mobil : " + nameData);
            System.out.println("Plat Mobil : " + platMobilData + " " + platMobilAngka);
            System.out.println("Mobil Berasal Dari Jogjakarta");
            cekInventarisMobil(platMobilAngka);
            semuaDataInventarisasi(platMobilData, platMobilAngka);
        } else if (platMobilData.startsWith("T")) {
            System.out.println("Nama Mobil : " + nameData);
            System.out.println("Plat Mobil : " + platMobilData + " " + platMobilAngka);
            System.out.println("Mobil Berasal Dari Karawang");
            cekInventarisMobil(platMobilAngka);
            semuaDataInventarisasi(platMobilData, platMobilAngka);
        } else if (platMobilData.startsWith("AD")) {
            System.out.println("Nama Mobil : " + nameData);
            System.out.println("Plat Mobil : " + platMobilData + " " + platMobilAngka);
            System.out.println("Mobil Berasal Dari Solo");
            cekInventarisMobil(platMobilAngka);
            semuaDataInventarisasi(platMobilData, platMobilAngka);
        } else {
            System.out.println("Plat Mobil Tidak Valid");
        }
    }

    public static void cekInventarisMobil(int platMobil){
        String ganjilGenapPlat = (platMobil % 2 == 1) ? "Mobil Merupakan Plat Ganjil" : "Mobil Merupakan Plat Genap";
        System.out.println(ganjilGenapPlat);
    }

    public static void semuaDataInventarisasi(String platMobilIndex, int numPlatIndex){
        if (platMobilIndex.startsWith("K")){
            kudus += 1;
        } else if (platMobilIndex.startsWith("B")) {
            jakarta += 1;
        } else if (platMobilIndex.startsWith("AB")) {
            jogja += 1;
        } else if (platMobilIndex.startsWith("T")) {
            karawang += 1;
        } else if (platMobilIndex.startsWith("AD")) {
            solo += 1;
        } else {
            System.out.println("Plat Mobil Tidak Valid");
        }

        hitungGanjilGenap = (numPlatIndex % 2 == 1) ? (ganjil += 1) : (genap += 1);
        System.out.println("\nTotal Plat Mobil Asal Kudus : " + kudus);
        System.out.println("Total Plat Mobil Asal Jakarta : " + jakarta);
        System.out.println("Total Plat Mobil Asal Jogjakarta : " + jogja);
        System.out.println("Total Plat Mobil Asal Karawang : " + karawang);
        System.out.println("Total Plat Mobil Asal Solo : " + solo);
        System.out.println("\nTotal Plat Ganjil : " + ganjil);
        System.out.println("Total Plat Genap : " + genap);
    }

    public static void menuInformasi(){
        System.out.println("\n   SELAMAT DATANG DI MENU INFORMASI");
        System.out.println("**************************************");
        System.out.println("\nTotal Plat Mobil Asal Kudus : " + kudus);
        System.out.println("Total Plat Mobil Asal Jakarta : " + jakarta);
        System.out.println("Total Plat Mobil Asal Jogjakarta : " + jogja);
        System.out.println("Total Plat Mobil Asal Karawang : " + karawang);
        System.out.println("Total Plat Mobil Asal Solo : " + solo);
        System.out.println("\nTotal Plat Ganjil : " + ganjil);
        System.out.println("Total Plat Genap : " + genap);
    }

    public static void main(String[] args) {
        viewFrontApp();
    }
}
