package wordpressTest;

import org.junit.Test;

import wordpressAutomation.AddUserPage;
import wordpressAutomation.GeneralSettingsPage;



public class SettingsTests extends WordPressTest 
{
	@Test
	public void Can_Change_NewUser_DefaultRole()
	{
		//Go to settings General
		GeneralSettingsPage.goTo();
		//Change default role to contributor
		GeneralSettingsPage.changeNewUserDefaultRole(CONTRIBUTOR);
		//Go to Adduser Page
		AddUserPage.goTo();
		//Verify that the default role is changed to contributor
		assertEquals("Default role is not changed",AddUserPage.getRole(),CONTRIBUTOR);
	}
	
}
