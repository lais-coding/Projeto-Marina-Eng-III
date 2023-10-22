
public class Apartamento {

	private int qtdeQuartos;
	private String numApt;
	private String tipoOcupacao;
	
	
	public void setApartamento(int qtdeQuartos, String numApt, String tipoOcupacao) { //Inserir os dados do Apartamento
		this.qtdeQuartos = qtdeQuartos;
		this.numApt = numApt;
		this.tipoOcupacao = tipoOcupacao;
	}
	
	public int getQtdeQuartos() { //Pegar a quantidade de quartos para calcular as despesas
		return qtdeQuartos;
	}
	
}
