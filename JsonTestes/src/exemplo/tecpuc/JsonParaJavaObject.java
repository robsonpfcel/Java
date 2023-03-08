package exemplo.tecpuc;

import com.google.gson.Gson;

public class JsonParaJavaObject {
	
public static void main(String[] args) {
		
		// texto json 
		// atributos iguais classe Cliente
		String json = "{\"id\":1,\"nome\":\"Victor\",\"email\":\"victormenegusso@gmail.com\"}";
		
		System.out.println(json);
		
		// fromJson transforma texto de json para objeto Java Cliente
		Gson gson = new Gson(); // conversor
		Cliente objCliente = gson.fromJson(json, Cliente.class);
		
		// exibindo dados em Java 
		System.out.println( objCliente.getId() );
		System.out.println( objCliente.getNome() );
		System.out.println( objCliente.getEmail() );
	}

}
