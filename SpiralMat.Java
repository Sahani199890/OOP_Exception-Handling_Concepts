import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=scan.nextInt();
            }
        }
        int startRow=0,endRow=n-1;
        int startCol=0,endCol=m-1;
        while(startRow<=endRow && startCol<=endCol){
            for(int i=startCol;i<=endCol;i++){
                System.out.print(mat[startRow][i]+"   ");
            }
            startRow++;
            for(int i=startRow;i<=endRow;i++){
                System.out.print(mat[i][endCol]+"   ");
            }
            endCol--;
            for(int i=endCol;i>=startCol;i--){
                if(startRow>endRow || startCol>endCol){
                    break;
                } 
                System.out.print(mat[endRow][i]+"   ");
            }
            endRow--;
            for(int i=endRow;i>=startRow;i--){ 
                System.out.print(mat[i][startCol]+"   ");
            }
            startCol++;
        }
    }
}