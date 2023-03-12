package learning.vladdubceac.iterator;

import java.util.LinkedList;

public class Client {

    public static void print(Iterator iterator){
        while (!iterator.isDone()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        System.out.println("*** Iterator Pattern Demo ***");
        String[] arts = new String[]{"Bengali","English"};
        Subject artsAggregate = new Arts(arts);

        LinkedList<String> scienceSubjects = new LinkedList<String>();
        scienceSubjects.add("Maths");
        scienceSubjects.add("Comp. Sc.");
        scienceSubjects.add("Physics");
        Subject scienceAggregate = new Science(scienceSubjects);

        System.out.println("Science subjects : ");
        Iterator scienceIterator = scienceAggregate.createIterator();
        print(scienceIterator);

        System.out.println();
        System.out.println("Arts subjects : ");
        Iterator artsIterator = artsAggregate.createIterator();
        print(artsIterator);
    }
}
