

public class FieldTest {
    // Legal field names
    private int legalField1;
    private String legalField2;
    private boolean legalField3;

    public static void main(String[] args) {
        FieldTest test = new FieldTest();
        test.printFields();

        // Illegal field names (uncomment one line at a time to see compiler errors)
        // private int 123IllegalField; // Invalid: cannot start with a number
        // private String my-variable; // Invalid: cannot contain hyphens
        // private boolean #illegalField; // Invalid: cannot contain special characters

        // Uninitialized fields
        FieldTest test2 = new FieldTest();
        test2.printUninitializedFields();

        // Uninitialized local variable (uncomment the following line to see compiler error)
        // int localVar;
        // System.out.println("Local variable: " + localVar);
        // This will produce a compiler error since the local variable is not initialized before use.
    }

    public void printFields() {
        System.out.println("Legal field1: " + legalField1);
        System.out.println("Legal field2: " + legalField2);
        System.out.println("Legal field3: " + legalField3);
    }

    public void printUninitializedFields() {
        int uninitializedIntField;
        String uninitializedStringField;
        boolean uninitializedBooleanField;

        // This will produce default values (0, null, false) since they are not initialized.
        System.out.println("Uninitialized int field: " + uninitializedIntField);
        System.out.println("Uninitialized String field: " + uninitializedStringField);
        System.out.println("Uninitialized boolean field: " + uninitializedBooleanField);
    }
}
