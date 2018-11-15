package errosLocal;

public class BairroInvalidoException extends Exception{
	public BairroInvalidoException() {
        super("Bairro invalido, digite um bairro valido.");
    }
}
