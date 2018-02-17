package com.moekr.shadow.rpc.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@Data
@EqualsAndHashCode
@ToString
public class Server implements Serializable {
	private Integer port;
	private String password;
	private String method;
	private String protocol;
	private String obfs;
}
