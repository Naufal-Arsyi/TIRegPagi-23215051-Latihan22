/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author Arsyi
 * 
 * Nama  : Naufal Miftahul Arsyi
 * Kelas : Teknik Informatika
 * NIM   : 23215057
 * Deskripsi : program ini berfungsi untuk menghitung jari-jari,luas,dan keliling lingkaran berdasarkan diameternya
 */
import java.util.Scanner;

public class TI_23215057_Latihan22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai diameter lingkaran: ");
        String diameterInput = input.next();
        
        if (!diameterInput.matches("\\d+")) {
            System.out.println("Nilai Diameter Tidak Sesuai");
        } else {
            double diameter = Double.parseDouble(diameterInput);
            double jariJari = diameter / 2;
            double luas = Math.PI * jariJari * jariJari;
            double keliling = Math.PI * diameter;

            System.out.println("Jari-jari Lingkaran = " + jariJari + " cm");
            System.out.println("Luas Lingkaran = " + luas + " cm");
            System.out.println("Keliling Lingkaran = " + keliling + " cm");
        }
    }
}

