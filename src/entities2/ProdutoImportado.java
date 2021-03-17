package entities2;

public class ProdutoImportado extends Produto {
	private double taxaAlfandega;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String name, Double price, double taxaAlfandega) {
		super(name, price);
		this.taxaAlfandega = taxaAlfandega;
	}

	public double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}

	public double valorTotal() {
		return getPrice() + taxaAlfandega;
	}

	@Override
	public String precoTag() {
		return getName() + " $ " + String.format("%.2f", valorTotal()) + " (Taxa Alfandega $ "
				+ String.format("%.2f", taxaAlfandega) + ")";
	}

}
