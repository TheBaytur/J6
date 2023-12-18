public class Main {  // Callbacks, lambda
    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        TaskProgressCallback callback = new CallbackImpl(factory);
        EmployeeChain chain = new EmployeeChain(new Designer(callback,"Alycia"));
        EmployeeChain next = new EmployeeChain(new Programmer(callback,"John"));
        EmployeeChain last = new EmployeeChain(new Tester(callback,"Steve"));
        next.setNextEmployee(last);
        chain.setNextEmployee(next);

        while (true)
            chain.doTask(factory.getTask());

    }
}
