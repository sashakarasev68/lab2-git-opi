public interface A {
    int ae();
    String nn();

    public default void r1Method() {
        System.out.println("r1 from blue user");
    }

    default int multiply(int a, int b) {
        return a * b;
    }

    default double average(double a, double b) {
        return (a + b) / 2;
    }

    default double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}