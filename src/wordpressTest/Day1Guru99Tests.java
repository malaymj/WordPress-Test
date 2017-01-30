package wordpressTest;



import static org.junit.Assert.*;

import org.junit.Test;




import wordpressAutomation.IndexPage;
import wordpressAutomation.MobilePage;

public class Day1Guru99Tests extends WordPressTest {
	
@Test
public void mobiles_can_sort_by_name(){
	IndexPage.GoTo();
	assertEquals("The page is not the demo site of guru99","THIS IS DEMO SITE FOR   ",IndexPage.getTitle());
	
	IndexPage.selectLink("MOBILE");
	assertEquals("This is not the correct page","Mobile",MobilePage.getTitle());
	MobilePage.SortBy("Name");
	//assertTrue(MobilePage.IsSorted);

	
	}
}






