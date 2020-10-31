/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan30.cakep;

/**
 *
 * @author Fiona Avila
 */

import java.util.Scanner;

public class ProgramCakep {
    
    static Scanner scan = new Scanner(System.in);
    
    String warna, nama;
    
    String merah = "\u001b[31m";
    String biru = "\u001b[34m";
    String kuning = "\u001b[33m";
    String hijau = "\u001b[32m";
    String ungu = "\u001b[35m";
    String biruMuda = "\u001b[36m";
    
    public void pertanyaan(){
        System.out.println(merah + "Kamu" + hijau + " ngerjain sendiri " + kuning +
                "latihan 17 sampe" + biru + " latihan 30 ini?");
    }
    
    public String jawabanSaya(){
        System.out.print(biru + "Jawab" + merah + " (ya/tidak) : ");
        String jawaban = scan.next().toLowerCase();
        System.out.println();
        return jawaban;
    }
    
    public void isiKomentar(){
        if(jawabanSaya().equals("ya")){
           System.out.println(merah + "Cakep bener." + ungu +" Good Jood!"); 
        }else{
            System.out.println(merah + "Tetep cakep sih.");
            System.out.println(biruMuda + "Sing penting paham konsep nya yee.");
            System.out.println("Keep the code works dude!");
        }
    }
    
    public static void main(String[] args) {
        ProgramCakep jawab = new ProgramCakep();
        jawab.pertanyaan();
        jawab.isiKomentar();
        
        System.out.println();
        System.out.println("Sekian tugas latihan 17-30 dari Fiona Avila :)");
    }
    
}
