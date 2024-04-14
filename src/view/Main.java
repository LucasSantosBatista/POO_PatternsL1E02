/**
 * 
 */
package view;

import java.time.LocalDate;

import controller.OperacaoController;
import model.Funcionario;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class Main {
	public static void main(String[] args) {
		OperacaoController opCtrl = new OperacaoController();

		// Contratando um funcionário de tempo integral
		Funcionario funcionarioTI = opCtrl.contratarFuncionarioTempoIntegral(1, "João", 5000, 50);
		System.out.println("Funcionário de Tempo Integral:");
		funcionarioTI.imprimir();
		System.out.println();

		// Contratando um funcionário de tempo parcial
		Funcionario funcionarioTP = opCtrl.contratarFuncionarioTempoParcial(2, "Maria", 3000, 8, 17);
		System.out.println("Funcionário de Tempo Parcial:");
		funcionarioTP.imprimir();
		System.out.println();

		// Contratando um funcionário temporário
		Funcionario funcionarioTemp = opCtrl.contratarFuncionarioTemporario(3, "Pedro", 2000,
				LocalDate.of(2024, 12, 31));
		System.out.println("Funcionário Temporário:");
		funcionarioTemp.imprimir();
	}
}