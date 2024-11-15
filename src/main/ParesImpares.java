public class ParesImpares {
    public static int esPar(int [] numeros){
        int totalPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0){
                totalPares ++;
            }
        }
        return totalPares;
    }

    public static int esImpar(int[] numeros){
        int totalImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0){
                totalImpares++;
            }
        }
        return totalImpares;
    }

    public static void main(String[] args) {
        int [] numeros = {12, 34, -23, -6, 34, -8, 12, -5, 34, -1};

        System.out.println("Hay un total de " + esPar(numeros) + " números pares");
        System.out.println("Hay un total de " + esImpar(numeros) + " números impares");
    }
}