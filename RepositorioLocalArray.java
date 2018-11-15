package Local;
 import errosLocal.*;

	public class RepositorioLocalArray implements RepositorioLocal {
	    private Local[] arrayLocal = new Local[200];
	    private int indice;

    //Construtor basico
     public RepositorioLocalArray() {
        this.arrayLocal = new Local[200];
        this.indice = 0;
     }

    //Verifica se o array nao esta cheio e insere a local
    public void inserir(Local local)
            throws LimiteAtingidoException {
        if (this.indice < this.arrayLocal.length) {
            this.arrayLocal[indice] = local;
            this.indice = this.indice + 1;
        } else {
            LimiteAtingidoException e;
            e = new LimiteAtingidoException();
            throw e;
        }
    }

    //Remove a local e tambem reorganiza suas posicoes no array
    public void remover(double x, double y)
            throws LocalNaoEncontradoException {
        int index = this.getIndice(x, y);

     //Troca os elementos de lugar, jogando-os uma posicao a esquerda
        for (int i = index; i < this.arrayLocal.length - 1; i++) {
            this.arrayLocal[i] = arrayLocal[i + 1];
        }
        this.arrayLocal[this.arrayLocal.length - 1] = null;
        this.indice = this.indice - 1;
    }

    //Procura por um local e o retorna a partir de sua coordenada
    public Local procurar(double x, double y)
            throws LocalNaoEncontradoException {
        Local resposta = null;
        boolean achou = false;
        for (int i = 0; i < this.indice && !achou; i++) {
            if (this.arrayLocal[i].getCoordenadax==x) {
                resposta = this.arrayLocal[i];
                achou = true;
            }
        }

        //Retorna um erro caso a local nao seja encontrada
        if (achou) {
            return resposta;
        } else {
            LocalNaoEncontradoException e;
            e = new LocalNaoEncontradoException();
            throw e;
        }
    }

    //Recebe uma local, procura pela sua coordenada no array e a atualiza
    public void atualizar(Local local)
            throws LocalNaoEncontradoException {
        int indice = this.getIndice(local.getCoordenadax(),local.getCoordenaday());
        this.arrayLocal[indice] = local;
    }

    //Verifica se existe um determinado objeto a partir de uma dada coordenada
    public boolean existe(int x, int y) {
        boolean resposta = false;
        for (int i = 0; i < this.indice && !resposta; i++) {
            if ((this.arrayLocal[i].getCoordenadax()==x) && (this.arrayLocal[i].getCoordenaday()==y)) {
                resposta = true;
            }
        }
        return resposta;
    }

    //Metodo que retorna o indice de um objeto a partir de uma coordenada
    public int getIndice(double x, double y)
            throws LocalNaoEncontradoException {
        int retorno = 0;
        boolean achou = false;
        for (int i = 0; i < this.indice && !achou; i++) {
            if ((this.arrayLocal[i].getCoordenadax()==x) && (this.arrayLocal[i].getCoordenaday()==y)) {
                retorno = i;
                achou = true;
            }
        }

        //Retorna um erro caso a local nao seja encontrado
        if (achou) {
            return retorno;
        } else {
            LocalNaoEncontradoException e;
            e = new LocalNaoEncontradoException();
            throw e;
        }
    }
	}
