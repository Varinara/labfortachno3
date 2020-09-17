

public class U0901WorkArray<T extends Number> {
    T[] arrNums;

    U0901WorkArray(T[] numP) {
        arrNums = numP;
    }

    double sum() {
        double doubleWork = (double) 0.0;
        for (T t : arrNums) {
            doubleWork += t.doubleValue();
        }
        return doubleWork;
    }
}