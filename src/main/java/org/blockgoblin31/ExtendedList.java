package org.blockgoblin31;

import java.util.ArrayList;

public class ExtendedList<E> extends ArrayList<E> {
    ArrayList<E> toRemove = new ArrayList<>();
    public ExtendedList<E> add(E[] input) {
        for (E element : input) {
            this.add(element);
        }
        return this;
    }
    public ExtendedList<E> add(ExtendedList<E> input) {
        for(E element : input) {
            this.add(element);
        }
        return this;
    }
    public ExtendedList<E> sortBy(ExtendedList<E> key) {
        ExtendedList<E> output = new ExtendedList<>();
        for (E o : key) {
            int j = this.getCount(o);
            for (int i = 0; i < j; i++) {
                output.add(o);
            }
        }
        this.set(output);
        return output;
    }
    public int getCount(E o) {
        int count = 0;
        for (E e : this) {
            if (e == o) {
                count++;
            }
        }
        return count;
    }
    public void set(ExtendedList<E> to) {
        this.clear();
        this.add(to);
    }
    public void set(E[] to) {
        this.clear();
        this.add(to);
    }
    public int getTotal() {
        ExtendedList<E> number = new ExtendedList<>();
        for (E e : this) {
            if (!number.contains(e)) {
                number.add(e);
            }
        }
        return number.size();
    }
    public void removeAll(E element) {
        boolean next = true;
        while(next) {
            next = this.remove(element);
        }
    }
    public void scheduleRemove(E e) {
        this.toRemove.add(e);
    }
    public void applyRemove() {
        this.remove(toRemove);
        toRemove.clear();
    }
}