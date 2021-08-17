package lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListExamplesTest {

    ListExamples listExamples;

    @BeforeEach
    void setUp() {
        listExamples = new ListExamples();
    }

    @Test
    void addIntoList() {
        List<Integer> result = listExamples.addIntoList();
    }

    @Test
    void searchInt() {
        List<Integer> result = listExamples.addIntoList();
        listExamples.searchInt(result);
    }


  @Test
    void dublicate(){
        int[] dub = new int[100];
        for (int i = 0; i <100; i++){
            dub[i] = i +1;
        }
      System.out.println(Arrays.toString(dub));
        dub[99] = 45;
        int sum = 0;
        int sum2 = 0;
      System.out.println(Arrays.toString(dub));
      for (int i = 0; i < dub.length; i++) {
          sum += dub[i];

      }
      for (int i = 1; i <=100; i++) {
          sum2 += i;

      }
      System.out.println(sum);
      System.out.println(sum2);
      System.out.println(sum - sum2);
  }


}