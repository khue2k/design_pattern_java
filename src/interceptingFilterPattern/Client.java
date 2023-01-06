package interceptingFilterPattern;

import java.util.Scanner;

public class Client {
    private FilterManager filterManager;

    public void sendRequest(HttpRequest httpRequest) {
        filterManager.filterRequest(httpRequest);
    }

    public Client(FilterManager filterManager) {
        this.filterManager = filterManager;
    }
}
