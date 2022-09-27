package entities;

public class Processo {
	
	private String nome;
	private Integer duracao;
	private Integer prioridade;
	private Integer tempoEntreProcesso;
	
	public Processo() {
	}

	public Processo(String nome, Integer duracao, Integer prioridade) {
		super();
		this.nome = nome;
		this.duracao = duracao;
		this.prioridade = prioridade;
	}

	public Processo(String nome, Integer duracao, Integer prioridade, Integer tempoEntreProcesso) {
		super();
		this.nome = nome;
		this.duracao = duracao;
		this.prioridade = prioridade;
		this.tempoEntreProcesso = tempoEntreProcesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}

	public Integer getTempoEntreProcesso() {
		return tempoEntreProcesso;
	}

	public void setTempoEntreProcesso(Integer tempoEntreProcesso) {
		this.tempoEntreProcesso = tempoEntreProcesso;
	}
	
	
}
