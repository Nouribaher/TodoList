public class Task {
    private String title;
    private String dueDate;
    private String project;
    private String status;

    public Task( String title,String dueDate,String project,String status ){
        this.title = title;
        this.dueDate = dueDate;
        this.project = project;
        this.status = status;
    }

    public void setDueDate(String date) {
        this.dueDate = date;
    }
    public String getDueDate() {
        return dueDate;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setMarkAsDone(String status) {
        this.status = status;
    }
    public String markAsDone() {
        return status;
    }

    public void setProject(String project) {
        this.project = project;
    }
    public String getProject() {
        return project;
    }

    public Task () { }
@Override
    public String toString() {
        return "Task Title = " + title + " , Project = " + project + " , DueDate = " + dueDate + ", MarkAsDone = " + status;
    }


}













