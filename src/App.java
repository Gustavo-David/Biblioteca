import java.util.Scanner;

import library.Books;
import library.Control;

public class App {
    public static void main(String[] args) throws Exception {
        Control control = new Control();
        Scanner sc = new Scanner(System.in);
        int option = 0;

        String name;
        String author;
        String publisher;
        int year;
        int pages;

        do {
            option = navegation(option);
            switch (option) {
                case 1:
                    System.out.println("Nome do livro\n");
                    name = sc.nextLine();

                    System.out.println("Nome do author\n");
                    author = sc.nextLine();

                    System.out.println("Nome do publisher\n");
                    publisher = sc.nextLine();

                    System.out.println("Ano do livro\n");
                    year = sc.nextInt();

                    System.out.println("Numero de paginas\n");
                    pages = sc.nextInt();

                    Books books = new Books(name, author, publisher, year, pages);

                    new Control(books);

                break;
                case 2:
                
                break;
                case 3:
                break;

            }

        } while (option != 0);

        sc.close();
    }

    public static int navegation(int option) {
        System.out.println("-----------------------------------");
        System.out.println("opçao");
        System.out.println(" 1 - adicionar Livro\n 2 - Listar Livros\n 3 - Deletar Livros\n 0 - sair");
        System.out.println("-----------------------------------");

        if (option > 3 || option < 0) {
            System.out.println("Numero invalido: " + option);
            option = navegation(option);
        }
        return option; 
    }

}
