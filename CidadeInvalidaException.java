package errosLocal;

public class CidadeInvalidaException extends Exception {
	public CidadeInvalidaException() {
        super("Cidade invalida, digite uma cidade valida.");
    }
}
