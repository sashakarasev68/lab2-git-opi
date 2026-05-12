public interface A {
    int ae();
    String nn();

    public default void r1Method() {
        System.out.println("r1 from blue user");
    }

    default int multiply(int a, int b) {
        return a * b;
    }
}