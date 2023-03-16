package ativ_lista_sequencial;

public class Main extends listaSeq_01 {
    public static void main(String[] args) {
        new listaSeq_01();

        System.out.println("verif se esta vazia: " + listaSeq_01.vazia());
        System.out.println("verif tamanho: " + listaSeq_01.tamanho());
        listaSeq_01.insere(1, 12);
        listaSeq_01.insere(2, 13);
        listaSeq_01.insere(3, 14);
        listaSeq_01.insere(4, 15);
        listaSeq_01.insere(5, 16);
        System.out.println("verif tamanho apos mudança: " + getTamAtual());
        //ativ_lista_sequencial.listaSeq_01.remove(4);
        listaSeq_01.remove(1);
        System.out.println("verif tamanho apos mudança: " + getTamAtual());
        System.out.println("\n----------LISTA--------- \n");
        listaSeq_01.show();
        listaSeq_01.trocaValor(2, 33);
        System.out.println("\n----------LISTA--------- \n");
        listaSeq_01.show();

        for(int i = 0; i < tamMax; i ++){
            listaSeq_01.insere((i+1), i);
        }
        System.out.println("verifica se esta cheia: " + listaSeq_01.cheia());
        System.out.println("verif tamanho: " + listaSeq_01.tamanho());
        System.out.println("\n-------LISTA------ \n");
        listaSeq_01.show();

        listaSeq_01.remove( 10);
        listaSeq_01.remove( 20);
        listaSeq_01.remove( 30);
        listaSeq_01.remove( 40);
        listaSeq_01.remove( 50);
        listaSeq_01.remove( 60);
        listaSeq_01.remove( 70);
        listaSeq_01.remove( 80);
        listaSeq_01.remove( 90);

        System.out.println("verifica tamanho: " + listaSeq_01.tamanho());
        System.out.println("\n-------LISTA------ \n");
        listaSeq_01.show();

        listaSeq_01.insere(0, 9999);

    }
}
