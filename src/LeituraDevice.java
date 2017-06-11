import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class LeituraDevice {
	
	BufferedReader arquivoDevice;
	
	public LeituraDevice() {
		super();
	}

	public BufferedReader leitura(String localDoArquivo) throws FileNotFoundException{
		arquivoDevice = new BufferedReader(new FileReader(localDoArquivo));
		return arquivoDevice;
	}
}
