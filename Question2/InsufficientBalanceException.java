package Question2;

public class InsufficientBalanceException extends RuntimeException{
private String message;

public InsufficientBalanceException() {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
public String toString() {
	return "InsufficientBalanceException:--" + message;
}

}
