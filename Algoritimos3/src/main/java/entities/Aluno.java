package entities;

import java.util.List;

public class Aluno {
	private int Id;
	private String Semestre;
	private String Cpf;
	private List<Aluno> Disciplina;
	private double N1;
	private double N2;
	private double MF;
	private int Faltas;
	private String Situacao;
	
	public Aluno() {
		
	}

	public Aluno(int id, String semestre, String cpf, List<Aluno> disciplina, double n1, double n2, double mF, int faltas,
			String situacao) {
		super();
		Id = id;
		Semestre = semestre;
		Cpf = cpf;
		Disciplina = disciplina;
		N1 = n1;
		N2 = n2;
		MF = mF;
		Faltas = faltas;
		Situacao = situacao;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getSemestre() {
		return Semestre;
	}

	public void setSemestre(String semestre) {
		Semestre = semestre;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public List<Aluno> getDisciplina() {
		return Disciplina;
	}

	public void setDisciplina(List<Aluno> disciplina) {
		Disciplina = disciplina;
	}

	public double getN1() {
		return N1;
	}

	public void setN1(double n1) {
		N1 = n1;
	}

	public double getN2() {
		return N2;
	}

	public void setN2(double n2) {
		N2 = n2;
	}

	public double getMF() {
		return MF;
	}

	public void setMF(double mF) {
		MF = mF;
	}

	public int getFaltas() {
		return Faltas;
	}

	public void setFaltas(int faltas) {
		Faltas = faltas;
	}

	public String getSituacao() {
		return Situacao;
	}

	public void setSituacao(String situacao) {
		Situacao = situacao;
	}

	@Override
	public String toString() {
		return "Aluno [Id=" + Id + ", Semestre=" + Semestre + ", Cpf=" + Cpf + ", Disciplina=" + Disciplina + ", N1="
				+ N1 + ", N2=" + N2 + ", MF=" + MF + ", Faltas=" + Faltas + ", Situacao=" + Situacao + "]";
	}
	
}
