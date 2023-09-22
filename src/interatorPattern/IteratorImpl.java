package interatorPattern;

public class IteratorImpl<T> implements Iterator {
    private T[] ts;
    private int position;

    public IteratorImpl(T[] ts) {
        this.ts = ts;
    }

    @Override
    public boolean hasNext() {
        return position < ts.length;
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            return ts[position++];
        }
        return null;
    }
}
