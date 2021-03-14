package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcelas;
import model.services.PayPalService;
import model.services.ServicoDeContrato;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Entre com os dados do Contrato: ");
		System.out.print("Numero: ");
		Integer numeroDoContrato = sc.nextInt();
		System.out.print("Data do Contrato (dd/MM/yyyy): ");
		sc.nextLine();
		Date dataDoContrato = sdf.parse(sc.nextLine());
		System.out.print("Valor:");
		Double valorContrato = sc.nextDouble();
		System.out.println("Quantas parcelas dividir esse contrato?");
		Integer numDeParcelas = sc.nextInt();
		
		Contrato contract = new Contrato(numeroDoContrato, dataDoContrato, valorContrato);
		
		System.out.println("Parcelas");
		
		ServicoDeContrato servicoDeContrato = new ServicoDeContrato(new PayPalService());
		
		servicoDeContrato.processarContrato(contract, numDeParcelas);
		
		for(Parcelas parcelas: contract.getParcelas()) {
			System.out.println(parcelas);
			
		}
		
		
		

	}

}
