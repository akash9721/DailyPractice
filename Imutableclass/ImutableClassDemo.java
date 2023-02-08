package com.java.other;

public class ImutableClassDemo {

	public static void main(String[] args) {

		Address address = new Address("Delhi", "Delhi");
		System.out.println("hascode :" + address.hashCode());

		User user1 = new User(123, "akash", address);
		System.out.println(user1);

		Address address2 = user1.getAddress();
		System.out.println("hascode :" + address2.hashCode());

		address2.setCity("Mumbai");
		address2.setState("Mumbai");
		System.out.println(user1);
	}
}

++++++++++++++++++++++========output++++++++++++++++++++++++++++
hascode :1586600255
User [id=123, name=akash, address=Address [city=Delhi, state=Delhi]]
hascode :305808283
User [id=123, name=akash, address=Address [city=Delhi, state=Delhi]]
