import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {
    public static void main(String[] args) {
        try {
            // Carregar os dados do arquivo JSON
            Gson gson = new Gson();
            FileReader reader = new FileReader("C:\\Users\\Umpalumpa\\eclipse-workspace\\Algoritimos3\\target\\teste1.json");
            Map<String, Aluno> alunosMap = gson.fromJson(reader, new TypeToken<Map<String, Aluno>>() {}.getType());
            
            // Encontrar o aluno pelo CPF
            String cpfBuscado = "111.111.111-11";
            Aluno aluno = alunosMap.get(cpfBuscado);
            
            if (aluno != null) {
                // Calcular a média geral do aluno
                double somaNotas = 0;
                int totalDisciplinas = 0;
                
                for (Disciplina disciplina : aluno.getDisciplinas()) {
                    somaNotas += disciplina.getNotaFinal();
                    totalDisciplinas++;
                }
                
                double mediaGeral = somaNotas / totalDisciplinas;
                
                // Exibir a média geral
                System.out.println("Média geral do aluno " + aluno.getNome() + " (CPF: " + cpfBuscado + "): " + mediaGeral);
            } else {
                System.out.println("Aluno não encontrado.");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
