package jdev.mentoria.lojavirtual.enums;

public enum StatusContaPagar {

	COBRANCA("Pagar"),
	VENCIDA("Vencida"), 
	ABERTA("Aberta"),
	RENEGOCIADA("Renegociada"),
	ALUGUEL("Aluguel"),
	FUNCIONARIO("Funcionário"),
	QUITADA("Quitada");
	
	private String descricao;
	
	private StatusContaPagar(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricaoString() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}
	
}
