package com.demo._6balance.client;

/**
 * 客户端接口
 * 
 * @author Alexander
 */
public interface Client {

	/**
	 * 与服务器连接
	 * 
	 * @author Alexander
	 * @throws Exception
	 */
	public void connect() throws Exception;

	/**
	 * 与服务器断开连接
	 * 
	 * @author Alexander
	 * @throws Exception
	 */
	public void disConnect() throws Exception;

}
