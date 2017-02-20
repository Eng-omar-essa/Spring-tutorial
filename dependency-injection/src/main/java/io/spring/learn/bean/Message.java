/**
 * 
 */
package io.spring.learn.bean;

/**
 * @author Omar
 * This a Message class bean . 
 * Here, we define variable string called message , then create setter and getter. 
 */
public class Message {
	
	private String message =null;

	/**
	 * Getter Method 
	 * @return message 
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Setter Method 
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
