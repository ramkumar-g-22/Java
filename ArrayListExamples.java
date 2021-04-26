import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> cabTypes = new ArrayList<String>();
		System.out.println("Size : " + cabTypes.size());
		
		// to add cab types in array list
		cabTypes.add("micro");
		cabTypes.add("mini");
		cabTypes.add("prime");
		
		System.out.println(cabTypes);
		
		int index = cabTypes.indexOf("hello");
		System.out.println("Index  " + index);
		
		int index1 = cabTypes.indexOf("prime");
		System.out.println("Prime Index  " + index1);
		
		boolean exists = cabTypes.contains("prime");
		System.out.println("Exists? : " + exists);
		
		cabTypes.clear();
		System.out.println(cabTypes);
		
		
		ArrayList<User> userList = new ArrayList<User>();
		
		User user1 = new User();
		user1.name = "Ramkumar";
		user1.email = "ram@mail.com";
		user1.password = "pass1234";
//		System.out.println(user1);
		
		User user2 = new User();
		user2.name = "Ramkumar1";
		user2.email = "ram@mail.com";
		user2.password = "pass1234";
//		System.out.println(user2);
		
		User user3 = new User();
		user3.name = "Ramkumar2";
		user3.email = "ram@mail.com";
		user3.password = "pass1234";
//		System.out.println(user3);
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		for (User user : userList) {
			if (user.name.equals("Ramkumar")) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
	
	

}
