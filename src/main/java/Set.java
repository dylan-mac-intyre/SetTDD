public class Set {

    private int size = 0;
    private Object[] setArray = new Object[5];

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Object item) {
        if(!contains(item)){
            setArray[size] = item;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public boolean contains(Object item) {
        for (int i = 0; i < size; i++) {
            if(setArray[i] == item) return true;
        }
        return false;
    }

    public boolean remove(Object itemToRemove) {
        if(!contains(itemToRemove)) return false;

        for (int i = 0; i < size; i++) {
            if(setArray[i] == itemToRemove){
                setArray[i] = null;

                for (int j = i; j < size -1; j++) {
                    setArray[j] = setArray[j+1];
                }

                size--;
            }
        }

        return true;
    }

    public void clear() {
        setArray = null;
        size = 0;
    }
}
