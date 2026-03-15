package in.sp.beans;

public class Address {

	
	private String city;
	private int pincode;
	private int houseno;

 public Address(int pincode,String city,int houseno) {
	  this.city = city;
	  this.pincode = pincode;
	  this.houseno = houseno;
 }

	@Override
	public String toString() {
		return city + ", " + pincode + "," + houseno;
	}

}
