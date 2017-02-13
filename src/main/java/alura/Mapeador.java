package alura;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Mapeador {

	private Map<Class<?>, Class<?>> mapa = new HashMap<>();
	
	public void load(String nomeArquivo) throws FileNotFoundException, IOException, ClassNotFoundException{
		
		Properties p = new Properties();
		p.load(new FileInputStream(nomeArquivo));
		
		for (Object key : p.keySet()) {
			Class<?> interf = Class.forName(key.toString());
			Class<?> impl = Class.forName(p.get(key).toString());
			
			if (!interf.isAssignableFrom(impl)) {
				throw new RuntimeException("Essa classe" + impl.getName() + " não implente essa interface " + interf);
			}
			mapa.put(interf, impl);
		}
	}
	
	public Class<?> getImplementacao(Class<?> interf){
		return mapa.get(interf);
	}
	
	@SuppressWarnings("unchecked")
	public <E> E getInstancia(Class<E> interf) throws InstantiationException, IllegalAccessException{
		
		Class<?> impl = mapa.get(interf);
		
		return (E) impl.newInstance();
	}
	
	public <E> E getInstancia(Class<E> interf, Object... params) throws Exception {
		
		Class<?> impl = mapa.get(interf);
		Class<?>[] tiposConstrutor = new Class<?>[params.length];
		
		for (int i = 0; i < tiposConstrutor.length; i++) {
			tiposConstrutor[i] = params[i].getClass();
		}
		
		Constructor<?> c = impl.getConstructor(tiposConstrutor);
		return (E) c.newInstance(params);
	}
	
	
	
}
