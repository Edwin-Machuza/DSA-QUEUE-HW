public class DesafioListaDinamica {

    //Parte 2
    public static void main(String[] args) {
        
        ListaDinamica1 lista = new ListaDinamica1();

        lista.enqueue(10);
        lista.enqueue(15);
        lista.enqueue(20);
        lista.enqueue(25);
        lista.enqueue(30);

        //Atividade 1:
        lista.enqueue(40);

        //Atividade 2:
        System.out.println("Elemento removido: " +lista.dequeue());

        //Atividade 3:
        System.out.println("Elemento da frente: "+lista.front());

        //Atividade 4:
       lista.quantidadePar();

       //Atividade 5:
        System.out.println("A soma dos elementos vale: "+lista.somaElementos());

        //Atividade 6:
        System.out.println("Maior elemento: "+lista.maiorElemento());
    }



}
