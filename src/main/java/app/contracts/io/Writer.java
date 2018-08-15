package app.contracts.io;

public interface Writer {
    void writeLine(String line);
    void write(String message);
    void writeLineErrorMessage(String errorMessageLine);
}
