package dia1906;
import java.util.ArrayList;
public class atividade01 {

	public static void main(String[] args) {
		char mA [] [] = {
				 {'A','B','C','D','E'},
		         {'F','G','H','I','J'},
		         {'K','L','M','N','O'},
		         {'P','Q','R','S','T'}
		
	};

		for (char []letra:mA){
			for (char  coluna:  letra) {
				System.out.println(coluna + "\t");
			}
			System.out.println();
		}

	}
}

