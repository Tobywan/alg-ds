package toby.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Main main = new Main();
        main._main();
    }

    private void _main()
    {
//        List<String> myList = new LinkedList<String>();
//        myList.add("T");
      
      ArrayList<Integer> list1 = new ArrayList<>();
      
      list1.add(1);
      list1.add(2);
      
      ArrayList<Integer> list2 = new ArrayList<>(list1);
      
      
    }

}
