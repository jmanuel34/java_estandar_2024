package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class TestEscritura {

	public static void main(String[] args) {
		String ruta="nombres.txt";
		Path pt=Path.of(ruta);
		try {			
			Files.writeString(pt, "cadena1"+System.lineSeparator(),StandardOpenOption.APPEND,StandardOpenOption.CREATE);
			Files.writeString(pt, "cadena2"+System.lineSeparator(),StandardOpenOption.APPEND);
			Files.writeString(pt, "cadena3"+System.lineSeparator(),StandardOpenOption.APPEND);
		}
		
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
