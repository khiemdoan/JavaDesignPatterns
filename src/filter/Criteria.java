package filter;

import java.util.List;

/**
 * Created by khiem on 9/4/16.
 */
public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);
}
