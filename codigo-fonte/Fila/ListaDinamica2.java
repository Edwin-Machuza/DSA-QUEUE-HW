public class ListaDinamica2 {
    private No inicio;
    private No fim;
    private int tamanho;

    public ListaDinamica2(){
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
            throw new RuntimeException("Fila vazia!");
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
            System.out.println("Fila vazia!");
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

    public String maxMin(){
        int max, min;
        min = inicio.valor;
        max = inicio.valor;

        No valorAtual = inicio;

        if (isEmpty()){
            return "A fila está vazia!";
        }
        if(getTamanho() > 2) {
            while (valorAtual != null) {
                if (valorAtual.valor > max) {
                    max = valorAtual.valor;
                }

                if(valorAtual.valor < min){
                    min = valorAtual.valor;
                }

                valorAtual = valorAtual.prox;
            }


            return "Maior valor: "+max+"\nMenor valor: "+min+"\n";
        } else if (getTamanho() == 2) {
            if(valorAtual.valor == fim.valor){
                return "O primeiro elemento e igual ao segundo ["+valorAtual.valor+"]";
            }
        }

        return "Nao e possivel determinar o maior e/ou o menor, pois so existe um elemento na fila ["+valorAtual.valor+"]";
    }

    public String removerMultiplos(int x){

        if(isEmpty()){
            return "A fila esta vazia!";
        }

        No valorAtual = inicio;
        int contador = 0;


        while (valorAtual != null) {
            if (valorAtual.valor % x == 0){
                valorAtual = valorAtual.prox;
                tamanho--;
                contador += 1;
            }else {
                valorAtual = valorAtual.prox;
            }
        }
        return "Foram removidos "+contador+" multiplos de "+ x;
    }

    public void adicionarFila(ListaDinamica2 fila){
        if(isEmpty() || fila.inicio == null){
            return;
        }

        this.fim.prox = fila.inicio;
        this.fim = fila.fim;
        System.out.println("Fila adicionada com sucesso!");

    }

    public ListaDinamica2 produzirCopiaLista(){
        ListaDinamica2 l2 = new ListaDinamica2();

        No valorAtual = this.inicio;

        if(isEmpty()){
            System.out.println("A lista esta vazia, nao há possibilidade de fazer copia!");
        }

        while (valorAtual != null){
            l2.enqueue(valorAtual.valor);

            valorAtual = valorAtual.prox;
        }

        return l2;
    }

    public void produzirCopiaListaInvertida(){

    }

    public static void main(String[] args) {
        ListaDinamica2 l1= new ListaDinamica2();
        ListaDinamica2 l2 = new ListaDinamica2();

        ListaDinamica2 l3 = new ListaDinamica2();

        l1.enqueue(10);
        l1.enqueue(5);
        l1.enqueue(7);

        l2.enqueue(13);
        l2.enqueue(17);
        l2.enqueue(0);



        l3 = l1.produzirCopiaLista();

        l3.displayQueue();

    }

}
