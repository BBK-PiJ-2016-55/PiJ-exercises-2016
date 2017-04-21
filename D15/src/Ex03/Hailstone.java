package Ex03;

import java.util.List;
import java.util.ArrayList;

public class Hailstone {
    List<Integer> result = new ArrayList<>();

    public void hail(int n) {
        int calcResult = (n % 2 == 0) ? (n / 2) : (3 * n + 1);
        result.add(calcResult);
        if (calcResult == 1) return;
        hail(calcResult);
    }
}