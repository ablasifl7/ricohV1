package ricoh.es;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Demo1_3 {
	@Test(groups = { "Demo1_3" })
  public void methodDemo1_3() {
	  System.out.println("method Demo1_3");
  }
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
