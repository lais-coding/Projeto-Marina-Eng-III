import java.time.LocalDate;

public class Despesa {

	private String anoDespesa;
	private String mesDespesa;
	private LocalDate dtEmissao;
	private LocalDate dtVencimentoDespesa;
	private LocalDate dtPagamentoDespesa;
	
	
	
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
	
	
	
	
}
