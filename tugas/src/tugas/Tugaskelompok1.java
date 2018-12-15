//=============================================Tugas kelompok 2====================================================//
//==========================================Kelas DMBA (2018-2019)================================================//
//Member :=======================================================================================================//
//1. Aldy Gilang Dwi M.  (2201840246)===========================================================================//
//2. Ginta Restu         (2201848513)==========================================================================//
//3. Rizky Ferdiansyah   (2201844351)=========================================================================//
//4. Wisnu Ismaya        (2201946432)========================================================================//
//5. Yolanda Septiana S. (2201846653)=======================================================================//


package tugas;

import java.util.Scanner;

public class Tugaskelompok1 {
        public static void main(String[] args) 
        {
            System.out.print("Masukkan jumlah kilogram yang akan dikonversi : ");
            Scanner input = new Scanner(System.in); 
            double kg = input.nextDouble();
            double pon = kg*2.2;
            double ons = kg*35.2;
            double g = kg*1000;
            
            System.out.println(kg + " kilogram sama dengan : \n" + pon + " pon\n" + ons + " ons\n" + g + " g\n");
        }
    }