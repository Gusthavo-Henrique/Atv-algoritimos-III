import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {
    public static void main(String[] args) {
        try {
            // Carregar os dados do arquivo JSON
            Gson gson = new Gson();
            FileReader reader = new FileReader("C:\\Users\\Umpalumpa\\eclipse-workspace\\Algoritimos3\\target\\teste1.json");
            List<Aluno> alunos = gson.fromJson(reader, new TypeToken<List<Aluno>>() {}.getType());
            
            // Mapa para armazenar o total de reprovações por disciplina
            Map<String, Integer> reprovasPorDisciplina = new HashMap<>();
            
            // Iterar sobre os alunos e contar as reprovações por disciplina
            for (Aluno aluno : alunos) {
                if (aluno.getSemestre().equals("2023.1")) {
                    List<Disciplina> disciplinas = aluno.getDisciplinas();
                    for (Disciplina disciplina : disciplinas) {
                        if (!disciplina.isAprovado()) {
                            reprovasPorDisciplina.put(disciplina.getNome(), 
                                                      reprovasPorDisciplina.getOrDefault(disciplina.getNome(), 0) + 1);
                        }
                    }
                }
            }
            
            // Encontrar a disciplina que mais reprova
            String disciplinaMaisReprova = null;
            int maxReprovacoes = 0;
            
            for (Map.Entry<String, Integer> entry : reprovasPorDisciplina.entrySet()) {
                if (entry.getValue() > maxReprovacoes) {
                    disciplinaMaisReprova = entry.getKey();
                    maxReprovacoes = entry.getValue();
                }
            }
            
            // Exibir a disciplina que mais reprova
            System.out.println("Disciplina que mais reprova no semestre 2023.1:");
            System.out.println(disciplinaMaisReprova + " (Total de reprovações: " + maxReprovacoes + ")");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
