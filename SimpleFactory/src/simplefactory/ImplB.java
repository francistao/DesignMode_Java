package simplefactory;

/**
 * 接口的具体实现对象B
 * @author dream
 *
 */
public class ImplB implements Api{

	@Override
	public void operation(String s) {
		//实现功能的代码
		System.out.println("ImplB s==" + s);
	}

	
}
