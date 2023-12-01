/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rabbanisalim;

public class pegawaibaru {
    private String nama;
    private String nopeg;
    private String jabatan;
    public float gaji;
	
	public pegawaibaru(String nama, String nopeg, String jabatan, float gaji) {
            this.nama = nama;
            this.nopeg = nopeg;
            this.jabatan = jabatan;
            this.gaji = gaji;
	}
	
        public void setNama(String nama){
            this.nama = nama;
	}
	public String getNama(){
		return nama;
	}
	public void setNopeg(String nopeg){
            this.nopeg = nopeg;
	}
	public String getNOPEG(){
		return nopeg;
	}
	public void setJabatan(String jabatan){
            this.jabatan = jabatan;
        }
        public String getJabatan(){
		return jabatan;
	}
        public void setGaji(Float gaji){
            this.gaji = gaji;
        }        
	public float getGaji(){
		return gaji;
	}
	
	@Override
	public String toString(){
		return "Nama: " + nama + ", NOPEG: " + nopeg + ", Jabatan: " + jabatan + ", Gaji: " + gaji;
	}
}
