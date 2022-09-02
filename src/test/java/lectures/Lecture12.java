package lectures;

import beans.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;
import mockdata.MockData;
import org.junit.Test;

public class Lecture12 {
  @Test
  public void understandingCollect() throws Exception {
    List<String> emails = MockData.getPeople()
        .stream()
        .map(Person::getEmail)
        //1.collect(Collectors.toList());
        /*2.collect(()-> new ArrayList<String>(),
                (strings, s) -> strings.add(s),
                (strings, strings2) -> strings.addAll(strings2));*/
        .collect(ArrayList::new,//3
                ArrayList::add,
                ArrayList::addAll);

    emails.forEach(System.out::println);
  }
}
