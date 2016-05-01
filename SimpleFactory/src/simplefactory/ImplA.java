package simplefactory;

public class ImplA implements Api{

	@Override
	public void operation(String s) {
		//实现功能的代码
		System.out.println("ImplA s==" + s);
	}
	

}
