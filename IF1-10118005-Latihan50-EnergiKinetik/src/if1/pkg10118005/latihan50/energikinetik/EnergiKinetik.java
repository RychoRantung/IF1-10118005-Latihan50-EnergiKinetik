/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan50.energikinetik;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi program yang menghitung energi kinetik dan usaha yang dihasilkan pada sebuah bola baseball
 */
public class EnergiKinetik {
    private int massa, kecepatan;

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    
    public double energiKinetik(int massa, int kecepatan){
        return (massa * kecepatan * kecepatan * 0.5) / 1000;
    }
    
    public double usaha(){
        return (energiKinetik(massa, kecepatan) - energiKinetik(massa, 0));
    }
    
    
}
