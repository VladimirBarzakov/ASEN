package app.contracts.io;

import java.io.IOException;

public interface Reader {
    String readLine() throws IOException;
    void close();
}
