package com.packt.legacy.powermockito;

import org.junit.*;
import org.junit.runner.*;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;
import static org.powermock.api.mockito.PowerMockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MedicalBill.class)
public class StaticMethodTest {
    @Test
    public void stubs_static_methods() {
        System.out.println(MedicalBill.generateId());

        mockStatic(MedicalBill.class);
        when(MedicalBill.generateId()).thenReturn(1);
        assertEquals(1, MedicalBill.generateId());
    }
}
