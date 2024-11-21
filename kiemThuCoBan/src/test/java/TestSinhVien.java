import com.example.ontapKT1.SinhVien;
import com.example.ontapKT1.SinhVienService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSinhVien {
    SinhVienService service = new SinhVienService();
    @BeforeEach
    public void setup(){
        service.addSV(new SinhVien("PH0001","Nguyen Van A",18,8.0F,1,"Phat trien phan mem"));
        service.addSV(new SinhVien("PH0002","Nguyen Van B",19,9.5F,2,"Phat trien phan mem"));
        service.addSV(new SinhVien("PH0003","Nguyen Van C",20,8.5F,1,"Phat trien phan mem"));
        service.addSV(new SinhVien("PH0004","Nguyen Van D",18,10.0F,2,"Phat trien phan mem"));
        service.addSV(new SinhVien("PH0005","Nguyen Van E",19,9.0F,1,"Phat trien phan mem"));
    }

    @Test
    public void testAdd1(){
        int exp = 6;
        SinhVien sv1 = new SinhVien("PH0006","Nguyen Van F",19,9.0F,1,"Phat trien phan mem");
        int act = service.addSV(sv1);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testAdd2(){
        SinhVien sv1 = new SinhVien("","Nguyen Van F",19,9.0F,1,"Phat trien phan mem");
        Assertions.assertThrows(NullPointerException.class, ()->{
            service.addSV(sv1);
        });
    }
    @Test
    public void testAdd3(){
        SinhVien sv1 = new SinhVien("PH0006","",19,9.0F,1,"Phat trien phan mem");
        Assertions.assertThrows(NullPointerException.class, ()->{
            service.addSV(sv1);
        });
    }
    @Test
    public void testAdd4(){
        SinhVien sv1 = new SinhVien("PH0006","Nguyen Van F",null,9.0F,1,"Phat trien phan mem");
        Assertions.assertThrows(NullPointerException.class, ()->{
            service.addSV(sv1);
        });
    }
    @Test
    public void testAdd5(){
        SinhVien sv1 = new SinhVien("PH0006","Nguyen Van F",19,null,1,"Phat trien phan mem");
        Assertions.assertThrows(NullPointerException.class, ()->{
            service.addSV(sv1);
        });
    }
    @Test
    public void testAdd6(){
        SinhVien sv1 = new SinhVien("PH0006","Nguyen Van F",19,9.0F,null,"Phat trien phan mem");
        Assertions.assertThrows(NullPointerException.class, ()->{
            service.addSV(sv1);
        });
    }
    @Test
    public void testAdd7(){
        SinhVien sv1 = new SinhVien("PH0006","Nguyen Van F",19,9.0F,1,"");
        Assertions.assertThrows(NullPointerException.class, ()->{
            service.addSV(sv1);
        });
    }
    @Test
    public void testAdd8(){
        int exp = 7;
        SinhVien sv1 = new SinhVien("PH0007","Nguyen Van F",19,9.0F,1,"Phat trien phan mem");
        int act = service.addSV(sv1);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testAdd9(){
        int exp = 8;
        SinhVien sv1 = new SinhVien("PH0008","Nguyen Van G",19,9.0F,1,"Phat trien phan mem");
        int act = service.addSV(sv1);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testAdd10(){
        int exp = 9;
        SinhVien sv1 = new SinhVien("PH0009","Nguyen Van P",20,9.0F,1,"Phat trien phan mem");
        int act = service.addSV(sv1);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testDelete1() {
        int sizeBefore = service.getList().size();
        service.deleteSV("PH0001");
        int sizeAfter = service.getList().size();
        assertEquals(sizeBefore - 1 , sizeAfter);
    }
    @Test
    public void testDelete2() {
        int sizeBefore = service.getList().size();
        service.deleteSV("PH0000");
        int sizeAfter = service.getList().size();
        assertEquals(sizeBefore - 1 , sizeAfter);
    }
    @Test
    public void testDelete3() {
        int sizeBefore = service.getList().size();
        service.deleteSV("PH0002");
        int sizeAfter = service.getList().size();
        assertEquals(sizeBefore - 1 , sizeAfter);
    }
    @Test
    public void testDelete4() {
        int sizeBefore = service.getList().size();
        service.deleteSV("PH001");
        int sizeAfter = service.getList().size();
        assertEquals(sizeBefore - 1 , sizeAfter);
    }
    @Test
    public void testDelete5() {
        int sizeBefore = service.getList().size();
        service.deleteSV("PH0005");
        int sizeAfter = service.getList().size();
        assertEquals(sizeBefore - 1 , sizeAfter);
    }
}
