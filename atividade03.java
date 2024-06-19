package dia1906;

public class atividade03 {

	public static void main(String[] args) {
		char dB [][] = {
				{' ',' ',' ','*'},
				{' ', ' ','*',' '},
				{' ','*',' ',' '},
				{'*',' ',' ',' '},
				};
				for(char[]letra:dB) {
				for(char diagonal: letra) {
				System.out.print(diagonal + "\t");
				}
				System.out.println();
				}
				}
				


		}
	


