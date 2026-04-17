/*
a) O custo de inserção no meio é igual, já que mesmo que para inserir em uma Linked List, só se precise
rearranjar ponteiros, o que seria um custo de O(1), achar a posição a ser inserida tem custo de O(n), já
em um array, achar a posição tem custo de O(1), mas rearranjar o vetor tem custo de O(n), o que torna equivalentes
em custos, por motivos diferentes.
b) Array, pois tem acesso por indice de forma direta, com custo de O(1), em uma Linked List, para achar o indice querido
seria necessário iterar o array, o que teria custo de O(n);
c) Seria, contudo pela quantidade de remoções, uma lista encadeada seria mais eficiente, já que toda remoção necessitaria de um
rearranjamento.
*/
