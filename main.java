import java.util.HashMap;
import java.util.Map;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
/*
Names: Bridget Naylor, 
Date: 4/5/2021
Lab: 10
*/


class Main {//display, read file, search

  /**
  @description: passes in a filename as a String.Return the Map populated witheach of the words in the file and the number of times they appeared
  */
  static HashMap<String,Integer> readFile( String fileToRead, HashMap<String,Integer> hash )
  {
    try {
      File myObj = new File(fileToRead);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
        if ( hash.containsKey(data) )
        {
          hash.put(data, hash.get(data) + 1);
        }
        else 
        {
          hash.put(data, 1);
        }
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return hash;
  }

  /**
  @description: pass in the Map. Prompt the user to enter a String. Display the word with its frequency in the format word => frequency (ie. Alice => 2). If the word is not in the map, display it in the same format with a 0
  @param the hashmap of words
  @return none
  */
  static HashMap<String,Integer> search( HashMap<String,Integer> h )
  {
    System.out.println("Enter String");
    String userInput = CheckInput.getString();
    System.out.println(userInput + "=>" + h.get(userInput));
  }

  /**
  @displays the words in the map with their frequencies
  @param the hashmap of words
  @return none
  */
  static void display( HashMap<String,Integer> h)
  {
    for (Map.Entry<String, Integer> entry : h.entrySet()){
      System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }
  }

  /**
  @description: display menu and then returns user's choice
  @param none
  @return int of user's menu choice
  */
  static int menu()
  {
    System.out.println("1. Search ");
    System.out.println("2. Display ");
    System.out.println("3. Quit ");
    return CheckInput.getIntRange(1, 3);
  }

  public static void main(String[] args) {
    
    int userInput = menu();
    while ( userInput != 3 )
    {

    }
  }
}
