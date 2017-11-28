package hawkeye.global.base.hbase.orm.query.criterion.junction;

import hawkeye.global.base.hbase.orm.query.criterion.Criterion;
import hawkeye.global.base.hbase.orm.query.criterion.Operator;

/**
 * And
 */
public class Conjunction extends Junction {

    public Conjunction() {
        super(Operator.AND);
    }

    public Conjunction(Criterion... criteria) {
        this();
        addAll(criteria);
    }
}
