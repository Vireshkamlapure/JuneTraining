package homework.InheritanceHW;

public class TestProduct {
    public static void main(String[] args) {
        Printer printer = new Printer(5,5000);
        printer.print();

        Scanner1 scanner = new Scanner1(10,10000);
        scanner.scan();

        PrinterScanner printerScanner = new PrinterScanner();
        printerScanner.p.print();
        printerScanner.s.scan();
    }
}
