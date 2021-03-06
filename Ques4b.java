package JDK8Updates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques4b {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(23, 34, 45, 56, 67, 78, 89, 90);
        int prod=list1.stream().reduce(1,(n1,n2)->n1+n2);
        System.out.println(prod);
        System.out.println(list1.stream().map(a->a*a).collect(Collectors.toList()));
    }
}
/*
483
[529, 1156, 2025, 3136, 4489, 6084, 7921, 8100]
 */