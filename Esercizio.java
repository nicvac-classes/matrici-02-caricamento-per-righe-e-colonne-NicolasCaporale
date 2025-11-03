
public class Esercizio {

    public static void riempiPerRighe(int[][]m, int r, int c) {
        // SCRIVERE QUI IL CODICE DELL'ESERCIZIO
        int c = 1;
        for(int i = 0; i < r; ++i)
        {
            for(int j = 0; < c; ++j)
            {
                m[i][j] = c;
                ++c;
            }
        }
    }

    public static void riempiPerColonne(int[][]m, int r, int c) {
        int c = 1;
        for(int j = 0; j < c; ++j)
        {
            for(int i = 0; < r; ++i)
            {
                m[i][j] = c;
                ++c;
            }
        }
    
    }

    public static void main(String[] args) {
        int r = 3;
        int c = 5;
        
        int[][] mR = new int[r][c];
        int[][] mC = new int[r][c];

        riempiPerRighe(mr,r,c);
        riempiPerColonne(mc,r,c);

        System.out.println("Per righe:");
        UtilsMatrice.visualizza(matricePerRighe);

        System.out.println();
        System.out.println("Per colonne:");
        UtilsMatrice.visualizza(matricePerColonne);

    }
}