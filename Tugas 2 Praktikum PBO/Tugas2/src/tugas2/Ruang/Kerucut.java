/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.Ruang;
import tugas2.Bidang.Lingkaran;
/**
 *
 * @author Shofiya Khalisa
 */
public class Kerucut extends Lingkaran implements MenghitungRuang{
    private int tinggi;
    
    public Kerucut(int jari, int tinggi){
        super(jari);
        this.tinggi = tinggi;
    }  

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double Volume() {
        return (Luas()*this.tinggi)/3;
    }

    @Override
    public double Lpermukaan() {
        int R = this.jari;
        int t = this.tinggi;
        double s = Math.sqrt((R*R)+(t*t));
        return Math.PI*R*(R+s);
    }
}
