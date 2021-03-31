
package Matriks;

public class Tugas4 {
    
    public static void main (String[] args) {
        

        int[][] B = {
            {2, 1, -5},
            {3, 4, 2}
        };
        int trans[][] = new int[3][2];
        
       
        for (int i = 0; i < B.length; ++i) {
            for (int j = 0; j < B[0].length; ++j) {
                System.out.print(B[i][j]+ "\t");
            }
            System.out.println();
        }
        
        System.out.println("Hasil transpose matriks: ");
        for (int i = 0; i < B.length; ++i) {
            for (int j = 0; j < B[0].length  ; ++j) {
                trans[j][i] = B[i][j];
            }
        }
        for (int i = 0; i < B[0].length; ++i) {
            for (int j = 0; j < B.length; ++j) {
                System.out.print(trans[i][j] + "\t");
            }
            System.out.println();
        }
    }   
}