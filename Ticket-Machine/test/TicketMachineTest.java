/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ViniSilva
 */
public class TicketMachineTest {
    
    public TicketMachineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of inserir method, of class TicketMachine.
     */
    @Test
    public void testInserir() throws NotainvalidaException {
        System.out.println("inserir");
        TicketMachine instance = new TicketMachine(10);
        instance.inserir(20);
        instance.inserir(50);
        assertEquals(70, instance.getSaldo());
    }

    /**
     * Test of troco method, of class TicketMachine.
     */
    @Test
    public void testTroco() throws TrocoInexistenteException, NotainvalidaException, SaldoInsuficienteException {
        System.out.println("troco");
        TicketMachine instance = new TicketMachine(2);
        instance.inserir(50);
        instance.imprimirPassagem();
        instance.troco();
        assertEquals(0, instance.getSaldo());
    }


    /**
     * Test of getSaldo method, of class TicketMachine.
     */
    @Test
    public void testGetSaldo() throws NotainvalidaException {
        TicketMachine instance = new TicketMachine(0);
        instance.inserir(50);
        int result = instance.getSaldo();
        assertEquals(50, result);

    }
    
    @Test
    public void imprimirPassagem() throws NotainvalidaException, SaldoInsuficienteException {
        TicketMachine instance = new TicketMachine(3);
        instance.inserir(50);
        instance.imprimirPassagem();
        int result = instance.getSaldo();
        assertEquals(41, result);

    }

}
