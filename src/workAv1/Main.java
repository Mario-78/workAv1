package workAv1;

import java.util.Scanner;

import javax.swing.JOptionPane;

import workAv1_negocios.Agencia;
import workAv1_negocios.Banco;
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
		
		int op = 0, idPessoa = 0, idAgencia = 0, matri = 100, idDis = 0, idCurso = 0, idEmpresa = 0, idConta = 0;
		
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
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		Disciplina disciplina = new Disciplina();
		Curso curso = new Curso();
						
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
		
		professor0.addFilaAlunos(aluno8);
		professor0.addFilaAlunos(aluno5);
		professor0.addFilaAlunos(aluno3);
		
		
		
		Coordenador coordenador0 = new Coordenador(++idPessoa, "Arthur Jorge Fogaça", "056.308.323-95", "coordenador");
		Coordenador coordenador1 = new Coordenador(++idPessoa, "Alessandra Luana Cecília Baptista", "135.766.013-84", "coordenador");
		
		coordenador0.addFilaAluno(aluno5);
		coordenador0.addFilaAluno(aluno2);
		coordenador0.addFilaAluno(aluno7);
		coordenador0.addFilaProfessor(professor3);
		coordenador0.addFilaProfessor(professor0);
		coordenador1.addFilaAluno(aluno5);
		coordenador1.addFilaAluno(aluno1);
		coordenador1.addFilaProfessor(professor0);
		coordenador1.addFilaProfessor(professor2);
		coordenador1.addFilaProfessor(professor3);
		
		
		SecAcademica secAcademica0 = new SecAcademica(++idPessoa, "Anderson Fábio Mário Santos", "596.002.023-89", "secretario academico");
		SecAcademica secAcademica1 = new SecAcademica(++idPessoa, "Elisa Olivia Juliana Melo", "775.919.453-60", "secretaria academica");
		
		SecFinanceira secFinanceira0 = new SecFinanceira(++idPessoa, "Bryan Bento Henrique Gonçalves", "847.708.383-52", "secretario academico");
		SecFinanceira secFinanceira1 = new SecFinanceira(++idPessoa, "Vitória Eduarda dos Santos", "424.361.063-04", "secretaria academica");
		
		Gerente gerente0 = new Gerente(++idPessoa, "Patrícia Larissa Rosângela Barros", "155.284.013-13", "gerente", agencia.getId());
		agencia = new Agencia(banco.getId(),banco.getName(), banco.getCnpj(),++idAgencia, "Centro", gerente0.getId());
		
		Gerente gerente1 = new Gerente(++idPessoa, "Danilo Alexandre Marcos Viana", "785.738.333-35", "gerente", agencia.getId());
		agencia = new Agencia(banco.getId(), banco.getName(), banco.getCnpj(), ++idAgencia, "Dirceu", gerente1.getId());
		
		diretor = new Diretor(++idPessoa, "Rafael Anthony Nicolas Peixoto", "256.443.233-66", "diretor");
		
		Presidente presidente0 = new Presidente(++idPessoa, "Renata Mariana Isadora da Cruz", "935.180.683-93|", "presidente");
		
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
		
		disciplina0.addListaAluno(aluno9);
		disciplina0.addListaAluno(aluno1);
		disciplina0.addListaAluno(aluno4);
		disciplina0.addListaAluno(aluno7);
		disciplina1.addListaAluno(aluno6);
		disciplina1.addListaAluno(aluno8);
		disciplina1.addListaAluno(aluno2);
		disciplina1.addListaAluno(aluno1);
		disciplina2.addListaAluno(aluno9);
		disciplina2.addListaAluno(aluno1);
		disciplina2.addListaAluno(aluno4);
		disciplina2.addListaAluno(aluno7);
		disciplina3.addListaAluno(aluno2);
		disciplina3.addListaAluno(aluno8);
		
		disciplina4.addListaAluno(aluno0);
		disciplina4.addListaAluno(aluno3); 
		disciplina4.addListaAluno(aluno5);
		disciplina5.addListaAluno(aluno0);
		disciplina5.addListaAluno(aluno3); 
		disciplina5.addListaAluno(aluno5);
		disciplina6.addListaAluno(aluno0);
		disciplina6.addListaAluno(aluno3); 
		disciplina6.addListaAluno(aluno5);
		disciplina7.addListaAluno(aluno0);
		disciplina7.addListaAluno(aluno3); 
		disciplina7.addListaAluno(aluno5);		
		
		Banco banco0 = new Banco(++idEmpresa, "Santander", "85.875.897/0001-50");
		
		faculdade = new Faculdade(++idEmpresa, "Estácio", "66.859.821/0001-96", diretor.getId());
		faculdade.addListaCoordenador(coordenador0);
		faculdade.addListaCoordenador(coordenador1);
		faculdade.addListaCurso(curso0);
		faculdade.addListaCurso(curso1);
		faculdade.addListaSecAcademica(secAcademica0);
		faculdade.addListaSecAcademica(secAcademica1);
		faculdade.addSecFinanceira(secFinanceira0);
		faculdade.addSecFinanceira(secFinanceira1);
		faculdade.addProfessor(professor0);
		faculdade.addProfessor(professor1);
		faculdade.addProfessor(professor2);
		faculdade.addProfessor(professor3);
		
		curso0.addDisciplina(disciplina0);
		curso0.addDisciplina(disciplina1);
		curso0.addDisciplina(disciplina2);
		curso0.addDisciplina(disciplina3);
		
		curso1.addDisciplina(disciplina4);
		curso1.addDisciplina(disciplina5);
		curso1.addDisciplina(disciplina6);
		curso1.addDisciplina(disciplina7);
		
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
		
		
		
		faculdade.addContaCorrente(contaCorrente0);
		professor0.addContaCorrente(contaCorrente1);
		professor1.addContaCorrente(contaCorrente2);
		professor2.addContaCorrente(contaCorrente3);
		professor3.addContaCorrente(contaCorrente4);
		coordenador0.addContaCorrente(contaCorrente5);
		coordenador1.addContaCorrente(contaCorrente6);
		secAcademica0.addContaCorrente(contaCorrente7);
		secAcademica1.addContaCorrente(contaCorrente8);
		secFinanceira0.addContaCorrente(contaCorrente9);
		secFinanceira1.addContaCorrente(contaCorrente10);
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
		secAcademica1.addContaPoupanca(contaPoupanca5);
		secFinanceira0.addContaPoupanca(contaPoupanca6);
		secFinanceira1.addContaPoupanca(contaPoupanca7);
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
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n"
					+ "01 Para cadastrar uma pessoa \n"
					+ "02 Para cadastrar uma empresa \n"					
					+ "03 Para Criar uma conta corrente ou poupança \n"
					+ "04 Para pesquisar dados \n"
					+ "05 Para sair do app"));
			
			if(op == 1) {
				do {
					op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n"
							+ "01 Para cadastrar aluno: \n"
							+ "02 Para cadastrar professor: \n"
							+ "03 Para cadastrar coordenador: \n"
							+ "04 Para cadastrar secretário(a) acadêmico(a): \n"
							+ "05 Para cadastrar secretário(a) financeiro(a): \n"
							+ "06 Para cadastrar diretor(a): \n"
							+ "07 para cadastrar gerente: \n"
							+ "08 Para cadastrar presidente \n"));
					
					if(op == 1) {
						Integer id = ++idPessoa;
						System.out.println("Informe o nome: \n");
						String name = sc.nextLine();
						System.out.println("Informe o cpf: \n");
						String cpf = sc.nextLine();				
						aluno = new Aluno(id, name, cpf, ++matri);
					}else {
						Integer id = ++idPessoa;
						System.out.println("Informe o nome: \n");
						String name = sc.nextLine();
						System.out.println("Informe o cpf: \n");
						String cpf = sc.nextLine();
						
						switch (op) {
						case 2: {
							String funcao = "Professor";
							Professor newProfessor = new Professor(id, name, cpf, funcao);
							faculdade.addProfessor(newProfessor);
							break;
						}
						case 3: {
							String funcao = "Coordenador";
							Coordenador newCoordenador = new Coordenador(id, name, cpf, funcao);
							faculdade.addListaCoordenador(newCoordenador);
							break;
						}
						case 4: {
							String funcao = "Secretário(a) acadêmico(a)";
							SecAcademica newSecAcademica = new SecAcademica(id, name, cpf, funcao);
							faculdade.addListaSecAcademica(newSecAcademica);
							break;
						}
						case 5: {
							String funcao = "Secretário(a) financeiro(a)";
							SecFinanceira newSecFinanceiro = new SecFinanceira(id, name, cpf, funcao);
							faculdade.addSecFinanceira(newSecFinanceiro);
							break;
						}
						case 6: {
							String funcao = "Diretor";
							Diretor newDiretor = new Diretor(id, name, cpf, funcao);
							break;
						}
						case 7: {
							String funcao = "Gerente";
							Gerente newGerente = new Gerente(id, name, cpf, funcao, agencia.getId());
							break;						
						}
						case 8: {
							String função = "Presidente";
							Presidente newPresidente = new Presidente(id, name, cpf, função);
							break;
						}
						default:
							System.out.println("Opção incorreta!!!");
							System.out.println("Informe um valor entre 1 e 9");;
						}
					}					
				}while(op != 9);
				
			}else if(op == 2){
				do {
					op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n"
							+ "01 Para Cadastrar uma faculdade \n"
							+ "02 Para cadastrar um banco \n"
							+ "03 Para cadastrar agência \n"
							+ "04 Para sair \n"));
					
					switch (op) {
					case 1: {
						System.out.println("Informe o nome: ");
						String name = sc.nextLine();
						System.out.println("Informe o cnpj: ");
						String cnpj = sc.nextLine();
						faculdade = new Faculdade(++idEmpresa, name, cnpj, diretor.getId());
						break;
					}
					case 2: {
						System.out.println("Informe o nome: ");
						String name = sc.nextLine();
						System.out.println("Informe o cnpj: ");
						String cnpj = sc.nextLine();
						banco = new Banco(++idEmpresa, name, cnpj);
						break;
					}
					case 3: {
						System.out.println("Informe o nome: ");
						String name = sc.nextLine();
						agencia = new Agencia(banco.getId(), banco.getName(), banco.getCnpj(), ++idAgencia, name, gerente.getId());	
						break;
					}
					default:
						System.out.println("Opção incorreta!!!");
						System.out.println("Informe um valor entre 1 e 4");;
					}
				}while(op != 4);
				
			}else if(op == 3){
				op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n"
						+ "01 Para cadastrar uma conta corrente \n"
						+ "02 Para cadastrar uma conta poupança"));
				
				Integer id = ++idConta;
				System.out.println("Informe seu id: ");
				Integer idTitual = sc.nextInt();
				System.out.println("Informe o id da agência: ");
				Integer idAg = sc.nextInt();
				
				if(op == 1) {
					contaCorrente = new ContaCorrente(id, idTitual, agencia.getIdGerente(), null);
				}else
				if(op == 2){
					contaPoupanca = new ContaPoupanca(id, idTitual, agencia.getIdGerente());
				}
			}else if(op == 4){
				op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n"
						+ "01 Para consultar dados da faculdade \n"
						+ "02 Para consultar dados de cursos e disciplinas \n"
						+ "03 Para consultar dados de alunos \n"
						+ "04 Para consultar dados de professores \n"
						+ "05 Para consultar dados de coordenadores \n"
						+ "06 Para consultar dados de secretários(as) academicos(as) \n"
						+ "07 Para consultar dados de secretários(as) financeiros(as) \n"));
				
				
				switch (op) {
				case 1: {
					faculdade.printDadosFaculdade();
					diretor.printDiretor();
					faculdade.listarCursos();
					break;
				}
				case 2:{
					faculdade.listarCursos();
					System.out.println("Informe o id do curso:");
					op = sc.nextInt();
					Curso findCurso = faculdade.findCurso(op);
					//List<Disciplina> listaDisc = curso.findListaDisciplinas(findCurso);
					curso.listarDisciplinas(findCurso);						
					break;
				}
				case 3: {
					System.out.println("Para listar os alunos de uma disciplina: \n");
					faculdade.listarCursos();
					System.out.println("Informe o id do curso: \n");
					op = sc.nextInt();
					Curso findCurso = faculdade.findCurso(op);
					curso.listarDisciplinas(findCurso);
					System.out.println("Informe o id da disciplina: \n");
					op = sc.nextInt();
					Disciplina findDisciplina = curso.findDisciplina(op, findCurso);
					System.out.println("Disciplina:  " + findDisciplina.getName());
					disciplina.listarAlunos(findDisciplina);
					do {
						op = Integer.parseInt(JOptionPane.showInputDialog("01 Para listar dados de um aluno específico \n"
								+ "02 Para imprimir informações financeiras do aluno \n"
								+ "03 Para sair \n"));
					
						if(op == 1) {						
							System.out.println("Informe o id do aluno: \n");
							op = sc.nextInt();
							Aluno findAluno = disciplina.findAluno(op, findDisciplina);
							aluno.listarDadosAluno(findAluno);
						}else 
						if(op == 2) {
								System.out.println("Informe o id do aluno: ");
								op = sc.nextInt();
								Aluno findAluno = disciplina.findAluno(op, findDisciplina);
								aluno.listarContasAluno(findAluno);
						}						
					}while (op != 3);
					break;
				}
				case 4: {
					faculdade.listarProfessores();
					do {
						op = Integer.parseInt(JOptionPane.showInputDialog("01 Para listar dados de um professor específico \n"
								+ "02 Para listar informações financeiras do professor \n"
								+ "03 Para listar fila de alunos aguardando atendimento \n"
								+ "04 Para atender o primeiro aluno da fila \n"
								+ "05 Para sair \n"));
					
						if(op == 1) {
							System.out.println("Informe o id do professor: \n");
							op = sc.nextInt();
							Professor findProfessor = faculdade.findProfessor(op);
							professor.listarDadosProfessor(findProfessor);
						}else
						if(op == 2) {
							System.out.println("Informe o id do professor: \n");
							op = sc.nextInt();
							Professor findProfessor = faculdade.findProfessor(op);
							professor.listarContasProfessor(findProfessor);
						}else
						if(op == 3) {
							faculdade.listarProfessores();
							System.out.println("Informe o id do professor: \n");
							op = sc.nextInt();
							Professor findProfessor = faculdade.findProfessor(op);
							professor.listarFilaAlunos(findProfessor);
						}else 
						if(op == 4) {
							System.out.println("Informe o id do professor que vai realizar o atendimento: \n");
							op = sc.nextInt();
							Professor findProfessor = faculdade.findProfessor(op);
							professor.listarFilaAlunos(findProfessor);
							Aluno findAluno = professor.realizarAtendimento(findProfessor);
							findProfessor.removeFilaAluno(findAluno);
							professor.listarFilaAlunos(findProfessor);
						}
					}while (op != 4);
				}
				case 5: {
					faculdade.listarCoordenadores();
					do {
						op = Integer.parseInt(JOptionPane.showInputDialog("01 Para listar dados de um coordenador específico \n"
								+ "02 Para imprimir informações financeiras do coordenador \n"
								+ "03 Para imprimir fila de professores aguardando atendimento \n"
								+ "04 Para imprimir fila de alunos aguardando atendimento \n"
								+ "05 Para atender o primeiro professor da fila \n"
								+ "06 Para atender o primeiro aluno da fila \n"
								+ "07 Para sair \n"));
						System.out.println();
						switch (op) {
						case 1: {
							System.out.println("Informe o id do coordenador: \n");
							op = sc.nextInt();
							Coordenador findCoordenador = faculdade.findCoordenador(op);
							coordenador.listarDadosCoordenador(findCoordenador);
							break;
						}
						case 2: {
							System.out.println("Informe o id do coordenador: \n");
							op = sc.nextInt();
							Coordenador findCoordenador = faculdade.findCoordenador(op);
							coordenador.listarContasCoordenador(findCoordenador);
							break;
						}
						case 3: {
							System.out.println("Informe o id do coordenador: \n");
							op = sc.nextInt();
							Coordenador findCoordenador = faculdade.findCoordenador(op);
							coordenador.listarFilaProfessores(findCoordenador);
							break;
						}
						case 4: {
							System.out.println("Informe o id do coordenador: \n");
							op = sc.nextInt();
							Coordenador findCoordenador = faculdade.findCoordenador(op);
							coordenador.listarFilaAlunos(findCoordenador);
							break;
						}
						case 5: {
							System.out.println("Informe o id do coordenador que vai realizar o atendimento: \n");
							op = sc.nextInt();
							Coordenador findCoordenador = faculdade.findCoordenador(op);							
							coordenador.listarFilaProfessores(findCoordenador);
							Professor findProfessor = coordenador.realizarAtendimentoProfessor(findCoordenador);
							findCoordenador.removeFilaProfessor(findProfessor);
							coordenador.listarFilaProfessores(findCoordenador);
							break;
						}
						case 6: {
							System.out.println("Informe o id do coordenador que vai realizar o atendimento: \n");
							op = sc.nextInt();
							Coordenador findCoordenador = faculdade.findCoordenador(op);
							coordenador.listarFilaAlunos(findCoordenador);
							Aluno findAluno = coordenador.realizarAtendimentoAluno(findCoordenador);
							findCoordenador.removeFilaAluno(findAluno);
							coordenador.listarFilaAlunos(findCoordenador);
							break;
						}
						default:
							System.out.println("Opção incorreta!!!");
							System.out.println("Informe um valor entre 1 e 7");;
						}
					}while(op != 7);
				}
				default:
					System.out.println("Opção incorreta!!!");
					System.out.println("Informe um valor entre 1 e 7");;
				}
				
			}
			
		}while(op != 5);
		
		
		
		sc.close();

	}

}
