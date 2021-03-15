package eu.academy.test;

public class HttpErrorPair <K,V extends HttpCode> implements Comparable<HttpErrorPair>{
    private  K key;
    private V value;

    public HttpErrorPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "HttpErrorPair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    @Override
    public int compareTo(HttpErrorPair o) {
        return this.value.getErrorLevel() - o.value.getErrorLevel();
    }
}
