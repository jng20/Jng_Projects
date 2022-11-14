import java.util.ArrayDeque;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/*
v2 will increase the food selections available using 100 most popular foods https://www.tasteatlas.com/100-most-popular-foods-in-the-world
Create a randomizer method that selects 10 foods out of the hundred and adds to the list for a base list.
Create a remove method that removes from food list and adds back to top100

Next Steps
    -Still need to think of when to randomly suggest a new addition to the list
    -Still need a way to suggest a new type of cuisine
    -Need a way to classify cuisine because sometimes you want a meal but this list may generate a dessert.
    -Potentially (even though it feels rather inefficient) create an object for each and every food with attributes of
        - name
        - cuisine type
        - meal type (breakfast, lunch, dinner, snack, dessert)
        - recipe / recipe link
        - nearby restaurants
    - need to figure out way to connect java program to internet.
    - create another save list for new foods to try but don't want to eat at the moment

*/
public class FoodList{

    ArrayDeque<String> foodList ;   //foodlist is the actual user list.
    ArrayList<String> top100;                //top 100 holds all available selections not in foodlist

    FoodList()throws IOException{
        foodList = new ArrayDeque();
        top100 = new ArrayList();
        processFile();
        baseList();
    }

    public ArrayDeque<String> getFoodList() {
      return foodList;
    }

    public void setFoodList(ArrayDeque<String> t) {
      this.foodList = t;
    }

    public ArrayList<String> getTop100() {
  		return top100;
  	}

  	public void setTop100(ArrayList<String> t) {
  		this.top100 = t;
  	}

    public void add(String f){
        foodList.add(f);
    }
    public String pop(){
        String ret = foodList.pollFirst();
        if(ret != null){
          foodList.add(ret);
          System.out.println("Your food is: " + ret);
        }
        return ret;
    }

//----------------------------------------------------------------------------------------------------------------
    public void processFile() throws IOException{
        Path p = FileSystems.getDefault().getPath("top100.txt");
        p = p.toAbsolutePath();
        BufferedReader br = new BufferedReader(new FileReader(p.toString()));
        String txt = "";
		    while((txt = br.readLine())!= null) {
            top100.add(txt);
        }
    }

    public String addRandom(){
        String ret = top100.remove( (int)(Math.random()* top100.size()) );
        foodList.add( ret );
        return ret;
    }

    public void baseList(){
        for(int i = 0; i< 10; i++){
          addRandom();
        }
    }

//Because you only know what foods are in the list after popping, the food you want to remove should be at the end of the queue.
    public String remove(){
      String result = foodList.pollLast();
      if(result != null){
        top100.add(result);
      }
      return result;
    }

//If you know a food in your list but didn't just pop and still want to remove it.
    public boolean remove(String s){
      boolean ret = foodList.remove(s);
      if(ret == true){
        top100.add(s);
      }
      return ret;
    }

    public String toString(){
        String out = "FoodList:";
        for(String s : foodList){
            out+= s + "\t ";
        }
        out += "\n";
        out += "Foods left: ";
        //just back 10
        for(int i = 10; i >= 1; i--){
            out+= top100.get(top100.size() - i) + "\t ";
        }
        return out;
    }
    public static void main(String[] args)  throws IOException{

        FoodList bob = new FoodList();
        System.out.println();
        bob.pop();
        System.out.println();
        System.out.println(bob);
        System.out.println();

        bob.pop();
        System.out.println();
        System.out.println(bob);
        System.out.println();

        bob.pop();
        System.out.println();
        System.out.println(bob);
        System.out.println();

        bob.pop();
        System.out.println();
        System.out.println(bob);
        System.out.println();
        System.out.println("***********************************************************");

        System.out.println(bob.remove());
        System.out.println(bob);
        System.out.println();

        System.out.println(bob.addRandom());
        System.out.println(bob);

    }
}
