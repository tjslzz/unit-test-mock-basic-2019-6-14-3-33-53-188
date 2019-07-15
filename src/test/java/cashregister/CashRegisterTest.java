package cashregister;


import org.junit.jupiter.api.Test;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class CashRegisterTest {


    @Test
    public void should_print_the_real_purchase_when_call_process() {
        //given
        Printer printer = mock(Printer.class);
        CashRegister cashRegister = new CashRegister(printer);
        Purchase purchase = new Purchase(new Item[0]);
        //when
        cashRegister.process(purchase);
        //then
        verify(printer,times(1)).print("");
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {

    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given
        //when
        //then
    }

}
