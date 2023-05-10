//allows access to other files
package stickynotes;
/*
code in this file is to aid in long term storage of user-taken notes
needs the ability to store notes taken in files and retrieve them
 */
import java.io.File;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Arraylist;

public class FileHelper {
  private File context;

  public FileHelper(File context) {
  this.context = context;
   }

  public void saveToFile(String filename, String fileContents) {
    FileOutputStream outputStream;

    try {
      outputStream = File.openFileOutput(filename, File.MODE_PRIVATE);
      outputStream.write(fileContents.getBytes());
      outputStream.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public String readFromFile(String filename) {
    StringBuilder sb = new StringBuilder();

    try {
      FileInputStream inputStream = File.openFileInput(filename);
      BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
      String line;

      while ((line = reader.readLine()) != null) {
        sb.append(line);
      }

      inputStream.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return sb.toString();
  }
}

public void storeInFiles(ArrayList<note> notes) {
  //this function should go through each notes in the notes arraylist and put them into a different
  // file in the storedNotes folder
  //suggestion: name the files note1.txt, note2.txt... so that when we are retrieving existing
  // notes we just have to iterate the number to get to the next one
  //suggestion: put the title of the note in the first line of the file and then append the rest of note after that
  //function should override files currently in storedNotes
  //for reference this funciton will be run at the end of each session
}

public ArrayList<note> retrieveNotes() {
  //function should go through files in storedNotes directory and turn each text file into a note,
  // should be able to pull out the title of the note and differentiate it from the rest of the content
  //function also needs to be able to tell when it has taken all the notes and there are no more
  //this funciton will be ran whenever an instance of sticky notes is started
}

//having a main class can be useful for testing, but make sure to remove this before we're done with the project
//there should only be one executable in the file structure
class Main {
  public static void main(String[] args) {
     FileHelper fileHelper = new FileHelper(this);
    fileHelper.saveToFile("myfile.txt", "Hello world!");
    String fileContents = fileHelper.readFromFile("myfile.txt");
  }
}