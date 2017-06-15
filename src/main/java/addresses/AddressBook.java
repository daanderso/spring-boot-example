package addresses;

public class AddressBook {
  
	private String name;
   private String phoneNum;
   private String addr;
   
	
	
	public AddressBook( String name, String addr, String phoneNum){
	 this.name = name;
	 this.addr = addr;
	 this.phoneNum = phoneNum;
 }

	public String getAddr(){
		return addr;
	}

	public String getName() {
		return name;
	}


	public String getPhoneNum() {
		return phoneNum;
	}
}
