package com.placement.demolition.enums;

/**
 * 业务异常枚举
 * 
 * @author Administrator
 *
 */
public enum DemolitionBizExceptionEnum {

	EVENT_NOT_EXSIT("10001", "风控事件不存在"),

	ENGINE_EXECUTE_FAIL("10002", "规则引擎执行失败");

	private String errorCode;

	private String errorMsg;

	private DemolitionBizExceptionEnum(String errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
