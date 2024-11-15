public class DNI {
    public static char letraDNI(int dni){
        final char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = dni % 23;
        return letras[resto];
    }
    public static void main(String[] args) {
        int dni = 54516524;

        char letra = (letraDNI(dni));

        System.out.println(dni + "" + letra);
    }
}