package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.service.PicPay;
import model.service.ProcessadorParcela;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero: ");
		String numero = sc.next();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Valor do contrado: ");
		double valor = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valor);
		
		System.out.print("Entre com o numero de parcelas: ");
		int qtd = sc.nextInt();
		
		ProcessadorParcela.gerarParcelas(contrato, qtd, new PicPay());
		System.out.println("\nParcelas: ");
		contrato.getListaParcelas().forEach(System.out::println);
		
		sc.close();
		
		
		
	}

}
