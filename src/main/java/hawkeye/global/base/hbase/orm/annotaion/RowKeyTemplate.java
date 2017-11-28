package hawkeye.global.base.hbase.orm.annotaion;

/**
 * @author XuFM
 * @since 8/25/16
 */
public @interface RowKeyTemplate {

    boolean sequenceEnabled() default false;

    RowKeyPart[] value();
}
