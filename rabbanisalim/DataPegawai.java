/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rabbanisalim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataPegawai {
    public static void main (String[] args){
		List<pegawaibaru> daftarPegawai = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		while (true){
			System.out.println("Tambah Data Pegawai Baru (y/n): ");
			String jawaban = input.nextLine();
			
			if (jawaban.equalsIgnoreCase("n")){
				break;
                        }
			System.out.print("Nama: ");
			String nama = input.nextLine();
			
			System.out.print("NOPEG: ");
			String nopeg = input.nextLine();
                        
                        System.out.print("Jabatan: ");
			String jabatan = input.nextLine();
			
			System.out.print("Gaji: %s %n");
			float gaji = input.nextFloat();
			input.nextLine();
			
			pegawaibaru pegawai = new pegawaibaru(nama, nopeg, jabatan, gaji);
			daftarPegawai.add(pegawai);
		}
		System.out.println("Daftar Pegawai:");
		for (pegawaibaru pegawai : daftarPegawai){
			System.out.println(pegawai);
		}
	}
}
