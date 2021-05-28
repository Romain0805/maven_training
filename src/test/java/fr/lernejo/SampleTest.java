package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SampleTest {

    @Test
    public void testOnePlusOne(){

        assertThrows(RuntimeException.class, () -> {
           throw new RuntimeException("toto");
        });
        assertEquals(new Sample().fact(3), 6);
        assertEquals(new Sample().op(Sample.Operation.ADD, 1, 1), 2);
        assertEquals(new Sample().op(Sample.Operation.MULT, 1, 1), 1);
    }


    @Test
    public void testos(){
        assertThrows(IllegalArgumentException.class, () -> new Sample().fact(-1));
    }
}
