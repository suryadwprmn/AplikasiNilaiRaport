package tutorial;

import java.util.Scanner;

public class AppToDoList {

    public static String [] model = new String [10];
    public static Scanner output = new Scanner(System.in);
    public static void main(String[] args) {
     FrontApp();
    }

    /**
     * Menampilkan show To do List
     */
    public static void ShowTodoList(){
        for ( var i = 0; i < model.length ; i++){
            var todo = model[i];
            // untuk menghasilkan nomer 1
            var no = i + 1;
            if ( todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void TesFrontApp(){

            model[0] = "Belajar Java Dasar";
            model[1] = "Studi Kasus Java Dasar : Aplikasi Todolist";
            ShowTodoList();
    }

    /**
     * Menambahkan ToDo List
     */
    public static void AddToDoList(String todo){
        //Cek apakah model yang dibuat penuh?
        // Jika belum akan melooping dengan isFull == true
        // JIka Sudah akan berhenti melooping isFull == false
        var isFull =true;
        for (var i =0; i<model.length;i++){
            if (model[i] == null){
                isFull = false;
                break;
            }
        }
        // menambah dua kali lipat isi Array (*2)
            if (isFull){
                //Pakai Scope Lokal
                var memorytemp = model;
                model = new String[model.length *2];
                for (var i =0; i< memorytemp.length;i++){
                    model [i] = memorytemp[i];
                }
            }


        // tambahkan posisi ke todo list
        for (var i = 0; i< model.length;i++){
            //mengecek String yang ditambahkan,jika kosong maka akan ditambah
            if (model[i] == null){
                model [i] = todo;
                break;
            }
        }
    }
    public static void TesAddToDoList(){
        for (var i = (0+1); i<= 100 ;i++){
            AddToDoList("Coba ke " + i);
        }
        ShowTodoList();
    }

    /**
     * Menghapus ToDo dari List
     */
    public static boolean removeToDoLIst(Integer number){

        //if yang pertama untuk menghapus jika nomer yang diinput lebih dari 10
        // else if yang kedua untuk menghapus nomer
        if ((number-1) >= model.length){
            return false;
        }else if (model[number-1] == null){
            return false;
        }else {
           for (int i = (number -1); i < model.length;i++){
               if (i == (model.length)-1){
                   model[i] = null;
               } else{
                   model[i] = model[i + 1];
               }

           }
           return true;
        }
    }

    public static void tesRemoveToDoList(){
        AddToDoList("Satu");
        AddToDoList("Dua");
        AddToDoList("Tiga");
        AddToDoList("Empat");
        AddToDoList("Lima");

        var result = removeToDoLIst(100);
        System.out.println(result);
        result = removeToDoLIst(3);
        System.out.println(result);
        result = removeToDoLIst(6);
        System.out.println(result);

        ShowTodoList();

    }

    public static String input (String index){
        System.out.print(index + " : ");
        String data = output.nextLine();
        return data;
    }

    public static void tesInput(){
        var name = input("Name");
        System.out.println("Hi " + name);
        var age = input("Umur");
        System.out.println("Umur " + age );
        var channel = input("Channel");
        System.out.println(channel);
    }

    /**
     * Tampilan Aplikasi todo list
     */

    public static void FrontApp(){
        while (true) {
            ShowTodoList();
            System.out.println("       APLIKASI MENU SHOW TO DO LIST     ");
            System.out.println("=========================================");
            System.out.println("MENU");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var pilihan = input("Pilih");
            if (pilihan.equals("1")){
                ViewAddToDoList();
            } else if (pilihan.equals("2")){
                ViewRemoveToDoList();
            } else if (pilihan.equals("x")){
                break;
            } else {
                System.out.println("Pilihan Anda Tidak Tersedia!!!!!!");
            }


        }
    }

    /**
     * Melihat hasil menambah todo list
     */
    public static void ViewAddToDoList(){
        System.out.println("=========MENAMBAH TODO LST YANG INGIN DILAKUKAN========");

        var todo = input("Kegiatan yang ingin dilakukan / ( TEKAN x jika ingin membatalkan )");

            if (todo.equals("x")){
                //batal
            }else {
                AddToDoList(todo);
            }
    }

    public static void tesViewAddTodoList(){

        ViewAddToDoList();
        ShowTodoList();
    }

    /**
     * Melihat hasil menghapus todo list
     */
    public static void ViewRemoveToDoList(){
        System.out.println("============= MENGAHPUS TO DO LIST ======================");
        var number = input("Hapus Kegiatan /(TEKAN x jika ingin dibatalkan)");

        if (number.equals("x")){
            //batal/tidak akan menghapus
        } else {
           boolean succes = removeToDoLIst(Integer.valueOf(number));
            if (!succes){
                System.out.println("Gagal mengapus todo list" + number);
            }
        }
    }

    public static void TesViewRemoveToDoList(){
        AddToDoList("Satu");
        AddToDoList("Dua");
        AddToDoList("Tiga");
        AddToDoList("Empat");
        ShowTodoList();
        ViewRemoveToDoList();
        ShowTodoList();


    }
}
