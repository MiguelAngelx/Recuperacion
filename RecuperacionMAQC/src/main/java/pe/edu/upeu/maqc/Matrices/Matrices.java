package pe.edu.upeu.maqc.Matrices;

public class Matrices {
    



    public static void main(String[] args) {

        int [][] matriz1 = new int[][] { {1,2,4}, {6,8,10},{2,5,3} };
        int [][] matriz2 = new int[][] { {160,8,16}, {24,32,40},{8, 20,12} };
        sumarOtraMatriz (matriz1, matriz2);
    }

    public static int[][] sumarOtraMatriz(int[][] matrizA , int[][] matrizB) {
        int[][] matrizResultado;
        int filasA =matrizA.length;
        int columnasA = matrizA[0].length;

        int filasB =matrizB.length;
        int columnasB = matrizB[0].length;

        System.out.println("Primera matriz:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                System.out.print(matrizA[i][j] + "   ");
            }
            System.out.println("");
        }

        System.out.println("Segunda matriz:");
        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print(matrizB[i][j] + "   ");
            }
            System.out.println("");
        }

        if (filasA==filasB && columnasB==columnasA) {

            matrizResultado = new int[filasA][columnasA];
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasA; j++) {
                    matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }

        } else {
            throw new Error("Las matrices deben tener la misma cantidad de filas que columnas");
        }
        System.out.println("Matriz resultado:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                System.out.print(matrizResultado[i][j] + "   ");
            }
            System.out.println("");
        }
        return matrizResultado;
    }

}
