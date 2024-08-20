public class StaticList {
    private int[] data;
    private int size;
    private int capacity;


    public StaticList(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.size = 0;
    }


    public void clear() {
        this.size = 0;
    }


    public void add(int data) {
        if (!isFull()) {
            this.data[size++] = data;
        } else {
            throw new RuntimeException("Lista cheia!");
        }
    }


    public void add(int data, int pos) {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Posição inválida!");
        }
        if (isFull()) {
            throw new RuntimeException("Lista cheia!");
        }
        for (int i = size; i > pos; i--) {
            this.data[i] = this.data[i - 1];
        }
        this.data[pos] = data;
        size++;
    }


    public int remove(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Posição inválida!");
        }
        int removedData = this.data[pos];
        for (int i = pos; i < size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        size--;
        return removedData;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public boolean isFull() {
        return size == capacity;
    }


    public void setData(int data, int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Posição inválida!");
        }
        this.data[pos] = data;
    }


    public int getData(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Posição inválida!");
        }
        return this.data[pos];
    }


    public int getSize() {
        return size;
    }


    public int find(int data) {
        for (int i = 0; i < size; i++) {
            if (this.data[i] == data) {
                return i;
            }
        }
        return -1;
    }
}
