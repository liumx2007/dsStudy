import org.junit.Assert.*;
import org.junit.Test;

/**
 * 柳明新 创建于 16/9/2.
 */
public class SortUtilTest {
    @Test
    public void halfInsertOrder() throws Exception {
        new SortUtil().halfInsertOrder(SortUtil.array);
    }

    @Test
    public void directInsertOrder() throws Exception {
        new SortUtil().directInsertOrder(SortUtil.array);
    }

}