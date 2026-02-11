package in.sp.beans;

public class Address {

	 private int houseno;
	 private int pincode;
	 private String city;
	 
	 public Address(int houseno,String city,int pincode) {
		 this.houseno = houseno;
		 this.city = city;
		 this.pincode = pincode;
	 }
	 
	 @Override
	 public String toString() {
		return houseno+","+city+","+pincode; 
	 }
}
