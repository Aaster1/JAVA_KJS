package Day13.Ex03_Comparator;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;

public class UserList {
	
	public static void main(String[] args) {
		
	
	ArrayList<User> userList = new ArrayList<User>(); 

	User u1 = new User("abcd1001","강진수",24);
	User u2 = new User("abcd1002","이용성",26);
	User u3 = new User("abcd1003","정슬기",25);
	User u4 = new User("abcd1004","김준혁",21);
	User u5 = new User("abcd1005","구교찬",24);
	User u6 = new User("abcd1006","이정훈",33);
	User u7 = new User("abcd1007","정재원",27);
	User u8 = new User("abcd1008","장조은",20);
	User u9 = new User("abcd1009","황조은",20);
	User u10 = new User("abcd1010","송조은",20);
	
	
	userList.add(u1);
	userList.add(u2);
	userList.add(u3);
	userList.add(u4);
	userList.add(u5);
	userList.add(u6);
	userList.add(u7);
	userList.add(u8);
	userList.add(u9);
	userList.add(u10);
	
//	Comparator<User> ageCom = new User();
	
	Collections.sort(userList,new User());
	
	for (User user : userList) {
		System.out.print(user.id+ "\t : ");
		System.out.println(user.name+ " : " + user.age);
	}
	
	}
}
