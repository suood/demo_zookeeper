package com.demo.zkclient;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;
import org.apache.zookeeper.data.Stat;

import com.demo.zkclient.model.User;

/**
 * 获取节点数据
 *
 * @author jerome_s@qq.com
 */
public class _3GetData {

	public static void main(String[] args) {
		// 反序列化数据
		ZkClient zc = new ZkClient("192.168.10.5:2181", 10000, 10000, new SerializableSerializer());
		System.out.println("conneted ok!");

		Stat stat = new Stat();
		User u = zc.readData("/node1", stat);
		System.out.println(u.toString());
		System.out.println(stat);

	}

}
