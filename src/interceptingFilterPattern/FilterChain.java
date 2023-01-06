package interceptingFilterPattern;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    List<Filter> filters=new ArrayList<>();
    private Target target;

    public void setTarget(Target target) {
        this.target = target;
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void doFilter(HttpRequest httpRequest) {
        //do some processing
        for (Filter filter:filters){
            filter.doFilter(httpRequest);
            if(!filter.pass())
                break;
            target.execute(httpRequest);
        }

    }

}
