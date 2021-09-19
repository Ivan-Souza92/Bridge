

public abstract class TipoVenda {

    protected ITipoEntrega tipoEntrega;

    protected float valor;

    public TipoVenda(float valor) {
        this.valor = valor;
    }

    public void setTipoEntrega(ITipoEntrega tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public abstract float calcularTotal();
}

