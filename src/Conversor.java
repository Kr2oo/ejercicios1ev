import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Conversor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Conversor de Euros a Dolares");
		
		System.out.print("Cu�ntos Euros desea convertir: ");
		float euros = Float.parseFloat(in.readLine());
		
		System.out.print("A cu�nto est� el cambio: ");
		float cambio = Float.parseFloat(in.readLine());
		
		System.out.printf("Dolares: %.2f $\n", (euros * cambio));

	}

}
