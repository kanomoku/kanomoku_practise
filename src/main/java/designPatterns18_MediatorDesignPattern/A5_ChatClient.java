package designPatterns18_MediatorDesignPattern;

public class A5_ChatClient {

	public static void main(String[] args) {
		A2_ChatMediator mediator = new A3_ChatMediatorImpl();
		A1_User user1 = new A4_UserImpl(mediator, "Pankaj");
		A1_User user2 = new A4_UserImpl(mediator, "Lisa");
		A1_User user3 = new A4_UserImpl(mediator, "Saurabh");
		A1_User user4 = new A4_UserImpl(mediator, "David");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi All");
	}
}

