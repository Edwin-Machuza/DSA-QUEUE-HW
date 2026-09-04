void main() throws IOException {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    FilaEstatica fe = new FilaEstatica(10);

    int option, generalOption, number;


    do {
        do {

        } while ();

        do {
            showMenu();
            option = Integer.parseInt(br.readLine());

            switch (option) {

                case 1:
                    IO.print("Numero: ");
                    number = Integer.parseInt(br.readLine());
                    fe.inserirElemento(number);
                    IO.println("Elemento adicionado com sucesso!\n");
                    break;

                case 2:
                    IO.println("Numero: ");
                    number = Integer.parseInt(br.readLine());
                    fe.removerElemento(number);
                    IO.println("Elemento removido com sucesso!\n");
                    break;

                case 3:
                    IO.print("Digite o indice: ");
                    number = Integer.parseInt(br.readLine());
                    IO.println(fe.buscarElemento(number));
                    break;

                case 4:
                    fe.contarParesImpares();
                    break;

                case 5:
                    fe.maiorMenor();
                    break;

                case 6:
                    IO.println("\n+====+Inverter+====+");
                    fe.inverterVetor();
                    break;

                case 7:
                    IO.println("========FILA=======");
                    fe.percorrerFila();
                    break;

                case 8:
                    break;

                default:
                    IO.print("Opcao invalida!");

            }
        } while (option != 8);

    } while ();

}

public static void showMenu() {
    IO.println("1.Inserir");
    IO.println("2.Remover");
    IO.println("3.Busca pelo indice");
    IO.println("4.Quantidade de pares e impares");
    IO.println("5.Comparação");
    IO.println("6.Inverter o vetor");
    IO.println("7.Ver a Fila");
    IO.println("8.Sair");

    IO.print("Option: ");
}