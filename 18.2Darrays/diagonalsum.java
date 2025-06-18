public class diagonalsum {
    public static void diaonal_sum(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        // btw here n==m(no. of rows = no. of columns)
        // here time complexlity is O(n^2) so this is not a optimized code...
        int sum=0;
        if(n%2==0){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    // for primary diaognal
                    if(i==j){
                        sum+=matrix[i][j];
                    }else if(i+j == n-1){
                        sum+=matrix[i][j];
                    }
            }
        }System.out.println(sum);
        }
    }
    public static void best_diagonal_sum(int matrix[][]){
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            // primary diagonal sum
            sum+=matrix[i][i];
            // secondary diagonal sum
            // we know this : i+j = n-1 from this j = n-1-i
            if(i != matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        int matrix[][] ={
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                        };
    diaonal_sum(matrix); 
    best_diagonal_sum(matrix);
    }
}
