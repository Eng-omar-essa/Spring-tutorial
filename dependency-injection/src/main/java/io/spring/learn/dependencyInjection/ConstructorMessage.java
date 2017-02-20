/**
 * 
 */
package io.spring.learn.dependencyInjection;

import io.spring.learn.bean.Message;

/**
 * @author Omar
 *
 */
public class ConstructorMessage {
	private String messageconstructor = null;

	/**
	 * Constructor
	 */
	public ConstructorMessage(String message) {
		this.messageconstructor = message;
	}

	/**
	 * Gets message.
	 */
	public String getMessage() {
		return messageconstructor;
	}

	/**
	 * Sets message.
	 */
	public void setMessage(String message) {
		this.messageconstructor = message;
	}

}
