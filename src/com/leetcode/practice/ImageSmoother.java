package com.leetcode.practice;

public class ImageSmoother {
    public static void main(String[] args) {
        int[][] img = {{100,0,10},{0,0,25},{10,10,10}};
        int[][] smoother = imgsmther(img);
        //print the image result
        for(int i=0;i<smoother.length;i++){
            for(int j=0;j<smoother[0].length;j++){
                System.out.print(smoother[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] imgsmther(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int [][] result = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum =0;
                int elementCount =0;
                for(int x = i-1;x<=i+1;x++){
                    for(int y = j-1;y<=j+1;y++){
                        if(x>=0 && x<m && y>=0 && y<n){
                            sum +=img[x][y] %256;
                            elementCount ++;
                        }
                    }
                }
                //result[i][j] = sum/elementCount;
                img[i][j] +=(sum/elementCount)*256;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                img[i][j] /=256;
            }
        }
        return img;
    }
}
