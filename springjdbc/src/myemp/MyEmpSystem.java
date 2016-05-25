package myemp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyEmpSystem {
	public static void main(String[] args) {
		ApplicationContext factory = 
			 new ClassPathXmlApplicationContext("config/scott.xml");
		AbstractUI ui = (AbstractUI)factory.getBean("menuui");
		while(true){
			ui.show();
		}

	}

}
