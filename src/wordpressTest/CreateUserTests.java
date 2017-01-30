package wordpressTest;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import wordpressAutomation.AllUserPage;
import wordpressAutomation.DashboardPage;
import wordpressAutomation.NewUserPage;

public class CreateUserTests extends WordPressTest
{
	@Test
	public void Can_create_a_new_user()
	{
	 assertTrue("Failed to Login",DashboardPage.IsAt);
	 NewUserPage.GoTo();
	 NewUserPage.CreateNewUsername("Test").WithEmail("test@test.com").AddNew();
	 NewUserPage.GoToAllUsers();
	 assertTrue("User is not created Successfully", AllUserPage.DoesUsernameExistAs("Test"));
	}
 
}
