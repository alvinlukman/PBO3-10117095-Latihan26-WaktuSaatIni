import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama      : Alvin Lukman Nulhakim 
 * Kelas     : IF3 
 * NIM       : 10117095 
 * Deskripsi : program ini menampilkan waktu saat ini
 */
public class WaktuSaatIni {

   
    public static void main(String[] args) {
        Date date = new Date();
     Calendar cal = Calendar.getInstance();
     int daysOfWeek = cal.get(Calendar.DAY_OF_WEEK);// hari dalam format angka
        
//     format tanggal dan waktu
     SimpleDateFormat formatIndo = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        
//     data array -> nama hari Indonesia
     String[] strDays = new String[]{"Sabtu","Minggu","Senin","Selasa","Rabu"
             ,"Kamus","Jumat"};
        
//     menampilkannya sesuai format
     System.out.println("Hari ini adalah hari : "+(strDays[daysOfWeek])+" ,"
             +formatIndo.format(date));
    }
    
}
