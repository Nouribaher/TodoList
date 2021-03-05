import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoList {

    List<Task> tasks = new ArrayList<>();

    public  TodoList() {  }

    public void showDateOfTask () {
        for (Task show : tasks) {
        System.out.println("Title of task : "+ show.getTitle() +"***"+"Due Date Of Task :"+ show.getDueDate());
        System.out.println("................................................");
    }
        }

   public void showProjectOfTask() {
                     for (Task show : tasks) {
                     System.out.println("Title of task : "+ show.getTitle() +"***"+"Name Of Project :"+ show.getProject());
                     System.out.println("................................................");
   }
   }
    public void createTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter task Title");
        String title = scanner.nextLine();
        System.out.println("Please enter Project name");
        String project = scanner.nextLine();
        System.out.println("Please enter due date");
        System.out.println("Please enter your date in the format dd/MM/yyyy");
        String  date = scanner.nextLine();
        Task t = new Task();
        t.setTitle(title);
        t.setDueDate(date);
        t.setProject(project);
        tasks.add(t);
        System.out.println("Task added successfully.");

    }

}

  
  