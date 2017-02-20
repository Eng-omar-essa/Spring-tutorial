/**
 * 
 */
package io.spring.learn.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.spring.learn.bean.Message;
import io.spring.learn.dependencyInjection.ConstructorMessage;
import io.spring.learn.dependencyInjection.DefualtMessage;
import io.spring.learn.dependencyInjection.SetterMessage;

/**
 * @author Omar
 *
 */
public class Application {

	/**
	 * @param args
	 */
	final static Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.info("Initializing Spring context.");
		
		ApplicationContext app = new ClassPathXmlApplicationContext("/application-context.xml");

		logger.info("Spring context initialized.");

		DefualtMessage messageDefualt = (DefualtMessage) app.getBean("defualtmessage");
		logger.debug("message='" + messageDefualt.getMessage() + "'");

		
		Message message = (Message) app.getBean("message"); 
		logger.debug("message='" + message.getMessage() + "'");

		ConstructorMessage constructorMessage = (ConstructorMessage) app.getBean("messageconstructor");
		logger.debug("message='" + constructorMessage.getMessage() + "'");

		SetterMessage setterMessage = (SetterMessage) app.getBean("messagesetter");

		logger.debug("message='" + setterMessage.getMessage() + "'");
		
		ConstructorMessage referanceMessage = (ConstructorMessage) app.getBean("referancemessage");
		logger.debug("referance message='" + referanceMessage.getMessage() + "'");


	}

}
