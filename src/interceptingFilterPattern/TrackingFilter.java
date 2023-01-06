package interceptingFilterPattern;

public class TrackingFilter implements Filter{
    @Override
    public void doFilter(HttpRequest httpRequest) {
        System.out.println("Processing request .........");
        System.out.println("Tracking Filter :"+httpRequest.getClientIp()+httpRequest.getTargetUrl());
    }

    @Override
    public boolean pass() {
        return true;
    }
}
