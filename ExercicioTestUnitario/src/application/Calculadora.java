package application;

/*
	Descrição do Problema:
	Você está desenvolvendo um programa para calcular o preço de um produto em um sistema de vendas online.
	O preço do produto é influenciado por várias regras de negócio, como descontos, promoções e taxas adicionais. 
	Crie uma função chamada precoFinal que recebe o preço base do produto e algumas variáveis indicando as condições de venda.
	
	Regras de Negócio:
	Se o cliente for um cliente "prime", aplicar um desconto de 10% no preço base.
	Se a quantidade de produtos no carrinho for maior que 5, aplicar um desconto de 5%.
	Se um cupom de desconto válido for fornecido, aplicar o desconto correspondente. Os cupons válidos são "DESC15" (15% de desconto) e "PRIMEIRACOMPRA" (10% de desconto).
	
	obs: os descontos não são comulativos, ou seja, cada cliente só pode ter um dos 4 tipos de acima, e vai prevalecer o maior desconto.
*/

public class Calculadora {
	private String cupomDesconto;
	private boolean clientePrime;
	private int quantidade;
	private double precoBase, resultado;

	public double precoFinal(double precoBase, int quantidade, Boolean clientePrime, String cupomDesconto)
			throws Exception {
		this.setPrecoBase(precoBase);
		this.setQuantidade(quantidade);
		this.setClientePrime(clientePrime);
		this.setCupomDesconto(cupomDesconto);
		return resultado;
	}

	public void setPrecoBase(double precoBase) throws Exception {
		if(precoBase <=0 ) {
			throw new Exception("Valor invalido.");
		}
		this.precoBase = precoBase;
	}

	public void setQuantidade(int quantidade) throws Exception {
		if (quantidade > 5) {
			this.resultado = this.precoBase * 0.95;
		} else {
			resultado = precoBase;
		}
		if (quantidade <= 0) {
			throw new Exception("Quantidade invalida.");
		}
		this.quantidade = quantidade;
	}

	public boolean setClientePrime(Boolean clientePrime) throws Exception {
		if (clientePrime == true) {
			this.resultado = this.precoBase * 0.9;
		}
		return clientePrime;
	}

	public void setCupomDesconto(String cupomDesconto) throws Exception {
		if (cupomDesconto == "DESC15") {
			this.resultado = this.precoBase * 0.85;
		}
		if (cupomDesconto == "PRIMEIRACOMPRA") {
			this.resultado = this.precoBase * 0.9;
		}
		if (cupomDesconto == "") {
			resultado = precoBase;
		}
		if((cupomDesconto != "DESC15") || (cupomDesconto != "PRIMEIRACOMPRA") || (cupomDesconto != "")) {
			throw new Exception("Cupom invalido.");
		}
	}
}
