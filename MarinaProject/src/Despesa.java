import java.time.LocalDate;

public class Despesa {

	private String anoDespesa;
	private String mesDespesa;
	private float valorDespesa;
	private LocalDate dtEmissao;
	private LocalDate dtVencimentoDespesa;
	private LocalDate dtPagamentoDespesa;
	private Competencia compDespesa;
	
	public Despesa(String ano, String mes, float valor, LocalDate emissao, LocalDate venc, LocalDate pgto) {
		this.anoDespesa = ano;
		this.mesDespesa = mes;
		this.valorDespesa = valor;
		this.dtEmissao = emissao;
		this.dtVencimentoDespesa = venc;
		this.dtPagamentoDespesa = pgto;
	}
	
	
	public float getValorDespesa() {
		return valorDespesa;
	}

	public void setValorDespesa(float valorDespesa) {
		this.valorDespesa = valorDespesa;
	}

	public String getAnoDespesa() {
		return anoDespesa;
	}
	public void setAnoDespesa(String anoDespesa) {
		this.anoDespesa = anoDespesa;
	}
	public String getMesDespesa() {
		return mesDespesa;
	}
	public void setMesDespesa(String mesDespesa) {
		this.mesDespesa = mesDespesa;
	}
	public LocalDate getDtEmissao() {
		return dtEmissao;
	}
	public void setDtEmissao(LocalDate dtEmissao) {
		this.dtEmissao = dtEmissao;
	}
	public LocalDate getDtVencimentoDespesa() {
		return dtVencimentoDespesa;
	}
	public void setDtVencimentoDespesa(LocalDate dtVencimentoDespesa) {
		this.dtVencimentoDespesa = dtVencimentoDespesa;
	}
	public LocalDate getDtPagamentoDespesa() {
		return dtPagamentoDespesa;
	}
	public void setDtPagamentoDespesa(LocalDate dtPagamentoDespesa) {
		this.dtPagamentoDespesa = dtPagamentoDespesa;
	}


	public Competencia getCompDespesa() {
		return compDespesa;
	}


	public void setCompDespesa(Competencia compDespesa) {
		this.compDespesa = compDespesa;
	}
	
	
	
	
}
