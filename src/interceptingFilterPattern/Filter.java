package interceptingFilterPattern;

public interface Filter {
    void  doFilter(HttpRequest httpRequest);
    boolean pass();
}
