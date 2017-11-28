package hawkeye.global.base.hbase.orm.query.criterion.junction;


import hawkeye.global.base.hbase.orm.query.criterion.Criterion;
import hawkeye.global.base.hbase.orm.query.criterion.Operator;

/**
 * Or
 */
public class Disjunction extends Junction {

    public Disjunction() {
        super(Operator.OR);
    }

    public Disjunction(Criterion... criteria) {
        this();
        addAll(criteria);
    }

}