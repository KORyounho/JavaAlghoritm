package algorithm.search;

public interface Comparator<T> extends java.util.Comparator<T> {

    int compare(T o1, T o2);
    boolean equals(Object obj);

    @Override
    default java.util.Comparator<T> reversed() {
        return java.util.Comparator.super.reversed();
    }
}
