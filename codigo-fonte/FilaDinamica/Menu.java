import java.util.Scanner;

public class Menu {

    public Scanner sc;

    public Menu(){
        sc = new Scanner(System.in);
    }

    public void menu(){
        int opcao = 0;

        do{
            System.out.print("""
                    ==================================Menu===================================
                    1. Inserir cinco(5) elementos quaisquer na fila
                    2. Mostrar o total de elementos armazenados
                    3. Verificar se um dado elemento faz parte da fila
                    4. Mostrar quantos elementos sao pares e quantos sao impares
                    5. Somar todos os elementos da fila e mostrar o resulatado
                    6. Determinar o maior e menor elementos da fila
                    7. Remover todos elementos multiplos de um dado elemento recebido
                    8. Adicionar outra fila (dinamica) a fila atual
                    9. Criar nova fila a partir da copia da fila original
                    10 Gerar outra fila com os elemetos na ordem inversa da fila original
                    11. Finalizar o programa
                    =========================================================================
                    Escolha: 
                    """);
            opcao = sc.nextInt();
            System.out.println();

            switch (opcao){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:
                    System.out.println("Danke!");
                    break;
                default:
                    System.out.println("Opcao inexistente.");
                    break;
            }

        }while (opcao != 11);

    }
}
