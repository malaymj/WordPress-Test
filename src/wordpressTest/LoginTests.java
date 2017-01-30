package wordpressTest;

import static org.junit.Assert.*;
import org.junit.Test;

import wordpressAutomation.DashboardPage;


public class LoginTests extends WordPressTest{
	
	
	@Test
	public void Admin_User_Can_Login()
	{
	
		assertTrue("Failed to login", DashboardPage.IsAt);
	}
	
}
