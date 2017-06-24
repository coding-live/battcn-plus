package com.battcn.framework.common.exception;

/**
 * 鏖战八方顶级异常,所有自定义异常都必须继承这个类。
 * 
 * @ClassName BaseException
 * @Description
 * @author Levin
 * @date 2017年5月20日
 */
public class BaseException extends RuntimeException {

	private static final long serialVersionUID = 2722194034617571915L;

	public BaseException() {
		super();
	}

	public BaseException(String message) {
		super(message);
	}

	public BaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaseException(Throwable cause) {
		super(cause);
	}

	public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}