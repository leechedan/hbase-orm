package hawkeye.global.base.hbase.orm.query;

import hawkeye.global.base.hbase.orm.query.criterion.Criterion;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The default implementation of the generic Query interface
 *
 * @param <T> the entity type being queried
 */
//@Service
public class QueryUpdateImpl<T> implements QueryUpdate<T> {

    private final T entity;
    private Criterion criteria;
    private final List<String> selectedFields;
    private final QueryOperationType queryOperationType;

    public QueryUpdateImpl(final T entity, Criterion criteria, List<String> selectedFields,
                           QueryOperationType queryOperationType) {
        this.entity = entity;
        this.criteria = criteria;
        this.selectedFields = selectedFields;
        this.queryOperationType = queryOperationType;
    }

    @Override
    public QueryOperationType getQueryOperationType() {
        return queryOperationType;
    }

    @Override
    public String toString() {
        return "QueryImpl [entityClass=" + entity.getClass() + ", criteria=" + criteria + "]";
    }

    @Override
    public List<String> getSelectedFields() {
        return this.selectedFields;
    }

    @Override
    public Criterion getCriteria() {
        return this.criteria;
    }

    @Override
    public T getEntity() {
        return this.entity;
    }

}
