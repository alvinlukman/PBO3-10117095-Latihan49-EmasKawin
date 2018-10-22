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
class Emas {
    private double beratEmas;
    private int hargaGram;

    public double geteratEmas() {
        return beratEmas;
    }

    public void setberatEmas(double beratEmas) {
        this.beratEmas = beratEmas;
    }

    public int gethargaGram() {
        return hargaGram;
    }

    public void sethargaGram(int hargaGram) {
        this.hargaGram = hargaGram;
    }
    
    public double perhitungan(){
        return hargaGram*beratEmas;
    }
    
}
