import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        banco meuBanco = new banco(5);

        System.out.println("--- VAMOS CADASTRAR AS 5 CONTAS ---");
        
        System.out.println("Cadastro da conta 1:");
        System.out.print("Nome do cliente: ");
        String nome1 = teclado.nextLine();
        System.out.print("Agencia: ");
        String ag1 = teclado.nextLine();
        System.out.print("Numero da conta: ");
        String num1 = teclado.nextLine();
        System.out.print("Saldo inicial: ");
        float saldo1 = teclado.nextFloat();
        teclado.nextLine(); 
        pessoa p1 = new pessoa(nome1);
        contabancaria conta1 = new contabancaria(saldo1, ag1, num1, p1);
        meuBanco.adicionar(conta1);

        System.out.println("\nCadastro da conta 2:");
        System.out.print("Nome do cliente: ");
        String nome2 = teclado.nextLine();
        System.out.print("Agencia: ");
        String ag2 = teclado.nextLine();
        System.out.print("Numero da conta: ");
        String num2 = teclado.nextLine();
        System.out.print("Saldo inicial: ");
        float saldo2 = teclado.nextFloat();
        teclado.nextLine();
        pessoa p2 = new pessoa(nome2);
        contabancaria conta2 = new contabancaria(saldo2, ag2, num2, p2);
        meuBanco.adicionar(conta2);

        System.out.println("\nCadastro da conta 3:");
        System.out.print("Nome do cliente: ");
        String nome3 = teclado.nextLine();
        System.out.print("Agencia: ");
        String ag3 = teclado.nextLine();
        System.out.print("Numero da conta: ");
        String num3 = teclado.nextLine();
        System.out.print("Saldo inicial: ");
        float saldo3 = teclado.nextFloat();
        teclado.nextLine();
        pessoa p3 = new pessoa(nome3);
        contabancaria conta3 = new contabancaria(saldo3, ag3, num3, p3);
        meuBanco.adicionar(conta3);

        System.out.println("\nCadastro da conta 4:");
        System.out.print("Nome do cliente: ");
        String nome4 = teclado.nextLine();
        System.out.print("Agencia: ");
        String ag4 = teclado.nextLine();
        System.out.print("Numero da conta: ");
        String num4 = teclado.nextLine();
        System.out.print("Saldo inicial: ");
        float saldo4 = teclado.nextFloat();
        teclado.nextLine();
        pessoa p4 = new pessoa(nome4);
        contabancaria conta4 = new contabancaria(saldo4, ag4, num4, p4);
        meuBanco.adicionar(conta4);

        System.out.println("\nCadastro da conta 5:");
        System.out.print("Nome do cliente: ");
        String nome5 = teclado.nextLine();
        System.out.print("Agencia: ");
        String ag5 = teclado.nextLine();
        System.out.print("Numero da conta: ");
        String num5 = teclado.nextLine();
        System.out.print("Saldo inicial: ");
        float saldo5 = teclado.nextFloat();
        teclado.nextLine();
        pessoa p5 = new pessoa(nome5);
        contabancaria conta5 = new contabancaria(saldo5, ag5, num5, p5);
        meuBanco.adicionar(conta5);

        System.out.println("\n--- TODAS AS CONTAS FORAM CADAUSTRADAS COM SUCESSO ---");

        int opcaoEscolhida = 0;

        while (opcaoEscolhida != 6) {
            System.out.println("\n====================================");
            System.out.println("        MENU PRINCIPAL DO BANCO     ");
            System.out.println("====================================");
            System.out.println("1 - Fazer um deposito");
            System.out.println("2 - Fazer um saque");
            System.out.println("3 - Consultar o saldo atual");
            System.out.println("4 - Listar todos os clientes");
            System.out.println("5 - Ver o total de contas salvas");
            System.out.println("6 - Sair do sistema");
            System.out.print("Digite o numero da opcao: ");
            opcaoEscolhida = teclado.nextInt();
            teclado.nextLine(); 

            if (opcaoEscolhida == 1) {
                System.out.println("\n--- OPERACAO DE DEPOSITO ---");
                System.out.print("Digite a agencia da conta: ");
                String agProcurada = teclado.nextLine();
                System.out.print("Digite o numero da conta: ");
                String numProcurado = teclado.nextLine();
                
                contabancaria contaAchada = meuBanco.recuperar(agProcurada, numProcurado);
                
                if (contaAchada != null) {
                    System.out.print("Qual valor voce deseja depositar? ");
                    float valorDeposito = teclado.nextFloat();
                    teclado.nextLine();
                    
                    boolean deuCerto = contaAchada.depositar(valorDeposito);
                    if (deuCerto == true) {
                        System.out.println("Sucesso! O deposito foi feito.");
                    } else {
                        System.out.println("Erro! Voce nao pode depositar valores negativos.");
                    }
                } else {
                    System.out.println("Erro! Essa conta nao existe no nosso banco.");
                }
            } 
            
            else if (opcaoEscolhida == 2) {
                System.out.println("\n--- OPERACAO DE SAQUE ---");
                System.out.print("Digite a agencia da conta: ");
                String agProcurada = teclado.nextLine();
                System.out.print("Digite o numero da conta: ");
                String numProcurado = teclado.nextLine();
                
                contabancaria contaAchada = meuBanco.recuperar(agProcurada, numProcurado);
                
                if (contaAchada != null) {
                    System.out.print("Qual valor voce deseja sacar? ");
                    float valorSaque = teclado.nextFloat();
                    teclado.nextLine();
                    
                    boolean deuCerto = contaAchada.sacar(valorSaque);
                    if (deuCerto == true) {
                        System.out.println("Sucesso! O dinheiro foi retirado.");
                    } else {
                        System.out.println("Erro! Saldo insuficiente ou valor digitado invalido.");
                    }
                } else {
                    System.out.println("Erro! Essa conta nao existe no nosso banco.");
                }
            } 
            
            else if (opcaoEscolhida == 3) {
                System.out.println("\n--- CONSULTAR SALDO ---");
                System.out.print("Digite a agencia da conta: ");
                String agProcurada = teclado.nextLine();
                System.out.print("Digite o numero da conta: ");
                String numProcurado = teclado.nextLine();
                
                contabancaria contaAchada = meuBanco.recuperar(agProcurada, numProcurado);
                
                if (contaAchada != null) {
                    System.out.println("O saldo atual dessa conta e: R$ " + contaAchada.getSaldo());
                } else {
                    System.out.println("Erro! Conta nao encontrada.");
                }
            } 
            
            else if (opcaoEscolhida == 4) {
                System.out.println("\n--- LISTA DE TODOS OS CLIENTES DO BANCO ---");
                contabancaria[] listaDeContas = meuBanco.getContas();
                int totalQueExiste = meuBanco.getQuantidade();
                
                for (int i = 0; i < totalQueExiste; i++) {
                    contabancaria contaDaVez = listaDeContas[i];
                    System.out.println(contaDaVez.toString());
                }
            } 
            
            else if (opcaoEscolhida == 5) {
                System.out.println("\n--- TOTAL DE CONTAS ---");
                int totalSalvo = meuBanco.getQuantidade();
                System.out.println("O banco possui " + totalSalvo + " contas cadastradas ate agora.");
            } 
            
            else if (opcaoEscolhida == 6) {
                System.out.println("\nSaindo do sistema do banco...");
            } 
            
            else {
                System.out.println("Opcao invalida! Tente digitar um numero de 1 a 6.");
            }
        }

        System.out.println("\n====================================");
        System.out.println("    NOMES DOS TITULARES NO BANCO    ");
        System.out.println("====================================");
        
        contabancaria[] todasAsContasDoBanco = meuBanco.getContas();
        int totalDeContasFinais = meuBanco.getQuantidade();
        
        for (int i = 0; i < totalDeContasFinais; i++) {
            contabancaria contaAtual = todasAsContasDoBanco[i];
            pessoa pessoaTitular = contaAtual.getTitular();
            String nomeDoDono = pessoaTitular.getNome();
            System.out.println("- " + nomeDoDono);
        }

        System.out.println("\nPrograma encerrado de vez. Obrigado!");
        teclado.close();
    }
}
