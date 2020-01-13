import com.dool.met.Method;

public class pow implements Method {

    @Override
    public double calculate(double v, double v1) {
        return Math.pow(v, v1);
    }

    @Override
    public String sign() {
        return "^";
    }

}
