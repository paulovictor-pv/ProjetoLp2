
public class FabricaAtividade {

	private String[] activity;
	private String verificar;
	
	public FabricaAtividade(String[] atividade) {
		
		this.activity = atividade;
		this.verificar = atividade[4];
	}
	
	public TiposDeAtividade criarAtividade(){
		if(verificar.equalsIgnoreCase("Connect") || verificar.equalsIgnoreCase("Disconnect")){
			return new Usb(activity);
		}else if(verificar.equalsIgnoreCase("Logon") || verificar.equalsIgnoreCase("Logoff")){
			return new Logon(activity);
		}else{
			return new Http(activity);
		}
	}

	public String[] getActivity() {
		return activity;
	}

	public String getVerificar() {
		return verificar;
	}

}
