package hawkeye.global.base.hbase.orm.annotaion;

/**
 * @author XuFM
 * @since 8/25/16
 */
public @interface RowKeyPart {

    String name() default "";

    Class type();

    RowKeyPartNameFrom from();
}
