import java.util.Scanner;

public class p362 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int casos = scn.nextInt();
		int dia;
		int mes;

		for(int i=0; i<casos; i++){
			
			dia = scn.nextInt();
			mes = scn.nextInt();
			
			if(dia==25 && mes == 12) {
				System.out.println("SI");
			}
			else {
				System.out.println("NO");
			}
			
		}

	}

}
