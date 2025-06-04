import java.util.Arrays; // for printing array

/**
 * A class to demonstrate minimum heap operations using arrays
 */
public class MinHeap {

    /** Underlying array */
    private int[] array;

    /** Size of min heap */
    private int size;

    /** Default constants */
    private static final int DEFAULT_SIZE = 4;

    /** Basic constructor */
    public MinHeap(int size) {
        this.size = (size > 0) ? size : DEFAULT_SIZE;
        this.array = new int[this.size];
    } // basic contructor

    /** Default constructor */
    public MinHeap() {
        this(DEFAULT_SIZE);
    }

    /** Accessor for this.size */
    public int getSize() {
        return this.size;
    }

    public static void main(String[] args) {
        MinHeap demo = new MinHeap(-1);
        System.out.printf("\nThe size of the object is %d\n", demo.getSize());
    }

} // class MinHeap