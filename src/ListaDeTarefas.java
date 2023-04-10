import java.util.ArrayList;
import java.util.Collections;

public class ListaDeTarefas {
    private ArrayList<Tarefa> tarefas;

    public ListaDeTarefas() {
        tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void editarTarefa(int numeroDaTarefa, Tarefa tarefaEditada) {
        tarefas.set(numeroDaTarefa - 1, tarefaEditada);
    }

    public void excluirTarefa(int numeroDaTarefa) {
        tarefas.remove(numeroDaTarefa - 1);
    }

    public void exibirTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas cadastradas.");
        } else {
            Collections.sort(tarefas);
            for (int i = 0; i < tarefas.size(); i++) {
                Tarefa tarefa = tarefas.get(i);
                System.out.println((i + 1) + ". " + tarefa);
            }
        }
    }

    public void marcarTarefaComoConcluida(int numeroDaTarefa) {
        Tarefa tarefa = tarefas.get(numeroDaTarefa - 1);
        tarefa.setConcluida(true);
    }

}
