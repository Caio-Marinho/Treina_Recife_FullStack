package logic;

public class Client {
	private int _idClient;
	private String _nameClient;
	private int _ageClient;
	private String _mailClient;
	private boolean _statusClient;
	private int _idAccount;
	
	public Client(int idClient,String nameClient,int ageClient,String mailClient, boolean statusClient,int idAccount) {
		this._idAccount = idClient;
		this._nameClient = nameClient;
		this._ageClient = ageClient;
		this._mailClient = mailClient;
		this._statusClient = statusClient;
		this._idAccount = idAccount;
	}
}
