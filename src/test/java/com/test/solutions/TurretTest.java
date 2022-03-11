package com.test.solutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurretTest {

    @Test
    void test1(){
        Turret t = new Turret();
        t.aa();
        t.main();
        assertEquals(t.sum(5,6), 10);
    }
}