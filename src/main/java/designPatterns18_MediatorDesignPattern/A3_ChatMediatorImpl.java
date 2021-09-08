package designPatterns18_MediatorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class A3_ChatMediatorImpl implements A2_ChatMediator {

	private List<A1_User> users;
	
	public A3_ChatMediatorImpl(){
		this.users=new ArrayList<>();
	}
	
	@Override
	public void addUser(A1_User user){
		this.users.add(user);
	}
	
	@Override
	public void sendMessage(String msg, A1_User user) {
		for(A1_User u : this.users){
			//message should not be received by the user sending it
			if(u != user){
				u.receive(msg);
			}
		}
	}
}
