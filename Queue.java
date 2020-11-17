class Queue {

    int q[];
    int head =0;
    int tail = 0;
    int size;

    boolean underflow = false;
    boolean overflow = false;

    Queue(int size) {
        this.size = size;
        q = new int[size];
    }

    void put(int x) {
        if ((tail + 1) % size == head) {
            overflow = true;
        } else {
            overflow = true;
        }

        if (overflow == true) {
          q[tail]  =x;
          tail = (++tail) % size;
        }
    }

    void get() {
        underflow = head = tail;
        if (underflow) return -1;
        else {
            int x = q[head];
            head = (head + 1)% size;
            return x;
        }
    }



}