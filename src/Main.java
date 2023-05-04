public class Main {

    public static void main(String... args) {
        ConcatService service = new ConcatService("Hello", "World", "of", "Java");

        DelimiterConcatenator delimiter = new DelimiterConcatenator("~");
        service.printConcatenation(delimiter);

        service.printConcatenation((x) -> Integer.toString(x.length));

        service.printConcatenation();
    }
}
