package sistema;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Documento aux;

        Queue<Documento> balconista = new LinkedList();
        Stack<Documento> supervisor = new Stack<Documento>();
        LinkedList<Documento> arquivista = new LinkedList();

        int opcao = 0, numSeq = 0;

        do {
            System.out.println("-----------------MENU-----------------");
            System.out.println("1 - Inseir novo documento");
            System.out.println("2 - Listar documento da fila");
            System.out.println("3 - Processar documentos");
            System.out.println("4 - Listar documento processados");
            System.out.println("5 - Arquviar documentos");
            System.out.println("6 - Listar Documento ordenados");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 0:
                    System.out.println("Saindo");
                    break;

                case 1:
                    Documento doc = new Documento();

                    System.out.println("Digite o nome de remetente");
                    doc.setNomeRemetente(sc.next());

                    System.out.println("Didite o tituto do documento");
                    doc.setTituloDoc(sc.next());

                    numSeq++;
                    balconista.add(doc);
                    break;

                case 2:
                    if (balconista.size() > 0) {
                        System.out.println("\nLista de documentos recebidos: ");
                        for (Object obj : balconista) {
                            System.out.println(obj);
                        }
                    } else {
                        System.out.println("\nNão há itens no balcão!");
                    }
                    break;

                case 3:
                    if (balconista.size() > 0) {
                        while (!balconista.isEmpty()) {
                            supervisor.push(balconista.peek());
                            balconista.remove();
                        }
                        System.out.println("Documentos processados com sucesso");
                    } else {
                        System.out.println("\nNão há itens no balcão!");
                    }
                    break;

                case 4:
                    if (supervisor.size() > 0) {
                        System.out.println("\nLista de documentos processados: ");
                        for (Object obj : supervisor) {
                            System.out.println(obj);
                        }
                    } else {
                        System.out.println("\nNão há itens processados!");
                    }
                    break;

                case 5:
                    if (supervisor.size() > 0) {
                        while (!supervisor.isEmpty()) {
                            arquivista.add(supervisor.pop());
                        }

                        System.out.println("Documentos arquivados com sucesso");
                    } else {
                        System.out.println("\nNão há itens processados!");
                    }
                    break;

                case 6:
                    for (int i = 0; i < arquivista.size(); i++) {
                        aux = arquivista.get(i);
                        for (int j = 0; j < arquivista.size() -1; j++) {
                            if (aux.getNomeRemetente().compareTo(arquivista.get(j).getNomeRemetente()) < 0) {
                                aux = arquivista.get(i);
                                arquivista.set(i, arquivista.get(j));
                                arquivista.set(j, aux);
                            }
                        }
                    }
                    if (arquivista.size() > 0) {
                        System.out.println("\nLista de documentos no arquivo ordenados por nome: ");
                        for (Object obj : arquivista) {
                            System.out.println(obj);
                        }
                    } else {
                        System.out.println("\nNão há itens no arquivo!");
                    }
                    break;

                default:
                    System.out.println("Opção invalida");
            }

        } while (opcao != 0);
/*
        //Balconista.
        //Enfileira os arquivos em uma lista lincada e repassada para o supervisor
        for (int i = 0; i <= 3; i++) {
            Documento doc = new Documento();

            System.out.println("Digite o numero de recebimento do documento:");
            doc.setNumSequencial(sc.nextInt());

            System.out.println("Digite o nome de remetente");
            doc.setNomeRemetente(sc.next());

            System.out.println("Didite o tituto do documento");
            doc.setTituloDoc(sc.next());

            enfileira.add(doc);
        }

        //Supervisor.
        //Empilha os dados para repassar ao Arquivista para a ordenaçao
        for (int i = 0; i <= 3; i++) {
            pilhaDoc.push(enfileira.peek());
            enfileira.remove();
        }

        //Arquivista
        //Repassa os a pilha para dentro de um vetor para começar a ordenaçao
        for (int i = 0; i < docVetor.length; i++) {
            docVetor[i] = pilhaDoc.pop();
        }

        //Ordena os elementos do vetor por BubbleSort atraves do Nome do Remetente
        for (int i = 0; i < docVetor.length; i++) {
            for (int j = 0; j < docVetor.length - 1; j++) {
                if (docVetor[i] != null && docVetor[j] != null) {
                    if (docVetor[i].getNomeRemetente().compareTo(docVetor[j].getNomeRemetente()) < 0) {
                        Documento docAux = docVetor[i];
                        docVetor[i] = docVetor[j];
                        docVetor[j] = docAux;
                    }
                }
            }
        }

        System.out.println("**************************");
        System.out.println("Documentos Ordenados");
        System.out.println("***************************");
        for (int i = 0; i < docVetor.length; i++) {
            System.out.println(docVetor[i].toString());
            System.out.println("**********************");
        }*/
                
    }
}
