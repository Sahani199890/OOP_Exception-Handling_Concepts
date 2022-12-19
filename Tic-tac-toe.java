import java.io.*;
import java.util.*;

public class Solution {
    
    static boolean isGameDraw(int[][] mat){
        int n=mat.length;
        for(int i=0;i<n;i++){
            
            boolean allSame=true;
            int ele=mat[i][0];
            for(int j=1;j<n;j++){
                if(ele!=mat[i][j]){
                    allSame=false;
                    break;
                }
            }
            if(allSame){
                return false;
            }
        }
        for(int i=0;i<n;i++){
            boolean allSame=false;
            int ele=mat[0][i];
            for(int j=1;j<n;j++){
                if(ele!=mat[i][j]){
                    allSame=false;
                    break;
                }
            }
            if(allSame){
                return false;
            }
        }
        boolean allSame=true;
        for(int i=0;i<n;i++){
            if(mat[i][i]!=mat[0][0]){
                allSame=false;
                break;
                }
            }
            if(allSame){
                return false;
        }
        allSame=true;
        for(int i=0;i<n;i++){
            if(mat[i][n-1-i]!=mat[0][n-1]){
                allSame=false;
                break;
                }
            }
            if(allSame){
                return false;
            }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] mat=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        if(isGameDraw(mat)){
            System.out.print("Draw");
        }
        else{
            System.out.print("Games End");
        }
    }
}