package wordpressTest;

import junit.framework.Assert;

import org.junit.Test;

import wordpressAutomation.ListPostPage;
import wordpressAutomation.NewPostPage;
import wordpressAutomation.PostType;


@SuppressWarnings("deprecation")
public class PageTests extends WordPressTest
{
	
	
	@Test
	public void Admin_User_Can_Login()
	{
		ListPostPage.GoTo(PostType.PAGE);
		ListPostPage.SelectPost("Sample Page");
		Assert.assertTrue("was not in the edit mode", NewPostPage.IsInEditMode());
	}
}
