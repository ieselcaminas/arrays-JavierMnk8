public class Minimo {
    public static int menorNumero(int numero[]){
        int minimo = numero[1];
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] < minimo){
                minimo = numero[i];
            }
        }
        return minimo;
    }//los metodos se encargar de SOLO UNA COSA, de encontrar el mayor o el menor, NADA MÁS

    public static void main(String[] args) {
        int numero[] = {10, 4 ,56 ,6, 65, 87, 23, 6, 2, 1};

        System.out.println("El número minimo es " + menorNumero(numero));
    }
}