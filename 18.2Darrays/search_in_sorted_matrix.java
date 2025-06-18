public class search_in_sorted_matrix {
    // here we have many method like 1.brute search(Time complex.. = O(n^2)) 2. binary search (time com. = n(log(n))) 
    // their time comp. is not good so we use a method called Staircase search 
    // -:---------------note : here matrix is sorted matrix--------------------------:-


    public static boolean staircaseSearch(int matrix[][],int key){
        int row = 0 , col = matrix[0].length -1;
        while(row<matrix.length && col >= 0){
            if(key == matrix[row][col]){
                System.out.println("key is founded");
                return true;
            }else {
                // top 
                for(int i=0;i<)
            }
        }
        System.out.println("key is not exist");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] ={
                        {10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}
                        };
        int key = 33;
    }
}
