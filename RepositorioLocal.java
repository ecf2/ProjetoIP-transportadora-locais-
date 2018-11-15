package Local;
import errosLocal.*;
import errosLocal.LocalNaoEncontradoException;

public interface RepositorioLocal {
	
	   public void inserir(Local local)
	            throws LimiteAtingidoException, LocalJaCadastradoException;
	            
	    public void atualizar(Local local) 
	    		throws LocalNaoEncontradoException;
	           

	    public void remover(double x, double y) 
	    		throws LocalNaoEncontradoException;
	           

	    public Local procurar(double x, double y) 
	    		throws LocalNaoEncontradoException;
	            

	    public boolean existe(double x, double y);
	}

