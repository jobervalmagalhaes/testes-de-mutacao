package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BaladaTest {
    
    @Test
    public void devePermitirEntradaDeAdulto() {
        Balada balada = new Balada();
        assertTrue(balada.podeEntrar(25));
    }

    @Test
    public void devePermitirEntradaComExatos18Anos() {
    Balada balada = new Balada();
    assertTrue(balada.podeEntrar(18));
    }

    @Test
    public void naoDevePermitirEntradaDeMenor() {
    Balada balada = new Balada();
    assertFalse(balada.podeEntrar(17));
    }

}

// mvn clean compile
// mvn test
// mvn org.pitest:pitest-maven:mutationCoverage