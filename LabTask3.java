//Lab Task 03: Decryption Process
class LabTask3{

    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix( Integer[][] matrix ){
        int rowNum=matrix.length;
        int colNum=matrix[0].length;
        int colSum[]=new int[colNum];
        System.out.println(rowNum);
        for(int i=0;i<colNum;i++){
            int sum=0;
            for(int j=0;j<rowNum;j++){
                sum+=matrix[j][i];
            }
        colSum[i]=sum;
        }
        Integer diff[]=new Integer[colNum-1];
        for(int k=0;k<colNum-1;k++){
            diff[k]=colSum[k+1]-colSum[k];
        }
        return diff;

        //For this task you'll need to create new arrays
        //we recommend you to use Integer type.
        //example:  Integer[] array = new Integer[5]

        //TO DO
        //DELETE the following return statement when you're ready to return the 2D array
        //return null;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println(matrix[0].length);
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}