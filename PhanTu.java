import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.TreeMap;

public class PhanTu<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T isGreaterThan(T a) {

        if (t.compareTo(a) < 0) {
            return a;
        } else return t;
    }