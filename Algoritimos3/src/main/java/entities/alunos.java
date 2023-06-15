package entities;
public class alunos {
	
	private int id;
	private String semestre;
	private String cpf;
	private String disciplina;
	private double n1;
	private double n2;
	private double mf;
	private int faltas;
	private String situacao;
	
	public alunos() {
		
	}

	public alunos(int id, String semestre, String cpf, String disciplina, double n1, double n2, double mf,
			int faltas, String situacao) {
		this.id = id;
		this.semestre = semestre;
		this.cpf = cpf;
		this.disciplina = disciplina;
		this.n1 = n1;
		this.n2 = n2;
		this.mf = mf;
		this.faltas = faltas;
		this.situacao = situacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getMf() {
		return mf;
	}

	public void setMf(double mf) {
		this.mf = mf;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "alunos [id=" + id + ", semestre=" + semestre + ", cpf=" + cpf + ", disciplina=" + disciplina + ", n1="
				+ n1 + ", n2=" + n2 + ", mf=" + mf + ", faltas=" + faltas + ", situacao=" + situacao + "]";
	}
	
}
