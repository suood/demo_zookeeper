package com.demo._6balance.server;

/**
 * 服务端启动时的注册过程
 * 
 * @author Alexander
 */
public interface RegistProvider {

	public void regist(Object context) throws Exception;

	public void unRegist(Object context) throws Exception;

}
