package ID.java;

public class Net {
	int ID ;
	int password;
	int email;
	
	public Net() {
		
	}
	
	public Net(int ID, int password) {
		this.ID = ID;
		this.password = password;
		String email = "ID" + "yantingji@itedu.com";
	}
	
	public Net(int ID, int password,int email) {
		this.ID = ID;
		this.password = password;
		this.email = email;
	}
	
	public static void main(String[] args) {
		Net net = new Net(int ID,int password,int email);
	}

	

}
