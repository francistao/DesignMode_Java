package example4;

import javax.print.attribute.standard.RequestingUserName;

/**
 * 双重检查加锁的单例模式
 * @author dream
 *
 */
public class Singleton {

	/**
	 * 对保存实例的变量添加volitile的修饰
	 */
	private volatile static Singleton instance = null;
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		//先检查实例是否存在，如果不存在才进入下面的同步块
		if(instance == null){
			//同步块，线程安全的创建实例
			synchronized (Singleton.class) {
				//再次检查实例是否存在，如果不存在才真正的创建实例
				instance = new Singleton();
			}
		}
		return instance;
	}
	
}
