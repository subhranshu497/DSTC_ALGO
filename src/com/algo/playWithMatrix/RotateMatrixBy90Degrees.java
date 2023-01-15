package com.algo.playWithMatrix;

public class RotateMatrixBy90Degrees {

    public static void main(String[] args) {
        int [][] matrixInitial = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("=====Initial Matrix======");
        printMatrix(matrixInitial);
        System.out.println("=====Transpose Matrix======");
        transposeMatrix(matrixInitial);
        System.out.println("======Rotation of Matrix======");
        rotateMatrix(matrixInitial);
    }
    public static void printMatrix(int[][] matrixInitial){
        for(int i=0;i<matrixInitial.length;i++){
            for(int j=0;j<matrixInitial.length;j++){
                System.out.print(matrixInitial[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void transposeMatrix(int[][] matrixInitial){
        //check for n*n or not
        int temp =0;
        for(int i=0;i<matrixInitial.length;i++){
            for(int j=i;j<matrixInitial.length;j++){
                    temp = matrixInitial[i][j];
                    matrixInitial[i][j] = matrixInitial[j][i];
                    matrixInitial[j][i] = temp ;
            }
        }
        printMatrix(matrixInitial);
    }
    public static void rotateMatrix(int[][] matrixInitial){
        int temp =0;
        for(int i=0;i<matrixInitial.length;i++){
            for(int j=0,k=matrixInitial.length-1;j<matrixInitial.length/2;j++, k--){
                temp = matrixInitial[i][j];
                matrixInitial[i][j] = matrixInitial[i][k];
                matrixInitial[i][k] = temp ;
            }
        }
        printMatrix(matrixInitial);
    }
}
