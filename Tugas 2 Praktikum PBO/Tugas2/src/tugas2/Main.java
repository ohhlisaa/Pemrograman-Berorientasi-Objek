/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import java.util.Scanner;
import tugas2.Ruang.Balok;
import tugas2.Ruang.Kerucut;
/**
 *
 * @author Shofiya Khalisa
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean exit = false;
        
        do{
            Scanner menu = new Scanner(System.in);
            System.out.println("INPUT");
            System.out.println("1. BALOK");
            System.out.println("2. KERUCUT");
            System.out.println("3. EXIT");
            System.out.print("PILIH = ");
            int pilihan=menu.nextInt();
            
            switch(pilihan){
                case 1:
                    blk(input);
                    break;
                case 2:
                    krct(input);
                    break;
                case 3:
                    exit=true;
                    break;
            }
            System.out.print("\n");
        } while(!exit);
    }

    public static void blk(Scanner input) {
        int panjang, lebar, tinggi;
        
        System.out.print("PANJANG : ");
        panjang = input.nextInt();
        System.out.print("LEBAR   : ");
        lebar = input.nextInt();
        System.out.print("TINGGI  : ");
        tinggi = input.nextInt();
        
        Balok blk = new Balok(panjang,lebar,tinggi);
        
        System.out.println("====== OUTPUT ======");
        System.out.println("LUAS PERSEGI     : " + blk.Luas());
        System.out.println("KELILING PERSEGI : " + blk.Keliling());
        System.out.println("VOLUME BALOK     : " + blk.Volume());
        System.out.println("LUAS PERMUKAAN   : " + blk.Lpermukaan());
    }

    public static void krct(Scanner input) {
        int tinggi, jari2;
        
        System.out.print("JARI-JARI  : ");
        jari2 = input.nextInt();
        System.out.print("TINGGI     : ");
        tinggi = input.nextInt();
        
        Kerucut krct = new Kerucut(jari2,tinggi);
        
        System.out.println("====== OUTPUT ======");
        System.out.println("LUAS LINGKARAN     : " + krct.Luas());
        System.out.println("KELILING LINGKARAN : " + krct.Keliling());
        System.out.println("VOLUME KERUCUT     : " + krct.Volume());
        System.out.println("LUAS PERMUKAAN     : " + krct.Lpermukaan());
    }   
}
