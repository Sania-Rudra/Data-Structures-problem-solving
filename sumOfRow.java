public class sumOfRow {
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        int sumRow, sumCol;
        //row. eikhane ulto logic boshbe. inner loop e col er hisab kortesi 
        //kintu row er elements jog hobe karon j++ hoile a(i,j)=a(0,1) hobe
        //jar mane next row wise shift korbe. so, col er inner loop==row wise shift
        for(int i=0;i<matrix.length;i++){
             sumRow=0;
            for(int j=0;j<matrix[0].length;j++){
                sumRow+=matrix[i][j];
            }
            System.out.println("sum of column "+sumRow);
        }
        //column\
        for(int i=0;i<matrix[0].length;i++){
             sumCol=0;
            for(int j=0;j<matrix.length;j++){
                //eikhane i,j swap kore dite hobe karon ager bar
                //2nd ta inc hoisilo. ebar first ta increase hobe. 
                sumCol+=matrix[j][i];
            }
            System.out.println("sum fof rows: "+sumCol);
        }
}
}
