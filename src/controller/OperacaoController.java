/**
 * 
 */
package controller;

import java.time.LocalDate;

import model.Funcionario;
import model.FuncionarioTempoIntegral;
import model.FuncionarioTempoParcial;
import model.FuncionarioTemporario;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class OperacaoController {
	public static Funcionario contratarFuncionarioTempoIntegral(int id, String nome, double salario, int bancoHoras) {
		return new FuncionarioTempoIntegral(id, nome, salario, bancoHoras);
	}

	public static Funcionario contratarFuncionarioTempoParcial(int id, String nome, double salario, int horaEntrada,
			int horaSaida) {
		return new FuncionarioTempoParcial(id, nome, salario, horaEntrada, horaSaida);
	}

	public static Funcionario contratarFuncionarioTemporario(int id, String nome, double salario,
			LocalDate dataFimContrato) {
		return new FuncionarioTemporario(id, nome, salario, dataFimContrato);
	}
}