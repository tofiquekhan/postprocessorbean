package myproject.postprocessorbean.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import myproject.postprocessorbean.beans.Account;

public class AccountPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
		Account acc = (Account) bean;
		if(acc.getAccType()==null)
		acc.setAccType("Savings");
		return acc;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
		Account acc = (Account) bean;
		String email = acc.getAccHolderEmail();
		if(!email.contains("@")) {
			email = email +"@gmail.com";
			acc.setAccHolderEmail(email);
		}
		String mobileNo = acc.getAccHolderMobileNo();
		if(!mobileNo.startsWith("+91")) {
			mobileNo = "+91"+mobileNo;
			acc.setAccHolderMobileNo(mobileNo);
		}
		return acc;
	}

}
