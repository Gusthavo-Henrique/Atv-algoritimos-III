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

        // Calcular e mostrar a média das notas na disciplina AED3 no semestre 2023.1
        calcularMediaAED3(alunos);
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

    public static void calcularMediaAED3(List<Aluno> alunos) {
        System.out.println("Média das notas dos alunos na disciplina AED3 no semestre 2023.1:");

        int contadorAlunos = 0;
        double somaNotas = 0.0;

        for (Aluno aluno : alunos) {
            List<Disciplina> disciplinas = aluno.getDisciplinas();
            for (Disciplina disciplina : disciplinas) {
                if (disciplina.getNome().equals("AED3") && disciplina.getSemestre().equals("2023.1")) {
                    contadorAlunos++;
                    somaNotas += disciplina.getMedia();
                    break;
                }
            }
