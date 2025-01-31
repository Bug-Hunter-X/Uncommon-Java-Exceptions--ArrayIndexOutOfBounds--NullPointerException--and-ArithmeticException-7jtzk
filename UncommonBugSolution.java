public class UncommonBugSolution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            if(arr.length > 5 && 5 < arr.length){
                System.out.println(arr[5]);
            } else{
                System.out.println("Array index out of bounds");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        String str = null;
        try {
            if (str != null) {
                System.out.println(str.length());
            } else {
                System.out.println("String is null");
            }
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero");
        }
    }
}