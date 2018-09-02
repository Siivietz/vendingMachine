package pl.sdacademy.vending.model;

import org.junit.Test;
import pl.sdacademy.vending.util.Configuration;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class VendingMachineTest {
    private static final String PARAM_NAME_ROWS= "machine.size.rows";
    private static final String PARAM_NAME_COLS= "machine.size.cols";

    @Test
    public void shoudBeAbleToCreateMachineWithProperSize(){
        //given
        Configuration mockedConfig = mock(Configuration.class);
        when(mockedConfig.getProperty(eq(PARAM_NAME_COLS), anyLong()))
                .thenReturn(8L);
        when(mockedConfig.getProperty(eq(PARAM_NAME_ROWS), anyLong()))
                .thenReturn(14L);
        //when
        VendingMachine testedMachine = new VendingMachine(mockedConfig);

        //then

        assertEquals(8L, testedMachine.colsSize(),0);
        assertEquals(14L, testedMachine.rowsSize(),0);
    }

}