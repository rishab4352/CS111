/*************************************************************************
 *  Compilation:  javac HadamardMatrix.java
 *  Execution:    java HadamardMatrix 2
 *
 *  @author:
 *
 * The program HadamardMatrix prints H(n)
 *
 *  % java HadamardMatrix 2
 *  T T
 *  T F
 *
 *************************************************************************/

public class HadamardMatrix {

    public static void main(String[] args) {

    int a = Integer.parseInt(args[0]);
    boolean[][] matrix = new boolean [a][a];
    matrix [0][0]= true;
    for(int index = 1; index < a; index += index){
        for (int i = 0;i<index;i++){
            for(int j =0;j<index;j++){
                matrix[i+index][j] = matrix[i][j];
                matrix[i][j+index] = matrix[i][j];
                matrix[i+index][j+index] = !matrix[i][j];
            }
        }
    }
    for (int i = 0;i<a; i++){
        for (int j= 0;j<a;j++){
            if (matrix[i][j]){
                System.out.print("T ");
            } 
            else {
                System.out.print("F ");
            }
        }
        System.out.println();
    }
    }
}
