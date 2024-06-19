package dia1906;

public class atividade02 {

	public static void main(String[] args) {
		char dA [][] = {
				{'*','*','*','*'},
				{'*', '*','*'},
				{'*','*'},
				{'*'},
		};
		for(char[]letra:dA) {
			for(char diagonal: letra) {
				System.out.print(diagonal + "\t");
			}
			System.out.println();
		}
	}





}


