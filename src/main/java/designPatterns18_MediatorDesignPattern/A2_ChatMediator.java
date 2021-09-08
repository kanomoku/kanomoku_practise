package designPatterns18_MediatorDesignPattern;

public interface A2_ChatMediator {
	public void sendMessage(String msg, A1_User user);
	void addUser(A1_User user);
}

