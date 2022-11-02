import java.util.ArrayDeque;

public class FoodList{

    ArrayDeque<String> foodList;

    FoodList(){
        foodList = new ArrayDeque();
    }
    public void add(String f){
        foodList.add(f);
    }
    public String pop(){
        String ret = foodList.remove();
        foodList.add(ret);
        return ret;
    }

    public String toString(){
        String out = "";
        for(String s : foodList){
            out+= s + "\t";
        }
        return out;
    }
    public static void main(String[] args){
        FoodList bob = new FoodList();

        bob.add("Pizza");
        System.out.println(bob);
        bob.add("Chicken");
        System.out.println(bob);
        bob.add("Steak");
        System.out.println(bob);
        bob.add("potato");
        System.out.println(bob);

        System.out.println();

        System.out.println(bob.pop());
        System.out.println(bob);
        System.out.println(bob.pop());
        System.out.println(bob);
        System.out.println(bob.pop());
        System.out.println(bob);
        System.out.println(bob.pop());
        System.out.println(bob);


    }
}
