package entities2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataFabricacao;
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String name, Double price, Date dataFabricacao) {
		super(name, price);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	
	@Override
	public String precoTag () {
		return getName() + " (usado) $ " + String.format("%.2f", getPrice()) + " (Data Fabricacao: " +  sdf.format(dataFabricacao) + ")";
	}
}
