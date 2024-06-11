package prog2;
import java.util.*;
public class progr2 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        boolean s=false;
        int num=0;
        while(!s){
            try{
                System.out.println("¿Cuantas filas y columnas quieres que tenga la matriz?");
                num=l.nextInt();
                s=true;
            }catch(InputMismatchException e){
                System.out.println("Solo puedes ingresar numeros");
                l.nextLine();
            }
        }
        s=false;
        int op=0;
        while(!s){
            try{
                System.out.println("\n *1*-restar matrices-*-*\n *2*-salir-*-*");
                op=l.nextInt();
                s=true;
            }catch(InputMismatchException e){
                System.out.println("Solo puedes ingresar numeros");
                l.nextLine();
            }
        }
        int matriz1[][]=new int[num][num];
        int matriz2[][]=new int[num][num];        
        
           
            
                re(matriz1,1);
                re(matriz2,2);
                mos(matriz1,1);
                mos(matriz2, 2);
                rest(matriz1, matriz2, num);   
    }
     public static void id(int dm){
        int ident[][]=new int[dm][dm];
         for(int i=0;i<ident.length;i++){
            for(int j=0;j<ident[i].length;j++){
                if(i==j){
                    ident[i][j]=1;
                }else{
                    ident[i][j]=0;
                }
                System.out.print(ident[i][j]+" ");
            }
            System.out.println(" ");
        }
        
    }
    public static int [][]rest(int m1[][],int m2[][],int dime){
        int res[][]=new int[dime][dime]; 
        System.out.println("Operacion de resta de matrices");
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                res[i][j]=m1[i][j]-m2[i][j];
                System.out.print(res[i][j]+"  ");
            }
            System.out.println(" ");
        }
        return res;
    }
    public static void mos(int mat[][],int m){
        System.out.println("Muestra la matriz "+m);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        } 
    }
    public static void re(int mat[][],int matr){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                
                mat[i][j]=(int)(Math.random()*9);
            }
        }
    }
}