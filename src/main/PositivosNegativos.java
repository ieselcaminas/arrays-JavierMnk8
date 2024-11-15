public class PositivosNegativos {
    public static int positivosSuma(int [] numeros){
        int suma = 0;
        for (int positivos : numeros){
            if (positivos > 0){
                suma += positivos;
            }
        }
        return suma;
    }
    public static int negativosSuma(int [] numeros){
        int resta = 0;
        for (int negativos : numeros){
            if (negativos < 0){
                resta -= negativos;
            }
        }
        return resta;
    }
    public static void main(String[] args) {
        int [] numeros = {12, 34, -23, -6, 34, -8, 12, -5, 34, -1};

        int suma = positivosSuma(numeros);
        int resta = negativosSuma(numeros);

        System.out.println("La suma de todos los positivos es " + suma);
        System.out.println("La suma de todos los negativos es " + resta);
    }
}