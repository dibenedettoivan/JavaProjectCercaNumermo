
public class CercaNumero {
	
	public static void main(String[] args) {
		
		int maxNum = 10000;
		int numeroCasuale;
		int bersaglio = 10000;
		int tentativi = 0;
		while(true){
			numeroCasuale = (int)(Math.random() * maxNum + 1);
			tentativi++;
			if (numeroCasuale == bersaglio) 
				break;
			
			
		}	System.out.println("Per trovare il numero " + bersaglio + " sono stati fatti " + tentativi + " tentativi.");
	}

}
