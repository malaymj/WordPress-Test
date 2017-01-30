package wordpressTest;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import wordpressAutomation.DashboardPage;
import wordpressAutomation.NewPostPage;
import wordpressAutomation.PostPage;

@SuppressWarnings("deprecation")
public class CreatePostTest extends WordPressTest
{
	
	@Test
	public void Can_create_a_basic_post()
	{
		assertTrue("Failed to login", DashboardPage.IsAt);
		NewPostPage.GoTo();
		NewPostPage.CreatePost("This is a test post title").WithBody("Hi,This is the body").Publish();
		NewPostPage.GoToNewPost();
		Assert.assertEquals("Post is not published", PostPage.Title, "This is a test post title");
	}
	

}
