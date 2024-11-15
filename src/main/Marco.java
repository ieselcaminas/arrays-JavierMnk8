import java.util.Scanner;

class Marco {
	public static int masLargo(String[] cadenas){
		int largo = 0;
		//int largo = cadenas.length[0];
		for (int i = 0; i < cadenas.length; i++) {
			if (cadenas[i].length() > largo){
				largo = cadenas[i].length();
			}
		}
		return largo;
	}
	public static String asteriscos(int largo){
		String asteriscos = "";
		for (int i = 0; i < largo + 4; i++) {
			//System.out.print("*");
			asteriscos += "*";
		}
		return asteriscos;
	}


	public static void main(String[] args){
		String[] cadenas = new String[5];
		System.out.println("Introduce 5 cadenas de texto:");
		Scanner miScanner;
		int largo;
        miScanner = new Scanner(System.in);

		//para introducir los 5 valores dentro de la variabe cadenas
		for (int i = 0; i < cadenas.length; i++){
			cadenas[i] = miScanner.next();
		}

		largo = masLargo(cadenas);

		System.out.println(asteriscos(largo));

		for (String array : cadenas){

			System.out.print("* " + array);

			for (int i = array.length(); i < largo; i++) {
					System.out.print(" ");

			}
			System.out.print(" *");
			System.out.println();
		}

		System.out.println(asteriscos(largo));
	}
}