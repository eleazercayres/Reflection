package alura;

import java.lang.reflect.Method;


public class TestErros {

	public static void main(String[] args) throws Exception {
		
		TestErros obj = new TestErros();
		
		Class<?> clazz = obj.getClass();
		
		//para invocar metodo private Method m = clazz.getDeclaredMethod("metodo", String.class);
		
		Method m = clazz.getDeclaredMethod("metodo", String.class);
		
		m.invoke(obj, "passou");
	}
	
	
	private void metodo(String s){
		System.out.println(s);
	}
}
