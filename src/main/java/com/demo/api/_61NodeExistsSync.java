package com.demo.api;

import java.io.IOException;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.EventType;
import org.apache.zookeeper.Watcher.Event.KeeperState;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

/**
 * 判断节点是否存在(同步)
 *
 * @author jerome_s@qq.com
 */
public class _61NodeExistsSync implements Watcher {

	private static ZooKeeper zooKeeper;

	public static void main(String[] args) throws IOException, InterruptedException, KeeperException {
		zooKeeper = new ZooKeeper("27.154.242.214:5091", 5000, new _61NodeExistsSync());
		Thread.sleep(Integer.MAX_VALUE);
	}

	private void doSomething(ZooKeeper zooKeeper) {
		try {
			// true 注册事件监听器
			Stat stat = zooKeeper.exists("/node2", true);
			System.out.println(stat);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void process(WatchedEvent event) {
		if (event.getState() == KeeperState.SyncConnected) {
			if (event.getType() == EventType.None && null == event.getPath()) {
				doSomething(zooKeeper);
			} else {
				try {
					if (event.getType() == EventType.NodeCreated) {
						System.out.println(event.getPath() + " created");
						System.out.println(zooKeeper.exists(event.getPath(), true));
					} else if (event.getType() == EventType.NodeDataChanged) {
						System.out.println(event.getPath() + " updated");
						System.out.println(zooKeeper.exists(event.getPath(), true));
					} else if (event.getType() == EventType.NodeDeleted) {
						System.out.println(event.getPath() + " deleted");
						System.out.println(zooKeeper.exists(event.getPath(), true));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
