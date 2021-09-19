

public class Atacado extends TipoVenda{


    public Atacado(float preco) {
        super(preco);
    }

    @Override
    public float calcularTotal() {
        return this.valor - (this.valor * 2/100) + this.tipoEntrega.precoEntrega();
    }
}
