public class ConcatService {

    private String[] strings;

    private StringConcatenator defaultConcat = (x) -> {
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
        System.out.println("=======================");
        System.out.println(concatenator.concatenate(strings));
        System.out.println("=======================");
    }

    public void printConcatenation() {
        printConcatenation(defaultConcat);
    }
}
