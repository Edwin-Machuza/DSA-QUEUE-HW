

public class FilaEstatica implements InterfaceFilaEstatica {

    private int capacidade;
    private int[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaEstatica(int capacidade) {
        this.capacidade = capacidade;
        this.tamanho = 0;
        this.elementos = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
    }
    @Override
    public boolean filaVazia(){
        return fim == -1;
    }

    @Override
    public void inserirElemento(int value) {
        if(filaCheia()) {
            throw new RuntimeException("Erro: fila cheia");
        }
        fim = (fim + 1) % capacidade;
        elementos[fim] = value;
        tamanho++;

    }

    @Override
    public void removerElemento(int value) {
        if(filaVazia()){
            throw new RuntimeException("Erro: fila vazia!");
        }
        elementos[inicio] = value;
        inicio = (inicio + 1) % capacidade;
        tamanho--;
    }

    @Override
    public void percorrerFila(){
        for(int i = inicio; i < tamanho; i++){
            IO.print(elementos[i]+" ");
        }
    }

    @Override
    public boolean filaCheia() {
        return capacidade == tamanho;
    }

    @Override
    public int frente() {
        if(filaVazia()){
            throw new RuntimeException("Erro: fila vazia!");
        }
        return elementos[inicio];
    }

    @Override
    public int buscarElemento(int index){
        if(!filaVazia()){
            if(index >= inicio && index <= fim){
                return elementos[index];
            }
        }
        return -1;

    }

    @Override
    public void contarParesImpares(){
        if(filaVazia()){
            IO.println("Erro: fila vazia");
        }
        else {
            int even = 0;
            int odd = 0;
            for (int i = inicio; i < tamanho; i++) {
                if (elementos[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            IO.println("Pares sao = " + even + "\nImpares sao = " + odd);
        }
    }

    @Override
    public void inverterVetor(){
        if(filaVazia()){
            IO.println("Erro: fila vazia");
        }
        else{
            int aux;

            int meio = (inicio + tamanho) / 2;

            for(int i = inicio; i < meio; i ++){
                int indiceOposto = fim - (i - inicio);

                aux = this.elementos[i];
                this.elementos[i] = this.elementos[indiceOposto];
                this.elementos[indiceOposto] = aux;
            }
            for(int i = inicio; i < tamanho; i++){
                IO.print(elementos[i]+" ");
            }
        }
    }
    @Override
    public void maiorMenor(){
        if(filaVazia()){
            IO.println("Erro: fila vazia");
        }
        else if(tamanho == 1) {
            IO.println("Não é possível comparar um elemento com ele mesmo!");
        }
        else{
            int maior = elementos[inicio];
            int menor = elementos[inicio];
            for (int i = inicio; i < tamanho - 1; i++) {
                if (maior < elementos[inicio + 1]) {
                    maior = elementos[inicio + 1];
                }
                if (menor > elementos[inicio + 1]) {
                    menor = elementos[inicio + 1];
                }
            }
            IO.println("O maior é "+maior+"\nO menor é "+menor);
        }
    }
}
