/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan23.nilaiterbesardanterkecil;
import java.util.*;
/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Tentang Program  : Menghitung nilai terbesar dan terkecil
 */
public class PBO11K10118901Latihan23NilaiTerbesarDanTerkecil {
    public static Scanner input = new Scanner(System.in);
    public static void mencariNilai(int i, String namaP) {
        int n, h = 0,l;
        int[] nilaiArr = new int[1000];
        for(int j = 1; j <= i;j++) {
            System.out.print("Masukan Nilai Mahasiswa Ke-"+j+" ");
            n = input.nextInt();
            nilaiArr[j] = n;
        }
        System.out.println("");
        System.out.println("======Hasil Nilai Mahasiswa=====");
        for (int x = 1;x <= i;x++){
            System.out.println("Nilai Mahasiswa Ke-"+x+" "+nilaiArr[x]);
        }
        for (int z = 1;z<=i;z++) {
            if (nilaiArr[z] > h)
                h = nilaiArr[z];
        }
        l = nilaiArr[1];
        for (int m = 1; m <= i;m++) {
            if (nilaiArr[m] < l )
                l = nilaiArr[m];
        }
        System.out.println("");
        System.out.println("Nilai terbesar adalah "+h);
        System.out.println("Nilai terkecil adalah "+l);
        System.out.println("");
        System.out.println("Nama Petugas : "+ namaP);
    }
    public static void main(String[] args) {
        int n;
        String namaP;
        
        System.out.println("=======Program Nilai Terbesar dan Nilai Terkecil Nilai Mahasiswa========");
        System.out.print("Masukan nama Petugas : ");
        namaP = input.nextLine();
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        n = input.nextInt();
        mencariNilai(n,namaP);
    }
    
}
