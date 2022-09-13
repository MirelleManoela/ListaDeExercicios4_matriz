public class ex1 {

    public static void main(String[] args) {



        int[] [] matri = new int[3][3];

        matri[0] [0] = 8;
        matri[0] [1] = 7;
        matri[0] [2] = 6;

        matri[1] [0] = 5;
        matri[1] [1] = 4;
        matri[1] [2] = 3;

        matri[2] [0] = 2;
        matri[2] [1] = 1;
        matri[2] [2] = 0;

        for (int i=0; i<matri.length; i++){
            for (int j = 0 ; j<matri[i].length; j++){
                System.out.print(matri[i][j]+ " ");
            }
            System.out.println( );
        }
}
}