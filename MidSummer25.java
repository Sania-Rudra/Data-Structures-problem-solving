import java.util.Arrays;

class MidSummer25 {
     public static int[] localMinima(int[][] matrix, int thershold){
        int row=matrix.length;
        int col=matrix[0].length;
        int[] result=null;
        boolean isLocal=false;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]<thershold){
                    if(i>0&&j>0&&i<row&&j<col){
                        int n=matrix[i][j];
                        if(n<matrix[i-1][j]&&
                            n<matrix[i+1][j]&&
                            n<matrix[i][j+1]&&
                            n<matrix[i][j-1]
                        )
                        {
                            isLocal=true;
                        }
                    }
                }
                if(isLocal){
                    result=new int[]{i,j};
                }
            }
        }
        return result;
     }
    public static void main(String[] args){
        int[][] matrix = {
            {8,2,1},
            {3,5,4},
            {6,9,7},
        };
        int threshold=100;
        int[] returned_val_1 = localMinima( matrix, threshold);
        System.out.print("\nYour Output:\n");
        System.out.println(Arrays.toString(returned_val_1));
}
}

