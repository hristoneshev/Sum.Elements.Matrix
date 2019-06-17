public class Main {

    public static void main(String[] args) {


        int [][] matrix = { {1,10,5,8}, {-5,2,30,2}, {8,12,6,3}, {12,7,8,1} };

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }

        int SUM = 0;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                SUM += matrix[i][j];
            }
        }
        System.out.println();
        System.out.println("SUM is " + SUM);
    }
}
