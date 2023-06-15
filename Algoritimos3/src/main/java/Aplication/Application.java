import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Ler o arquivo JSON
        List<Aluno> alunos = lerArquivoJSON("C:\\Users\\Umpalumpa\\eclipse-workspace\\Algoritimos3\\target\\teste1.json");

        // Mostrar todas as matérias cursadas pelo aluno 111.111.111-11
        mostrarMateriasDoAluno(alunos, "111.111.111-11");
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

    public static void mostrarMateriasDoAluno(List<Aluno> alunos, String cpf) {
        System.out.println("Matérias cursadas pelo aluno " + cpf + ":");

        for (Aluno aluno : alunos) {
            if (aluno.getCpf().equals(cpf)) {
                List<Disciplina> disciplinas = aluno.getDisciplinas();
                for (Disciplina disciplina : disciplinas) {
                    System.out.println("Matéria: " + disciplina.getNome());
                    System.out.println("Média Final: " + disciplina.getMedia());
                    System.out.println("Total de Faltas: " + disciplina.getFaltas());
                    System.out.println("Situação: " + disciplina.getSituacao());
                    System.out.println("--------------------");
                }
                return; 
            }
        }

        // Caso nenhum aluno seja encontrado com o CPF informado
        System.out.println("Aluno com CPF " + cpf + " não encontrado.");
    }
}
