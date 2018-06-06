package ricoh.es;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeTest;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Demo1_1 {
	private String url,mail;

	
	@DataProvider(name = "dp")
	public Object[][] createData(ITestContext  context) {
		 String users = context.getCurrentXmlTest().getParameter("users");
		 this.url = context.getCurrentXmlTest().getParameter("url");
		 this.mail = context.getCurrentXmlTest().getParameter("mail");
		 String[] user = users.split(",",-1);
		 
			Object[][] ob = new Object[user.length][1]; 
			for(int i=0;i<user.length;i++){
				ob[i][0] = user[i];
			}
			return ob;
	}
	
  @Test(dataProvider = "dp",groups = { "Demo1_1" })
  public void methodDemo1_1(String user) {
	  System.out.println("user: "+user);
	  System.out.println("mail: "+this.mail);
	  System.out.println("url: "+this.url);
  }
  


}
