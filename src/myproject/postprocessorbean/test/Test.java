package myproject.postprocessorbean.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myproject.postprocessorbean.beans.Account;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/myproject/postprocessorbean/resources/applicationContext.xml");
		Account accBean = (Account) context.getBean("accBean");
		accBean.getAccountDetails();
		
	}

}
 