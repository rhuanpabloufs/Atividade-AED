import java.util.Arrays;
public class MeuArrayDinamico {
    private int[] dados;
    private int tamanho;
    private int capacidade;

    public MeuArrayDinamico(int capacidadeInicial) {
        this.dados = new int[capacidadeInicial];
        this.tamanho = 0;
        this.capacidade = capacidadeInicial;
    }

    /** Dobra a capacidade do array interno. */
    private void resize() {
        capacidade *= 2;
        dados = Arrays.copyOf(dados, capacidade);
    }

    /** Adiciona 'valor' no final do array. */
    public void add(int valor) {
        if(tamanho == capacidade){
            resize();
        }
        dados[tamanho++] = valor;
    }

    /** Retorna o elemento na posicao 'indice'. */
    public int get(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Indice invalido: " + indice);
        }
        return dados[indice];
    }

    public int size() {
        return tamanho;
    }

    /** Imprime o array no formato [a, b, c]. */
    public void imprimir() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tamanho; i++) {
            sb.append(dados[i]);
            if (i < tamanho - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    // === Teste ===
    public static void main(String[] args) {
        MeuArrayDinamico arr = new MeuArrayDinamico(2);
        arr.add(10);
        arr.add(20);
        arr.imprimir(); // [10, 20]
        arr.add(30); // deve fazer resize aqui!
        arr.add(40);
        arr.imprimir(); // [10, 20, 30, 40]
        System.out.println("Tamanho: " + arr.size()); // 4
    }
}
