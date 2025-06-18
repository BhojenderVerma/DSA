import java.util.*;
public class matrix {
    public static boolean search(int matrixx[][],int key){
        for(int i=0;i<matrixx.length;i++){
            for(int j=0;j<matrixx[0].length;j++){
                if(matrixx[i][j] == key){
                    System.out.println("the key is founded on ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){
        int matrixx[][] = new int[3][3];
        int n = matrixx.length ;// for get rows
        int m = matrixx[0].length; //for get columns
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<m;j++){
                matrixx[i][j] = sc.nextInt();
            }
        }


        // output 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrixx[i][j]+" ");
            }System.out.println();


        }
        System.out.println(search(matrixx, 5));
    }
}
