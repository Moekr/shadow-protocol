package com.moekr.shadow.rpc.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.Map;

@Data
@EqualsAndHashCode
@ToString
public class Configuration implements Serializable {
	private Action action;
	private String method;
	private String protocol;
	private String protocolParam;
	private String obfs;
	private String obfsParam;
	private Map<Integer, String> portPassword;
}
