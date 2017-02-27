package com.demo._6balance.client;

import java.util.List;

/**
 * 抽象负载均衡算法
 * 
 * @author Alexander
 * @param <T>
 */
public abstract class AbstractBalanceProvider<T> implements BalanceProvider<T> {

	/**
	 * 负载均衡算法
	 * 
	 * @author Alexander
	 * @param items
	 * @return
	 */
	protected abstract T balanceAlgorithm(List<T> items);

	/**
	 * 获取负载均衡服务器
	 * 
	 * @author Alexander
	 * @return
	 */
	protected abstract List<T> getBalanceItems();

	public T getBalanceItem() {
		return balanceAlgorithm(getBalanceItems());
	}

}
