public class DelimiterConcat implements  StringConcatenator {

    private String delimiter;

    public DelimiterConcat(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public String concatenate(String... strings) {
        StringBuilder builder = new StringBuilder(delimiter);
        for (String str : strings) {
            builder.append(str);
            builder.append(delimiter);
        }
        return builder.toString();
    }
}
