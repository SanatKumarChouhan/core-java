package in.co.rays.spring;

public class TestUserDao {
	
	public static void main(String[] args) {
		
		
		UserDaoInter sahil=new UserDaoImpl();
		
		UserService userService=new UserService();
		
		userService.setUserDaoInter(sahil);
		
		userService.testAdd();
	}

}
