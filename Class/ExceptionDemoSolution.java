public class ExceptionDemoSolution {
    public static void main(String[] args) {
        try {
            String s = args[0];
            int i = Integer.parseInt(s); // String to int Conversion
            int j = i / (i - 9);
            System.out.println("Value of j: " + j);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Command line argument is not passed");
        } catch (NumberFormatException ex) {
            System.out.println("String to int conversion");
        } catch (ArithmeticException ex) {
            System.out.println("Arithematic error due to divisble by 0");
        } finally {
            System.out.println("Praveen sir rocks");
        }
    System.out.println("Main out");
    }
}
