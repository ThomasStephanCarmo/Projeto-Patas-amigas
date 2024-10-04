import java.util.Scanner;

public class Pessoa {

    private int ID;
    private static int IDGenerator = 0;
    private String CPF;
    private String dataDeNascimento;
    private String email;
    private String endereco;
    private String nome;
    private String senha;
    private String telefone;
    private boolean isAdotante;
    private boolean isTutor;
    private boolean isFuncionario; 

    public Pessoa(String CPF, String endereco, String nome, String dataDeNascimento, String email, String senha, String telefone, boolean isAdotante, boolean isTutor, boolean isFuncionario){

        setID();
        setCPF(CPF);
        setEndereco(endereco);
        setNome(nome);
        setDataNascimento(dataDeNascimento);
        setEmail(email);
        setSenha(senha);
        setTelefone(telefone);
        setIsAdotante(isAdotante);
        setIsTutor(isTutor);
        setIsFuncionario(isFuncionario);
    }

    private void setID(){
        this.ID = IDGenerator++;
    }
    public String getCPF(){
        return CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDataDeNascimento(){
        return dataDeNascimento;
    }
    public void setDataNascimento(String dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;}

    public boolean getIsAdotante(){
        return isAdotante;
    }

    public void setIsAdotante(boolean isAdotante){
        this.isAdotante = isAdotante;
    }

    public boolean getIsTutor(){
        return isTutor;
    }

    public void setIsTutor(boolean isTutor){
        this.isTutor = isTutor;
    }

    public boolean getIsFuncionario(){
        return isFuncionario;
    }

    public void setIsFuncionario(boolean isFuncionario){
        this.isFuncionario = isFuncionario;
    }

    @Override
    public String toString(){
        return "Pessoa{"+
        "ID="+ ID +
        ", CPF='" + CPF+ '\'' +
        ", dataDeNascimento='" + dataDeNascimento + '\'' +
        ", nome='" + nome + '\'' +
        ", senha='" + senha + '\'' +
        ", telefone='" + telefone + '\'' +
        '}';
    }


}