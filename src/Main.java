public class Main {  // Callbacks, lambda
    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        TaskProgressCallback callback = new CallbackImpl(factory);

        EmployeeChain chain = new EmployeeChain(
                new Designer(callback,"Kamilla"),
                        new EmployeeChain(
                        new Programmer(callback, "Olga"),
                                new Tester(callback, "Aya")
                )

        );


        while (true)

            break;

    }
}
