public class lockerSafe {
    public static int[][] unlockSafe(int[][] safe, int[] combination){
        int row=safe.length;
        int col=safe[0].length;
        int mid=4;
        for(int j=0;j<col;j++){ //column wise iterate korte hobe
            int target=combination[j];
            int targetInd=0;
            for(int i=0;i<row;i++){
                if(safe[i][j]==target){
                    targetInd=i;
                    break;
                }
            }
            int up=(targetInd-mid+row)%row;
            int down=(mid-targetInd+row)%row;
            if(up<=down){
                for(int i=0;i<up;i++){
                    int temp=safe[0][j];
                    for(int k=0;k<row-1;k++){

                        safe[k][j]=safe[k+1][j];
                    }
                    safe[row-1][j]=temp;
                }
            
            }
            else {
                for(int i=0;i<down;i++){
                    int temp=safe[row-1][j];
                    for(int k=row-1;k>0;k++){

                        safe[k][j]=safe[k-1][j];
                    }
                    safew[0][j]=temp;
                }
            }
        }
        return safe;
    }
    public static void main(String[] args) {
        int[][] safe = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 1},
            {2, 3, 4, 5, 6},
            {7, 8, 9, 1, 2},
            {3, 4, 5, 6, 7},
            {8, 9, 1, 2, 3},
            {4, 5, 6, 7, 8},
            {9, 1, 2, 3, 4},
            {5, 6, 7, 8, 9}
        };

        int[] combination = {8, 9, 5, 3, 2};

        int[][] unlockedSafe = unlockSafe(safe, combination);
        // Arr.print2D(unlockedSafe);

        // Print the resulting array
        for (int i = 0; i < unlockedSafe.length; i++) {
            for (int j = 0; j < unlockedSafe[0].length; j++) {
                System.out.print(unlockedSafe[i][j] + " ");
            }
            System.out.println();
        }
    }
}
