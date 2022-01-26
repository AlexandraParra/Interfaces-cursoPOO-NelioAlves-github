package moelo.servicos;

public class ServicoPaypal implements ServicoPagoOnline {
	
	private static final double taxa = 0.02;
	private static final double interesse = 0.01;
	
	public double taxa(double valor) {
		return valor * taxa;
	}
	
	public double interesse(double valor, int meses) {
		return valor * interesse * meses;
	}
}
