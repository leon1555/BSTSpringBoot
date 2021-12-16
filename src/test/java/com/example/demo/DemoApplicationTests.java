package com.example.demo;

import com.example.accessingdatarest.TreeInput;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TreeInputTest {
    @Test
    void testConstructor() {
        TreeInput actualTreeInput = new TreeInput();
        actualTreeInput.setId(123);
        actualTreeInput.setInput("[1, 2, 3]");
        assertEquals(123, actualTreeInput.getId());
        assertEquals("[1, 2, 3]", actualTreeInput.getInput());
    }
}
