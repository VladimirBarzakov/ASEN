package app.engine;

import app.contracts.io.Reader;
import app.contracts.io.Writer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Engine implements CommandLineRunner {

    private Reader reader;
    private Writer writer;

    @Autowired
    public Engine(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    @Override
    public void run(String... args) throws Exception {
        //this.writer.writeLine(Messages.AWAIT_YOUR_COMMAND_MESSAGE);

    }
}
