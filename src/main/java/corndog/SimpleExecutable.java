package corndog;

import java.lang.StringBuffer;

public class SimpleExecutable {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Hello World: Nothing was passed");
        } else {
            StringBuffer tmp = new StringBuffer();
            for (int x=0; x<args.length; x++){
                tmp.append(" ").append(args[x]);
            }
            System.out.println ("Hello World: You passed -" +tmp);
        }
    }

}