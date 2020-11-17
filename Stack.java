class Stack {

    int[] s;

    int length;
    boolean overflow;
    boolean underflow;

    Stack(int size) {
        s = new int[size];
        length = 0;
        overflow = false;
        underflow = false;
    }

    void push(int x)   {
        if (length >= s.length) {
            overflow = true;
        }
        else {
            overflow = false;
        }
      if (overflow == true)  s[length++] = x;
    }

      int pop() {
        underflow = lenght == 0;
        if (underflow)
            return s[--length];
        else {
            return -1;
        }
      }
}
