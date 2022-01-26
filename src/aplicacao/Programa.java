package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import moelo.entidades.Contrato;
import moelo.entidades.Prestacao;
import moelo.servicos.ServicoContrato;
import moelo.servicos.ServicoPaypal;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Dados do contrato:");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/mm/aaaa): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");
		double totalValor = sc.nextDouble();
		Contrato contrato = new Contrato(numero, data, totalValor);
		System.out.print("Digite o número de parcelas: ");
		int n = sc.nextInt();
		ServicoContrato serv = new ServicoContrato(new ServicoPaypal());
		serv.processoContrato(contrato, n);
		
		System.out.println();
		System.out.println("Parcelas:");
		for (Prestacao p: contrato.getPrestacoes()) {
			System.out.println(sdf.format(p.getDataVcto()) + " - " + String.format("%.2f",p.getValor()));
		}
		
		
		sc.close();
	}

}
