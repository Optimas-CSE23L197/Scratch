public class Variable {
    int x = 25;
    char c = 'A';
    String name = "Animesh";
    double d = 4.5;
    float f = (float) 3.2; // narrowing conversion

    boolean isTrue = true;

    byte b = 10; // 1 byte = 8 bits
    short s = 1000;
    long l = 10000000000L; // long value must end with L or l

    public static void main(String[] args) {
        Variable v = new Variable();
        System.out.println("Integer: " + v.x + " | Bytes: " + Integer.BYTES);
        System.out.println("Character: " + v.c + " | Bytes: " + Character.BYTES);
        System.out.println("String: " + v.name); // String size varies (reference type)
        System.out.println("Double: " + v.d + " | Bytes: " + Double.BYTES);
        System.out.println("Float: " + v.f + " | Bytes: " + Float.BYTES);
        System.out.println("Boolean: " + v.isTrue + " | Size: JVM dependent");
        System.out.println("Byte: " + v.b + " | Bytes: " + Byte.BYTES);
        System.out.println("Short: " + v.s + " | Bytes: " + Short.BYTES);
        System.out.println("Long: " + v.l + " | Bytes: " + Long.BYTES);
    }
}

/*
 * Variable Types in Java:
 * 
 * 1. Primitive Types (stored in stack memory):
 * - int, char, double, float, boolean, byte, short, long
 * 
 * 2. Reference Types (reference stored in stack, object in heap):
 * - String, Arrays, Classes, Interfaces, etc.
 * Example: Box obj = new Box();
 * // 'obj' is reference in stack, actual Box object is in heap
 * 
 * 3. Primitive types cannot be null; they always have default values.
 * Reference types can be null (can cause NullPointerException if accessed).
 * 
 * 4. Performance:
 * - Primitive types are faster (stack).
 * - Reference types are slower (heap + dynamic allocation).
 * 
 * 5. Type Conversions:
 * a. Narrowing (explicit): Large -> Small (may lose data)
 * Example: float f = (float) 3.2; long to int, double to float
 * 
 * b. Widening (implicit): Small -> Large (safe)
 * Example: int to long, float to double
 * 
 * 6. Overflow:
 * - If value exceeds type range, it wraps around.
 * - Example: byte max is 127. Adding 1 results in -128.
 * 
 * 7. Type Casting:
 * - Explicit: int x = 10; double d = (double) x;
 * - Implicit: int x = 10; double d = x;
 * 
 * 8. Sizes of Primitive Types:
 * - byte = 1 byte = 8 bits
 * - short = 2 bytes = 16 bits
 * - int = 4 bytes = 32 bits
 * - long = 8 bytes = 64 bits
 * - float = 4 bytes = 32 bits
 * - double = 8 bytes = 64 bits
 * - char = 2 bytes = 16 bits (Unicode)
 * - boolean = JVM dependent (often 1 byte in arrays, but not defined in spec)
 */
