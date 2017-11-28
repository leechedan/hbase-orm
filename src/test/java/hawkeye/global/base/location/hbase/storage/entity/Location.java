package hawkeye.global.base.location.hbase.storage.entity;

import hawkeye.global.base.hbase.orm.annotaion.RowKeyPart;
import hawkeye.global.base.hbase.orm.annotaion.RowKeyPartNameFrom;
import hawkeye.global.base.hbase.orm.annotaion.RowKeyTemplate;
import hawkeye.global.base.hbase.orm.annotaion.TableColumnFamily;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author XuFM
 * @since 8/25/16
 */
@Table(name = "location")
@TableColumnFamily(name = Location.ColumnFamily.DATA)
@RowKeyTemplate(sequenceEnabled = true, value = {
        @RowKeyPart(name = "data.vin", type = String.class, from = RowKeyPartNameFrom.COLUMN),
        @RowKeyPart(name = "YYMMDD", type = int.class, from = RowKeyPartNameFrom.CONTEXT)
})
public class Location implements Serializable {

    private static final long serialVersionUID = 8220641142933994569L;

    public static class ColumnFamily {
        public static final String DATA = "data";
    }

    @Id
    @Column(length = 255, unique = true, nullable = false)
    private String id;
    @Column(name = "hmi_imei", nullable = false)
    private String hmi_imei;
    @Column(name = "vin", nullable = false)
    private String vin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHmi_imei() {
        return hmi_imei;
    }

    public void setHmi_imei(String hmi_imei) {
        this.hmi_imei = hmi_imei;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
