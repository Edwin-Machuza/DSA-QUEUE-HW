import util.FilaEstatica;

void main(String...args) throws IOException {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    FilaEstatica fe = new FilaEstatica(10);

    int option, number;

    do{
        showMenu();
        option = Integer.parseInt(br.readLine());

        switch(option){

            case 1: IO.print("Numero: ");
                    number = Integer.parseInt(br.readLine());
                    fe.inserirElemento(number);
                    IO.println("Elemento adicionado com sucesso!");
                    break;
            case 2: IO.println("Numero: ");
                    number = Integer.parseInt(br.readLine());
                    fe.removerElemento(number);
                    IO.println("Elemento removido com sucesso");
                    break;
            case 3: IO.print("Digite o indice: ");
                    number = Integer.parseInt(br.readLine());
                    IO.println(fe.buscarElemento(number));
                    break;
            case 4: fe.contarParesImpares();
                    break;
            case 5: fe.maiorMenor();
                    break;
            case 6: IO.println("+====+Inverter+====+");
                    fe.inverterVetor();
                    break;


        }



    }while(option != 3);

}
public static void showMenu(){
    IO.println("1.Inserir");
    IO.println("2.Remover");
    IO.println("3.Busca pelo indice");
    IO.println("4.Quantidade de pares e impares");
    IO.println("5.Comparação");
    IO.println("6.Inverter o vetor");

    IO.print("Option: ");
}