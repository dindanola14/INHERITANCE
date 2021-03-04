/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Void2 extends Main{
    String nama, nafas, habitat;
    
    public Void2(){
        super();
        System.out.println("     Jaga Kesehatan Hewan Peliharaanmu Yaa!");
        System.out.println("  Yuk Cari Tahu Lagi Tentang Hewan Peliharaanmu!");
        System.out.println(" ");        
    }
    void kelompokhewan(){
        Scanner input = new Scanner(System.in);
        System.out.println("==================== Perhatian! =======================");
        System.out.println("( Isi data di bawah ini dengan diawali huruf kapital! )");
        System.out.println(" ");
        System.out.print("Masukkan Nama Hewan : ");
        nama = input.nextLine();
        System.out.print("Masukkan Alat Pernapasan Hewan [ Insang, Paru - Paru ] : ");
        nafas = input.nextLine();
        
        switch(nafas){
            case "Insang":
                System.out.println(nama+ " adalah " + "Kelompok Ikan");
                break;
            case "Paru - Paru":
                System.out.println(nama+ " adalah " + "Kelompok Mamalia");
                break;
            default:
                System.out.println(nama+ " Bukan Hewan");
                break;
        }
    }
    
    void habitathewan(){
        Scanner input = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.print("Masukkan Habitat Hewan [ Darat, Air ]: ");
        habitat = input.nextLine();
        
        switch(habitat){
            case "Darat":
                System.out.println(nama+ " mempunyai habitat di "+habitat);
                break;
            case "Air":
                System.out.println(nama+ " mempunyai habitat di "+habitat);
                break;
            default:
                System.out.println(nama+ " tidak mempunyai habitat");
        }
        System.out.println("======================================================");  
    } 
}
