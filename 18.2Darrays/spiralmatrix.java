public class spiralmatrix{
    public static void spimatrix(int matrix[][]){

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length -1 ;
        while(startRow <=endRow && startCol <= endCol){
            // top
            for(int i=startCol;i<=endCol;i++){
                System.out.print(matrix[startRow][i]+" ");
            }
            // right
            for(int j=startRow+1;j<=endRow;j++){
                System.out.print(matrix[j][endCol]+" ");
            }
            // bottom
            for(int i=endCol-1;i>=startCol;i--){
                System.out.print(matrix[endRow][i]+" ");
            }
            // left
            for(int j=endRow-1;j>=startRow+1;j--){
                System.out.print(matrix[j][startCol]+" ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;  
        }
        


    }
    public static void main(String args[]){
        int matrix[][] ={
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                        }; 
        spimatrix(matrix);
    }
}