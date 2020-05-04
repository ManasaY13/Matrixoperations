import java.util.Scanner;
import java.util.*;

public class MatrixDemo {

    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter rows and cols");
        int row=scan.nextInt();
        int col=scan.nextInt();
        int[][] m1=new int[row][col];
        int[][] m2=new int[row][col];
        int[][] addm=new int[row][col];
        int[][] mulm=new int[row][col];

        System.out.println("Enter elements of m1");
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                m1[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter elements of m2");
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                m2[i][j]=scan.nextInt();
            }
        }

        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                addm[i][j]=m1[i][j]+m2[i][j];
            }
        }

        System.out.println("addition of both matrices is");
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(addm[i][j]+ " ");
                }
                System.out.println( );
        }
         
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                for(int k=0;k<row;k++){
                    mulm[i][j]=mulm[i][j]+m1[i][k]*m2[k][j];
                }
                
            }
        }

        System.out.println("multiplication of both matrices is");
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mulm[i][j]+" ");
                }
                System.out.println( );
        }




       

    }
    
}
