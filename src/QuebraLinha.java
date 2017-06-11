
public class QuebraLinha {
	String valoresEntreVirgulas;
	String[] valorFinal;
	public QuebraLinha(String linhaDoArquivo) {
		
		this.valoresEntreVirgulas = linhaDoArquivo;
		
	}
	
	public String[] quebrandoLinhas(){
		this.valorFinal = valoresEntreVirgulas.split(",");
		return valorFinal;
	}
	
	
}
