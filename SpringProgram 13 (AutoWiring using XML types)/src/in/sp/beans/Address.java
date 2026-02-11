package in.sp.beans;

public class Address {

	 private int houseno;
	 private int pincode;
	 private String city;
	 
	 public void setHouseno(int houseno) {
		 this.houseno = houseno;
	 }
	 public void setPincode(int pincode) {
		 this.pincode = pincode;
	 }
	 public void setCity(String city) {
		 this.city = city;
	 }
	 
	 @Override
	 public String toString() {
		return houseno+","+city+","+pincode; 
	 }
}
