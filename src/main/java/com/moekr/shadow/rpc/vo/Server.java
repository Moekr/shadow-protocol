package com.moekr.shadow.rpc.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
public class Server {
	private String name;
	private Integer port;
	private String password;
	private String method;
	private String protocol;
	private String obfs;
}
