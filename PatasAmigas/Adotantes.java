
public class Adotantes extends Pessoa {

   private String preferenciaAdocao;
   private String historicoAdocaoRealizada;
   private String status;

    public Adotantes(String CPF, String endereco, String nome, String dataDeNascimento, String email, String senha, String telefone, String preferenciaAdocao, String historicoAdocaoRealizada, String status){

        super(CPF, endereco, nome, dataDeNascimento, email, senha, telefone);
    }
}
