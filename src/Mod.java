import com.dool.met.Method;

public class Mod implements Method {

    @Override
    public double calculate(double v, double v1) {
        return v % v1;
    }

    @Override
    public String sign() {
        return "%";
    }
}