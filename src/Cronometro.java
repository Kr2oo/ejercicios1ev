import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Cronometro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Dime tu nombre: ");
		long time1 = System.currentTimeMillis();
		
		String nombre = in.readLine();
		long time2 = System.currentTimeMillis();
		
		double segundos = (time2 - time1) / 1000d;
		System.out.printf("Hola %s, has tardado %.3f segundos en decirme tu nombre.\n", nombre, segundos);

	}

}
