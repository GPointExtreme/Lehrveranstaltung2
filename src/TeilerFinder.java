
public class TeilerFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Ganzzahl = 100;
		int Teiler = 2;
		
		while(Ganzzahl > Teiler) {
			if (Ganzzahl%Teiler==0) {
				System.out.println(Teiler);
			}
			Teiler++;
			}
			

	}

}
