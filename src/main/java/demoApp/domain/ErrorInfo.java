package demoApp.domain;

public class ErrorInfo {
	private final int code;
	private final String message;
	private final String resolution;
	
	public ErrorInfo(int code, String message, String resolution) {
		this.code = code;
		this.message = message;
		this.resolution = resolution;
	}
	
	public int getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
	public String getResolution() {
		return resolution;
	}

}
