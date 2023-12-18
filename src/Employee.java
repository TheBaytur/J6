public abstract class Employee implements TaskHandler{

    private final TaskProgressCallback callback;
    private final String name;
    private final Task.Status taskStatus;

    protected Employee(TaskProgressCallback callback, String name,
                       Task.Status taskStatus){

        this.name = name;
        this.taskStatus = taskStatus;
        this.callback = callback;
    }

//    public void doTask(Task task){
//        System.out.println(getClass().getSimpleName() + " " + name + "is doing task " +
//                getDetails(task));
//        callback.updateTask(getTaskWhenDone(task));
//    }

    public boolean doTask (Task task){
        boolean canHandle = taskStatus == task.getStatus();
        if (canHandle){
            System.out.println(getClass().getSimpleName() + "" + name + " is doing task "
            + getDetails(task));
            callback.updateTask(getTaskWhenDone(task));
        }
        return canHandle;

    }

    protected abstract Task getTaskWhenDone(Task task);

    protected abstract String getDetails(Task task);


}
