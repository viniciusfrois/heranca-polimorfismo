package aplication2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities2.Produto;
import entities2.ProdutoImportado;
import entities2.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {
		List<Produto> lista = new ArrayList<>();
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.print("Entre com numero de Produtos:");
		int n = teclado.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Produto # " + i + " dados:");
			System.out.print("Produto comum , usado ou importado? utilize (c/u/i)");
			char resp = teclado.next().charAt(0);
			System.out.print("Nome:");
			teclado.nextLine();
			String nome = teclado.nextLine();
			System.out.print("Preço:");
			Double preco = teclado.nextDouble();

			if (resp == 'c' || resp == 'C') {
				lista.add(new Produto(nome, preco));
			} else if (resp == 'u' || resp == 'U') {
				System.out.print("Data de Fabricação:");
				Date data = formataData.parse(teclado.next());
				lista.add(new ProdutoUsado(nome, preco, data));
			} else if (resp == 'i' || resp == 'I') {
				System.out.print("Taxa alfendega: ");
				Double taxa = teclado.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, taxa));
			}

		}
		System.out.println();
		System.out.println("Lista de Produtos:");
		for (Produto prod : lista) {
			System.out.println(prod.precoTag());
		}
		teclado.close();
	}

}
