package com.moekr.shadow.rpc;

import com.moekr.shadow.rpc.vo.Configuration;
import com.moekr.shadow.rpc.vo.Statistic;

public interface RpcService {
	String VERSION = "0.2";

	Configuration exchange(Integer nodeId, Statistic statistic);
}
