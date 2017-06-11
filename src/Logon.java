
public class Logon extends TiposDeAtividade{
	private String id;
	private String date;
	private String time;
	private String domain;
	private String user;
	private String device;
	protected String status;

	public Logon(String[] atividade) {
		this.id = atividade[0];
		separarDataHora(atividade[1]);
		separarDominioUser(atividade[2]);
		this.device = atividade[3];
		this.status = atividade[4];
	}
	
	public String descricao(){
		return "LOGON";
	}
	public void separarDataHora(String separar){
		String[] separando = separar.split(" ");
		this.date = separando[0];
		this.time = separando[1];
	}
	
	public void separarDominioUser(String separar){
		String[] separando = separar.split("/");
		this.domain = separando[0];
		this.user = separando[1];
	}
	
	public String getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public String getDomain() {
		return domain;
	}

	public String getUser() {
		return user;
	}

	public String getDevice() {
		return device;
	}
	
	public String getConect() {
		return status;
	}
}
