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
public class IF110118005Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnergiKinetik ek = new EnergiKinetik();
        ek.setMassa(145);
        ek.setKecepatan(25);
        System.out.println("Massa Bola Baseball : " +ek.getMassa() + " g");
        System.out.println("Kecepatan Bola Baseball : " + ek.getKecepatan() + " m/s");
        System.out.println("Energi kinetik yang dihasilkan : " + ek.energiKinetik(ek.getMassa(), ek.getKecepatan()));
        System.out.println("Usaha yang dilakukan pada bola baseball : " +ek.usaha());
        
    }

    
}
