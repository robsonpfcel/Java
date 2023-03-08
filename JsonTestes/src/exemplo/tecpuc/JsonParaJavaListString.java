package exemplo.tecpuc;

import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsonParaJavaListString {
	
public static void main(String[] args) {
		
		// json //
		String json = "[\"victormenegusso@gmail.com\",\"teste@teste.com\",\"javeiro@php.com\"]";
		
		// --- convertendo para json --- //
		Gson gson = new Gson();
		
		// converte de lista json para lista java string
		Type tipoLista = new TypeToken<ArrayList<String>>() {}.getType();
		ArrayList<String> lista = gson.fromJson(json, tipoLista);
		
		// --- exibindo json --- //
		for(String item : lista)
		{
			System.out.println(item);
		}
	}

}
