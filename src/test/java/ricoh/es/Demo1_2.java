package ricoh.es;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Demo1_2 {
	@Test(groups = { "Demo1_2" })
  public void methodDemo1_2() {
	  System.out.println("method Demo1_2");
  }
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
