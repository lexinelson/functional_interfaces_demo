public class Main {

    public static void main(String... args) {
        ConcatService s = new ConcatService("Hello", "World", "of", "Java");

        DelimiterConcat d = new DelimiterConcat("~");
        s.printConcatenation(d);

        s.printConcatenation((x) -> Integer.toString(x.length));

        s.printConcatenation();
    }
}
