package app27a;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class ServerTime extends ActionSupport {
	private String currentTime;

	public String getCurrentTime() {
		return new Date().toString();
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}
	
}
