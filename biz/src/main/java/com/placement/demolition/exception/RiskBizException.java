package com.placement.demolition.exception;

import com.placement.demolition.enums.DemolitionBizExceptionEnum;

public class RiskBizException extends RuntimeException {

	private DemolitionBizExceptionEnum bizExceptionEnum;

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public RiskBizException() {
		super();
	}

	public RiskBizException(String message) {
		super(message);
	}

	public RiskBizException(String message, Throwable cause) {
		super(message, cause);
	}

	public RiskBizException(DemolitionBizExceptionEnum bizExceptionEnum) {
		super("[" + bizExceptionEnum.getErrorCode() + "]" + "->[" + bizExceptionEnum.getErrorMsg() + "]");
		this.setBizExceptionEnum(bizExceptionEnum);
	}

	public RiskBizException(DemolitionBizExceptionEnum bizExceptionEnum, Throwable cause) {
		super("[" + bizExceptionEnum.getErrorCode() + "]" + "->[" + bizExceptionEnum.getErrorMsg() + "]",
				cause);
		this.setBizExceptionEnum(bizExceptionEnum);
	}

	public DemolitionBizExceptionEnum getBizExceptionEnum() {
		return bizExceptionEnum;
	}

	public void setBizExceptionEnum(DemolitionBizExceptionEnum bizExceptionEnum) {
		this.bizExceptionEnum = bizExceptionEnum;
	}
}
