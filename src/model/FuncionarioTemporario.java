/**
 * 
 */
package model;

import java.time.LocalDate;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class FuncionarioTemporario extends Funcionario {
	private LocalDate dataFimContrato;

	public FuncionarioTemporario(int id, String nome, double salario, LocalDate dataFimContrato) {
		super(id, nome, salario);
		this.dataFimContrato = dataFimContrato;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Data Fim do Contrato: " + dataFimContrato);
	}
}
