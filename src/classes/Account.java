package classes;

import com.mkyong.customer.model.Customer;

public class Account {
	private static String firstName, lastName;
	private static String address;
	private static String dateOfBirth;
	private static String password;
	private static double ballance;
	private static String custId;
	
	public Account(Customer e) {
		super();
		firstName = e.getFirstName();
		lastName = e.getLastName();
		address = e.getAddress();
		dateOfBirth = e.getDateOfBirth();
		password = e.getPassword();
		ballance = e.getBallance();
		custId = e.getCustId();
	}

	public static String getFirstName() {
		return firstName;
	}

	public static void setFirstName(String firstName) {
		Account.firstName = firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public static void setLastName(String lastName) {
		Account.lastName = lastName;
	}

	public static String getAddress() {
		return address;
	}

	public static void setAddress(String address) {
		Account.address = address;
	}

	public static String getDateOfBirth() {
		return dateOfBirth;
	}

	public static void setDateOfBirth(String dateOfBirth) {
		Account.dateOfBirth = dateOfBirth;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		Account.password = password;
	}

	public static double getBallance() {
		return ballance;
	}

	public static void setBallance(double ballance) {
		Account.ballance = ballance;
	}

	public static String getCustId() {
		return custId;
	}

	public static void setCustId(String custId) {
		Account.custId = custId;
	}
	
}
