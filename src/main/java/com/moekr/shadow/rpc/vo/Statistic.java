package com.moekr.shadow.rpc.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.Map;

@Data
@EqualsAndHashCode
@ToString
public class Statistic implements Serializable {
	private Boolean running;
	private Long inputTraffic;
	private Long outputTraffic;
	private Map<Integer, Long> portTraffic;
	private Map<Integer, Map<String, Integer>> socket;
}
