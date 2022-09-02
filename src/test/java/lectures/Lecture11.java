package lectures;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.junit.Test;

public class Lecture11 {

  @Test
  public void joiningStrings() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
    String resul = "";
    for (int i = 0; i < names.size(); i++ ) {
      if(i+1 != names.size())
        resul += names.get(i) +", ";
      else resul += names.get(i);
    }
    System.out.println(resul);
  }

  @Test
  public void joiningStringsWithStream() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
    String join = names.stream()
            .map(String::toUpperCase)
            .collect(Collectors.joining(", "));
    System.out.println(join);
  }
}
