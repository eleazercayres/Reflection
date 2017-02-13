package alura;


public class Principal {

	public static void main(String[] args) throws Exception {

		Usuario usuario = new Usuario();
		
		usuario.setEmail("eleazer.mota@gmail.com");
		usuario.setLogin("loginssss");
		usuario.setSenha("senha");
		
		boolean resultado = Validador.validarObjeto(usuario);
		
		System.out.println("Resultado = " + resultado);
		
		
		/*Usuario usuario = new Usuario();
		
		usuario.setEmail("eleazer.mota@gmail.com");
		usuario.setLogin("login");
		usuario.setSenha("senha");
		
		String xml = GeradorXml.getXML(usuario);
		
		System.out.println(xml);*/
		
		/*Mapeador m = new Mapeador();
		m.load("classes.prop");
		
		System.out.println(m.getImplementacao(List.class));
		System.out.println(m.getImplementacao(Map.class));
		
		List l = (List) m.getInstancia(List.class);
		System.out.println(l.getClass());
		
		InterfaceExemplo i = m.getInstancia(InterfaceExemplo.class, "teste");
			
		System.out.println(i.getClass());*/
	}
}
