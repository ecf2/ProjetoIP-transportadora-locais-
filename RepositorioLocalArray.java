package Local;

	public class RepositorioLocalArray implements repositorioLocais {
	    private Local[] arrayLocal = new Local[200];
	    private int contador = 0;

	    
	    //Verifica se o array nao esta cheio e insere a rota  
	    public void inserir(Local local) {
	           
	        if (this.contador < this.arrayLocal.length) {
	            this.arrayLocal[contador] = local;
	            this.contador++;
             }
	    
	     }
 }
