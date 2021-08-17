package lists;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {



    public List<Integer> addIntoList() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        return list;
    }

    public void searchInt(List<Integer> list){
        System.out.println(String.format("Answer is %d", list.get(list.size()/2)));
    }
}


