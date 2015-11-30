
public class GrenzwertReihe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double aktuellerWert = 0;
		double letzterWert = 0;
		double genauigkeit = 0.0001;
		
		for(int i = 1; ; i*=2) {
			aktuellerWert += 1.0/i;
			if (aktuellerWert - letzterWert < genauigkeit) {
				System.out.println(aktuellerWert);
				break;
			}
			letzterWert=aktuellerWert;
				
			
		}

	}

}
