import java.io.*;
import java.util.*;
import java.io.File;
import java.util.Scanner;

public class FileHandler {
    private String path = "src/main/r/";
    private Object String;

    public void WriteAsData (ArrayList<Task> list){
    try {
        FileWriter fileWriter = new FileWriter(new File (path + "admin.txt"));
        BufferedWriter writer = new BufferedWriter(fileWriter);
        for ( Task a : list){
            writer.write(a.toString()+"\n");
        }

        writer.close();
    }

        catch(IOException e) {
            System.out.println("File doesn't found"+e);
        }

    }

       public ArrayList<Task> readASData(){
           ArrayList<Task> readerList = new ArrayList<>();
        try {
            File fileReader = new File (path+"admin.txt");
            Scanner reader = new Scanner(fileReader);
            while (reader.hasNextLine()) {
                  String data = reader.nextLine();
                  System.out.println(data);
            }
            reader.close();
            }

           catch(IOException e) {
           System.out.println("FAn error occurred." + e);
               e.printStackTrace();
       }
        return readerList;

       }
}
