/**
 * 
 */
package model;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class FuncionarioTempoIntegral extends Funcionario {
	private int bancoHoras;

	public FuncionarioTempoIntegral(int id, String nome, double salario, int bancoHoras) {
		super(id, nome, salario);
		this.bancoHoras = bancoHoras;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Banco de Horas: " + bancoHoras + " horas");
	}
}
