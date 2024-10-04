public class Animais {

    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private String sexo;
    private String historicoMedico;
    private String dataCadastro;
    private String statusAdocao;


    public Animais(String nome, String especie, String raca, int  idade, String sexo, String historicoMedico, String dataCadastro, String statusAdocao ){

        setNome(nome);
        setEspecie(especie);
        setRaca(raca);
        setIdade(idade);
        setSexo(sexo);
        setHistoricoMedico(historicoMedico);
        setDataCadastro(dataCadastro);
        setStatusAdocao(statusAdocao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {  // A idade é um número (int)
        return idade;
    }

    public void setIdade(int idade) {  // O método precisa de um número inteiro (int)
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {  // Corrigi o nome do método
        this.dataCadastro = dataCadastro;
    }

    public String getStatusAdocao() {
        return statusAdocao;
    }

    public void setStatusAdocao(String statusAdocao) {  // Corrigi o nome do método
        this.statusAdocao = statusAdocao;
    }

}
