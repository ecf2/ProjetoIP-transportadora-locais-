package Local;
import errosLocal.*;

public class CadastroLocal {
	private RepositorioLocal locais;

    //Se o construtor receber um parametro true, inicializa uma lista, caso contrario inicializa um array;
    public CadastroLocal(boolean tipo) {

        if (tipo) {
            this.locais = new RepositorioLocalLista();
        } else {
            this.locais = new RepositorioLocalArray();
        }
    }

  //Verifica se a rota ja esta cadastrada, caso nao esteja, a cadastra
    public void cadastrar(Local local)
            throws LocalJaCadastradoException, LimiteAtingidoException {
       if (!this.locais.existe(local.getCodigo())) {
            this.locais.inserir(local);
        } else {
             LocalJaCadastradoException e;
            e = new LocalJaCadastradoException();
            throw e;
        }
    }
    
    //Chama o remover da interface
    public void remover(int x, int y)
            throws LocalNaoEncontradoException {
        this.locais.remover(x, y);
    }

    
  //Chama o procurar da interface
    public Local procurar(int x, int y)
            throws LocalNaoEncontradoException {
        return this.locais.procurar(x,y);
    }
 
  //Chama o atualizar da interface
   public void atualizar(Local local)
        throws LocalNaoEncontradoException {
      this.locais.atualizar(local);
   }

  //Chama o existe da interface
    public boolean existe(int x, int y) {
      return this.locais.existe(x, y);
}
}

