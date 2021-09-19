import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VarejoTest {

    @Test
    void EntregaExpressaCompraVarejo(){

        ITipoEntrega tipoEntrega = new Expressa();
        Varejo varejo = new Varejo(140);
        varejo.setTipoEntrega(tipoEntrega);
        assertEquals(160 ,varejo.calcularTotal());
    }

    @Test
    void EntregaNormalCompraVarejo(){

        ITipoEntrega tipoEntrega = new Normal();
        Varejo varejo = new Varejo(342);
        varejo.setTipoEntrega(tipoEntrega);
        assertEquals(347 ,varejo.calcularTotal());
    }

}