package workAv1;

import java.util.Scanner;

import javax.swing.JOptionPane;

import workAv1_negocios.Agencia;
import workAv1_negocios.Banco;
import workAv1_negocios.Empresa;
import workAv1_negocios.Faculdade;
import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;
import workAv1_negociosProdutos.Curso;
import workAv1_negociosProdutos.Disciplina;
import workAv1_recursosHumanos.Aluno;
import workAv1_recursosHumanos.Coordenador;
import workAv1_recursosHumanos.Diretor;
import workAv1_recursosHumanos.Gerente;
import workAv1_recursosHumanos.Presidente;
import workAv1_recursosHumanos.Professor;
import workAv1_recursosHumanos.SecAcademica;
import workAv1_recursosHumanos.SecFinanceira;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer op = 0, idPessoa = 0, idAgencia = 0, matri = 100, idDis = 0, idCurso = 0, idEmpresa = 0, idConta = 0;
		
		Presidente presidente = new Presidente();
		Gerente gerente = new Gerente();
		Diretor diretor = new Diretor();
		Coordenador coordenador = new Coordenador();
		Professor professor = new Professor();
		Aluno aluno = new Aluno();
		SecAcademica secAcademica = new SecAcademica();
		SecFinanceira secFinanceiro = new SecFinanceira();
		Agencia agencia = new Agencia();
		Banco banco = new Banco();
		Faculdade faculdade = new Faculdade();
		Disciplina disciplina = new Disciplina();
		Curso curso = new Curso();
		Empresa empresa = new Faculdade();
						
		Aluno aluno0 = new Aluno(++idPessoa, "João Marcos", "154.894.230-80", ++matri);
		Aluno aluno1 = new Aluno(++idPessoa, "Antonio Pereira Silva", "950.725.740-32", ++matri);
		Aluno aluno2 = new Aluno(++idPessoa, "Claudio Jose Martins", "717.237.410-00", ++matri);
		Aluno aluno3 = new Aluno(++idPessoa, "André Macedo Morais", "595.995.410-90", ++matri);
		Aluno aluno4 = new Aluno(++idPessoa, "Claudia Regina Costa", "318.252.280-94", ++matri);
		Aluno aluno5 = new Aluno(++idPessoa, "Isis Giovanna Cristiane da Rosa", "564.441.690-97", ++matri);
		Aluno aluno6 = new Aluno(++idPessoa, "Debora Ayla Kua Moraes", "084.946.250-98", ++matri);
		Aluno aluno7 = new Aluno(++idPessoa, "Luisa Teresinha Bernardes", "661.730.890-50", ++matri);
		Aluno aluno8 = new Aluno(++idPessoa, "Murilo Lucca Ian Assis", "885.393.330-58", ++matri);
		Aluno aluno9 = new Aluno(++idPessoa, "Jennifer Fátima de Paula", "954.961.020-90", ++matri);
		
		Professor professor0 = new Professor(++idPessoa, "Catarina Mariah Ana Silva", "528.046.620-47", "professor");
		Professor professor1 = new Professor(++idPessoa, "Sebastião Márcio Carlos da Mota", "347.269.760-10", "professor");
		Professor professor2 = new Professor(++idPessoa, "Thales Joaquim Freitas", "604.902.050-70", "professor");
		Professor professor3 = new Professor(++idPessoa, "Mateus Manoel da Rocha", "407.334.973-22", "professor");
		
		professor0.addFilaAlunos(aluno8);professor0.addFilaAlunos(aluno5);professor0.addFilaAlunos(aluno3);
		
		
		
		Coordenador coordenador0 = new Coordenador(++idPessoa, "Arthur Jorge Fogaça", "056.308.323-95", "coordenador");
		Coordenador coordenador1 = new Coordenador(++idPessoa, "Alessandra Luana Cecília Baptista", "135.766.013-84", "coordenador");
		
		coordenador0.addFilaAluno(aluno5);coordenador0.addFilaAluno(aluno2);coordenador0.addFilaAluno(aluno7);
		coordenador0.addFilaProfessor(professor3);coordenador0.addFilaProfessor(professor0);coordenador1.addFilaAluno(aluno5);
		coordenador1.addFilaAluno(aluno1);coordenador1.addFilaProfessor(professor0);coordenador1.addFilaProfessor(professor2);coordenador1.addFilaProfessor(professor3);
		
		
		SecAcademica secAcademica0 = new SecAcademica(++idPessoa, "Anderson Fábio Mário Santos", "596.002.023-89", "secretario academico");
		SecAcademica secAcademica1 = new SecAcademica(++idPessoa, "Elisa Olivia Juliana Melo", "775.919.453-60", "secretaria academica");
		
		SecFinanceira secFinanceira0 = new SecFinanceira(++idPessoa, "Bryan Bento Henrique Gonçalves", "847.708.383-52", "secretario academico");
		SecFinanceira secFinanceira1 = new SecFinanceira(++idPessoa, "Vitória Eduarda dos Santos", "424.361.063-04", "secretaria academica");
		
		Diretor diretor0 = new Diretor(++idPessoa, "Rafael Anthony Nicolas Peixoto", "177.985.974-09", "Diretor(a)");
		Diretor diretor1 = new Diretor(++idPessoa, "Sarah Isabelle da Costa", "256.443.233-66", "Diretor(a)");
		
		Presidente presidente0 = new Presidente(++idPessoa, "Renata Mariana Isadora da Cruz", "935.180.683-93|", "Presidente");
		Presidente presidente1 = new Presidente(++idPessoa, "Elisa Olivia dos Santos", "155.443.233-93|", "Presidente");
		empresa.addPresidente(presidente0);empresa.addPresidente(presidente1);
		
		Curso curso0 = new Curso(++idCurso, "Ciência da Computação", coordenador0.getId());
		Curso curso1 = new Curso(++idCurso, "Medicina", coordenador1.getId());
		
		Disciplina disciplina0 = new Disciplina(++idDis, curso0.getId(), "Programação", professor2.getId());
		Disciplina disciplina1 = new Disciplina(++idDis, curso0.getId(), "Banco de Dados", professor2.getId());
		Disciplina disciplina2 = new Disciplina(++idDis, curso0.getId(), "Segurança da Informação", professor0.getId());
		Disciplina disciplina3 = new Disciplina(++idDis, curso0.getId(), "Redes de Computadores", professor0.getId());
		Disciplina disciplina4 = new Disciplina(++idDis, curso1.getId(), "Anatomia", professor1.getId());
		Disciplina disciplina5 = new Disciplina(++idDis, curso1.getId(), "Biologia celular e molecular", professor1.getId());
		Disciplina disciplina6 = new Disciplina(++idDis, curso1.getId(), "Embriologia", professor3.getId());
		Disciplina disciplina7 = new Disciplina(++idDis, curso1.getId(), "Imunologia", professor3.getId());
		
		
		
		professor2.addDisciplina(disciplina0);professor2.addDisciplina(disciplina1);
		professor0.addDisciplina(disciplina2);professor0.addDisciplina(disciplina3);
		professor1.addDisciplina(disciplina4);professor1.addDisciplina(disciplina5);
		professor3.addDisciplina(disciplina6);professor3.addDisciplina(disciplina7);
		
		disciplina0.addListaAluno(aluno9);disciplina0.addListaAluno(aluno1);disciplina0.addListaAluno(aluno4);disciplina0.addListaAluno(aluno7);
		disciplina0.addListaAluno(aluno0);disciplina0.addListaAluno(aluno2);disciplina0.addListaAluno(aluno5);disciplina0.addListaAluno(aluno9);
		disciplina1.addListaAluno(aluno6);disciplina1.addListaAluno(aluno8);disciplina1.addListaAluno(aluno2);disciplina1.addListaAluno(aluno1);
		disciplina2.addListaAluno(aluno9);disciplina2.addListaAluno(aluno1);disciplina2.addListaAluno(aluno4);disciplina2.addListaAluno(aluno7);
		disciplina3.addListaAluno(aluno2);disciplina3.addListaAluno(aluno8);	
		disciplina4.addListaAluno(aluno0);disciplina4.addListaAluno(aluno3);disciplina4.addListaAluno(aluno5);disciplina5.addListaAluno(aluno0);
		disciplina5.addListaAluno(aluno3);disciplina5.addListaAluno(aluno5);
		disciplina6.addListaAluno(aluno0);disciplina6.addListaAluno(aluno3);disciplina6.addListaAluno(aluno5);
		disciplina7.addListaAluno(aluno0);disciplina7.addListaAluno(aluno3);disciplina7.addListaAluno(aluno5);		
		
		Banco banco0 = new Banco(++idEmpresa, "Santander", "85.875.897/0001-50");
		
		Gerente gerente0 = new Gerente(++idPessoa, "Patrícia Larissa Rosângela Barros", "155.284.013-13", "gerente", agencia.getId());
		Agencia agencia0 = new Agencia(banco0.getId(),banco0.getName(), banco0.getCnpj(), ++idAgencia, "Centro", gerente0.getId());
		
		Gerente gerente1 = new Gerente(++idPessoa, "Danilo Alexandre Marcos Viana", "785.738.333-35", "gerente", agencia.getId());
		Agencia agencia1 = new Agencia(banco0.getId(), banco0.getName(), banco0.getCnpj(), ++idAgencia, "Dirceu", gerente1.getId());
		
		empresa.addListaBanco(banco0);
		banco0.addListaGerente(gerente1);banco0.addListaGerente(gerente0);
		banco0.addListaAgencia(agencia1);banco0.addListaAgencia(agencia0);
		
		Faculdade faculdade0 = new Faculdade(++idEmpresa, "Estácio", "66.859.821/0001-96", diretor0.getId());
		Faculdade faculdade1 = new Faculdade(++idEmpresa, "Mauricio de Nassau", "06.681.430/0001-00", diretor1.getId());
		faculdade0.addListaDiretor(diretor0);faculdade0.addListaDiretor(diretor1);
		faculdade1.addListaDiretor(diretor1);faculdade1.addListaDiretor(diretor0);
		empresa.addListaFaculdade(faculdade0);empresa.addListaFaculdade(faculdade1);
		
		faculdade0.addListaDisciplina(disciplina7);faculdade0.addListaDisciplina(disciplina6);faculdade0.addListaDisciplina(disciplina5);faculdade0.addListaDisciplina(disciplina4);
		faculdade0.addListaDisciplina(disciplina3);	faculdade0.addListaDisciplina(disciplina2);	faculdade0.addListaDisciplina(disciplina1);faculdade0.addListaDisciplina(disciplina0);
		
		
		faculdade0.addListaCoordenador(coordenador0);faculdade0.addListaCoordenador(coordenador1);
		faculdade0.addListaCurso(curso0);faculdade0.addListaCurso(curso1);
		faculdade0.addListaSecAcademica(secAcademica0);faculdade0.addListaSecAcademica(secAcademica1);
		faculdade0.addSecFinanceira(secFinanceira0);faculdade0.addSecFinanceira(secFinanceira1);
		faculdade0.addProfessor(professor0);faculdade0.addProfessor(professor1);faculdade0.addProfessor(professor2);faculdade0.addProfessor(professor3);
		
		curso0.addDisciplina(disciplina0);curso0.addDisciplina(disciplina1);curso0.addDisciplina(disciplina2);curso0.addDisciplina(disciplina3);
		
		curso1.addDisciplina(disciplina4);curso1.addDisciplina(disciplina5);curso1.addDisciplina(disciplina6);curso1.addDisciplina(disciplina7);
		
		secFinanceira0.addFilaPessoa(professor2);secFinanceira0.addFilaPessoa(aluno1);	secFinanceira0.addFilaPessoa(gerente0);
		
		ContaCorrente contaCorrente0 = new ContaCorrente(++idConta, faculdade.getId(), gerente0.getId(), null);
		ContaCorrente contaCorrente1 = new ContaCorrente(++idConta, professor0.getId(), gerente1.getId(), null);
		ContaCorrente contaCorrente2 = new ContaCorrente(++idConta, professor1.getId(), gerente0.getId(), null);
		ContaCorrente contaCorrente3 = new ContaCorrente(++idConta, professor2.getId(), gerente1.getId(), null);
		ContaCorrente contaCorrente4 = new ContaCorrente(++idConta, professor3.getId(), gerente0.getId(), null);
		ContaCorrente contaCorrente5 = new ContaCorrente(++idConta, coordenador0.getId(), gerente1.getId(), null);
		ContaCorrente contaCorrente6 = new ContaCorrente(++idConta, coordenador1.getId(), gerente0.getId(), null);
		ContaCorrente contaCorrente7 = new ContaCorrente(++idConta, secAcademica0.getId(), gerente1.getId(), null);
		ContaCorrente contaCorrente8 = new ContaCorrente(++idConta, secAcademica1.getId(), gerente0.getId(), null);
		ContaCorrente contaCorrente9 = new ContaCorrente(++idConta, secFinanceira0.getId(), gerente1.getId(), null);
		ContaCorrente contaCorrente10 = new ContaCorrente(++idConta, secFinanceira1.getId(), gerente0.getId(), null);
		ContaCorrente contaCorrente11 = new ContaCorrente(++idConta, gerente0.getId(), gerente0.getId(), null);
		ContaCorrente contaCorrente12 = new ContaCorrente(++idConta, gerente1.getId(), gerente1.getId(), null);
		ContaCorrente contaCorrente13 = new ContaCorrente(++idConta, presidente0.getId(), gerente0.getId(), null);
		ContaCorrente contaCorrente14 = new ContaCorrente(++idConta, agencia.getId(), gerente1.getId(), null);
		ContaCorrente contaCorrente15 = new ContaCorrente(++idConta, aluno0.getId(), gerente1.getId(), null);
		ContaCorrente contaCorrente16 = new ContaCorrente(++idConta, aluno1.getId(), gerente0.getId(), null);
		ContaCorrente contaCorrente17 = new ContaCorrente(++idConta, aluno2.getId(), gerente1.getId(), null);
		ContaCorrente contaCorrente18 = new ContaCorrente(++idConta, aluno4.getId(), gerente0.getId(), null);
		ContaCorrente contaCorrente19 = new ContaCorrente(++idConta, aluno6.getId(), gerente1.getId(), null);
		ContaCorrente contaCorrente20 = new ContaCorrente(++idConta, aluno8.getId(), gerente0.getId(), null);
		ContaCorrente contaCorrente21 = new ContaCorrente(++idConta, aluno9.getId(), gerente1.getId(), null);
		
		
		ContaPoupanca contaPoupanca0 = new ContaPoupanca(++idConta, faculdade.getId(), gerente0.getId());
		ContaPoupanca contaPoupanca1 = new ContaPoupanca(++idConta, professor1.getId(), gerente0.getId());
		ContaPoupanca contaPoupanca2 = new ContaPoupanca(++idConta, professor2.getId(), gerente1.getId());
		ContaPoupanca contaPoupanca3 = new ContaPoupanca(++idConta, coordenador0.getId(), gerente1.getId());
		ContaPoupanca contaPoupanca4 = new ContaPoupanca(++idConta, secAcademica0.getId(), gerente1.getId());
		ContaPoupanca contaPoupanca5 = new ContaPoupanca(++idConta, secAcademica1.getId(), gerente0.getId());
		ContaPoupanca contaPoupanca6 = new ContaPoupanca(++idConta, secFinanceira0.getId(), gerente1.getId());
		ContaPoupanca contaPoupanca7 = new ContaPoupanca(++idConta, secFinanceira1.getId(), gerente0.getId());
		ContaPoupanca contaPoupanca8 = new ContaPoupanca(++idConta, gerente0.getId(), gerente0.getId());
		ContaPoupanca contaPoupanca9 = new ContaPoupanca(++idConta, gerente1.getId(), gerente1.getId());
		ContaPoupanca contaPoupanca10 = new ContaPoupanca(++idConta, presidente0.getId(), gerente0.getId());
		ContaPoupanca contaPoupanca11 = new ContaPoupanca(++idConta, agencia.getId(), gerente1.getId());
		ContaPoupanca contaPoupanca12 = new ContaPoupanca(++idConta, aluno2.getId(), gerente1.getId());
		ContaPoupanca contaPoupanca13 = new ContaPoupanca(++idConta, aluno3.getId(), gerente0.getId());
		ContaPoupanca contaPoupanca14 = new ContaPoupanca(++idConta, aluno5.getId(), gerente1.getId());
		ContaPoupanca contaPoupanca15 = new ContaPoupanca(++idConta, aluno6.getId(), gerente0.getId());
		ContaPoupanca contaPoupanca16 = new ContaPoupanca(++idConta, aluno8.getId(), gerente0.getId());
		ContaPoupanca contaPoupanca17 = new ContaPoupanca(++idConta, aluno9.getId(), gerente1.getId());
		
		
		
		faculdade0.addContaCorrente(contaCorrente0);
		professor0.addContaCorrente(contaCorrente1);professor1.addContaCorrente(contaCorrente2);
		professor2.addContaCorrente(contaCorrente3);
		professor3.addContaCorrente(contaCorrente4);
		coordenador0.addContaCorrente(contaCorrente5);
		coordenador1.addContaCorrente(contaCorrente6);
		secAcademica0.addContaCorrente(contaCorrente7);
		secAcademica1.addContaCorrente(contaCorrente8);secFinanceira1.addContaCorrente(contaCorrente10);
		secFinanceira0.addContaCorrente(contaCorrente9);
		gerente0.addContaCorrente(contaCorrente11);
		gerente1.addContaCorrente(contaCorrente12);
		presidente0.addContaCorrente(contaCorrente13);
		agencia.addContaCorrente(contaCorrente14);
		aluno0.addContaCorrente(contaCorrente15);
		aluno1.addContaCorrente(contaCorrente16);
		aluno2.addContaCorrente(contaCorrente17);
		aluno4.addContaCorrente(contaCorrente18);
		aluno6.addContaCorrente(contaCorrente19);
		aluno8.addContaCorrente(contaCorrente20);
		aluno9.addContaCorrente(contaCorrente21);
		
		faculdade.addContaPoupanca(contaPoupanca0);
		professor1.addContaPoupanca(contaPoupanca1);
		professor2.addContaPoupanca(contaPoupanca2);
		coordenador1.addContaPoupanca(contaPoupanca3);
		secAcademica0.addContaPoupanca(contaPoupanca4);
		secAcademica1.addContaPoupanca(contaPoupanca5);secFinanceira1.addContaPoupanca(contaPoupanca7);
		secFinanceira0.addContaPoupanca(contaPoupanca6);
		gerente0.addContaPoupanca(contaPoupanca8);
		gerente1.addContaPoupanca(contaPoupanca9);
		presidente0.addContaPoupanca(contaPoupanca10);
		agencia.addContaPoupanca(contaPoupanca11);
		aluno2.addContaPoupanca(contaPoupanca12);
		aluno3.addContaPoupanca(contaPoupanca13);
		aluno5.addContaPoupanca(contaPoupanca14);
		aluno6.addContaPoupanca(contaPoupanca15);
		aluno8.addContaPoupanca(contaPoupanca16);
		aluno9.addContaPoupanca(contaPoupanca17);
				
		do {
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
					+ "\n01 Para consultar/criar dados da faculdade: "
					+ "\n02 Para consultar/criar dados do banco"
					+ "\n00 Para sair do app: "));
			
			
			switch (op) {
			//FACULDADE
			case 1: {
				do {
					op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
							+ "\n01 Para cadastrar e consultar dados de uma faculdade: "
							+ "\n02 Para cadastrar e consultar dados de uma disciplina: "
							+ "\n03 Para cadastrar e consultar dados de um curso: "
							+ "\n04 Para cadastrar e consultar dados de um aluno: "
							+ "\n05 Para cadastrar e consultar dados de um professor: "
							+ "\n06 Para cadastrar e consultar dados de um coordenador: "
							+ "\n07 Para cadastrar e consultar dados de um secretário(a) academico(a): "
							+ "\n08 Para cadastrar e consultar dados de um secretário financeiro(a): "
							+ "\n09 Para cadastrar e consultar dados de um diretor(a): "
							+ "\n00 Para retornar ao menu anterior: "));
					
					switch (op) {
					case 1: {
						do {
							op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
									+ "\n01 Para cadastrar uma faculdade: "
									+ "\n02 Para consultar, alterar ou excluir dados de uma faculdade: "
									+ "\n00 Para retornar ao menu anterior: "));
							switch (op) {
							//Cadastrar faculdade
							case 1: {
																
								System.out.println("\nInforme o nome da faculdade: ");
								String name = sc.nextLine();
								
								System.out.println("\nInforme o cnpj: ");
								String cnpj = sc.nextLine();
								
								Faculdade newFaculdade = new Faculdade(++idEmpresa, name, cnpj, diretor.getId());
								empresa.addListaFaculdade(newFaculdade);
								
								break;
							}
							//Consultar dados de uma faculdade
							case 2: {
																
								empresa.listarFaculdades();
								System.out.println("\nInforme o id da faculdade para consultar seus dados: ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
																
								faculdade.listarDadosFaculdade(findFaculdade);
								faculdade.listarCursos(findFaculdade);
								
								op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
										+ "\n01 Para listar as contas bancárias da faculdade: "											
										+ "\n00 Para ir ao próximo menu : "));
								
								//Listar as contas bancárias de uma faculdade
								if(op == 1) {
																		
									faculdade.listarContasBancarias(findFaculdade);
									
								}
								
								op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
										+ "\n01 Para cadastrar uma conta bancária: "
										+ "\n00 Para ir ao próximo menu : "));
								
								//Criar conta bancária da faculdade
								if(op == 1) {									
																		
									empresa.listarBancos();
									System.out.println("\nInforme o id do banco: ");
									op = sc.nextInt();
									Banco findBanco = empresa.findBanco(op);
									
									banco.listarAgencias(findBanco);
									System.out.println("Informe o id da agência: ");
									op = sc.nextInt();
									Agencia findAgencia = banco.findAgencia(op, findBanco);
									
									op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
											+ "\n01 Para cadastrar uma conta corrente: "
											+ "\n02 Para cadastrar uma conta poupança: "
											+ "\n00 Para ir ao próximo menu : "));
									if(op == 1) {
										ContaCorrente newContaCorrente = new ContaCorrente(++idConta, findFaculdade.getId(), findAgencia.getIdGerente(), null);
										findFaculdade.addContaCorrente(newContaCorrente	);
									}
									else if(op == 2){
										ContaPoupanca newContaPoupanca = new ContaPoupanca(++idConta, findFaculdade.getId(), findAgencia.getIdGerente());
										findFaculdade.addContaPoupanca(newContaPoupanca);
									}
									
									faculdade.listarContasBancarias(findFaculdade);
									
								}
																								
								op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
										+ "\n01 Para listar os professores da faculdade: "											
										+ "\n00 Para ir ao próximo menu : "));
								
								//Listar os professores da faculdade
								if(op == 1) {
																											
									faculdade.listarProfessores(findFaculdade);									
									
								}
								
								op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
										+ "\n01 Para excluir os dados da faculdade : "											
										+ "\n00 Para ir ao próximo menu : "));
								
								// Excluir os dados de uma faculdade
								if(op == 1) {
																	
									op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
											+ "\n01 Para confirmar a exclusão dos dados da faculdade!!!!: "											
											+ "\n00 Para retornar ao menu principal do item faculdade: "));
									
									if(op == 1) {
										empresa.removeListaFaculdade(findFaculdade);	
									}
									
								}
								//Flag de controle de fluxo da aplicação
								op = 1;
								break;
							}

							default:
								if(op != 0) {
									System.out.println("\nOpção inválida!!!!");
								}
							}
						}while(op != 0);
						//Flag de controle de fluxo da aplicação
						op = 1;
						break;
					}
					//DISCIPLINA
					case 2: {	
												
						do {
							op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
									+ "\n01 Para cadastrar uma disciplina: "
									+ "\n02 Para consultar, alterar ou excluir de uma disciplina: "
									+ "\n00 Para retornar ao menu anterior: "));
							
							switch (op) {
							//Cadastrar uma disciplina
							case 1: {
								
								++idDis;
								
								empresa.listarFaculdades();
								System.out.println("\nInforme o id da faculdade: ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								faculdade.listarProfessores(findFaculdade);
								System.out.println("\nInforme o id do professor para ministrar a disciplina: ");
								op = sc.nextInt();
								Professor findProfessor = faculdade.findProfessor(op, findFaculdade);
								
								faculdade.listarCursos(findFaculdade);
								System.out.println("\nInforme o id do curso para inclusão da disciplina: ");
								op = sc.nextInt();
								Curso findCurso = faculdade.findCurso(op, findFaculdade);
								
								System.out.println("\nInforme o nome da disciplina: ");
								sc.nextLine();
								String name = sc.nextLine();
								
								System.out.println("\nDisciplinas disponíveis no curso antes da inclusão: ");
								curso.listarDisciplinas(findCurso);
								
								Disciplina newDisciplina = new Disciplina(idDis, findCurso.getId(), name, findProfessor.getId());
								findCurso.addDisciplina(newDisciplina);
								findFaculdade.addListaDisciplina(newDisciplina);
								
								System.out.println("\nDisciplinas disponíveis no curso depois da inclusão: ");
								curso.listarDisciplinas(findCurso);
								
								break;
							}
							//Consultar, alterar ou excluir os dados das diciplinas de uma faculdade
							case 2: {
																								
								empresa.listarFaculdades();
								System.out.println("\nInforme o id da faculdade para listar as disciplnas ofertadas: ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								faculdade.listarDisciplinas(findFaculdade);
								
								op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
										+ "\n01 Para listar as disciplinas de cada curso: "
										+ "\n00 Para retornar ao menu anterior : "));
								
								if(op == 1) {
									
									faculdade.listarCursos(findFaculdade);
									System.out.println("\nInforme o id do curso para listar as disciplinas: ");
									op = sc.nextInt();
									Curso findCurso = faculdade.findCurso(op, findFaculdade);
									
									curso.listarDisciplinas(findCurso);
									

									op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
											+ "\n01 Para listar os dados de uma disciplina deste curso: "
											+ "\n00 Para retornar ao menu anterior : "));
									
									//Consultar os dados de uma disciplina específica
									if(op == 1) {
																				
										System.out.println("\nInforme o id da disciplina para listar os alunos: ");
										op = sc.nextInt();
										Disciplina findDisciplina = curso.findDisciplina(op, findCurso);
										Professor findProfessor = faculdade.findProfessor(findDisciplina.getIdProfessor(), findFaculdade);
										
										disciplina.listarDadosDiscilina(findDisciplina, findCurso, findProfessor, findFaculdade);
										disciplina.listarAlunos(findDisciplina);	
										
										op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
												+ "\n01 Para excluir esta disciplina disciplina: "
												+ "\n02 Para execuir aluno desta disciplina"
												+ "\n00 Para retornar ao menu anterior: "));
										
										while(op != 0) {
											switch (op) {
											//Excluir uma disciplina
											case 1: {
												
												System.out.println("\nInforme 01 para confirmar a exclusão: ");
												op = sc.nextInt();
												if(op == 1) {
													curso.removeDisciplina(findDisciplina);
												}
												
												op = 0;
												break;
											}
											//Excluir um aluno desta disciplina
											case 2: {
												
												System.out.println("\nInforme o id do aluno a ser excluído: ");
												op = sc.nextInt();
												Aluno findAluno = disciplina.findAluno(op, findDisciplina);
												
												System.out.println("\nInforme 01 para confirmar a exclusão: ");
												op = sc.nextInt();
												if(op == 1) {
													disciplina.removeListaAluno(findAluno);	
												}
												
												op = 0;
												break;
											}
											default:
												if(op != 0) {
													System.out.println("\nOpção inválida!!!!");
												}
											}
										}								
									
									}
									
								}
															
								op = 1;
								break;
							}
							default:
								if(op != 0) {
									System.out.println("\nOpção inválida!!!!");
								}
							}
							
						}while(op != 0);
						op = 1;
						break;
					}
					//CURSO
					case 3: {
					
						do {
							op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
									+ "\n01 Para cadastrar um curso: "
									+ "\n02 Para consultar, alterar ou excluir os dados de um curso: "
									+ "\n00 Para retornar ao menu anterior: "));
							switch (op) {
							case 1: {
								//Cadastrar um curso
								++idCurso;
								
								empresa.listarFaculdades();
								System.out.println("\nInforme o id da faculdade: ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								faculdade.listarCoordenadores(findFaculdade);
								System.out.println("\nInforme o id do coordenador do curso: ");
								op = sc.nextInt();
								Coordenador findCoordenador = faculdade.findCoordenador(op, findFaculdade);							
								
								System.out.println("\nCursos ofertados antes da inclusão: ");
								faculdade.listarCursos(findFaculdade);
								
								System.out.println("\nInforme o nome do curso: ");
								sc.nextLine();
								String name = sc.nextLine();
								
								Curso newCurso = new Curso(idCurso, name, findCoordenador.getId());
								findFaculdade.addListaCurso(newCurso);
								
								System.out.println("\nCursos ofertados antes da inclusão: ");
								faculdade.listarCursos(findFaculdade);
								
								break;
							}
							case 2: {
								//Consultar, alterar ou excluir os dados de um curso
								
								empresa.listarFaculdades();
								System.out.println("\nInforme o id da faculdade para listar os cursos: ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								faculdade.listarCursos(findFaculdade);
								
								op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
										+ "\n01 Para excluir um curso: "
										+ "\n00 Para retornar ao menu anterior: "));
								
								if(op == 1) {
									
									System.out.println("\nInforme id do curso: ");
									op = sc.nextInt();
									Curso findCurso = faculdade.findCurso(op, findFaculdade);
									
									System.out.println("\nInforme 01 para confirmar a exclusão: ");
									op = sc.nextInt();
									if(op == 1) {
										findFaculdade.removeListaCurso(findCurso);
									}									
									faculdade.listarCursos(findFaculdade);
								}
								
								break;
							}
							default:
								if(op != 0) {
									System.out.println("\nOpção inválida!!!!");
								}
							}
							
						}while(op != 0);
						
						break;
					}
					//ALUNO
					case 4: {
						
						do {
							op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
									+ "\n01 Para cadastrar um aluno: "
									+ "\n02 Para consultar,alterar ou excluir dados de um aluno: "
									+ "\n00 Para retornar ao menu anterior: "));
							
							switch (op) {
							
							case 1: {
								//Cadastrar aluno
								++idPessoa;
								Integer matricula = aluno.geraMatricula();
								
								empresa.listarFaculdades();
								System.out.println("\nInforme o id da faculdade: ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								faculdade.listarCursos(findFaculdade);
								System.out.println("\nInforme o id do curso:");
								op = sc.nextInt();
								Curso findCurso = faculdade.findCurso(op, findFaculdade);
								
								System.out.println("\nInforme o nome do aluno: ");
								String name = sc.nextLine();
								System.out.println("\nInforme o CPF: ");
								String cpf = sc.nextLine();
								
								Aluno newAluno = new Aluno(idPessoa, name, cpf, matricula);
								
								do {
									op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
											+ "\n01 Para incluir disciplina: "
											+ "\n00 Para retornar ao menu anterior: "));
									
									curso.listarDisciplinas(findCurso);									
																	
									System.out.println("Informe o id da disciplina: ");
									op = sc.nextInt();
									Disciplina findDisciplina = findCurso.findDisciplina(op, findCurso);
									findDisciplina.addListaAluno(newAluno);
									
								}while(op != 0);
								break;
							}
							//Consultar, alterar ou excluir dados do aluno
							case 2: {
								do {									
																		
									empresa.listarFaculdades();
									System.out.println("Informe o id da faculdade: \n");
									op = sc.nextInt();
									Faculdade findFaculdade = empresa.findFaculdade(op);
									
									faculdade.listarCursos(findFaculdade);
									System.out.println("\nPara listar os alunos de uma disciplina: ");									
									System.out.println("Informe o id do curso: ");
									op = sc.nextInt();
									Curso findCurso = faculdade.findCurso(op, findFaculdade);
									
									curso.listarDisciplinas(findCurso);
									System.out.println("Informe o id da disciplina: \n");
									op = sc.nextInt();
									Disciplina findDisciplina = curso.findDisciplina(op, findCurso);
									
									System.out.println("Disciplina:  " + findDisciplina.getName());
									disciplina.listarAlunos(findDisciplina);
									
									op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada \n"
											+ "01 Para listar dados de um aluno específico: \n"
											+ "00 Para retornar ao menu anterior"));
									
									if(op == 1) {										
										//Listando dados pessoais de um aluno 
										
										System.out.println("Informe o id do aluno para listar os dados pessoais: \n");
										op = sc.nextInt();
										Aluno findAluno = disciplina.findAluno(op, findDisciplina);
										aluno.listarDadosAluno(findAluno);
										
										while (op != 0){
											op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "												
													+ "\n01 Para imprimir informações financeiras do aluno: "
													+ "\n02 Para criar uma conta bancária para o aluno: "
													+ "\n03 Para solicitar atendimento do professor: "
													+ "\n04 Para solicitar atendimento do secretário(a) financeiro(a): "
													+ "\n05 Para solicitar atendimento do gerente de sua agência: "
													+ "\n06 Para excluir o cadastro de um aluno: "
													+ "\n00 Para retornar ao menu anterior: "));
											
											switch (op) {
											//Listando informações financeiras de um aluno
											case 1: {
																								
												aluno.listarContasAluno(findAluno);
												
												break;
											}
											//Criar conta bancária do aluno
											case 2: {
																							
												empresa.listarBancos();
												System.out.println("Informe o id do banco: \n");
												op = sc.nextInt();
												Banco findBanco = empresa.findBanco(op);
												
												banco.listarAgencias(findBanco);
												System.out.println("Informe o id da agência: \n");
												op = sc.nextInt();
												Agencia findAgencia = banco.findAgencia(op, findBanco);
												
												
												op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n"
														+ "01 Para cadastrar uma conta corrente \n"
														+ "02 Para cadastrar uma conta poupança"));										
												
												Integer id = ++idConta;
												if(op == 1) {
													ContaCorrente newContaCorrente = new ContaCorrente(id, findAluno.getId(), findAgencia.getIdGerente(), null);
													findAluno.addContaCorrente(newContaCorrente	);
												}else
												if(op == 2){
													ContaPoupanca newContaPoupanca = new ContaPoupanca(id, findAluno.getId(), findAgencia.getIdGerente());
													findAluno.addContaPoupanca(newContaPoupanca);
												}
												
												break;
											}
											//Solicitar atendimento de um professor
											case 3: {												
												
												faculdade.listarProfessores(findFaculdade);
												System.out.println("\nInforme o id do professor do qual deseja atendimento: \n");
												op = sc.nextInt();
												Professor findProfessor = faculdade.findProfessor(op, findFaculdade);
												
												System.out.println("\nFila de alunos aguardando atendimento antes da solicitação: \n");
												professor.listarFilaAlunos(findProfessor);
												
												findProfessor.addFilaAlunos(findAluno);
												
												System.out.println("\nFila de alunos aguardando atendimento depois da solicitação: \n");
												professor.listarFilaAlunos(findProfessor);
												
												break;
											}
											//Solicitar atendimento do secretário(a) financeiro(a)
											case 4: {
												
												faculdade.listarSecFinanceiras(findFaculdade);
												System.out.println("\nInforme o id do secretário(a) financeiro(a) do qual deseja atendimento: ");
												op = sc.nextInt();
												
												SecFinanceira findSecFinanceira = faculdade.findSecFinanceira(op, findFaculdade);
												
												System.out.println("\nAntes da solicitação: ");
												secFinanceiro.listarFilaPessoas(findSecFinanceira);
												
												findSecFinanceira.addFilaPessoa(findAluno);
												
												System.out.println("\nDepois da solicitação: ");
												secFinanceiro.listarFilaPessoas(findSecFinanceira);
												
												break;
											}
											//Solicitar atendimento do gerente de sua agência
											case 5: {
												
												empresa.listarBancos();
												System.out.println("\nInforme o id do banco: ");
												op = sc.nextInt();
												Banco FindBanco = empresa.findBanco(op);
												
												banco.listarGerentes(FindBanco);
												
												System.out.println("\nInforme o id do gerente do qual deseja atendimento: ");
												op = sc.nextInt();
												Gerente findGerente = banco.findGerente(op, FindBanco);
												
												System.out.println("\nAntes da solicitação: ");
												gerente.listarFilaPessoas(findGerente);
												
												findGerente.addFilaPessoas(findAluno);	
												
												System.out.println("\nDepois da solicitação: ");
												gerente.listarFilaPessoas(findGerente);
												
												break;
											}
											//Excluir os dados do aluno
											case 6: {												
												
												System.out.println("Informe o id do aluno para exclusão de cadastro: \n");
												op = sc.nextInt();
												findAluno = disciplina.findAluno(op, findDisciplina);
												aluno.listarDadosAluno(findAluno);
												System.out.println("Informe 01 para confirmar a exclusão \n");
												op = sc.nextInt();
												if(op == 1) {
													disciplina.removeListaAluno(findAluno);	
												}
												
												op = 0;
												break;
											}
											default:
												if(op != 0) {
													System.out.println("Opção inválida!!!!");
												}
											}											
											
										}
										
									}								
																	
									break;
									
								}while(op != 0);
							}
							
							default:
								if(op != 0) {
									System.out.println("Opção inválida!!!!");
								}
							}
							
						}while(op != 0);
						
						break;
					}
					case 5: {
						//PROFESSOR
						do {
														
							op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n"
									+ "01 Para cadastrar um professor \n"
									+ "02 Para consultar, alterar ou excluir dados de um professor \n"
									+ "03 Para retornar ao menu anterior \n"));
							
							switch (op) {
							//Cadastrar profassor
							case 1: {
																
								++idPessoa;
								
								empresa.listarFaculdades();
								System.out.println("Informe id da faculdade onde o professor será cadastrado: \n");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								System.out.println("Informe o nome do professor: \n");
								sc.nextLine();
								String name = sc.nextLine();
								
								System.out.println("Informe o CPF: \n");
								sc.nextLine();
								String cpf = sc.nextLine();
								
								String funcao = "Professor";
								
								Professor newProfessor = new Professor(idPessoa, name, cpf, funcao);
								findFaculdade.addProfessor(newProfessor);
								
								break;
							}
							//Consultar, alterar ou excluir dados de um professor
							case 2: {
																
								do {
									
									empresa.listarFaculdades();
									System.out.println("\nInforme id da faculdade onde o professor é cadastrado: ");
									op = sc.nextInt();
									Faculdade findFaculdade = empresa.findFaculdade(op);
									
									faculdade.listarProfessores(findFaculdade);
									
									
									
									op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: "
											+ "\n01 Para listar dados de um professor específico: "
											+ "\n00 Para ir ao próximo menu: "));
									
									if(op == 1) {
										
										System.out.println("\nInforme id do professor para listar os dados pessoais: ");
										op = sc.nextInt();
										Professor findProfessor = faculdade.findProfessor(op, findFaculdade);
										
										professor.listarDadosProfessor(findProfessor);
										
										do {
											
											op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: "
													+ "\n01 Para listar dados financeiros do professor: "
													+ "\n02 Para criar uma conta bancária para o professor: "
													+ "\n03 Para solicitar atendimento ao coordenador: "
													+ "\n04 Para solicitar atendimento do secretário(a) financeiro(a): "
													+ "\n05 Para solicitar atendimento do gerente de sua agência: "
													+ "\n06 Para listar a fila de alunos aguardando atendimento e atender alunos: "
													+ "\n07 Para excluir os dados do professor: "
													+ "\n00 Para ir ao próximo menu: "));
											
											switch (op) {
											//Listar dados financeiros do professor
											case 1: {
												
												professor.listarContasProfessor(findProfessor);
												
												break;
											}
											//Criar uma conta bancária para o professor
											case 2: {
												
												empresa.listarBancos();
												System.out.println("Informe o id do banco: \n");
												op = sc.nextInt();
												Banco findBanco = empresa.findBanco(op);
												
												banco.listarAgencias(findBanco);
												System.out.println("Informe o id da agência: \n");
												op = sc.nextInt();
												Agencia findAgencia = banco.findAgencia(op, findBanco);
												
												
												op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n"
														+ "01 Para cadastrar uma conta corrente \n"
														+ "02 Para cadastrar uma conta poupança"));										
												
												Integer id = ++idConta;
												if(op == 1) {
													ContaCorrente newContaCorrente = new ContaCorrente(id, findProfessor.getId(), findAgencia.getIdGerente(), null);
													findProfessor.addContaCorrente(newContaCorrente	);
												}else
												if(op == 2){
													ContaPoupanca newContaPoupanca = new ContaPoupanca(id, findProfessor.getId(), findAgencia.getIdGerente());
													findProfessor.addContaPoupanca(newContaPoupanca);
												}
												
												break;
											}
											//Solicitar atendimento ao coordenador
											case 3: {
												
												faculdade.listarCoordenadores(findFaculdade);
												System.out.println("\nInforme o id do coordendor: ");
												op = sc.nextInt();
												Coordenador findCoordenador = faculdade.findCoordenador(op, findFaculdade);
												
												System.out.println("\nAntes da solicitação:");
												coordenador.listarFilaProfessores(findCoordenador);
												
												findCoordenador.addFilaProfessor(findProfessor);
												
												System.out.println("\nDepois da solicitação:");
												coordenador.listarFilaProfessores(findCoordenador);
												
												break;
											}
											//Solicitar atendimento do secretário(a) financeiro(a)
											case 4: {
												
												faculdade.listarSecFinanceiras(findFaculdade);
												System.out.println("\nInforme o id do secretário(a) financeiro(a) do(a) qual deseja atendimento: ");
												op = sc.nextInt();
												
												SecFinanceira findSecFinanceira = faculdade.findSecFinanceira(op, findFaculdade);
												
												System.out.println("\nAntes da solicitação: ");
												secFinanceiro.listarFilaPessoas(findSecFinanceira);
												
												findSecFinanceira.addFilaPessoa(findProfessor);
												
												System.out.println("\nDepois da solicitação: ");
												secFinanceiro.listarFilaPessoas(findSecFinanceira);
												
												break;
											}
											//Solicitar atendimento do gerente de sua agência
											case 5: {
												
												empresa.listarBancos();
												System.out.println("\nInforme o id do banco: ");
												op = sc.nextInt();
												
												Banco findBanco = empresa.findBanco(op);
												
												banco.listarGerentes(findBanco);
												System.out.println("\nInforme o id do gerente do(a) qual deseja atendimento: ");
												op = sc.nextInt();
												
												Gerente findGerente = banco.findGerente(op, findBanco);
																								
												System.out.println("\nAntes da solicitação: ");
												gerente.listarFilaPessoas(findGerente);
												
												findGerente.addFilaPessoas(findProfessor);
												
												System.out.println("\nDepois da solicitação: ");
												gerente.listarFilaPessoas(findGerente);
												
												break;
											}
											//Listar a fila de alunos aguardando atendimento e atender alunos
											case 6: {
												
												System.out.println("\nFila de alunos aguardando antes do atendimento: ");
												professor.listarFilaAlunos(findProfessor);
												
												op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: "
														+ "\n01 Para atender o 1º aluno da fila: "
														+ "\n00 Para ir ao próximo menu: "));
												
												if(op == 1) {
													
													Aluno findAluno = professor.realizarAtendimento(findProfessor);
													findProfessor.removeFilaAluno(findAluno);
													
													System.out.println("\nFila de alunos aguardando depois do atendimento: ");
													professor.listarFilaAlunos(findProfessor);
													
												}
												
												break;
											}
											//Excluir os dados do professor
											case 7: {
												
												System.out.println("Informe 01 para confirmar a exclusão \n");
												op = sc.nextInt();
												if(op == 1) {
													faculdade.removeProfessor(findProfessor);	
												}
												
												op = 0;
												break;
											}
											default:
												if(op != 0) {
													System.out.println("Opção inválida!!!!");
												}
											}
											
											
											
										}while(op != 0);
										
									}													
																	
								}while(op != 0);
			
								break;
							}
							default:
								if(op != 0) {
									System.out.println("Opção inválida!!!!");
								}
							}
							
						}while(op != 0);	
						
						op = 1;
						break;
					}
					//COODENADOR
					case 6: {
						do {
							
							op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n"
									+ "01 Para cadastrar um coordenador \n"
									+ "02 Para consultar, alterar ou excluir dados de um coordenador \n"
									+ "00 Para retornar ao menu anterior \n"));
							
							switch (op) {
							//Cadastrar um coordenador
							case 1: {
								
								++idPessoa;
								
								empresa.listarFaculdades();
								System.out.println("Informe o id da faculdade para cadastro do coordenador: \n");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								System.out.println("\nInforme o nome do coordenador: ");
								sc.nextLine();
								String name = sc.nextLine();
								
								System.out.println("\nInforme o CPF: ");
								sc.nextLine();
								String cpf = sc.nextLine();
								String funcao = "Coordenador";
								
								Coordenador newCoordenador = new Coordenador(idPessoa, name, cpf, funcao);
								findFaculdade.addListaCoordenador(newCoordenador);
								
								break;
							}
							//Consultar, alterar ou excluir dados de um coordenador
							case 2: {
								
								empresa.listarFaculdades();
								System.out.println("\nInforme id da faculdade onde o coordenador é cadastrado: ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								faculdade.listarCoordenadores(findFaculdade);
								
								op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: "
										+ "\n01 Para listar dados pessoais de um coordenador: "
										+ "\n00 Para retornar ao menu anterior: "));
								
								if(op == 1) {
									
									System.out.println("\nInforme id do coordenador para listar os dados pessoais: ");
									op = sc.nextInt();
									Coordenador findCoordenador = faculdade.findCoordenador(op, findFaculdade);	
									
									coordenador.listarDadosCoordenador(findCoordenador);
									
									do {
										
										op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: "
												+ "\n01 Para listar dados financeiros do coordenador: "
												+ "\n02 Para criar uma conta bancária para o coordenador: "
												+ "\n03 Para solicitar atendimento ao diretor: "
												+ "\n04 Para solicitar atendimento do secretário(a) financeiro(a): "
												+ "\n05 Para solicitar atendimento do gerente de sua agência: "
												+ "\n06 Para listar a fila de alunos aguardando atendimento e atender alunos: "
												+ "\n07 Para listar a fila de professores aguardando atendimento e atender professores: "
												+ "\n08 Para excluir os dados do coordenador: "
												+ "\n00 Para retornar ao menu anterior: "));
										
										switch (op) {
										//Listar dados financeiros do coordenador
										case 1: {
											
											coordenador.listarContasCoordenador(findCoordenador);
											
											break;
										}
										//Criar uma conta bancária para o coordenador
										case 2: {
											
											empresa.listarBancos();
											System.out.println("Informe o id do banco: \n");
											op = sc.nextInt();
											Banco findBanco = empresa.findBanco(op);
											
											banco.listarAgencias(findBanco);
											System.out.println("Informe o id da agência: \n");
											op = sc.nextInt();
											Agencia findAgencia = banco.findAgencia(op, findBanco);
											
											
											op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n"
													+ "01 Para cadastrar uma conta corrente \n"
													+ "02 Para cadastrar uma conta poupança"));										
											
											Integer id = ++idConta;
											if(op == 1) {
												ContaCorrente newContaCorrente = new ContaCorrente(id, findCoordenador.getId(), findAgencia.getIdGerente(), null);
												findCoordenador.addContaCorrente(newContaCorrente	);
											}else
											if(op == 2){
												ContaPoupanca newContaPoupanca = new ContaPoupanca(id, findCoordenador.getId(), findAgencia.getIdGerente());
												findCoordenador.addContaPoupanca(newContaPoupanca);
											}
											
											break;
										}
										//Solicitar atendimento ao diretor
										case 3: {
											
											faculdade.listarDiretores(findFaculdade);
											System.out.println("\nInforme o id do diretor: ");
											op = sc.nextInt();
											
											Diretor findDiretor = faculdade.findDiretor(op, findFaculdade);
											
											System.out.println("\nAntes da solicitação: ");
											diretor.listarFilaCoordenadores(findDiretor);
											
											System.out.println("\nDepois da solicitação: ");
											findDiretor.addFilaCoordenadores(findCoordenador);
											diretor.listarFilaCoordenadores(findDiretor);
											
											break;
										}
										//Solicitar atendimento do secretário(a) financeiro(a)
										case 4: {
											
											faculdade.listarSecFinanceiras(findFaculdade);
											System.out.println("\nInforme o id do secretário(a) financeiro(a) do(a) qual deseja atendimento: ");
											op = sc.nextInt();
											
											SecFinanceira findSecFinanceira = faculdade.findSecFinanceira(op, findFaculdade);
											
											System.out.println("\nAntes da solicitação: ");
											secFinanceiro.listarFilaPessoas(findSecFinanceira);
											
											findSecFinanceira.addFilaPessoa(findCoordenador);
											
											System.out.println("\nDepois da solicitação: ");
											secFinanceiro.listarFilaPessoas(findSecFinanceira);
											
											break;
										}
										//Solicitar atendimento do gerente de sua agência
										case 5: {
											
											empresa.listarBancos();
											System.out.println("\nInforme o id do banco: ");
											op = sc.nextInt();
											
											Banco findBanco = empresa.findBanco(op);
											
											banco.listarGerentes(findBanco);
											System.out.println("\nInforme o id do gerente do(a) qual deseja atendimento: ");
											op = sc.nextInt();
											
											Gerente findGerente = banco.findGerente(op, findBanco);
																							
											System.out.println("\nAntes da solicitação: ");
											gerente.listarFilaPessoas(findGerente);
											
											findGerente.addFilaPessoas(findCoordenador);
											
											System.out.println("\nDepois da solicitação: ");
											gerente.listarFilaPessoas(findGerente);
											
											break;
										}										
										//Listar a fila de alunos aguardando atendimento e atender aluno
										case 6: {
											
											System.out.println("\nAntes do atendimento");
											coordenador.listarFilaAlunos(findCoordenador);
											
											op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: "
													+ "\n01 Para atender o 1º aluno da fila: "
													+ "\n00 Para ir ao próximo menu: "));
											
											if(op == 1) {
												
												Aluno findAluno = coordenador.realizarAtendimentoAluno(findCoordenador);
												findCoordenador.removeFilaAluno(findAluno);
												
												System.out.println("\nDepois do atendimento: ");
												coordenador.listarFilaAlunos(findCoordenador);
												
											}											
											
											break;
										}
										//Listar a fila de professores aguardando atendimento e atender professor
										case 7: {
											
											System.out.println("\nAntes do atendimento: ");
											coordenador.listarFilaProfessores(findCoordenador);
											
											op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: "
													+ "\n01 Para atender o 1º professor da fila: "
													+ "\n00 Para ir ao próximo menu: "));
											
											if(op == 1) {
												
												Professor findProfessor = coordenador.realizarAtendimentoProfessor(findCoordenador);
												findCoordenador.removeFilaProfessor(findProfessor);
												
												System.out.println("\nDepois do atendimento: ");
												coordenador.listarFilaAlunos(findCoordenador);
												
											}						
											
											break;
										}
										//Excluir os dados do coordenador
										case 8: {
											
											System.out.println("Informe 01 para confirmar a exclusão \n");
											op = sc.nextInt();
											if(op == 1) {
												faculdade.removeListaCoordenador(findCoordenador);	
											}
											
										op = 0;	
										}
										default:
											if(op != 0) {
												System.out.println("Opção inválida!!!!");
											}
										}
										
									}while(op != 0);
									
								}
																																							
								break;
							}
							default:
								if(op != 0) {
									System.out.println("Opção inválida!!!!");
								}
							}
							
						}while(op !=  0);
						
						op = 1;
						break;
					}
					//SECRETÁRIO(A) ACADEMICO(A)
					case 7: {
						
						do {
							
							op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
									+ "\n01 Para cadastrar um secretário(a) academico(a): "
									+ "\n02 Para consultar, alterar ou excluir dados de um secretário(a) academico(a): "
									+ "\n00 Para retornar ao menu anterior: "));
							
							switch (op) {
							//Cadastrar um secretário(a) academico(a)
							case 1: {
								
								++ idPessoa;
								
								empresa.listarFaculdades();
								System.out.println("Informe o id da faculdade para cadastro do secretário(a) academico(a): \n");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								System.out.println("\nInforme o nome do(a) secretário(a) academico(a): ");
								sc.nextLine();
								String name = sc.nextLine();
								
								System.out.println("\nInforme o CPF: ");
								sc.nextLine();
								String cfp = sc.nextLine();
								String funcao = "Secretário(a) academico(a)";
								
								SecAcademica newSecAcademica = new SecAcademica(op, name, cfp, funcao);
								findFaculdade.addListaSecAcademica(newSecAcademica);
								
								op = 1;
								break;
							}
							//Consultar, alterar ou excluir dados de um secretário(a) academico(a)
							case 2: {
								
								empresa.listarFaculdades();
								System.out.println("\nInforme id da faculdade onde o secretário(a) academico(a) é cadastrado: ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: "
										+ "\n01 Para listar dados pessoais de um secretário(a) academico(a): "
										+ "\n00 Para ir ao próximo menu: "));
								
								if(op == 1) {
									
									System.out.println("\nInforme id do secretário(a) academico(a) para listar os dados pessoais: ");
									op = sc.nextInt();
									
									SecAcademica findSecAcademica = faculdade.findSecAcademica(op, findFaculdade);
									secAcademica.listarDadosSecAcademica(findSecAcademica);
									
									op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
											+ "\n01 Para listar dados financeiros do secretário(a) academico(a): "
											+ "\n02 Para criar uma conta bancária para o secretário(a) academico(a): "
											+ "\n03 Para listar a fila de alunos aguardando atendimento e atender alunos: "
											+ "\n04 Para solicitar atendimento do secretário(a) financeiro(a): "
											+ "\n05 Para solicitar atendimento do gerente de sua agência: "
											+ "\n06 Para excluir os dados do secretário(a) academico(a): "
											+ "\n00 Para retornar ao menu anterior: "));
									
									do {
										
										switch (op) {
										//Listar dados financeiros do secretário(a) academico(a)
										case 1: {
											
											secAcademica.listarContasSecAcad(findSecAcademica);
											
											break;
										}
										//Criar conta bancária para o secretário(a) academico(a)
										case 2: {											

											empresa.listarBancos();
											System.out.println("Informe o id do banco: \n");
											op = sc.nextInt();
											Banco findBanco = empresa.findBanco(op);
											
											banco.listarAgencias(findBanco);
											System.out.println("Informe o id da agência: \n");
											op = sc.nextInt();
											Agencia findAgencia = banco.findAgencia(op, findBanco);
											
											
											op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n"
													+ "01 Para cadastrar uma conta corrente \n"
													+ "02 Para cadastrar uma conta poupança"));										
											
											Integer id = ++idConta;
											if(op == 1) {
												ContaCorrente newContaCorrente = new ContaCorrente(id, findSecAcademica.getId(), findAgencia.getIdGerente(), null);
												findSecAcademica.addContaCorrente(newContaCorrente	);
											}else
											if(op == 2){
												ContaPoupanca newContaPoupanca = new ContaPoupanca(id, findSecAcademica.getId(), findAgencia.getIdGerente());
												findSecAcademica.addContaPoupanca(newContaPoupanca);
											}
											
											break;
										}
										//Listar a fila de alunos aguardando atendimento e atender alunos
										case 3: {
											
											System.out.println("\nAntes do atendimento");
											secAcademica.listarFilaAlunos(findSecAcademica);
											
											op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: "
													+ "\n01 Para atender o 1º aluno da fila: "
													+ "\n00 Para ir ao próximo menu: "));
											
											if(op == 1) {
												
												Aluno findAluno = secAcademica.realizarAtendimentoAluno(findSecAcademica);
												findSecAcademica.removeFilaAluno(findAluno);
												
												System.out.println("\nDepois do atendimento: ");
												secAcademica.listarFilaAlunos(findSecAcademica);
												
											}				
											
											break;
										}
										//Solicitar atendimento do secretário(a) financeiro(a)
										case 4: {
											
											faculdade.listarSecFinanceiras(findFaculdade);
											System.out.println("\nInforme o id do secretário(a) financeiro(a) do(a) qual deseja atendimento: ");
											op = sc.nextInt();
											
											SecFinanceira findSecFinanceira = faculdade.findSecFinanceira(op, findFaculdade);
											
											System.out.println("\nAntes da solicitação: ");
											secFinanceiro.listarFilaPessoas(findSecFinanceira);
											
											findSecFinanceira.addFilaPessoa(findSecAcademica);
											
											System.out.println("\nDepois da solicitação: ");
											secFinanceiro.listarFilaPessoas(findSecFinanceira);
											
											break;
										}
										//Solicitar atendimento do gerente de sua agência
										case 5: {
											
											empresa.listarBancos();
											System.out.println("\nInforme o id do banco: ");
											op = sc.nextInt();
											
											Banco findBanco = empresa.findBanco(op);
											
											banco.listarGerentes(findBanco);
											System.out.println("\nInforme o id do gerente do(a) qual deseja atendimento: ");
											op = sc.nextInt();
											
											Gerente findGerente = banco.findGerente(op, findBanco);
																							
											System.out.println("\nAntes da solicitação: ");
											gerente.listarFilaPessoas(findGerente);
											
											findGerente.addFilaPessoas(findSecAcademica);
											
											System.out.println("\nDepois da solicitação: ");
											gerente.listarFilaPessoas(findGerente);
											
											break;
										}
										//Excluir os dados do secretário(a) academico(a)
										case 6: {
											
											System.out.println("Informe 01 para confirmar a exclusão \n");
											op = sc.nextInt();
											if(op == 1) {
												faculdade.removeSecAcademica(findSecAcademica);
											}
											
											op = 0;	
											
											break;
										}
										default:
											if(op != 0) {
												System.out.println("Opção inválida!!!!");
											}
										}
										
									}while(op != 0);
									
								}
								
								break;
							}
							default:
								if(op != 0) {
									System.out.println("Opção inválida!!!!");
								}
							}
							
						}while(op != 0);
						
						op = 1;
						break;
					}
					//SECRETÁRIO(A) FINANCEIRO(A)
					case 8: {
						
						do {
							
							op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
									+ "\n01 Para cadastrar um secretário(a) financeiro(a): "
									+ "\n02 Para consultar, alterar ou excluir dados de um secretário(a) financeiro(a): "
									+ "\n00 Para retornar ao menu anterior: "));
							
							switch (op) {
							//Cadastrar um secretário(a) financeiro(a)
							case 1: {
								
								++ idPessoa;
								
								empresa.listarFaculdades();
								System.out.println("Informe o id da faculdade para cadastro do secretário(a) financeiro(a): \n");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								System.out.println("\nInforme o nome do(a) secretário(a) financeiro(a): ");
								sc.nextLine();
								String name = sc.nextLine();
								
								System.out.println("\nInforme o CPF: ");
								sc.nextLine();
								String cfp = sc.nextLine();
								String funcao = "Secretário(a) financeiro(a)";
								
								SecFinanceira newSecFinaceira = new SecFinanceira(idPessoa, name, cfp, funcao);
								findFaculdade.addSecFinanceira(newSecFinaceira);
								
								break;
							}
							//Consultar, alterar ou excluir dados de um secretário(a) financeiro(a)
							case 2: {
								
								empresa.listarFaculdades();
								System.out.println("\nInforme id da faculdade onde o secretário(a) financeiro(a) é cadastrado: ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								faculdade.listarSecFinanceiras(findFaculdade);
								
								op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: "
										+ "\n01 Para listar dados pessoais de um secretário(a) financeiro(a): "
										+ "\n00 Para ir ao próximo menu: "));
								
								if(op == 1) {
									
									System.out.println("\nInforme id do secretário(a) financeiro(a) para listar os dados pessoais: ");
									op = sc.nextInt();
									
									SecFinanceira findSecFinanceira = faculdade.findSecFinanceira(op, findFaculdade);
									secFinanceiro.listarDadosSecFinanceira(findSecFinanceira);
									
									op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: "
											+ "\n01 Para listar dados financeiros do secretário(a) financeiro(a): "
											+ "\n02 Para criar uma conta bancária para o secretário(a) financeiro(a): "
											+ "\n03 Para listar a fila de pessoas aguardando atendimento e atender pessoa: "
											+ "\n04 Para solicitar atendimento do gerente de sua agência: "
											+ "\n05 Para excluir os dados do secretário(a) financeiro(a): "
											+ "\n00 Para retornar ao menu anterior: "));
									
									switch (op) {
									//Listar dados financeiros do secretário(a) financeiro(a)
									case 1: {
										
										secFinanceiro.listarContasSecFin(findSecFinanceira);
										
										break;
									}
									//Criar uma conta bancária para o secretário(a) financeiro(a)
									case 2: {
										
										empresa.listarBancos();
										System.out.println("Informe o id do banco: \n");
										op = sc.nextInt();
										Banco findBanco = empresa.findBanco(op);
										
										banco.listarAgencias(findBanco);
										System.out.println("Informe o id da agência: \n");
										op = sc.nextInt();
										Agencia findAgencia = banco.findAgencia(op, findBanco);
										
										
										op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n"
												+ "01 Para cadastrar uma conta corrente \n"
												+ "02 Para cadastrar uma conta poupança"));										
										
										Integer id = ++idConta;
										if(op == 1) {
											ContaCorrente newContaCorrente = new ContaCorrente(id, findSecFinanceira.getId(), findAgencia.getIdGerente(), null);
											findSecFinanceira.addContaCorrente(newContaCorrente	);
										}else
										if(op == 2){
											ContaPoupanca newContaPoupanca = new ContaPoupanca(id, findSecFinanceira.getId(), findAgencia.getIdGerente());
											findSecFinanceira.addContaPoupanca(newContaPoupanca);
										}
										
										break;
									}
									//Listar a fila de pessoas aguardando atendimento e atender pessoa
									case 3: {
										
										System.out.println("\nAntes do atendimento");
										secFinanceiro.listarFilaPessoas(findSecFinanceira);
										
										Integer findId = secFinanceiro.findIdPrimeiraPessoaFila(findSecFinanceira);
										
										secFinanceiro.realizarAtendimento(findId, findSecFinanceira);
										
										System.out.println("\nDepois do atendimento");
										secFinanceiro.listarFilaPessoas(findSecFinanceira);
										
										break;
									}
									//Solicitar atendimento do gerente de sua agência
									case 4: {
										
										empresa.listarBancos();
										System.out.println("\nInforme o id do banco: ");
										op = sc.nextInt();
										
										Banco findBanco = empresa.findBanco(op);
										
										banco.listarGerentes(findBanco);
										System.out.println("\nInforme o id do gerente do(a) qual deseja atendimento: ");
										op = sc.nextInt();
										
										Gerente findGerente = banco.findGerente(op, findBanco);
																						
										System.out.println("\nAntes da solicitação: ");
										gerente.listarFilaPessoas(findGerente);
										
										findGerente.addFilaPessoas(findSecFinanceira);
										
										System.out.println("\nDepois da solicitação: ");
										gerente.listarFilaPessoas(findGerente);
										
										break;
									}
									//Excluir os dados do secretário(a) financeiro(a)
									case 5: {
										
										System.out.println("Informe 01 para confirmar a exclusão \n");
										op = sc.nextInt();
										if(op == 1) {
											faculdade.removeSecFinanceira(findSecFinanceira);
										}
										
										op = 0;	
										
										break;
									}
									default:
										if(op != 0) {
											System.out.println("Opção inválida!!!!");
										}
									}
									
								}
								
								break;
							}
							default:
								if(op != 0) {
									System.out.println("Opção inválida!!!!");
								}
							}
							
						}while(op != 0);
						
						break;
					}
					//DIRETOR
					case 9: {
						
						do {
							
							op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
									+ "\n01 Para cadastrar um secretário(a) financeiro(a): "
									+ "\n02 Para consultar, alterar ou excluir dados de um secretário(a) financeiro(a): "
									+ "\n00 Para retornar ao menu anterior: "));
							
							switch (op) {
							//Cadastrar um secretário(a) financeiro(a)
							case 1: {
								
								++idPessoa;
								
								empresa.listarFaculdades();
								System.out.println("\nInforme o id da faculdade para cadastar o diretor:");
								op = sc.nextInt();
								
								Faculdade findFaculdade = faculdade.findFaculdade(op);
								
								System.out.println("\nInforme o nome do diretor: ");
								sc.nextLine();
								String name = sc.nextLine();
								System.out.println("\nInforme o CPF: ");
								sc.nextLine();
								String cpf = sc.nextLine();
								String funcao = "Diretor";
								
								Diretor newDiretor = new Diretor(op, name, cpf, funcao);
								
								findFaculdade.addListaDiretor(newDiretor);
								
								break;
							}
							//Consultar, alterar ou excluir dados de um secretário(a) financeiro(a)
							case 2: {
								
								empresa.listarFaculdades();
								System.out.println("\nInforme id da faculdade onde o secretário(a) financeiro(a) é cadastrado: ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								faculdade.listarDiretores(findFaculdade);
								
								op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: "
										+ "\n01 Para listar dados pessoais de um secretário(a) financeiro(a): "
										+ "\n00 Para ir ao próximo menu: "));
								
								if(op == 1) {
									
									System.out.println("\nInforme o id do diretor para listar os dados pessoais: ");
									op = sc.nextInt();
									
									Diretor findDiretor = faculdade.findDiretor(op, findFaculdade);
									
									diretor.listarDadosDiretor(findDiretor);
									
									op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: "
											+ "\n01 Para listar dados financeiros do diretor: "
											+ "\n02 Para criar uma conta bancária para o diretor: "
											+ "\n03 Para listar a fila de coordenadores aguardando atendimento e atender coordenador: "
											+ "\n04 Para solicitar atendimento do gerente de sua agência: "
											+ "\n05 Para excluir os dados do diretor: "
											+ "\n00 Para retornar ao menu anterior: "));
									
									switch (op) {
									//Cistar dados financeiros do diretor
									case 1: {
										
										diretor.listarContasDiretor(findDiretor);
										
										break;
									}
									//Criar uma conta bancária para o diretor
									case 2: {
										
										empresa.listarBancos();
										System.out.println("Informe o id do banco: \n");
										op = sc.nextInt();
										Banco findBanco = empresa.findBanco(op);
										
										banco.listarAgencias(findBanco);
										System.out.println("Informe o id da agência: \n");
										op = sc.nextInt();
										Agencia findAgencia = banco.findAgencia(op, findBanco);
										
										
										op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n"
												+ "01 Para cadastrar uma conta corrente \n"
												+ "02 Para cadastrar uma conta poupança"));										
										
										Integer id = ++idConta;
										if(op == 1) {
											ContaCorrente newContaCorrente = new ContaCorrente(id, findDiretor.getId(), findAgencia.getIdGerente(), null);
											findDiretor.addContaCorrente(newContaCorrente	);
										}else
										if(op == 2){
											ContaPoupanca newContaPoupanca = new ContaPoupanca(id, findDiretor.getId(), findAgencia.getIdGerente());
											findDiretor.addContaPoupanca(newContaPoupanca);
										}
										
										break;
									}
									//Listar a fila de coordenadores aguardando atendimento e atender coordenador
									case 3: {
										
										System.out.println("\nAntes do atendimento: ");
										diretor.listarFilaCoordenadores(findDiretor);
										
										op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: "
												+ "\n01 Para atender ao 1º coordenador da fila: "
												+ "\n00 Para ir ao próximo menu: "));
										
										Coordenador findCoordenador = diretor.realizarAtendimento(findDiretor);
										
										if(op == 1) {
											findDiretor.removeFilaCoordenador(findCoordenador);
										}
										
										System.out.println("\nDepois do atendimento: ");
										diretor.listarFilaCoordenadores(findDiretor);
										
										break;
									}
									//Solicitar atendimento do gerente de sua agência
									case 4: {
										
										empresa.listarBancos();
										System.out.println("\nInforme o id do banco: ");
										op = sc.nextInt();
										
										Banco findBanco = empresa.findBanco(op);
										
										banco.listarGerentes(findBanco);
										System.out.println("\nInforme o id do gerente do(a) qual deseja atendimento: ");
										op = sc.nextInt();
										
										Gerente findGerente = banco.findGerente(op, findBanco);
																						
										System.out.println("\nAntes da solicitação: ");
										gerente.listarFilaPessoas(findGerente);
										
										findGerente.addFilaPessoas(findDiretor);
										
										System.out.println("\nDepois da solicitação: ");
										gerente.listarFilaPessoas(findGerente);
										
										break;
									} 
									//Excluir os dados do diretor
									case 5: {
										
										System.out.println("Informe 01 para confirmar a exclusão \n");
										op = sc.nextInt();
										if(op == 1) {
											faculdade.removeListaDiretor(findDiretor);
										}
										
										op = 0;	
										
										break;
									}
									default:
										if(op != 0) {
											System.out.println("Opção inválida!!!!");
										}
									}
									
								}
								
								break;
							}
							default:
								if(op != 0) {
									System.out.println("Opção inválida!!!!");
								}
							}
							
						}while(op != 0);
						
						
						break;
					}
					default:
						if(op != 0) {
							System.out.println("Opção inválida!!!!");
						}
					}
					
					
				}while(op != 0);
				
				op = 1;
				break;
			}
			//BANCO
			case 2:{
				//Cadastrar e consultar dados de um banco
				do {
					
					op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
							+ "\n01 Para cadastrar e consultar dados de um banco: "
							+ "\n02 Para cadastrar e consultar dados de uma agência: "
							+ "\n03 Para cadastrar e consultar dados de um presidente: "
							+ "\n04 Para cadastrar e consultar dados de um gerente: "
							+ "\n00 Para retornar ao menu anterior: "));
					
					switch (op) {
					//Cadastrar um banco
					case 1: {
						
						op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: "
								+ "\n01 Para cadastrar os dados do banco: "
								+ "\n02 Para nomear o presidente de uma empresa: "
								+ "\n00 Para ir ao próximo menu: "));
						
						if(op == 1) {

							++idEmpresa;
							
							System.out.println("\nInforme o nome do banco: ");
							sc.nextLine();
							String name = sc.nextLine();
							
							System.out.println("\nInforme o CNPJ: ");
							sc.nextLine();
							String cnpj = sc.nextLine();
							
							Banco newBanco = new Banco(idEmpresa, name, cnpj);
							empresa.addListaBanco(newBanco);
						}
						else if(op == 2) {
							
							empresa.listarPresidentes();
							
							System.out.println("\nInforme o id do presidente a ser nomeado: ");
							op = sc.nextInt();							
							Presidente findPresidente = empresa.findPresidente(op);
							
							empresa.listarBancos();
							
							System.out.println("\nInforme o id do banco: ");
							op =sc.nextInt();
							Banco findBanco = empresa.findBanco(op);
							
							findBanco.setPresidente(findPresidente);
							
							System.out.println("\nPresidente do banco " + findBanco.getName());
							System.out.println("\nNome:               " + findBanco.getPresidente().getName());
						}	
												
						break;
					}
					//Cadastrar e consultar dados de uma agência
					case 2: {
						do {
							
							op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
									+ "\n01 Para cadastrar uma agêcia bancária: "
									+ "\n02 Para consultar, alterar ou excluir dados de uma agêcia bancária: "
									+ "\n00 Para retornar ao menu anterior: "));
							
							switch (op) {
							//Cadastrar uma agêcia bancária
							case 1: {
								
								++idAgencia;
								
								empresa.listarBancos();
								System.out.println("\nInforme o id banco do qual a agência faz parte: ");
								op = sc.nextInt();
								Banco findBanco = empresa.findBanco(op);
								
								banco.listarGerentes(findBanco);
								System.out.println("\nInforme o id do gerente para assumir a gestão da agência: ");
								op = sc.nextInt();
								Gerente findGerente = banco.findGerente(op, findBanco);
								
								System.out.println("\nInforme o nome da agência: ");
								sc.nextLine();
								String name = sc.nextLine();
								
								Agencia newAgencia = new Agencia(findBanco.getId(), findBanco.getName(), findBanco.getCnpj(), idAgencia, name, findGerente.getId());
								banco.addListaAgencia(newAgencia);
								newAgencia.setGerente(findGerente);
								
								break;
							}
							//Consultar, alterar ou excluir dados de uma agêcia bancária
							case 2: {
								
								empresa.listarBancos();
								System.out.println("\nInforme o id do banco para consultar dados de suaas agencias: ");
								op = sc.nextInt();
								Banco findBanco = empresa.findBanco(op);
								
								banco.listarAgencias(findBanco);
								System.out.println("\nInforme o id da agência a qual deseja listar as informações:");
								op = sc.nextInt();
								Agencia findAgencia = banco.findAgencia(op, findBanco);
								
								agencia.listarDadosAgencia(findAgencia, findBanco);
								
								
							}
							default:
								if(op != 0) {
									System.out.println("Opção inválida!!!!");
								}
							}
							
							
						}while(op != 0);
						
						break;
					}
					//Cadastrar e consultar dados de um presidente
					case 3: {
						
						do {
							
							op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
									+ "\n01 Para cadastrar um presidente: "
									+ "\n02 Para consultar, alterar ou excluir dados de um presidente: "
									+ "\n00 Para retornar ao menu anterior: "));
							
							switch (op) {
							//Cadastrar um presidente
							case 1: {
								
								++idPessoa;
								
								System.out.println("\nInforme o nome do presidente: ");
								sc.nextLine();
								String name = sc.nextLine();
								
								System.out.println("\nInforme o CPF: ");
								sc.nextLine();
								String cpf = sc.nextLine();
								String funcao = "Presidente";
								
								Presidente newPresidente = new Presidente(idPessoa, name, cpf, funcao);
								empresa.addPresidente(newPresidente);
								
								break;
							}
							//Consultar, alterar ou excluir dados de um presidente
							case 2: {
								
								empresa.listarPresidentes();
								System.out.println("\nInforme o id de um presidente para listar os dados pessoais: ");
								op = sc.nextInt();
								Presidente findPresidente = empresa.findPresidente(op);
								
								presidente.listarDadosPresidente(findPresidente);
								
								op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "												
										+ "\n01 Para listar informações financeiras do presidende: "
										+ "\n02 Para criar uma conta bancária para o presidente: "
										+ "\n06 Para excluir os dados de um presidente: "
										+ "\n00 Para retornar ao menu anterior: "));
								
								switch (op) {
								//Listar informações financeiras do presidende
								case 1: {
									
									presidente.listarContasPresidente(findPresidente);
									
									break;
								}
								//Criar uma conta bancária para o presidente
								case 3: {
									
									empresa.listarBancos();
									System.out.println("Informe o id do banco: \n");
									op = sc.nextInt();
									Banco findBanco = empresa.findBanco(op);
									
									banco.listarAgencias(findBanco);
									System.out.println("Informe o id da agência: \n");
									op = sc.nextInt();
									Agencia findAgencia = banco.findAgencia(op, findBanco);
									
									
									op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n"
											+ "01 Para cadastrar uma conta corrente \n"
											+ "02 Para cadastrar uma conta poupança"));										
									
									Integer id = ++idConta;
									if(op == 1) {
										ContaCorrente newContaCorrente = new ContaCorrente(id, findPresidente.getId(), findAgencia.getIdGerente(), null);
										findPresidente.addContaCorrente(newContaCorrente	);
									}else
									if(op == 2){
										ContaPoupanca newContaPoupanca = new ContaPoupanca(id, findPresidente.getId(), findAgencia.getIdGerente());
										findPresidente.addContaPoupanca(newContaPoupanca);
									}								
									
									break;
								}
								//Excluir os dados de um presidente
								case 4: {
									
									System.out.println("Informe 01 para confirmar a exclusão \n");
									op = sc.nextInt();
									if(op == 1) {
										empresa.removePresidente(findPresidente);	
									}
									
								op = 0;	
									
									break;
								}
								default:
									if(op != 0) {
										System.out.println("Opção inválida!!!!");
									}
								}
								break;
							}
							default:
								if(op != 0) {
									System.out.println("Opção inválida!!!!");
								}
							}
							
							
						}while(op != 0);
						
						break;
					}
					//Cadastrar e consultar dados de um gerente
					case 4: {
						
						do { 
							
							op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
									+ "\n01 Para cadastrar um gerente: "
									+ "\n02 Para consultar, alterar ou excluir dados de um gerente: "
									+ "\n00 Para retornar ao menu anterior: "));
							
							switch (op) {
							//Cadastrar um gerente
							case 1: {
								
								++idPessoa;
								
								empresa.listarBancos();
								System.out.println("\nInforme o id do banco no qual o gente será cadastrado: ");
								op = sc.nextInt();
								Banco FindBanco = empresa.findBanco(op);
								
								banco.listarAgencias(FindBanco);
								System.out.println("\nInforme o id da agência na qual o gerente assumirá a gestão: ");
								op = sc.nextInt();
								Agencia findAgencia = banco.findAgencia(op, FindBanco);
								

								System.out.println("\nInforme o nome do gerente: ");
								sc.nextLine();
								String name = sc.nextLine();
								
								System.out.println("\nInforme o CPF: ");
								sc.nextLine();
								String cpf = sc.nextLine();
								String funcao = "gerente";
								
								Gerente newGerente = new Gerente(idPessoa, name, cpf, funcao, idAgencia);
								findAgencia.setGerente(newGerente);
								FindBanco.addListaGerente(newGerente);								
															
								break;
							}
							//Consultar, alterar ou excluir dados de um gerente
							case 2: {
								empresa.listarBancos();
								System.out.println("\nInforme o id do banco para listar os gerentes: ");
								op = sc.nextInt();
								Banco FindBanco = empresa.findBanco(op);
								
								banco.listarGerentes(FindBanco);
								
								System.out.println("\nInforme o id de um gerente para listar os dados pessoais: ");
								op = sc.nextInt();
								Gerente findGerente = banco.findGerente(op, FindBanco);
								
								gerente.listarDadosGerente(findGerente);
								
								op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "												
										+ "\n01 Para listar informações financeiras do gerente: "
										+ "\n02 Para criar uma conta bancária para o gerente: "
										+ "\n03 Para excluir os dados de um gerente: "
										+ "\n00 Para retornar ao menu anterior: "));
								
								switch (op) {
								//Listar informações financeiras do gerente
								case 1: {
									
									gerente.listarContasGernte(findGerente);
									
									break;
								}
								//Criar uma conta bancária para o gerente
								case 2: {
									
									empresa.listarBancos();
									System.out.println("Informe o id do banco: \n");
									op = sc.nextInt();
									Banco findBanco = empresa.findBanco(op);
									
									banco.listarAgencias(findBanco);
									System.out.println("Informe o id da agência: \n");
									op = sc.nextInt();
									Agencia findAgencia = banco.findAgencia(op, findBanco);
									
									
									op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n"
											+ "01 Para cadastrar uma conta corrente \n"
											+ "02 Para cadastrar uma conta poupança"));										
									
									Integer id = ++idConta;
									if(op == 1) {
										ContaCorrente newContaCorrente = new ContaCorrente(id, findGerente.getId(), findAgencia.getIdGerente(), null);
										findGerente.addContaCorrente(newContaCorrente	);
									}else
									if(op == 2){
										ContaPoupanca newContaPoupanca = new ContaPoupanca(id, findGerente.getId(), findAgencia.getIdGerente());
										findGerente.addContaPoupanca(newContaPoupanca);
									}					
									break;
								}
								//Excluir os dados de um gerente
								case 3: {
									
									System.out.println("Informe 01 para confirmar a exclusão \n");
									op = sc.nextInt();
									if(op == 1) {
										banco.removeListaGerente(findGerente);	
									}
									
								op = 0;	
									
									break;
								}
								default:
									throw new IllegalArgumentException("Unexpected value: " + op);
								}
								
								break;
							}
							default:
								if(op != 0) {
									System.out.println("Opção inválida!!!!");
								}
							}
							 
							
						}while(op != 0);
						
						break;
					}
					default:
						if(op != 0) {
							System.out.println("Opção inválida!!!!");
						}
					}
					
				}while(op != 0);
										
				break;
			}
			default:
				if(op != 0) {
					System.out.println("Opção inválida!!!!");
				}
			}
			
		
		}while(op != 0);
		
		sc.close();

	}

}
