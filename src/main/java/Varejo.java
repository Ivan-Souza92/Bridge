

public class Varejo extends TipoVenda{

    public Varejo(float valor) {

        super(valor);
    }

    @Override
    public float calcularTotal() {
        return this.valor + this.tipoEntrega.precoEntrega();
    }
}
