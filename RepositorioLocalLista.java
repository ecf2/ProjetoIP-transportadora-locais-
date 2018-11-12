package Local;


public class RepositorioLocalLista implements repositorioLocais {
    private Local local;
    private RepositorioLocalLista proximo;

    //Construtor da lista
    public RepositorioLocalLista() {
        this.local = null;
        this.proximo = null;
    }

    //Insere o elemento na lista 
    public void inserir(Local local) {
        if (this.local == null) {
            this.local = local;
            this.proximo = new RepositorioLocalLista();
        } else {
            this.proximo.inserir(local);
        }
    }
    
   //Remove o elemento da lista
    public void remover(String codigo)
            throws RotaNaoEncontradaException {
        Rota rotaEncontrada;
        rotaEncontrada = this.procurar(codigo);

        if (this.rota != null) {
            if (this.rota.equals(rotaEncontrada)) {
                this.rota = this.proximo.rota;
                this.proximo = this.proximo.proximo;
            } else {
                this.proximo.remover(codigo);
            }
            //Caso a rota nao seja encontrada
        } else {
            RotaNaoEncontradaException e;
            e = new RotaNaoEncontradaException();
            throw e;
        }
    }
}
