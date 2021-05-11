/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;
import javax.swing.*;
import java.awt.event.*;
import ruang.Balok;
/**
 *
 * @author Shofiya Khalisa
 */
public class GUI extends JFrame implements ActionListener{
     JLabel lpanjang = new JLabel("Panjang");
     JTextField fpanjang = new JTextField(10);
     JLabel llebar = new JLabel("Lebar");
     JTextField flebar = new JTextField(10);
     JLabel ltinggi = new JLabel("Tinggi");
     JTextField ftinggi = new JTextField(10);

     JLabel lhasil = new JLabel("Hasil :");
     JLabel lluas= new JLabel();
     JLabel lkeliling= new JLabel();
     JLabel lluaspermukaan= new JLabel();
     JLabel lvolume= new JLabel();

     JButton bhitung = new JButton("Hitung");
     JButton breset = new JButton("Reset");

     public GUI(){
        setTitle("BALOK");
        setSize(350,320);

        setLayout(null);
        add(fpanjang);
        add(lpanjang);
        add(flebar);
        add(llebar);
        add(ftinggi);
        add(ltinggi);
        add(lhasil);
        add(lluas);
        add(lkeliling);
        add(lluaspermukaan);
        add(lvolume);
        add(bhitung);
        add(breset);

        lpanjang.setBounds(10,10,120,20);
        fpanjang.setBounds(130,10,150,20);
        llebar.setBounds(10,35,120,20);
        flebar.setBounds(130,35,150,20);
        ltinggi.setBounds(10,60,120,20);
        ftinggi.setBounds(130,60,150,20);
        
        lhasil.setBounds(150,95,150,20);
        lluas.setBounds(10,120,200,20);
        lkeliling.setBounds(10,145,2000,20);
        lluaspermukaan.setBounds(10,170,200,20);
        lvolume.setBounds(10,195,200,30);
        
        bhitung.setBounds(80,240,80,25);
        breset.setBounds(170,240,80,25);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        bhitung.addActionListener(this);
        breset.addActionListener(this);
    }
     
    @Override
    public void actionPerformed(ActionEvent e){
    int panjang,lebar,tinggi;
           
    if(e.getSource() == bhitung){
        if(fpanjang.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Input tidak boleh kosong!");
        } else if(flebar.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Input tidak boleh kosong!");
        } else if(ftinggi.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Input tidak boleh kosong!");
        } else {
            try{
                panjang = Integer.parseInt(fpanjang.getText());
                lebar = Integer.parseInt(flebar.getText());
                tinggi = Integer.parseInt(ftinggi.getText());
                Balok balok = new Balok(panjang, lebar, tinggi);
                lluas.setText("Luas = " + balok.Luas());
                lkeliling.setText("Keliling = " + balok.Keliling());
                lluaspermukaan.setText("Luas Permukaan = " + balok.Lpermukaan());
                lvolume.setText("Volume = " + balok.Volume());
            } catch(NumberFormatException err){
                JOptionPane.showMessageDialog(this, "Silahkan input angka!");
            }
        }
    }
           
    if(e.getSource() == breset){
        fpanjang.setText("");
        flebar.setText("");
        ftinggi.setText("");
        lluas.setText("");
        lkeliling.setText("");
        lluaspermukaan.setText("");
        lvolume.setText("");
        }
    }
}
