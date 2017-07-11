package RetryFailedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {
	
	@Test(retryAnalyzer=ReTry.class)
	public void testCase1() {
		  Assert.assertEquals("Msg", "Msg1");
	}

	@Test
	public void testCase2() {
		  Assert.assertEquals("Msg1", "Msg11");
	}

	@Test
	public void testCase3() {
		  Assert.assertEquals("Msg2", "Msg2");
	}

}
