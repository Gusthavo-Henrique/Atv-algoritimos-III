import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {
    public static void main(String[] args) {
        try {
            // Carregar os dados do arquivo JSON
            Gson gson = new Gson();
            FileReader reader = new FileReader("C:\\Users\\Umpalumpa\\eclipse-workspace\\Algoritimos3\\target\\teste1.json");
            List<Aluno> alunos = gson.fromJson(reader, new TypeToken<List<Aluno>>() {}.getType());
            
            // Encontrar o aluno pelo CPF
            String cpfBuscado = "111.111.111-11";
            Aluno alunoBuscado = null;
            
            for (Aluno aluno : alunos) {
                if (aluno.getCpf().equals(cpfBuscado)) {
                    alunoBuscado = aluno;
                    break;
                }
            }
            
            if (alunoBuscado != null) {
                // Ordenar os alunos pela média em ordem decrescente
                Collections.sort(alunos, Comparator.comparing(Aluno::getMediaGeral).reversed());
                
                // Encontrar a posição do aluno buscado no ranking
                int posicao = alunos.indexOf(alunoBuscado) + 1;
                
                // Exibir o ranking do aluno
                System.out.println("Ranking do aluno " + alunoBuscado.getNome() + " (CPF: " + cpfBuscado + ") no semestre 2023.1:");
                System.out.println("Posição: " + posicao + " de " + alunos.size());
            } else {
                System.out.println("Aluno não encontrado.");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
