import java.util.Stack;

public class Calc {

    public static Double calc(String[] args) {
        Stack<Double> st = new Stack<>();

        for (int i=0; i < args.length; i++) {
            try {
                Double x = Double.parseDouble(args[i]);
                st.push(x);
            } catch(Exception e) {
                String c = args[i];
                if (st.size() < 2) {
                    System.err.print("Invalid character order");
                } else {
                    Double y = st.pop();
                    Double x = st.pop();

                    if (c.equals("+")) {
                        Double res = x+y;
                        st.push(res);
                    } else if (c.equals("-")) {
                        Double res = x-y;
                        st.push(res);
                    } else if (c.equals("*")) {
                        Double res = x*y;
                        st.push(res);
                    } else if (c.equals("/")) {
                        Double res = x / y;
                        st.push(res);
                    } else if (c.equals("^")) {
                        Double res = Math.pow(x, y);
                        st.push(res);
                    } else {
                        System.err.println("Invalid character");
                    }
                }
            }
        }
        Double z = st.pop();
        return z;
    }

    public static void main(String[] args) {
        Double res = calc(args);
        System.out.println(res);
    }
}
