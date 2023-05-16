
import java.util.Scanner;
public class TestSmartphone {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("inserisci marca telefono");
		String a = scan.nextLine();
		System.out.println("inserisci modello");
		String b = scan.nextLine();
		System.out.println("inserisci prezzo di lancio ");
		double c = scan.nextDouble();
		System.out.println("inserisci numero di pollici ");
		double d = scan.nextDouble();
		System.out.println("inserisci capienza ram ");
		int e = scan.nextInt();
		Smartphone tel1 = new Smartphone(a,b,c,d,e);
		Smartphone tel2 = new Smartphone();
		System.out.println(tel1.toString());
		System.out.println(tel2.toString());


	}

}
