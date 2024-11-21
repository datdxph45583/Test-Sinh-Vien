import com.example.ontapKT1.Tich;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class TestTich {
    Tich t = new Tich();
    @Test
    public void testT1(){
        int exp = 10;
        int act = t.tich("5","2");
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void testT2(){
        int exp = 10;
        int act = t.tich("dcsd","2");
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void testT3(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            t.tich("-15000", "2");
        });
    }@Test
    public void testT4(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            t.tich("15000", "2");
        });
    }
    @Test
    public void testT5(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            t.tich("-15000", "-15000");
        });
    }
    @Test
    public void testT6(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            t.tich("10000", "-15000");
        });
    }@Test
    public void testT7(){
        int exp = 10;
        int act = t.tich("8","2");
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void testT8(){
        int exp = 18;
        int act = t.tich("9","2");
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void testT9(){
        int exp = 10;
        int act = t.tich("1","2");
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void testT10(){
        int exp = 10;
        int act = t.tich("5","2");
        Assertions.assertEquals(exp,act);
    }

}
