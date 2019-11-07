/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan52.siapakamu;

/**
 *
 * @author nama : indri yuliyanti
 *          nim ; 10115109
 *          kelas : pbo ulng
 *          tugas pbo pert 5 siapa kamu
 */
public class Pboulang10115109Latihan52Siapakamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosenA;
        
        dosenA = new Dosen();
        dosenA.setNip("41227829930");
        dosenA.setNama("Rizki Adam Kurniawan");
        System.out.println("NIP DOSEN :" +dosenA.getNip());
        dosenA.Siapakamu();
        dosenA.Mengajarapa();
        
        System.out.println("\n");
        
        Mahasiswa mahasiswaA = new Mahasiswa();
        mahasiswaA.setNim("10110269");
        mahasiswaA.setNama("Nindi");
        System.out.println("NIM MAHASISWA :" +mahasiswaA.getNim());
        mahasiswaA.Siapakamu();
        mahasiswaA.Kelasapa();
        
        
        
        
        
        
        
    }
    
}
