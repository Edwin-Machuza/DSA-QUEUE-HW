//package  DSA-QUEUE-HW.codigo-fonte.FilaDinamica;

public class ListaDinamica1 {
    //Parte 1

    private No inicio;
    private No fim;
    private int tamanho;

    public ListaDinamica1(){
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    private static class No {

        int valor;
        No prox;

        private No(int valor){
            this.valor = valor;
            this.prox = null;
        }
    }

    public void enqueue(int element){
        No novoNo = new No(element);

        if (isEmpty()){
            inicio = novoNo;
        }else{
            fim.prox = novoNo;
        }

        fim = novoNo;
        tamanho++;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Empty Queue!");
        }

        int valor = inicio.valor;
        inicio = inicio.prox;
        tamanho--;

        if (inicio == null){
            fim = null;
        }

        return valor;

    }

    public int front(){
        if (isEmpty()){
            throw new RuntimeException("Empty Queue!");
        }

        return inicio.valor;
    }

    public boolean isEmpty(){
        return inicio == null;
    }

    public void displayQueue(){
        if(isEmpty()){
            System.out.println("Empty Queue!");
            return;
        }

        No valorAtual = inicio;
        System.out.print("Lista Ligada: { ");
        while(valorAtual != null){
            System.out.print(valorAtual.valor);
            if(valorAtual.prox != null){
                System.out.print(", ");
            }
            valorAtual = valorAtual.prox;
        }
        System.out.println(" }");
    }

    public int getTamanho(){
        return tamanho;
    }

    public boolean isElement(int x){
        if (isEmpty()){
            System.out.println("A lista está vazia!");
            return false;
        }
        No elemento = inicio;
        while(elemento!=null){
            if(elemento.valor == x){
                return true;
            }
            elemento = elemento.prox;
        }
        return false;

    }

    public void quantidadePar(){
        No valorAtual = inicio;
        int contaPar = 0, contaImpar = 0;

        if (isEmpty()){
            System.out.println("A lista está vazia!");
            return;
        }
        while(valorAtual != null){
            if (valorAtual.valor % 2 == 0){
                contaPar += 1;
            }else{
                contaImpar += 1;
            }
            valorAtual = valorAtual.prox;
        }

        System.out.println("Há ao todo "+ contaPar+ " pares e "+contaImpar+ " impares.");

    }

    public int maiorElemento(){
        int max;
        max = inicio.valor;

         No valorAtual = inicio;

        if (isEmpty()){
            System.out.println("Lista vazia!");
        }

        while (valorAtual != null){
            if(valorAtual.valor > max){
                max = valorAtual.valor;
            }

            valorAtual = valorAtual.prox;
        }

        return max;

        }

    public int somaElementos(){
        No valorAtual = inicio;
        int somaElementos = 0;

        if(isEmpty()){
            System.out.println("Lista vazia!");
            return -1;
        }

        while (valorAtual != null){
            somaElementos += valorAtual.valor;

            valorAtual = valorAtual.prox;
        }

        return somaElementos;
    }

    static void main(String[] args) {
        //Parte 1:
        ListaDinamica1 listaLigada = new ListaDinamica1();

        listaLigada.enqueue(10);
        listaLigada.enqueue(12);
        listaLigada.enqueue(13);
        listaLigada.enqueue(14);
        listaLigada.enqueue(17);
        listaLigada.enqueue(9);

        listaLigada.displayQueue();

        System.out.println("A fila possui "+listaLigada.getTamanho()+" elementos armazenados.");
        int x = 7;
        if(listaLigada.isElement(x)){
            System.out.println("O valor "+x+ " é elemento da fila.");
        }else{
            System.out.println("O valor " +x +" não é elemento da fila.");
        }

        listaLigada.quantidadePar();

        System.out.println("A soma dos elementos da lista vale: "+ listaLigada.somaElementos());
    }
}
