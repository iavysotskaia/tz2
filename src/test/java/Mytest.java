import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Mytest {
    @Test
    public void t_sum_1(){
        ArrayList<Long> a = new ArrayList<Long>();
        a.add(1l);
        a.add(1l);
        a.add(1l);

        long v = Main._sum(a);

        Assertions.assertEquals(3l, v);
    }
    @Test
    public void t_sum_2(){
        ArrayList<Long> a = new ArrayList<Long>();
        a.add(11l);
        a.add(22l);
        a.add(33l);
        a.add(1l);

        long v = Main._sum(a);

        Assertions.assertEquals(67l, v);
    }
    @Test
    public void t_sum_3(){
        ArrayList<Long> a = new ArrayList<Long>();
        a.add(2l);
        a.add(7l);
        a.add(5l);
        a.add(9l);
        a.add(11l);

        long v = Main._sum(a);

        Assertions.assertEquals(34l, v);
    }
    @Test
    public void t_mult_1(){
        ArrayList<Long> a = new ArrayList<Long>();
        a.add(1l);
        a.add(2l);
        a.add(3l);

        long v = Main._mult(a);

        Assertions.assertEquals(6l, v);
    }
    @Test
    public void t_mult_2(){
        ArrayList<Long> a = new ArrayList<Long>();
        a.add(2l);
        a.add(4l);
        a.add(8l);

        long v = Main._mult(a);

        Assertions.assertEquals(64l, v);
    }
    @Test
    public void t_mult_3(){
        ArrayList<Long> a = new ArrayList<Long>();
        a.add(1l);
        a.add(2l);
        a.add(1l);
        a.add(1l);
        a.add(5l);

        long v = Main._mult(a);

        System.out.println(Main._mult(a));

        Assertions.assertEquals(10l, v);
    }
    @Test
    public void t_min_1(){
        ArrayList<Long> a = new ArrayList<Long>();
        a.add(7l);
        a.add(7l);
        a.add(7l);
        a.add(7l);
        a.add(7l);

        long v = Main._min(a);

        Assertions.assertEquals(7l, v);
    }
    @Test
    public void t_min_2(){
        ArrayList<Long> a = new ArrayList<Long>();
        a.add(8l);
        a.add(6l);
        a.add(4l);
        a.add(28l);
        a.add(1l);

        long v = Main._min(a);

        Assertions.assertEquals(1l, v);
    }
    @Test
    public void t_min_3(){
        ArrayList<Long> a = new ArrayList<Long>();
        a.add(723l);
        a.add(850l);
        a.add(465l);
        a.add(375l);
        a.add(586l);

        long v = Main._min(a);

        Assertions.assertEquals(375l, v);
    }
    @Test
    public void t_max_1(){
        ArrayList<Long> a = new ArrayList<Long>();
        a.add(3l);
        a.add(5l);
        a.add(8l);
        a.add(13l);
        a.add(21l);

        long v = Main._max(a);

        Assertions.assertEquals(21l, v);
    }
    @Test
    public void t_max_2(){
        ArrayList<Long> a = new ArrayList<Long>();
        a.add(386l);
        a.add(55l);
        a.add(869l);
        a.add(134l);
        a.add(213l);

        long v = Main._max(a);

        Assertions.assertEquals(869l, v);
    }
    @Test
    public void t_max_3(){
        ArrayList<Long> a = new ArrayList<Long>();
        a.add(0l);
        a.add(0l);
        a.add(51l);
        a.add(68l);
        a.add(3l);

        long v = Main._max(a);

        Assertions.assertEquals(68l, v);
    }
    //реализация теста на выход за пределы типа Long ("реализуйте любой другой тест на ваше усмотрение")
    @Test
    public void t_mult_4(){
        ArrayList<Long> a = new ArrayList<Long>();
        a.add(1l);
        a.add(2l);
        a.add(1l);
        a.add(1l);
        a.add(5000000000000000000l);

        long v = Main._mult(a);

        System.out.println(Main._mult(a));

        Assertions.assertEquals(-8446744073709551616l, v);
    }

}
