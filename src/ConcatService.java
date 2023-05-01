public class ConcatService {

    private final String[] strings;

    private final StringConcatenator defaultConcat = (x) -> {
        StringBuilder builder = new StringBuilder();
        for (String str : x) {
            builder.append(str);
            builder.append("\n");
        }
        return builder.toString();
    };

    public ConcatService(String... strings) {
        this.strings = strings;
    }

    public void printConcatenation(StringConcatenator concatenator) {
        System.out.println("=========================\n");
        System.out.println(concatenator.concatenate(strings));
        System.out.println("\n=========================");
    }

    public void printConcatenation() {
        printConcatenation(defaultConcat);
    }
}
