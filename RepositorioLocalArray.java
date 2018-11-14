package Local;
 import errosLocal.*;

	public class RepositorioLocalArray implements RepositorioLocal {
	    private Local[] arrayLocal = new Local[200];
	    private int contador = 0;

	    
	    //Verifica se o array nao esta cheio e insere a local  
	    public void inserir(Local local) {
	           
	        if (this.contador < this.arrayLocal.length) {
	            this.arrayLocal[contador] = local;
	            this.contador++;
             }
	    
	     }
 }//Construtor basico
    public RepositoriolocalsArray() {
        this.arraylocal = new local[200];
        this.indice = 0;
    }

    //Verifica se o array nao esta cheio e insere a local
    public void inserir(local local)
            throws LimiteAtingidoException {
        if (this.indice < this.arraylocal.length) {
            this.arraylocal[indice] = local;
            this.indice = this.indice + 1;
        } else {
            LimiteAtingidoException e;
            e = new LimiteAtingidoException();
            throw e;
        }
    }

    //Remove a local e tambem reorganiza suas posicoes no array
    public void remover(String codigo)
            throws LocalNaoEncontradoException {
        int index = this.getIndice(codigo);

        //Troca os elementos de lugar, jogando-os uma posicao a esquerda
        for (int i = index; i < this.arraylocal.length - 1; i++) {
            this.arraylocal[i] = arraylocal[i + 1];
        }
        this.arraylocal[this.arraylocal.length - 1] = null;
        this.indice = this.indice - 1;
    }

    //Procura por uma local e a retorna a partir de seu codigo
    public local procurar(String codigo)
            throws LocalNaoEncontradoException {
        local resposta = null;
        boolean achou = false;
        for (int i = 0; i < this.indice && !achou; i++) {
            if (this.arraylocal[i].getCodigo().equalsIgnoreCase(codigo)) {
                resposta = this.arraylocal[i];
                achou = true;
            }
        }

        //Retorna um erro caso a local nao seja encontrada
        if (achou) {
            return resposta;
        } else {
            localNaoEncontradaException e;
            e = new localNaoEncontradaException();
            throw e;
        }
    }

    //Recebe uma local, procura pelo seu codigo no array e a atualiza
    public void atualizar(local local)
            throws LocalNaoEncontradOException {
        int indice = this.getIndice(local.getCodigo());
        this.arraylocal[indice] = local;
    }

    //Verifica se existe um determinado objeto a partir de um dado codigo
    public boolean existe(String codigo) {
        boolean resposta = false;
        for (int i = 0; i < this.indice && !resposta; i++) {
            if (this.arraylocal[i].getCodigo().equals(codigo)) {
                resposta = true;
            }
        }
        return resposta;
    }

    //Metodo que retorna o indice de um objeto a partir de um codigo
    public int getIndice(String codigo)
            throws LocalNaoEncontradoException {
        int retorno = 0;
        boolean achou = false;
        for (int i = 0; i < this.indice && !achou; i++) {
            if (this.arraylocal[i].getCodigo().equals(codigo)) {
                retorno = i;
                achou = true;
            }
        }

        //Retorna um erro caso a local nao seja encontrada
        if (achou) {
            return retorno;
        } else {
            LocalNaoEncontradoException e;
            e = new LocalNaoEncontradoException();
            throw e;
        }
    }
