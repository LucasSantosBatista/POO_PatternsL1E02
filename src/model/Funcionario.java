/**
 * 
 */
package model;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class Funcionario {
	private int id;
	private String nome;
	private double salario;

	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public void imprimir() {
		System.out.println("ID: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("Salário: R$" + salario);
	}
}
