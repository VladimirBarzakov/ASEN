package app.io;

import app.contracts.io.Writer;
import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements Writer {
    private static final String RED_BRIGHT = "\033[0;91m";
    private static final String RESET = "\033[0m";  // Text Reset
    @Override
    public void writeLine(String line) {
        System.out.println(line);
    }

    @Override
    public void write(String message) {
        System.out.print(message);
    }

    @Override
    public void writeLineErrorMessage(String errorMessageLine) {
        System.out.println(RED_BRIGHT+errorMessageLine+RESET);
    }
}
