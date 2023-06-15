package Aplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import entities.Aluno;

public class Application {
    public static void main(String[] args) {
        // Ler o arquivo JSON
        List<Aluno> alunos = lerArquivoJSON("C:\\Users\\Umpalumpa\\eclipse-workspace\\Algoritimos3\\target\\teste1.json");

        //alunos matriculados na disciplina AED3
        List<Aluno> alunosMatriculadosAED3 = filtrarAlunosPorDisciplinaSemestre(alunos, "AED3", "2023.1");

        // alunos encontrados
        for (Aluno aluno : alunosMatriculadosAED3) {
            System.out.println(aluno.getId());
        }
    }

    public static List<Aluno> lerArquivoJSON(String caminhoArquivo) {
        List<Aluno> alunos = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(caminhoArquivo));
            Gson gson = new Gson();
            alunos = gson.fromJson(bufferedReader, new TypeToken<List<Aluno>>(){}.getType());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return alunos;
    }

    public static List<Aluno> filtrarAlunosPorDisciplinaSemestre(List<Aluno> alunos, String disciplina, String semestre) {
        List<Aluno> alunosFiltrados = new ArrayList<>();
        for (Aluno aluno : alunos) {
            List<Aluno> disciplinas = aluno.getDisciplina();
            for (Aluno d : disciplinas) {
                if (d.getDisciplina().equals(disciplina) && d.getSemestre().equals(semestre)) {
                    alunosFiltrados.add(aluno);
                    break;
                }
            }
        }
        return alunosFiltrados;
    }
}
