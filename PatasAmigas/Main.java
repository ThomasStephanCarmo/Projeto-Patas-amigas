import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Bem-vindo ao sistema de gerenciamento de Pessoas!");

        boolean running = true;
        while (running) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Criar novo Usuário");
            System.out.println("2. Exibir informações da pessoa");
            System.out.println("3. Editar informações da pessoa");
            System.out.println("4. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    pessoa = criarPessoa(scanner);
                    break;
                case 2:
                    exibirPessoa(pessoa);
                    break;
                case 3:
                    editarPessoa(scanner, pessoa);
                    break;
                case 4:
                    running = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            
        }

        scanner.close();
    }


    
    //private static void exibirPessoa(Pessoa pessoa) {
    //    System.out.println("\n--- Informações da Pessoa ---");
    //    System.out.println(pessoa.toString());
    //}

    /*private static void editarPessoa(Scanner scanner, Pessoa pessoa) {
        System.out.println("\n--- Editar Pessoa ---");

        System.out.print("Nome (" + pessoa.getNome() + "): ");
        String nome = scanner.nextLine();
        if (!nome.isEmpty()) pessoa.setNome(nome);

        System.out.print("Sobrenome (" + pessoa.getSobrenome() + "): ");
        String sobrenome = scanner.nextLine();
        if (!sobrenome.isEmpty()) pessoa.setSobrenome(sobrenome);

        System.out.print("Email (" + pessoa.getEmail() + "): ");
        String email = scanner.nextLine();
        if (!email.isEmpty()) pessoa.setEmail(email);

        System.out.print("Logradouro (" + pessoa.getLogradouro() + "): ");
        String logradouro = scanner.nextLine();
        if (!logradouro.isEmpty()) pessoa.setLogradouro(logradouro);

        System.out.print("Número (" + pessoa.getNumero() + "): ");
        String numero = scanner.nextLine();
        if (!numero.isEmpty()) pessoa.setNumero(numero);

        System.out.print("Bairro (" + pessoa.getBairro() + "): ");
        String bairro = scanner.nextLine();
        if (!bairro.isEmpty()) pessoa.setBairro(bairro);

        System.out.print("Cidade (" + pessoa.getCidade() + "): ");
        String cidade = scanner.nextLine();
        if (!cidade.isEmpty()) pessoa.setCidade(cidade);

        System.out.print("Estado (" + pessoa.getEstado() + "): ");
        String estado = scanner.nextLine();
        if (!estado.isEmpty()) pessoa.setEstado(estado);

        System.out.print("País (" + pessoa.getPais() + "): ");
        String pais = scanner.nextLine();
        if (!pais.isEmpty()) pessoa.setPais(pais);

        System.out.print("Nacionalidade (" + pessoa.getNacionalidade() + "): ");
        String nacionalidade = scanner.nextLine();
        if (!nacionalidade.isEmpty()) pessoa.setNacionalidade(nacionalidade);

        System.out.println("Informações da pessoa atualizadas com sucesso!");
    }*/
}

public static Pessoa criarPessoa(Scanner scanner) {
    System.out.println("\n--- Criar Nova Pessoa ---");

    System.out.print("CPF: ");
    String cpf = scanner.nextLine();

    System.out.print("Data de Nascimento: ");
    String dataNascimento = scanner.nextLine();

    System.out.print("E-mail: ");
    String email = scanner.nextLine();

    System.out.print("Endereço: ");
    String endereco = scanner.nextLine();

    System.out.print("Nome: ");
    String nome = scanner.nextLine();

    System.out.print("Senha: ");
    String senha = scanner.nextLine();

    System.out.print("Telefone: ");
    String telefone = scanner.nextLine();


    System.out.print("Você é um Adotante?");
    boolean isAdotante = scanner.hasNext();

    System.out.print("Você é um Tutor?");
    boolean isTutor = scanner.hasNext();

    System.out.print("Você é um Funcionário?");
    boolean isFuncionario = scanner.hasNext();


    Pessoa novaPessoa = new Pessoa(cpf, dataNascimento, email, endereco, nome, senha, telefone, isAdotante, isTutor, isFuncionario);

    System.out.println("Pessoa criada com sucesso!");
    return novaPessoa;
}

}
