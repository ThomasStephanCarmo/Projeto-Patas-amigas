
public class Funcionarios extends Pessoa {

private String dataContratacao;
private String cargo;
private int salario;
private String departamento;

public Funcionarios(String CPF, String endereco, String nome, String dataDeNascimento, String email, String senha, String telefone,String dataContratacao, String cargo, int salario, String departamento){

super(CPF, endereco,nome, dataDeNascimento, email, senha, telefone);
}
}
