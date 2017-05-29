package Model;

public class User {
	private int id_user;
	private String username;
	private String password;
	private String tip;
	
	public User(){}
	
	public User(int id_user, String username, String password) {
		super();
		this.id_user = id_user;
		this.username = username;
		this.password = password;
		
	}
	
	public User(int id_user, String username, String password,String tip) {
		super();
		this.id_user = id_user;
		this.username = username;
		this.password = password;
		this.tip=tip;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
}
