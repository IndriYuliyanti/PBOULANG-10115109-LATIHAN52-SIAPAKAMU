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
public class Mahasiswa extends Manusia {
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void Kelasapa(){
        System.out.println("saya nindi umur 17 tahun sedang belajar kelas PBO");
    }

    @Override
    public void Siapakamu() {
        System.out.println("saya manusia"); //To change body of generated methods, choose Tools | Templates.
    }

    
    }
    
   
    
    

