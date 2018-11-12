package Local;

public class Local {
	
	//Atributos da classe Local;
	private double coordenadax, coordenaday;
	private String logradouro;
	private String cidade;
	private String bairro; //opcional;
	
	
	public void Locais (int x, int y, String logradouro){
		this.coordenadax = x;
		this.coordenaday = y;
		this.logradouro = logradouro;
	}


    public double getCoordenadax() {
       return this.coordenadax;
    }
    public double getCoordenaday() {
       return this.coordenaday;
    }
   public void setCoordenada(int x, int y) {
      this.coordenadax = x;
      this.coordenaday = y;
    }

    public String getLogradouro() {
       return this.logradouro;
    }
    public void setLogradouro (String logradouro) {
       this.logradouro = logradouro;
    }

    public String getCidade() {
       return this.cidade;
    }   
    public void setDistancia(String cidade) {
    this.cidade = cidade;
    }
    
    public String getBairro() {
        return this.bairro;
     }   
     public void setBairro(String bairro) {
     this.bairro = bairro;
     }
}