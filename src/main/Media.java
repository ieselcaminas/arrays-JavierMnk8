public class Media {
    public static double media(int[] numeros) {
        int suma = 0;
        double media;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        media = ((double) suma / (double) numeros.length);
        return media;
    }
    public static void main(String[] args) {
        int[] numeros = {3, 5, 6 ,7, 9 ,10, 8 ,8, 0 ,10};
        double media;

        media = media(numeros);
        System.out.println(media);
    }
}