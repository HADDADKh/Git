import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class TestLamda3 {


public static void main(String[] args) {

    Comparator<String> tri = (o1, o2) -> o1.compareTo(o2);
    String[] elements = new String[] { "aaa","zzz","fff","mmm"};
    Arrays.sort(elements, tri);
    System.out.println(Arrays.toString(elements));
    
}
  }