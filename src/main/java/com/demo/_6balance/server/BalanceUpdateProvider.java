package com.demo._6balance.server;

/**
 * 负载均衡更新器
 *
 * @author Alexander
 */
public interface BalanceUpdateProvider {

    boolean addBalance(Integer step);

    boolean reduceBalance(Integer step);

}
