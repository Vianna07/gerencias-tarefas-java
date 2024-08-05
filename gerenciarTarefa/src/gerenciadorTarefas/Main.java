package gerenciadorTarefas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static final Scanner scanner = new Scanner(System.in);
	public static final SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
 

	public static void main(String[] args) throws Exception {
		ArrayList<Item> itens = new ArrayList<Item>();
		
		while (true) {
			try {
				itens.add(Item.cadastrar());
			} catch (Exception e) {
				throw new Exception("Erro ao cadastrar item: " + e.getMessage());
			}
			
			System.out.println("|========================|");
			System.out.println(itens.size());
			System.out.println("|========================|");
		}


	}
}
