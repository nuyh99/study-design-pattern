package adapter_pattern.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

public class IteratorAdapter implements Iterator<Object> {
    private final Enumeration<Object> enumeration;

    public IteratorAdapter(Enumeration<Object> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEachRemaining(Consumer<? super Object> action) {
        while(enumeration.hasMoreElements()){
            Object o = enumeration.nextElement();
            action.accept(o);
        }
    }
}
