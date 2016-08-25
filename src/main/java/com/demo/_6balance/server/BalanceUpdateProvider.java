package com.demo._6balance.server;

/**
 * 负载均衡更新器
 * 
 * @author jerome_s@qq.com
 */
public interface BalanceUpdateProvider {

	public boolean addBalance(Integer step);

	public boolean reduceBalance(Integer step);

}
