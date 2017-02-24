package Singleton;

public class InstitutoEducativo {
	private static InstitutoEducativo intance;
	private String nombreinstituto;
	public static InstitutoEducativo getInstance(){
		if(intance==null){
			intance=new InstitutoEducativo();
		}
		return intance;
	}
	public String getNombreinstituto() {
		return nombreinstituto;
	}
	public void setNombreinstituto(String nombreinstituto) {
		this.nombreinstituto = nombreinstituto;
	}
	
}
