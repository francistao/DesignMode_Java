package example3;

import java.util.HashMap;
import java.util.Map;

/**
 * Java缓存的基本实现
 * @author dream
 *
 */
public class JavaCache {

	/**
	 * 缓存数据的容器，定义成Map是方便访问，直接根据key就可以获取value了
	 * key选用String是为了方便
	 */
	private Map<String, Object> map = new HashMap<String, Object>();
	
	/**
	 * 从缓存中获取值
	 * @param key
	 * @return
	 */
	public Object getValue(String key){
		//先从缓存中获取值
		Object obj = map.get(key);
		//判断缓存里面是否有值
		if(obj == null){
			//如果没有，那么就去获取相应的数据，比如读取数据库或者文件
			//这里只是演示，所以直接写个假的值
			obj = key + ",value";
			//把获取的值设置回到缓存里
			map.put(key, obj);
		}
		//如果有值了，就直接返回使用
		return obj;
	}
}
