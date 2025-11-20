class SymLowerTri {

    public static Integer[][] SymLowerTrin(Integer[][] matrix){
        int row=matrix.length;
        int col=matrix[0].length;
        if(!(row==col)) return matrix;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i<j){
                    matrix[j][i]+=matrix[i][j];
                    matrix[i][j]=0;
                }
            }
        }

        return matrix;
    }
    public static void main(String[] args){
        Integer[][] matrix = {
            {8,2,1},
            {3,5,4},
            {6,9,7},
        };
        Integer[][] returned_val_1 = SymLowerTrin( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print2D(SymLowerTrin(matrix));  
}
}
