/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang;

/**
 *
 * @author Shofiya Khalisa
 */
public class Persegi implements MenghitungBidang{
    protected int panjang;
    protected int lebar;

    public Persegi(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    @Override
    public double Keliling() {
        return 2*(panjang+lebar);
    }

    @Override
    public double Luas() {
        return panjang*lebar;
   }  
}
