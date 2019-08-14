package helo_1408;


public class AccountNotValidException extends Throwable {
	
	
	private static final long serialVersionUID = -1L;
	private String message;
	
	public AccountNotValidException()
	{
		super();
	}
	
	public AccountNotValidException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
 
	

}
