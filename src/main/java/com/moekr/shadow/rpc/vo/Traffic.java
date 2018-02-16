package com.moekr.shadow.rpc.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
public class Traffic {
	private Long download;
	private Long upload;
}
