import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtacadoTest {

    @Test
    void EntregaExpressaCompraAtacado(){

        ITipoEntrega tipoEntrega = new Expressa();
        Atacado atacado = new Atacado(400);
        atacado.setTipoEntrega(tipoEntrega);
        assertEquals(412, atacado.calcularTotal());
    }


    @Test
    void EntregaNormalCompraAtacado(){
        ITipoEntrega tipoEntrega = new Normal();
        Atacado atacado = new Atacado(300);
        atacado.setTipoEntrega(tipoEntrega);
        assertEquals(299, atacado.calcularTotal());
    }

}