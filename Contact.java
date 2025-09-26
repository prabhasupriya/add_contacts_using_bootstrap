package aiml.restapi.contact_api.contact_api.demo.model;

public class Contact{
	private String mobileNumber;
	private String name;
	private String email;
	private String type;
	
	public Contact(){}

	public Contact(String mobileNumber, String name, String email, String type) {
		this.mobileNumber = mobileNumber;
		this.name = name;
		this.email = email;
		this.type = type;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
