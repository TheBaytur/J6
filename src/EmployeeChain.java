public class EmployeeChain implements TaskHandler{

    private final TaskHandler first;
    private final TaskHandler second;
    private EmployeeChain nextEmployeeChain;

    public EmployeeChain(TaskHandler first, TaskHandler second) {

        this.first = first;
        this.second = second;
    }



    @Override
    public boolean doTask(Task task) {
        boolean result;
        result = first.doTask(task);
        if (!result){
            result = second.doTask(task);
        }
        return result;
    }
}
