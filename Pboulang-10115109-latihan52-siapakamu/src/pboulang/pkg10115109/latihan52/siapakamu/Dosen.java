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
public class Dosen extends Manusia{
    private String nip;
    private String Matakuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMatakuliah() {
        return Matakuliah;
    }

    public void setMatakuliah(String Matakuliah) {
        this.Matakuliah = Matakuliah;
    }
    
    public void Mengajarapa(){
        System.out.println("Saya rizki adam kurniawan umur 27 tahun sedang mengajar mata kuliah PBO");
    }

    @Override
    public void Siapakamu() {
        System.out.println("saya dosen"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    }
    
    
    

