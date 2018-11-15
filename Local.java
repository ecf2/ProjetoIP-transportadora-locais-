package Local;

import errosLocal.*;

public class Local {

	// Atributos da classe Local;
	private double coordenadax, coordenaday;
	private String logradouro;
	private String cidade;
	private String bairro; // opcional;

	public void Locais(int x, int y, String logradouro, String cidade) throws LogradouroInvalidoException,
			CoordenadaInvalidaException, CidadeInvalidaException, InputMismatchException {

		// Verifica se o Logradouro é uma string valida;
		if (logradouro.matches("[a-zA-Z0-9]+")) {

			try {
				Integer.parseInt(logradouro);
				LogradouroInvalidoException e;
				e = new LogradouroInvalidoException();
				throw e;

			} catch (NumberFormatException e) {
				this.logradouro = logradouro;
			}
		} else {
			LogradouroInvalidoException e;
			e = new LogradouroInvalidoException();
			throw e;
		}

		// Verifica se a cidade e uma string valida;
		if (logradouro.matches("[a-zA-Z0-9]+")) {
			try {
				Integer.parseInt(cidade);
				CidadeInvalidaException e;
				e = new CidadeInvalidaException();
				throw e;

			} catch (NumberFormatException e) {
				this.cidade = cidade;
			}
		} else {
			CidadeInvalidaException e;
			e = new CidadeInvalidaException();
			throw e;
		}

		this.coordenadax = x;
		this.coordenaday = y;
		this.bairro = null;
	}

	public void Locais(int x, int y, String logradouro, String cidade, String bairro)
			throws LogradouroInvalidoException, CoordenadaInvalidaException, CidadeInvalidaException,
			BairroInvalidoException {
		// Verifica se o Logradouro é uma string valida;
		if (logradouro.matches("[a-zA-Z0-9]+")) {

			try {
				Integer.parseInt(logradouro);
				LogradouroInvalidoException e;
				e = new LogradouroInvalidoException();
				throw e;

			} catch (NumberFormatException e) {
				this.logradouro = logradouro;
			}
		} else {
			LogradouroInvalidoException e;
			e = new LogradouroInvalidoException();
			throw e;
		}

		// Verifica se a cidade e uma string valida;
		if (cidade.matches("[a-zA-Z0-9]+")) {
			try {
				Integer.parseInt(cidade);
				CidadeInvalidaException e;
				e = new CidadeInvalidaException();
				throw e;

			} catch (NumberFormatException e) {
				this.cidade = cidade;
			}
		} else {
			CidadeInvalidaException e;
			e = new CidadeInvalidaException();
			throw e;
		}

		// Verifica se o bairro e uma string valida;
		if (bairro.matches("[a-zA-Z0-9]+")) {
			try {
				Integer.parseInt(bairro);
				BairroInvalidoException e;
				e = new BairroInvalidoException();
				throw e;

			} catch (NumberFormatException e) {
				this.bairro = bairro;
			}
		} else {
			BairroInvalidoException e;
			e = new BairroInvalidoException();
			throw e;
		}

		this.coordenadax = x;
		this.coordenaday = y;

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

	public void setLogradouro(String logradouro) {
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