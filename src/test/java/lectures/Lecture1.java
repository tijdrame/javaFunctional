package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import beans.Person;

import com.google.common.collect.ImmutableList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;


public class Lecture1 {

    @Test
    public void imperativeApproach() throws IOException {
        int limit = 10;
        int counter = 0;
        List<Person> people = MockData.getPeople();
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people
        List<Person> young = new ArrayList<>();
        for (Person p: people) {
            if(p.getAge()<=18) {
                young.add(p);
                counter ++;
                if(counter == limit) break;
            }
        }
        for (Person p: young) {
            System.out.println(p);
        }

    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        MockData.getPeople().stream().filter(p -> p.getAge() <= 18)
                .limit(10)
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
}
