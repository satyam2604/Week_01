class NullPointerExceptionDemo {
    public static void main(String[] args) {
        // Generate the exception
        System.out.println("Generating NullPointerException:");
        try {
            generateException(); // This will cause a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());// This will display the reason that why the exception occurs
        }

        // Handle the exception
        System.out.println("\nHandling NullPointerException:");
        handleException(); // This will handle the exception gracefully
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null; // Initializing the variable to null
        try {
            // Attempting to call a String method on a null object
            System.out.println(text.length());
        } catch (NullPointerException e) {
            // Handling the exception
            System.out.println("Caught NullPointerException: The string is null!");
        }
    }

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // Initializing the variable to null
        // Attempting to call a String method on a null object
        System.out.println(text.length()); // This will throw NullPointerException
    }
}
