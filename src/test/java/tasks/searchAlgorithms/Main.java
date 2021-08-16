package tasks.searchAlgorithms;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        double[] doubles = {360D, 480D, 640D, 720D, 1080D, 1920D};

        int index = Utils.linearSearch(doubles, 480D);


        List<Double> doubles1 = Arrays.asList(1080D, 480D, 640D, 720D, 360D, 1920D);
        Collections.sort(doubles1);
        System.out.println(doubles1);


        System.out.println("index = " + index);
        assert index == 1;

        Optional<Integer> optional;
        optional = Optional.empty();
        optional.get();

        List<String> lost = new ArrayList<>();
        lost.add("");

        Set<String> sett = new HashSet<>();
        sett.add("");

        Map<Integer, String> mapp = new HashMap<>();
        mapp.put(1, "");
    }

}
