class LabSpring24 {
    
public static Integer[] decrypt(Integer[][] matrix){
    int row=matrix.length;
    int col=matrix[0].length;
    int[] avg=new int[col];
    Integer[] newarr=new Integer[col-1];
    
    for(int j=0;j<col;j++){
        int sum=0;
        for(int i=0;i<row;i++){
            sum+=matrix[i][j];
        }
        avg[j]=sum/row;
    }
    for(int i=0;i<newarr.length;i++){
        newarr[i]=avg[i+1]-avg[i];
    }
    return newarr;
}

    public static void main(String[] args){
        Integer[][] matrix = {
            {85,90,78},
            {88,85,80},
            {75,95,85},
            {90,88,82},
        };
        Integer[] returned_val_1 = decrypt( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);
    }
}