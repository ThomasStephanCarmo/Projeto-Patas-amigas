
public class Tutor extends Pessoa {

    private int numeroAnimaisCustodia;
    private String historicoDeDoacoes;
    private String status = "Ativo";

    public Tutor (String CPF, String endereco, String nome, String dataDeNascimento, String email, String senha, String telefone,int numeroAnimaisCustodia){

        super(CPF, endereco,nome, dataDeNascimento, email, senha, telefone);

        this.numeroAnimaisCustodia = numeroAnimaisCustodia;
}
}
