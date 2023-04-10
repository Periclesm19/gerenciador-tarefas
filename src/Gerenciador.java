import java.util.Scanner;

public class Gerenciador {
    public static void main(String[] args) throws Exception {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("O que você deseja fazer?");
            System.out.println("1. Adicionar uma nova tarefa");
            System.out.println("2. Editar uma tarefa existente");
            System.out.println("3. Excluir uma tarefa");
            System.out.println("4. Exibir lista de tarefas");
            System.out.println("5. Marcar uma tarefa como concluída");
            System.out.println("6. Sair");

            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome da tarefa: ");
                    String nome = input.next();

                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = input.next();

                    System.out.print("Digite a data de vencimento da tarefa (dd/mm/yyyy): ");
                    String data = input.next();

                    Tarefa novaTarefa = new Tarefa(nome, descricao, data);
                    listaDeTarefas.adicionarTarefa(novaTarefa);

                    System.out.println("Tarefa adicionada com sucesso.");
                    break;
                case 2:
                    System.out.print("Digite o número da tarefa que deseja editar: ");
                    int numeroDaTarefa = input.nextInt();

                    System.out.print("Digite o novo nome da tarefa: ");
                    nome = input.next();

                    System.out.print("Digite a nova descrição da tarefa: ");
                    descricao = input.next();

                    System.out.print("Digite a nova data de vencimento da tarefa (dd/mm/yyyy): ");
                    data = input.next();

                    Tarefa tarefaEditada = new Tarefa(nome, descricao, data);
                    listaDeTarefas.editarTarefa(numeroDaTarefa, tarefaEditada);

                    System.out.println("Tarefa editada com sucesso.");
                    break;
                case 3:
                    System.out.print("Digite o número da tarefa que deseja excluir: ");
                    numeroDaTarefa = input.nextInt();

                    listaDeTarefas.excluirTarefa(numeroDaTarefa);

                    System.out.println("Tarefa excluída com sucesso.");
                    break;
                case 4:
                    System.out.println("Lista de Tarefas:");
                    listaDeTarefas.exibirTarefas();
                    break;
                case 5:
                    System.out.print("Digite o número da tarefa que deseja marcar como concluída: ");
                    numeroDaTarefa = input.nextInt();

                    listaDeTarefas.marcarTarefaComoConcluida(numeroDaTarefa);

                    System.out.println("Tarefa marcada como concluída.");
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Escolha inválida. Por favor, tente novamente.");

            }
        }
    }
}
