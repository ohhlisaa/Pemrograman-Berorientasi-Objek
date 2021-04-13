/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.Ruang;
import tugas2.Bidang.PersegiPanjang;
/**
 *
 * @author Shofiya Khalisa
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
    private int tinggi;

    public Balok(int tinggi, int panjang, int lebar) {
        super(panjang, lebar);
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
        return Luas() * tinggi;
    }

    @Override
    public double Lpermukaan() {
        return 2*((panjang*lebar)+(panjang*tinggi)+(tinggi*lebar));
    }
}
