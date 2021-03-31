
package Matriks;

public class Tugas2 {
    
    public static void main(String[] args) {
        
        int[][] matriksA = {
            {12, 22},
            {10, 20},
            {11, 21}
        };
        int[][] matriksB = {
            {6, 5},
            {8, 9},
            {7, 4}
        };
        
        int[][] hasilKurang = new int[matriksA.length][matriksA[0].length];
        if (matriksA.length == matriksB.length && matriksA[0].length == matriksB[0].length) {
            for (int i = 0; i < matriksA.length; ++i) {
                for (int j = 0; j < matriksA[0].length; ++j) {
                    
                    hasilKurang[i][j] = matriksA[i][j] - matriksB[i][j];
                    System.out.print(hasilKurang[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Baris dan kolom matriks tidak sama");
        }
    }
}
