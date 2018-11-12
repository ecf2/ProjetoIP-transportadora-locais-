package Local;

public class CadastroLocal {
	private repositorioLocais locais;
	
	//Se o construtor receber um parametro true, inicializa uma lista, caso contrario inicializa um array;
    public CadastroLocal(boolean tipo) {
    	
        if (tipo) {
            this.locais = new RepositorioLocalLista();
        } else {
            this.locais = new RepositorioLocalArray();
        }
    }
    
    
    public void cadastrarLocal(Local local){
		
	}
	public void removerLocal(int x, int y) {
		
	}
	public void atualizarLocal() {
		
	}
	public boolean procurarLocal(int x, int y){
		
	}
}

