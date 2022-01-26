package moelo.servicos;

public interface ServicoPagoOnline {
	double taxa (double valor);
	double interesse (double valor, int mes);
}
