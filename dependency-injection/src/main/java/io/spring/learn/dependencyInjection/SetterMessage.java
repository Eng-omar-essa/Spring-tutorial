/**
 * 
 */
package io.spring.learn.dependencyInjection;

/**
 * @author Omar
 *
 */
public class SetterMessage {

	private String message = null;

	/**
	 * Gets message.
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets message.
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
