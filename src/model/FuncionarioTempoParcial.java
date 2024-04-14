/**
 * 
 */
package model;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class FuncionarioTempoParcial extends Funcionario {
	private int horaEntrada;
	private int horaSaida;

	public FuncionarioTempoParcial(int id, String nome, double salario, int horaEntrada, int horaSaida) {
		super(id, nome, salario);
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Hora de Entrada: " + horaEntrada + "h");
		System.out.println("Hora de Saída: " + horaSaida + "h");
	}
}