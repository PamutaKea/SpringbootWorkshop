public class CircularBuffer {
    private int bufferSize = 10;
    private String[] buffer;
    private int readPointer;
    private int writePointer;
    private boolean result;

    // Default constructor
    public CircularBuffer() {
        this.buffer = new String[10];
    }

    public boolean isEmpty() {
        return bufferSize == 10;
    }

    public void writeData(String input) {
        bufferSize--;
        this.buffer[writePointer++] = input;
    }

    public boolean isFull() {
       return bufferSize == 0;
    }

    public String readData() {
        return this.buffer[readPointer++];
    }

    public boolean checkSize(int size) {
        if(size <= bufferSize){
            result = true;
        }else if(size > bufferSize){
            result = false;
        }
        return result;
    }
}
