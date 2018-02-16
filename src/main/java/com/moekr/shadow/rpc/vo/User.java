package com.moekr.shadow.rpc.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
public class User {
	private String name;
	private Integer muId;
	private String password;
}
