package app.io;

import app.contracts.io.Reader;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
public class ConsoleReader implements Reader {
    private BufferedReader reader;

    public ConsoleReader() {
        this.reader=new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String readLine() throws IOException {
        return this.reader.readLine();
    }

    @Override
    public void close() {
        if (this.reader==null){
            return;
        }
        try {
            this.reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
