/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.Bidang;

/**
 *
 * @author Shofiya Khalisa
 */
public class Lingkaran implements MenghitungBidang{
    protected int jari;

    public Lingkaran(int jari) {
        this.jari = jari;
    }

    public int getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }
 
    @Override
    public double Keliling() {
        return Math.PI*2*jari;
    }

    @Override
    public double Luas() {
        return Math.PI*jari*jari;
    }    
}
