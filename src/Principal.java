import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		LeituraDevice lendoDevice = new LeituraDevice();
		
		try {
			Scanner leitor = new Scanner(lendoDevice.leitura("E:\\logstest\\device.csv"));
			String linhaDoArquivo = new String();
			leitor.nextLine();
			while(leitor.hasNext()){
				linhaDoArquivo = leitor.nextLine();
				QuebraLinha quebrando = new QuebraLinha(linhaDoArquivo);
				FabricaAtividade gerarAtividade = new FabricaAtividade(quebrando.quebrandoLinhas());
				TiposDeAtividade atividade = gerarAtividade.criarAtividade();
				
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
