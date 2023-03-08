package exemplo.alexjdev.viacep;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;

public class TestaCep {
	
	public static void main(String[] args) throws Exception {
		
		String cepPesquisar = "01001000";
		
		// web service que sera consultado - via cep
		URL url = new URL("https://viacep.com.br/ws/"+cepPesquisar+"/json/");
		URLConnection connection = url.openConnection();
		InputStream is = connection.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		
		String cep = "";
		StringBuilder jsonCep = new StringBuilder(); // sequencia de caracteres
		
		// percorre BufferedReader
		while((cep = br.readLine()) != null) {
			jsonCep.append(cep); // adiciona na sequencia de caracteres
			
		}
		
		System.out.println(jsonCep.toString());
		
		// converte de json para objeto java cep
		Cep cepConvertido = new Gson().fromJson(jsonCep.toString(), Cep.class);
		
		System.out.println(cepConvertido.getCep());
		System.out.println(cepConvertido.getLogradouro());
		System.out.println(cepConvertido.getLocalidade());
		System.out.println(cepConvertido.getBairro());
		System.out.println(cepConvertido.getUf());
				
	}

}
