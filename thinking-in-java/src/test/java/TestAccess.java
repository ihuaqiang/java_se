import com.ihuaqiang.util.Range;
import org.junit.Test;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/7
 */
public class TestAccess {
    @Test
    public void testRange(){
        int[] range = Range.range(3,10,3);
        for (int i:range){
            System.out.println(i);
        }
    }
}
