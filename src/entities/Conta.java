package entities;

public class Conta {

	private int numero;
	private String titular;
	private double saldo;
	

	public Conta() {
	}
	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	public void depositar(double valor) {
		this.saldo += valor;
	}
	public void saque(double valor) {
		this.saldo -= (valor + 5);
	}
	@Override
	public String toString() {
		return "Conta " + numero + ", Titular " + titular + ", Saldo " + String.format("%.2f", saldo);
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if(this.getNumero() != 0) {
			System.out.println("O número da conta não pode ser alterado");
		}else {			
			this.numero = numero;
		}
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
}