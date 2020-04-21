package LastLesonLab6;

import java.io.PrintStream;

public class Printer {
    private PrintStream out;

    public Printer(PrintStream out) {
        this.out = out;
    }

    public void printLine(String line){
        out.println(line);
    }
    public void printDoubleRounded(double dbl){
        String roundedDouble = String.format("%.2f",dbl);
        out.println(roundedDouble);
    }
}
