package com.moekr.shadow.rpc.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode
@ToString
public class Configuration implements Serializable {
	private Action action;
	private Set<Server> servers = new HashSet<>();
	private Set<VirtualServer> virtualServers = new HashSet<>();
}
