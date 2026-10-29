public class Task {
    private int taskID;
    private String taskDesc;
    private boolean taskStatus;

    public Task(int taskID) {
        this.taskID = 0;
        this.taskDesc = null;
        this.taskStatus = false;
    }

    public int getID() {
        return taskID;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public boolean getTaskStatus() {
        return taskStatus;
    }

}