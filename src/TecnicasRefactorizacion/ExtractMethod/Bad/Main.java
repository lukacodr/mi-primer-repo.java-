package TecnicasRefactorizacion.ExtractMethod.Bad;

public class Main {

    void printHTML() {

        printHead();
        printBody();
        System.out.println("This is the footer");
        System.out.println("script");
        System.out.println("copyright");
        System.out.println();
    }

    private void printBody() {

    }

    private void printHead() {

    }
}
