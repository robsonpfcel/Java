package exemplo.tecpuc;

import com.google.gson.Gson;

public class JavaObjectParaJson {
	
public static void main(String[] args) {
		
		// --- criar objeto cliente --- //
		Cliente objCliente = new Cliente();
		
		objCliente.setId(1);
		objCliente.setNome("Victor");
		objCliente.setEmail("victormenegusso@gmail.com");
		
		// --- transformando em JSON --- //
		// toJson para Json
		Gson gson = new Gson(); // conversor
		String json = gson.toJson( objCliente );
		
		// exibindo o JSON //
		System.out.println( json );
		
	}

}

