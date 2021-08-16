package tasks.task9;

import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

public class Car {
    int number;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    public static Stream<String> nameList(Map<String, Stream<String>> map) {
        if (map == null) throw new NullPointerException();
        return map.values()
                .stream()
                .flatMap(t-> t)
                .filter(Objects::nonNull)
                .map(m -> m.replaceAll(" ", ""))
                .filter(m -> !m.equals(""))
                .map(m -> (m.substring(0, 1).toUpperCase() + m.substring(1).toLowerCase()))
                .distinct()
                .sorted();

    }

    //    @Override
//    public int hashCode() {
//        return Objects.hash(number, name);
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if(o == this) return true;
//        if(o == null || o.getClass() != getClass()) return false;
//        Car car = (Car) o;
//        return car.name.equals(this.name) && car.number == this.number;
//
//
//    }
}
