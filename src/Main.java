/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * NAMA  :Alvin Lukman Nulhakim
 * NIM   :10117095    
 * KELAS :IF-3
 */
public class Main {

    
    public static void main(String[] args) {
        Emas objE = new Emas();
        objE.sethargaGram(570000);
        objE.setberatEmas(15.7);
        System.out.println("Hendi Akan membeli emas kawin sebagai mahar nikahnya");
        System.out.println("dengan total seberat 15,7 gram. jika harga 1 gram emas");
        System.out.println("per bulan oktober ini adalah Rp.570.000. Berapa total");
        System.out.println("harus dikeluarkan oleh hendi ?");
        System.out.println("");
        System.out.println("Jadi Biaya Yang Harus Dikeluarkan Oleh Hendi Adalah "
                + "Rp."+objE.perhitungan());
    }
    
}
