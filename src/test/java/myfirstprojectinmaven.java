import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class myfirstprojectinmaven {

    @Test
    public void myTest1(){
        System.out.println("Hello ");
        List<Integer> strList = new ArrayList<Integer>();
        strList.add(5);
        strList.add(6);
        strList.add(13);
        strList.add(0);
        strList.add(7);



        //using Collections.sort() to sort ArrayList
        Collections.sort(strList);
        for(Integer str: strList)
            System.out.print(" "+str);
    }


}
