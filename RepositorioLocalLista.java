package Local;
import errosLocal.*;

public class RepositorioLocalLista implements RepositorioLocal {
	private Local local;
	private RepositorioLocalLista proximo;

	// Construtor da lista;
	public RepositorioLocalLista() {
		this.local = null;
		this.proximo = null;
	}

	// Insere o elemento na lista;
	public void inserir(Local local) {
		if (this.local == null) {
			this.local = local;
			this.proximo = new RepositorioLocalLista();
		} else {
			this.proximo.inserir(local);
		}
	}

	// Remove o elemento da lista;
	public void remover(double x, double y) throws LocalNaoEncontradoException {
		Local localEncontrado;
		localEncontrado = this.procurar(x, y);

		if (this.local != null) {
			if (this.local.equals(localEncontrado)) {
				this.local = this.proximo.local;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.remover(x, y);
			}
			// Caso a rota nao seja encontrada;
		} else {
			LocalNaoEncontradoException e;
			e = new LocalNaoEncontradoException();
			throw e;
		}
	}

	// Retorna o local dada sua coordenada;
	public Local procurar(double x, double y) throws LocalNaoEncontradoException {
		Local resposta;
		resposta = null;
		if (this.local != null) {
			if ((this.local.getCoordenadax() == x) && (this.local.getCoordenaday() == y)) {
				resposta = this.local;
			} else {
				this.proximo.procurar(x, y);
			}
			// Caso a rota nao seja encontrada
		} else {
			LocalNaoEncontradoException e;
			e = new LocalNaoEncontradoException();
			throw e;
		}
		return resposta;
	}

	// Recebe uma rota, procura por ela e a atualiza
	public void atualizar(Local local) throws LocalNaoEncontradoException {
		Local localAtualizar;
		localAtualizar = procurar(local.getCoordenadax(), local.getCoordenaday());
		this.remover(local.getCoordenadax(), local.getCoordenaday());
		this.inserir(local);
	}

	// Verifica se existe um determinado objeto a partir de um dado codigo
	public boolean existe(double x, double y) {
		if (this.local != null) {
			if ((this.local.getCoordenadax() == x) && (this.local.getCoordenaday() == y)) {
				return true;
			} else {
				return this.proximo.existe(x, y);
			}
		} else {
			return false;
		}
	}
}
