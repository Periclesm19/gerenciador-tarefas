import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tarefa implements Comparable<Tarefa> {

    private String nome;
    private String descricao;
    private Date dataDeVencimento;
    private Boolean concluida;

    public Tarefa(String nome, String descricao, String dataString) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataDeVencimento = stringToDate(dataString);
        this.concluida = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(Date dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public Boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }

    private Date stringToDate(String dataString) {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        try {
            data = formatoData.parse(dataString);
        } catch (ParseException e) {
            System.out.println("Data inválida.");
        }
        return data;
    }

    @Override
    public int compareTo(Tarefa outraTarefa) {
        return dataDeVencimento.compareTo(outraTarefa.dataDeVencimento);
    }

    @Override
    public String toString() {
        String status = concluida ? "Concluida" : "Pendente";
        return nome + " - " + descricao + " - " + getDataDeVencimento() + " - " + status;
    }

}
