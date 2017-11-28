package hawkeye.global.base.location.hbase.storage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.hadoop.hbase.HbaseTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author XuFM
 * @since 8/25/16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-context.xml")
public class TestApp {

    public final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private HbaseTemplate hbaseTemplate;

    @Test
    public void testRead() {
        //hbaseTemplate.
        logger.info("hello");
    }

}
