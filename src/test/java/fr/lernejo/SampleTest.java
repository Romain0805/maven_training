package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SampleTest {

    @Test
    public void testOnePlusOne(){
        assertEquals(2, 1+1);

        assertThrows(RuntimeException.class, () -> {
           throw new RuntimeException("toto");
        });
        assertEquals(new Sample().fact(3), 6);
    }


    @Test
    public void testos(){
        assertThrows(IllegalArgumentException.class, () -> new Sample().fact(-1));
    }
}
