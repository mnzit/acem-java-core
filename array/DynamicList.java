public class DynamicList<T> implements List<T> {

    Object[] elements = new Object[0];
    Integer size = 0;

    @Override
    public void add(T param) {
        int length = elements.length;
        if (length == 0) {
            elements = new Object[1];
            elements[0] = param;

        } else {
            Object[] temp = new Object[length + 1];
            for (int i = 0; i < length; i++) {
                temp[i] = elements[i];
            }
            temp[length] = param;
            elements = temp;
        }
        size++;
    }

    @Override
    public void remove(int i) {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] all() {
        return elements;
    }
}
