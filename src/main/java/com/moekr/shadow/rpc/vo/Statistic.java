package com.moekr.shadow.rpc.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
@EqualsAndHashCode
@ToString
public class Statistic implements Serializable {
	private boolean running;
	private Map<Integer, Traffic> trafficMap = new HashMap<>();
}
