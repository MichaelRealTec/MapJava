package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		// Map - Java - DevSuperior
		Map<String, String> cookies = new TreeMap<>();
		cookies.put("username", "Maria"); // armazenando chave e valor
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		cookies.remove("email");
		cookies.put("phone", "99771133"); // Ecreve por cima do primeiro phone 
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email")); // Quando o elemento não existe ele retorna nulo
		System.out.println("Size: " + cookies.size()); // Quantos elementos tem
		
		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
