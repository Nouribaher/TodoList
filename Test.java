import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler();
        System.out.println(">> Welcome to Todoly");
        System.out.println(">> You have X tasks todo and Y tasks are done!");
      for(int i = 0 ;i< 5 ;i++)  {
        System.out.println("Pick any option :");
        System.out.println("( 1 ) Show Task list(by date or project" );
        System.out.println("( 2 ) Add New Task" );
        System.out.println("( 3 ) Edit Task (Update.Mark as done ,Remove" );
        System.out.println("( 4 ) Save and Quit" );
          try {
              Scanner scan = new Scanner(System.in);
              int numberOfMenu  = scan.nextInt();
              System.out.println("Valid input");
          switch(numberOfMenu)
        {
            case 1:{ TodoList showDate = new TodoList();
                     TodoList showProject= new TodoList();
                     showDate.showDateOfTask();
                     showProject.showProjectOfTask();
                      break;
            }
            case 2:{ TodoList cerat = new TodoList();
                      cerat.createTask();
                      break;
            }
            case 3:
                System.out.println("Case3 ");
                System.out.println("( 1 ) Update of Task  ");
                break;
            case 4:
                System.out.println("Case4 ");
                break;
            default:
                System.out.println("Default ");
        }
          } catch(NumberFormatException e) {
              System.out.println("input is not an int value");
          }

      }



      //  Task task = new Task("Noi","1978-10-03","ITC","Maher");
        //ArrayList<Task> taskArrayList = new ArrayList<>();
        //taskArrayList.add(task);
        //fileHandler.WriteAsData(taskArrayList);
        //fileHandler.readASData();
        //System.out.println(".............................");
     //System.out.println(task.toString());

    }


}
