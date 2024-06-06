import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<Person>();

        people.add(new Person("Warren Buffett", 120));
        people.add(new Person("Jeff Bezos", 150));
        people.add(new Person("Bill Gates", 100));
        people.add(new Person("Mark Zuckenberg", 50));

//        List<Person> hundredClub = new ArrayList<>();
//        List<Person> hundredClub =  people.stream()
//                .filter(person -> person.billions >= 100)
//                .collect(Collectors.toList());

        List<Person> sortedList = people.stream()
                .sorted(Comparator.comparing(person -> person.name))
                        .collect(Collectors.toUnmodifiableList());

//        for( Person p : people ){
//            if(p.billions >= 100){
//                hundredClub.add(p);
//            }
//        }

        sortedList.forEach(person -> System.out.println(person.name));





    }
}