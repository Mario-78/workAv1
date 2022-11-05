package workAv1;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import anotations.Colaboradores;
import exceptions.ErroOpcaoException;
import javax.swing.JFrame;
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
import workAv1_recursosHumanos.Fila;
import workAv1_recursosHumanos.Gerente;
import workAv1_recursosHumanos.Pessoa;
import workAv1_recursosHumanos.Presidente;
import workAv1_recursosHumanos.Professor;
import workAv1_recursosHumanos.SecAcademica;
import workAv1_recursosHumanos.SecFinanceira;

public class Main extends javax.swing.JFrame{
	@Colaboradores(
			colaboradores = {"Glï¿½ria Assunï¿½ï¿½o Sousa, Mï¿½rio Josï¿½ de Sousa"},
			versao = "0.1"
)
        public Main() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
        
        @SuppressWarnings("unchecked")
	
	public static void main(String[] args) throws ErroOpcaoException, Exception, IOException{
            
            java.awt.EventQueue.invokeLater(() -> {
                new Main().setVisible(true);
            });
		
		Integer op = 0, idPessoa = 0, idAgencia = 0, matri = 100, idDis = 0, idCurso = 0, idEmpresa = 0, idConta = 0, flag = 0;
		
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
		Fila<Pessoa> fila = new Fila<Pessoa>();

						
		Aluno aluno0 = new Aluno(++idPessoa, "Joï¿½o Marcos", "154.894.230-80", ++matri);
		Aluno aluno1 = new Aluno(++idPessoa, "Antonio Pereira Silva", "950.725.740-32", ++matri);
		Aluno aluno2 = new Aluno(++idPessoa, "Claudio Jose Martins", "717.237.410-00", ++matri);
		Aluno aluno3 = new Aluno(++idPessoa, "Andrï¿½ Macedo Morais", "595.995.410-90", ++matri);
		Aluno aluno4 = new Aluno(++idPessoa, "Claudia Regina Costa", "318.252.280-94", ++matri);
		Aluno aluno5 = new Aluno(++idPessoa, "Isis Giovanna Cristiane da Rosa", "564.441.690-97", ++matri);
		Aluno aluno6 = new Aluno(++idPessoa, "Debora Ayla Kua Moraes", "084.946.250-98", ++matri);
		Aluno aluno7 = new Aluno(++idPessoa, "Luisa Teresinha Bernardes", "661.730.890-50", ++matri);
		Aluno aluno8 = new Aluno(++idPessoa, "Murilo Lucca Ian Assis", "885.393.330-58", ++matri);
		Aluno aluno9 = new Aluno(++idPessoa, "Jennifer Fï¿½tima de Paula", "954.961.020-90", ++matri);
		
		Professor professor0 = new Professor(++idPessoa, "Catarina Mariah Ana Silva", "528.046.620-47", "professor");
		Professor professor1 = new Professor(++idPessoa, "Sebastiï¿½o Mï¿½rcio Carlos da Mota", "347.269.760-10", "professor");
		Professor professor2 = new Professor(++idPessoa, "Thales Joaquim Freitas", "604.902.050-70", "professor");
		Professor professor3 = new Professor(++idPessoa, "Mateus Manoel da Rocha", "407.334.973-22", "professor");
		
		//professor0.getFila().addFila(aluno8);professor0.getFila().addFila(aluno5);professor0.getFila().addFila(aluno3);
		
		
		
		Coordenador coordenador0 = new Coordenador(++idPessoa, "Arthur Jorge Fogaï¿½a", "056.308.323-95", "coordenador");
		Coordenador coordenador1 = new Coordenador(++idPessoa, "Alessandra Luana Cecï¿½lia Baptista", "135.766.013-84", "coordenador");
		
		/*coordenador0.addFilaAluno(aluno5);coordenador0.addFilaAluno(aluno2);coordenador0.addFilaAluno(aluno7);
		coordenador0.addFilaProfessor(professor3);coordenador0.addFilaProfessor(professor0);coordenador1.addFilaAluno(aluno5);
		coordenador1.addFilaAluno(aluno1);coordenador1.addFilaProfessor(professor0);coordenador1.addFilaProfessor(professor2);coordenador1.addFilaProfessor(professor3);*/
		
		
		SecAcademica secAcademica0 = new SecAcademica(++idPessoa, "Anderson Fï¿½bio Mï¿½rio Santos", "596.002.023-89", "secretario academico");
		SecAcademica secAcademica1 = new SecAcademica(++idPessoa, "Elisa Olivia Juliana Melo", "775.919.453-60", "secretaria academica");
		
		SecFinanceira secFinanceira0 = new SecFinanceira(++idPessoa, "Bryan Bento Henrique Gonï¿½alves", "847.708.383-52", "secretario academico");
		SecFinanceira secFinanceira1 = new SecFinanceira(++idPessoa, "Vitï¿½ria Eduarda dos Santos", "424.361.063-04", "secretaria academica");
		
		Diretor diretor0 = new Diretor(++idPessoa, "Rafael Anthony Nicolas Peixoto", "177.985.974-09", "Diretor(a)");
		Diretor diretor1 = new Diretor(++idPessoa, "Sarah Isabelle da Costa", "256.443.233-66", "Diretor(a)");
		
		Presidente presidente0 = new Presidente(++idPessoa, "Renata Mariana Isadora da Cruz", "935.180.683-93|", "Presidente");
		Presidente presidente1 = new Presidente(++idPessoa, "Elisa Olivia dos Santos", "155.443.233-93|", "Presidente");
		empresa.addPresidente(presidente0);empresa.addPresidente(presidente1);
		
		Curso curso0 = new Curso(++idCurso, "Ciï¿½ncia da Computaï¿½ï¿½o", coordenador0.getId());
		Curso curso1 = new Curso(++idCurso, "Medicina", coordenador1.getId());
		
		Disciplina disciplina0 = new Disciplina(++idDis, curso0.getId(), "Programaï¿½ï¿½o", professor2.getId());
		Disciplina disciplina1 = new Disciplina(++idDis, curso0.getId(), "Banco de Dados", professor2.getId());
		Disciplina disciplina2 = new Disciplina(++idDis, curso0.getId(), "Seguranï¿½a da Informaï¿½ï¿½o", professor0.getId());
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
		
		Gerente gerente0 = new Gerente(++idPessoa, "Patrï¿½cia Larissa Rosï¿½ngela Barros", "155.284.013-13", "gerente", agencia.getId());
		Agencia agencia0 = new Agencia(banco0.getId(),banco0.getName(), banco0.getCnpj(), ++idAgencia, "Centro", gerente0.getId());
		
		Gerente gerente1 = new Gerente(++idPessoa, "Danilo Alexandre Marcos Viana", "785.738.333-35", "gerente", agencia.getId());
		Agencia agencia1 = new Agencia(banco0.getId(), banco0.getName(), banco0.getCnpj(), ++idAgencia, "Dirceu", gerente1.getId());
		
		empresa.addListaBanco(banco0);
		banco0.addListaGerente(gerente1);banco0.addListaGerente(gerente0);
		banco0.addListaAgencia(agencia1);banco0.addListaAgencia(agencia0);
		
		Faculdade faculdade0 = new Faculdade(++idEmpresa, "Estï¿½cio", "66.859.821/0001-96", diretor0.getId());
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
		
		secFinanceira0.getFilaPessoas().addFila(professor3);secFinanceira0.getFilaPessoas().addFila(gerente1);
		
		
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
			
			Scanner sc = new Scanner(System.in);
			
			try {
				flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
						+ "\n01 Para consultar/criar dados da faculdade: "
						+ "\n02 Para consultar/criar dados do banco"
						+ "\n00 Para sair do app: "));
				

				if(flag < 0 || flag > 2) {
					throw new ErroOpcaoException(0, 2);
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			op = flag;
			switch (op) {
			
			case 0: {
				break;
			}
			//FACULDADE
			case 1: {
				do {
					try {
						flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
								+ "\n01 Para cadastrar e consultar dados de uma faculdade: "
								+ "\n02 Para cadastrar e consultar dados de uma disciplina: "
								+ "\n03 Para cadastrar e consultar dados de um curso: "
								+ "\n04 Para cadastrar e consultar dados de um aluno: "
								+ "\n05 Para cadastrar e consultar dados de um professor: "
								+ "\n06 Para cadastrar e consultar dados de um coordenador: "
								+ "\n07 Para cadastrar e consultar dados de um secretï¿½rio(a) academico(a): "
								+ "\n08 Para cadastrar e consultar dados de um secretï¿½rio financeiro(a): "
								+ "\n09 Para cadastrar e consultar dados de um diretor(a): "
								+ "\n00 Para retornar ao menu anterior: "));
						
						if(flag < 0 || flag > 9) {
							throw new ErroOpcaoException(0, 9);
						}
						
				
					}catch (Exception e) {
						e.printStackTrace();
					}
					
					op = flag;
					switch (op) {
					case 0: {
						break;
					}
					case 1: {
						do {
							
							try {
								flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
										+ "\n01 Para cadastrar uma faculdade: "
										+ "\n02 Para consultar, alterar ou excluir dados de uma faculdade: "
										+ "\n00 Para retornar ao menu anterior: "));
								
								if(flag < 0 || flag > 2) {
									throw new ErroOpcaoException(0, 2);
								}
								
							}catch (Exception e) {
								e.printStackTrace();
							}
							
							op = flag;
							switch (op) {
							//Cadastrar faculdade
							case 1: {
																
								do {
									
									System.out.print("\nInforme o nome da faculdade: ");
									String name = sc.nextLine();
									
									System.out.print("\nInforme o cnpj: ");
									String cnpj = sc.nextLine();
									
									Faculdade newFaculdade = new Faculdade(++idEmpresa, name, cnpj, diretor.getId());
									empresa.addListaFaculdade(newFaculdade);
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
												+ "\n01 Para cadastrar outra faculdade: "
												+ "\n00 Para retornar ao menu anterior: "));
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.printStackTrace();
									}
									
								}while(flag != 0);
								flag = 1;
								break;
							}
							//Consultar dados de uma faculdade
							case 2: {
																
								empresa.listarFaculdades();
								
								System.out.print("\nInforme o id da faculdade para listar seus dados: ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
																
								faculdade.listarDadosFaculdade(findFaculdade);
								
								faculdade.listarCursos(findFaculdade);
								
								do {
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
												+ "\n\nNome da faculdade:  " + findFaculdade.getName()
												+ "\n" 
												+ "\n01 Para listar as contas bancárias da faculdade: "	+ findFaculdade.getName()
												+ "\n02 Para cadastrar uma conta bancária para faculdade: " + findFaculdade.getName()
												+ "\n03 Para listar os professores da faculdade: " + findFaculdade.getName()											
												+ "\n00 Para retornar ao menu anterior: "));
										
										if(flag < 0 || flag > 3) {
											throw new ErroOpcaoException(0, 3);
										}
										
									}catch (Exception e) {
										e.printStackTrace();
									}
									
									op = flag;
									switch (op) {
									//Listar as contas bancárias de uma faculdade
									case 1: {
										
										faculdade.listarContasBancarias(findFaculdade);
										
										break;
									}
									//Criar conta bancária da faculdade
									case 2: {
										
										do {  
											
											empresa.listarBancos();
											
											System.out.print("\n\nInforme o id do banco: ");
											op = sc.nextInt();
											Banco findBanco = empresa.findBanco(op);
											
											banco.listarAgencias(findBanco);
											System.out.print("Informe o id da agência: ");
											op = sc.nextInt();
											Agencia findAgencia = banco.findAgencia(op, findBanco);
											
											try {
												op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
														+ "\n\nNome da faculdade:  " + findFaculdade.getName()
														+ "\n\n01 Para cadastrar uma conta corrente: "
														+ "\n02 Para cadastrar uma conta poupança: "
														+ "\n00 Para retornar ao menu anterior: "));
												
												if(flag < 0 || flag > 2) {
													throw new ErroOpcaoException(0, 2);
												}
												
											}catch (Exception e) {
												e.printStackTrace();
											}
											
											System.out.println("\n\nLista antes da criação da conta");
											faculdade.listarContasBancarias(findFaculdade);
											if(op == 1) {
												ContaCorrente newContaCorrente = new ContaCorrente(++idConta, findFaculdade.getId(), findAgencia.getIdGerente(), null);
												findFaculdade.addContaCorrente(newContaCorrente	);
											}
											else if(op == 2){
												ContaPoupanca newContaPoupanca = new ContaPoupanca(++idConta, findFaculdade.getId(), findAgencia.getIdGerente());
												findFaculdade.addContaPoupanca(newContaPoupanca);
											}
											
											System.out.println("\n\nLista depois da criação da conta");
											faculdade.listarContasBancarias(findFaculdade);
											
											try {
												flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
														+ "\n\nNome do banco: " + findBanco.getName()
														+ "\nNome da agência: " + findAgencia.getName()
														+ "\nNome do cliente: " + findFaculdade.getName()
														+ "\n01 Para criar outra conta"
														+ "\n00 Para retornar ao menu anterior"));	
												
												if(flag < 0 || flag > 1) {
													throw new ErroOpcaoException(0, 1);
												}
												
											}catch (Exception e) {
												e.printStackTrace();
											}
											
										}while(flag != 0);
										flag = 1;
										break;
									}
									//Listar os professores da faculdade
									case 3: {
										
										faculdade.listarProfessores(findFaculdade);	
										
										break;
									}
									default:
										if(op != 0) {
											System.out.println("\nOpção inválida!!!!");
										}
									}
									
								}while(flag != 0);
								flag = 1;
								break;
							}

							default:
								if(op != 0) {
									System.out.println("\nOpção inválida!!!!");
								}
							}
			
						}while(flag != 0);
						//Flag de controle de fluxo da aplicação
						flag = 1;
						break;
					}
					//DISCIPLINA
					case 2: {	
												
						do {
							try {
								flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
										+ "\n01 Para cadastrar uma disciplina: "
										+ "\n02 Para consultar, alterar ou excluir de uma disciplina: "
										+ "\n00 Para retornar ao menu anterior: "));
								
								if(flag < 0 || flag > 2) {
									throw new ErroOpcaoException(0, 2);
								}
							}catch (Exception e) {
								e.printStackTrace();
							}
							
							op = flag;
							switch (op) {
							//Cadastrar uma disciplina
							case 1: {
								
								empresa.listarFaculdades();
								System.out.print("\nInforme o id da faculdade: ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								do {
									
									faculdade.listarProfessores(findFaculdade);
									System.out.print("\nInforme o id do professor para ministrar a disciplina: ");
									op = sc.nextInt();
		 							Professor findProfessor = faculdade.findProfessor(op, findFaculdade);
									
									faculdade.listarCursos(findFaculdade);
									System.out.print("\nInforme o id do curso para inclusão da disciplina em sua grade: ");
									op = sc.nextInt();
									Curso findCurso = faculdade.findCurso(op, findFaculdade);
									
									System.out.print("\nInforme o nome da disciplina: ");
									sc.nextLine();
									String name = sc.nextLine();
									
									System.out.print("\nDisciplinas disponï¿½veis no curso antes da inclusão: ");
									curso.listarDisciplinas(findCurso);
									
									Disciplina newDisciplina = new Disciplina(++idDis, findCurso.getId(), name, findProfessor.getId());
									findCurso.addDisciplina(newDisciplina);
									findFaculdade.addListaDisciplina(newDisciplina);
									
									System.out.println("\nDisciplinas disponíveis no curso depois da inclusão: ");
									curso.listarDisciplinas(findCurso);
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
												+ "\n\nNome da faculdade:  " + findFaculdade.getName()
												+ "\n\n01 Para cadastar dados de outra disciplina"
												+ "\n00 Para retornar ao menu anterior"));
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.printStackTrace();
									}
									
								}while(flag != 0);
								
								break;
							}
							//Consultar, alterar ou excluir os dados das diciplinas de uma faculdade
							case 2: {
																								
								empresa.listarFaculdades();
								System.out.print("Informe o id da faculdade para listar as disciplnas ofertadas: ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								faculdade.listarDisciplinas(findFaculdade);
								
								do {
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
												+ "\n\nNome da faculdade:  " + findFaculdade.getName()
												+ "\n\n01 Para listar as disciplinas de um curso e listar seus dados: "
												+ "\n00 Para retornar ao menu anterior : "));
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.printStackTrace();
									}
									
									//Listar disciplinas de um curso específico
									op =flag;
									if(op == 1) {
										
										faculdade.listarCursos(findFaculdade);
										
										
										System.out.print("\nInforme o id do curso para listar as disciplinas que o compõem: ");
										op = sc.nextInt();
										Curso findCurso = faculdade.findCurso(op, findFaculdade);
										
										do {
											
											curso.listarDisciplinas(findCurso);
											
											try {
												flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
														+ "\n\nNome da faculdade:  " + findFaculdade.getName()
														+ "\nNome do curso:        " + findCurso.getName()
														+ "\n\n01 Para listar os dados das disciplinas deste curso: "
														+ "\n00 Para retornar ao menu anterior : "));
												
												if(flag < 0 || flag > 1) {
													throw new ErroOpcaoException(0, 1);
												}
											}catch (Exception e) {
												e.printStackTrace();
											}
											
											
											//Consultar os dados de uma disciplina específica
											op = flag;
											if(op == 1) {
																						
												System.out.print("\nInforme o id da disciplina para listar os alunos matriculados: ");
												op = sc.nextInt();
												Disciplina findDisciplina = curso.findDisciplina(op, findCurso);
												Professor findProfessor = faculdade.findProfessor(findDisciplina.getIdProfessor(), findFaculdade);
												
												disciplina.listarDadosDiscilina(findDisciplina, findCurso, findProfessor, findFaculdade);
												disciplina.listarAlunos(findDisciplina);	
												
												do {
													
													try {
														flag= Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
																+ "\n\nNome da faculdade:  " + findFaculdade.getName()
																+ "\nNome do curso:        " + findCurso.getName()
																+ "\nNome da disciplina    " + findDisciplina.getName()
																+ "\n\n01 Para excluir esta disciplina do curso: "
																+ "\n02 Para execuir um aluno desta disciplina"
																+ "\n00 Para retornar ao menu anterior: "));
														
														if(flag < 0 || flag > 2) {
															throw new ErroOpcaoException(0, 2);
														}
													}catch (Exception e) {
														e.printStackTrace();
													}
													
													op = flag;
													switch (op) {
													//Excluir uma disciplina
													case 1: {
														System.out.println("\nAntes da exclusão: ");
														curso.listarDisciplinas(findCurso);		
														
														System.out.print("\nInforme 01 para confirmar a exclusão: ");
														op = sc.nextInt();
														if(op == 1) {
															curso.removeDisciplina(findDisciplina);
														}
														
														System.out.println("\nDepois da exclusão: ");
														curso.listarDisciplinas(findCurso);	
														op = 0;
														break;
													}
													//Excluir um aluno desta disciplina
													case 2: {
														
														System.out.println("\nAntes da exclusão: ");
														disciplina.listarAlunos(findDisciplina);
														
														System.out.print("\nInforme o id do aluno a ser excluído: ");
														op = sc.nextInt();
														Aluno findAluno = disciplina.findAluno(op, findDisciplina);
												
														System.out.print("\nInforme 01 para confirmar a exclusão: ");
														op = sc.nextInt();
														if(op == 1) {
															findDisciplina.removeListaAluno(findAluno);	
														}
														System.out.println("\nDepois da exclusão: ");
														disciplina.listarAlunos(findDisciplina);
														op = 0;
														break;
													}
													
													default:
														
														if(op != 0) { System.out.println("\nRepita a operação!"); }
														 
													}
																																							
												}while(flag != 0);
												flag = 1;
											}
										
										}while(flag != 0);
										flag = 1;
									}
									
								}while(flag != 0);
								flag = 1;					
								break;
							}
							default:
								if(op != 0) {
									System.out.println("\nRepita a operação!");
								}
							}
							op = 1;
						}while(flag != 0);
						flag = 1;
						break;
					}
					//CURSO
					case 3: {
					
						do {
							try {
								flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
										+ "\n01 Para cadastrar um curso: "
										+ "\n02 Para consultar, alterar ou excluir os dados de um curso: "
										+ "\n00 Para retornar ao menu anterior: "));
								
								if(flag < 0 || flag > 2) {
									throw new ErroOpcaoException(0, 2);
								}
							}catch (Exception e) {
								e.printStackTrace();
							}
							
							op = flag;
							switch (op) {
							//Cadastrar um curso
							case 1: {
								
								empresa.listarFaculdades();
								System.out.println("\nInforme o id da faculdade: ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								do {
									
									faculdade.listarCoordenadores(findFaculdade);
									System.out.print("\nInforme o id do coordenador do curso: ");
									op = sc.nextInt();
									Coordenador findCoordenador = faculdade.findCoordenador(op, findFaculdade);							
									
									System.out.println("\nCursos ofertados antes da inclusão: ");
									faculdade.listarCursos(findFaculdade);
									
									System.out.print("\nInforme o nome do curso: ");
									sc.nextLine();
									String name = sc.nextLine();
									
									Curso newCurso = new Curso(++idCurso, name, findCoordenador.getId());
									findFaculdade.addListaCurso(newCurso);
									
									System.out.println("\nCursos ofertados antes da inclusão: ");
									faculdade.listarCursos(findFaculdade);
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
												+ "\n\nNome da faculdade:  " + findFaculdade.getName()
												+ "\n\n01 Para cadastrar de outro curso"
												+ "\n00 Para retornar ao menu anterior"));	
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.printStackTrace();
									}
									
								}while(flag != 0);
								flag = 1;
								break;
							}
							//Consultar, alterar ou excluir os dados de um curso
							case 2: {	
								
								empresa.listarFaculdades();
								System.out.print("\nInforme o id da faculdade para listar os cursos: ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								faculdade.listarCursos(findFaculdade);
								
								do {
																											
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
												+ "\n\nNome da faculdade:  " + findFaculdade.getName()
												+ "\n\n01 Para excluir um curso: "
												+ "\n00 Para retornar ao menu anterior: "));
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.printStackTrace();
									}
									
									//Excluir curso
									op = flag;
									if(op == 1) {
										
										System.out.println("\nAntes da exclusão");
										faculdade.listarCursos(findFaculdade);
										
										System.out.print("\nInforme id do curso: ");
										op = sc.nextInt();
										Curso findCurso = faculdade.findCurso(op, findFaculdade);
										
										System.out.print("\nInforme 01 para confirmar a exclusão: ");
										op = sc.nextInt();
										if(op == 1) {
											findFaculdade.removeListaCurso(findCurso);
										}
										System.out.println("\nDepois da exclusão");
										faculdade.listarCursos(findFaculdade);
									}
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opção desejada: "
												+ "\n\nNome da faculdade:  " + findFaculdade.getName()
												+ "\n\n01 Para consultar dados de outro curso: "
												+ "\n00 Para retornar ao menu anterior: "));	
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.printStackTrace();
									}
									
		
									
								}while(flag != 0);
								flag = 1;
								break;
							}
							default:
								System.out.println("\nRepita a operação!");
							}
							
						}while(flag != 0);
						flag = 1;
						break;
					}
					//ALUNO
					case 4: {
						
						do {
							try {
								flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
										+ "\n01 Para cadastrar um aluno: "
										+ "\n02 Para consultar,alterar ou excluir dados de um aluno: "
										+ "\n00 Para retornar ao menu anterior: "));
								
								if(flag < 0 || flag > 2) {
									throw new ErroOpcaoException(0, 2);
								}
							}catch (Exception e) {
								e.printStackTrace();
							}
							
							op = flag;
							switch (op) {
							//Cadastrar aluno
							case 1: {
								
								do {
									
									Integer matricula = aluno.geraMatricula();
									
									empresa.listarFaculdades();
									System.out.print("\nInforme o id da faculdade: ");
									op = sc.nextInt();
									
									Faculdade findFaculdade = empresa.findFaculdade(op);
									
									faculdade.listarCursos(findFaculdade);
									System.out.print("\nInforme o id do curso:");
									op = sc.nextInt();
									
									Curso findCurso = faculdade.findCurso(op, findFaculdade);
									
									System.out.print("\nInforme o nome do aluno: ");
									String name = sc.nextLine();
									System.out.print("\nInforme o CPF: ");
									String cpf = sc.nextLine();
									
									Aluno newAluno = new Aluno(++idPessoa, name, cpf, matricula);
									
									do {
										try {
											flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
													+ "\n\nNome da faculdade:  " + findFaculdade.getName()
													+ "\nNome do curso:  " + findCurso.getName()
													+ "\n\n01 Para incluir disciplina: "
													+ "\n00 Para retornar ao menu anterior: "));
											
											if(flag < 0 || flag > 1) {
												throw new ErroOpcaoException(0, 1);
											}
										}catch (Exception e) {
											e.printStackTrace();
										}
										
										curso.listarDisciplinas(findCurso);									
																		
										System.out.print("Informe o id da disciplina: ");
										op = sc.nextInt();
										Disciplina findDisciplina = findCurso.findDisciplina(op, findCurso);
										
										findDisciplina.addListaAluno(newAluno);
										
									}while(flag != 0);
									flag = 1;
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
												+ "\n\nNome da faculdade:  " + findFaculdade.getName()
												+ "\nNome do curso:  " + findCurso.getName()
												+ "\n\n01 Para cadastrar outro aluno "
												+ "\n00 Para retornar ao menu anterior: "));
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.printStackTrace();
									}
									
								}while(flag != 0);
								flag = 1;
								break;
							}
							//Consultar, alterar ou excluir dados do aluno
							case 2: {
											
								empresa.listarFaculdades();
								System.out.print("Informe o id da faculdade: ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								do {									
																		
									faculdade.listarCursos(findFaculdade);
									System.out.println("\nPara listar os alunos de uma disciplina: ");									
									System.out.print("Informe o id do curso: ");
									op = sc.nextInt();
									Curso findCurso = faculdade.findCurso(op, findFaculdade);
									
									curso.listarDisciplinas(findCurso);
									System.out.print("Informe o id da disciplina: \n");
									op = sc.nextInt();
									Disciplina findDisciplina = curso.findDisciplina(op, findCurso);
									
									System.out.println("Disciplina:  " + findDisciplina.getName());
									disciplina.listarAlunos(findDisciplina);
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada "
												+ "\n\nNome da faculdade:  " + findFaculdade.getName()
												+ "\nNome do curso:  " + findCurso.getName()
												+ "\nNome da Disciplina:  " + findDisciplina.getName()
												+ "\n\n01 Para listar dados de um aluno especï¿½fico: "
												+ "\n00 Para retornar ao menu anterior"));
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.printStackTrace();
									}
									
									//Listando dados pessoais de um aluno 
									op = flag;
									if(op == 1) {							
																				
										System.out.print("Informe o id do aluno para listar os dados pessoais: ");
										op = sc.nextInt();
										Aluno findAluno = disciplina.findAluno(op, findDisciplina);
										
										aluno.listarDadosAluno(findAluno);
										
										do{
											
											try {
												flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "	
														+ "\n\nNome da faculdade:  " + findFaculdade.getName()
														+ "\nNome do curso:  " + findCurso.getName()
														+ "\nNome da Disciplina:  " + findDisciplina.getName()
														+ "\nNome do aluno(a): " + findAluno.getName()
														+ "\n\n01 Para imprimir informações financeiras do aluno: "
														+ "\n02 Para criar uma conta bancária para o aluno: "
														+ "\n03 Para solicitar atendimento do professor: "
														+ "\n04 Para solicitar atendimento do cooordenador: "
														+ "\n05 Para solicitar atendimento do secretï¿½rio(a) financeiro(a): "
														+ "\n06 Para solicitar atendimento do gerente de sua agência: "
														+ "\n07 Para excluir o cadastro de um aluno: "
														+ "\n00 Para retornar ao menu anterior: "));
												
												if(flag < 0 || flag > 7) {
													throw new ErroOpcaoException(0, 7);
												}
											}catch (Exception e) {
												e.printStackTrace();
											}
											
											//Listando informações financeiras de um aluno
											op = flag;
											switch (op) {
											
											case 1: {
																								
												aluno.listarContasAluno(findAluno);
												
												break;
											}
											//Criar conta bancária do aluno
											case 2: {
																							
												do {
													
													empresa.listarBancos();
													System.out.println("Informe o id do banco: \n");
													op = sc.nextInt();
													Banco findBanco = empresa.findBanco(op);
													
													banco.listarAgencias(findBanco);
													System.out.println("Informe o id da agência: \n");
													op = sc.nextInt();
													Agencia findAgencia = banco.findAgencia(op, findBanco);
													
													try {
														op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
																+ "\n\nNome do banco:  " + findBanco.getName()
																+ "\nNome da agência: " + findAgencia.getName()
																+ "\nNome do cliente: " + findAluno.getName()
																+ "\n\n01 Para cadastrar uma conta corrente: "
																+ "\n02 Para cadastrar uma conta poupança: "));	
														
														if(flag < 1 || flag > 2) {
															throw new ErroOpcaoException(1, 2);
														}
													}catch (Exception e) {
														e.printStackTrace();
													}
																						
													
													Integer id = ++idConta;
													if(op == 1) {
														ContaCorrente newContaCorrente = new ContaCorrente(id, findAluno.getId(), findAgencia.getIdGerente(), null);
														findAluno.addContaCorrente(newContaCorrente	);
													}else
													if(op == 2){
														ContaPoupanca newContaPoupanca = new ContaPoupanca(id, findAluno.getId(), findAgencia.getIdGerente());
														findAluno.addContaPoupanca(newContaPoupanca);
													}
													
													try {
														flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
																+ "\n\nNome do banco:  " + findBanco.getName()
																+ "\nNome da agência: " + findAgencia.getName()
																+ "\nNome do cliente: " + findAluno.getName()
																+ "\n\n01 Para criar outra conta"
																+ "\n00 Para retornar ao menu anterior"));	
														
														if(flag < 0 || flag > 1) {
															throw new ErroOpcaoException(0, 1);
														}
													}catch (Exception e) {
														e.printStackTrace();
													}
													
												}while(flag != 0);
												flag = 1;
												break;
											}
											//Solicitar atendimento de um professor
											case 3: {
												
												faculdade.listarProfessores(findFaculdade);
												
												System.out.print("\nInforme o id do professor do qual deseja atendimento: ");
												op = sc.nextInt();
												Professor findProfessor = faculdade.findProfessor(op, findFaculdade);
												
												//List<Pessoa> findList = fila.findListaAlunosProfessor(findProfessor);
												
												System.out.println("\nFila de alunos aguardando atendimento antes da solicitaï¿½ï¿½o: ");
												//professor.getFilaAlunos().listarFila(findList);	
												fila.listarFilaProfessor(findProfessor);
												
												List<Pessoa> findList = findProfessor.getFilaAlunos().getFila();
												findList.add(findAluno);
												
												System.out.println("\nFila de alunos aguardando atendimento depois da solicitaï¿½ï¿½o: ");
												fila.listarFilaProfessor(findProfessor);
												
												break;
											}
											//Solicitar atendimento do(a) coordenador(a)
											case 4: {
												
												faculdade.listarCoordenadores(findFaculdade);
												
												System.out.print("\nInforme o id do(a) coordenador(a) do(a) qual deseja atendimento: ");
												op = sc.nextInt();
												Coordenador findCoordenador = faculdade.findCoordenador(op, findFaculdade);
												
												//List<Pessoa> findList = fila.findListaAlunosCoordenador(findCoordenador);
												
												System.out.println("\nFila de alunos aguardando atendimento antes da solicitaï¿½ï¿½o: ");
												//coordenador.getFilaAlunos().listarFila(findList);
												fila.listarFilaCoordenadorA(findCoordenador);
												
												List<Pessoa> findList = findCoordenador.getFilaAlunos().getFila();
												findList.add(findAluno);
												
												System.out.println("\nFila de alunos aguardando atendimento depois da solicitaï¿½ï¿½o: ");
												fila.listarFilaCoordenadorA(findCoordenador);
												
												
												break;
											}
											//Solicitar atendimento do secretï¿½rio(a) financeiro(a)
											case 5: {
												
												faculdade.listarSecFinanceiras(findFaculdade);
												System.out.print("\nInforme o id do secretï¿½rio(a) financeiro(a) do qual deseja atendimento: ");
												op = sc.nextInt();												
												SecFinanceira findSecFinanceira = faculdade.findSecFinanceira(op, findFaculdade);
												
												//List<Pessoa> findList = fila.findListPessoasSecFinancira(findSecFinanceira);
												
												System.out.println("\nFila de alunos aguardando atendimento antes da solicitaï¿½ï¿½o: ");
												fila.listarFilaSecFinanceira(findSecFinanceira);
												
												List<Pessoa> findList = findSecFinanceira.getFilaPessoas().getFila();
												findList.add(findAluno);
												
												System.out.println("\nFila de alunos aguardando atendimento depois da solicitaï¿½ï¿½o: ");
												fila.listarFilaSecFinanceira(findSecFinanceira);
												
												break;
											}
											//Solicitar atendimento do gerente de sua agência
											case 6: {
												
												empresa.listarBancos();
												System.out.print("\nInforme o id do banco: ");
												op = sc.nextInt();
												Banco FindBanco = empresa.findBanco(op);
												
												banco.listarGerentes(FindBanco);
												
												System.out.print("\nInforme o id do gerente do qual deseja atendimento: ");
												op = sc.nextInt();
												Gerente findGerente = banco.findGerente(op, FindBanco);
												
												//List<Pessoa> findList = fila.findListPessoasGrente(findGerente);											
																								
												System.out.println("\nFila de alunos aguardando atendimento antes da solicitaï¿½ï¿½o: ");
												fila.listarFilaGerente(findGerente);
												
												List<Pessoa> findList = findGerente.getFilaPessoas().getFila();
												findList.add(findAluno);
												
												System.out.println("\nFila de alunos aguardando atendimento depois da solicitaï¿½ï¿½o: ");
												fila.listarFilaGerente(findGerente);
												
												break;
											}
											//Excluir os dados do aluno
											case 7: {												
												
												System.out.print("Informe o id do aluno para exclusão de cadastro: ");
												op = sc.nextInt();
												findAluno = disciplina.findAluno(op, findDisciplina);
												aluno.listarDadosAluno(findAluno);
												System.out.print("Informe 01 para confirmar a exclusão ");
												op = sc.nextInt();
												if(op == 1) {
													disciplina.removeListaAluno(findAluno);	
												}
												
												op = 0;
												break;
											}
											default:
												System.out.println("\nRepita a operação!");
											}											
											
										}while(flag != 0);
										flag = 1;
									}								
																	
									break;
									
								}while(flag != 0);
								flag = 1;
							}
							
							default:
								System.out.println("\nRepita a operação!");
							}
							
						}while(flag != 0);
						flag = 1;
						break;
					}
					//PROFESSOR
					case 5: {
						
						do {
														
							try {
								flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
										+ "\n01 Para cadastrar um professor "
										+ "\n02 Para consultar, alterar ou excluir dados de um professor "
										+ "\n00 Para retornar ao menu anterior "));
								
								if(flag < 0 || flag > 2) {
									throw new ErroOpcaoException(0, 2);
								}
								
							}catch (Exception e) {
								e.printStackTrace();
							}
							
							
							op = flag;
							switch (op) {
							//Cadastrar profassor
							case 1: {
																				
								do {
									
									empresa.listarFaculdades();
									System.out.print("Informe id da faculdade onde o professor serï¿½ cadastrado: ");
									op = sc.nextInt();
									Faculdade findFaculdade = empresa.findFaculdade(op);
									
									System.out.print("Informe o nome do professor: ");
									sc.nextLine();
									String name = sc.nextLine();
									
									System.out.print("Informe o CPF: ");
									sc.nextLine();
									String cpf = sc.nextLine();
									
									String funcao = "Professor";
									
									Professor newProfessor = new Professor(++idPessoa, name, cpf, funcao);
									findFaculdade.addProfessor(newProfessor);
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
												+ "\n\nNome da faculdade:  " + findFaculdade.getName()
												+ "\n\n01 Para cadastrar outro(a) frofessor(a) "
												+ "\n00 Para retornar ao menu anterior: "));
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.printStackTrace();
									}
									
								}while(flag != 0);
								
								break;
							}
							//Consultar, alterar ou excluir dados de um professor
							case 2: {
																
								do {
									
									empresa.listarFaculdades();
									System.out.print("\nInforme id da faculdade onde o professor ï¿½ cadastrado: ");
									op = sc.nextInt();
									Faculdade findFaculdade = empresa.findFaculdade(op);
									
									faculdade.listarProfessores(findFaculdade);									
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
												+ "\n\nNome da faculdade:  " + findFaculdade.getName()
												+ "\n\n01 Para listar dados de um professor especï¿½fico: "
												+ "\n00 Para retornar ao menu anterior \n"));
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.printStackTrace();
									}										
									
									//Listar dados pessoais do professor
									op = flag;
									if(op == 1) {
										
										System.out.print("\nInforme id do professor para listar os dados pessoais: ");
										op = sc.nextInt();
										Professor findProfessor = faculdade.findProfessor(op, findFaculdade);
										
										professor.listarDadosProfessor(findProfessor);
										
										do {
											
											try {
												flag = Integer.parseInt(JOptionPane.showInputDialog("Informe a opcão desejada: "
														+ "\n\nNome da faculdade:  " + findFaculdade.getName()
														+ "\nNome do professor: " + findProfessor.getName()
														+ "\n\n01 Para listar dados financeiros do professor: "
														+ "\n02 Para criar uma conta bancária para o professor: "
														+ "\n03 Para solicitar atendimento ao coordenador: "
														+ "\n04 Para solicitar atendimento do secretï¿½rio(a) financeiro(a): "
														+ "\n05 Para solicitar atendimento do gerente de sua agência: "
														+ "\n06 Para listar a fila de alunos aguardando atendimento e atender alunos: "
														+ "\n07 Para excluir os dados do professor: "
														+ "\n00 Para ir ao próximo menu: "));
												
												if(flag < 0 || flag > 7) {
													throw new ErroOpcaoException(0, 7);
												}
											}catch (Exception e) {
												e.printStackTrace();
											}
											
											
											op = flag;
											switch (op) {
											//Listar dados financeiros do professor
											case 1: {
												
												professor.listarContasProfessor(findProfessor);
												
												break;
											}
											//Criar uma conta bancária para o professor
											case 2: {
												
												do {
													
													empresa.listarBancos();
													System.out.print("Informe o id do banco: ");
													op = sc.nextInt();
													Banco findBanco = empresa.findBanco(op);
													
													banco.listarAgencias(findBanco);
													System.out.print("Informe o id da agência: ");
													op = sc.nextInt();
													Agencia findAgencia = banco.findAgencia(op, findBanco);
													
													try {
														op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
																+ "\n\nNome do banco: " + findBanco.getName()
																+ "\nNome da agência: " + findAgencia.getNameAgencia()
																+ "\nNome do cliente: " + findProfessor.getName()
																+ "01 Para cadastrar uma conta corrente: "
																+ "02 Para cadastrar uma conta poupança: "));
														
														if(flag < 1 || flag > 2) {
															throw new ErroOpcaoException(1, 2);
														}
													}catch (Exception e) {
														e.printStackTrace();
													}
																							
													
													Integer id = ++idConta;
													if(op == 1) {
														ContaCorrente newContaCorrente = new ContaCorrente(id, findProfessor.getId(), findAgencia.getIdGerente(), null);
														findProfessor.addContaCorrente(newContaCorrente	);
													}else
													if(op == 2){
														ContaPoupanca newContaPoupanca = new ContaPoupanca(id, findProfessor.getId(), findAgencia.getIdGerente());
														findProfessor.addContaPoupanca(newContaPoupanca);
													}
													
													try {
														flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
																+ "\n01 Para criar outra conta: "
																+ "\n00 Para retornar ao menu anterior: "));
														
														if(flag < 0 || flag > 1) {
															throw new ErroOpcaoException(0, 1);
														}
													}catch (Exception e) {
														e.printStackTrace();
													}
													
												}while(flag != 0);
												flag = 1;
												break;
											}
											//Solicitar atendimento ao coordenador
											case 3: {
												
												faculdade.listarCoordenadores(findFaculdade);
												System.out.print("\nInforme o id do coordendor: ");
												op = sc.nextInt();
												Coordenador findCoordenador = faculdade.findCoordenador(op, findFaculdade);
												
												//List<Pessoa> findList = fila.findListaProfessoresCoordenador(findCoordenador);  
												
												System.out.println("\nAntes da solicitaï¿½ï¿½o:");
												//coordenador.getFilaProfessores().listarFila(findList);
												fila.listarFilaCoordenadorP(findCoordenador);
												
												List<Pessoa> findList = findCoordenador.getFilaProfessores().getFila();
												findList.add(findProfessor);
												
												System.out.println("\nDepois da solicitaï¿½ï¿½o:");
												fila.listarFilaCoordenadorP(findCoordenador);
												
												break;
											}
											//Solicitar atendimento do secretï¿½rio(a) financeiro(a)
											case 4: {
												
												faculdade.listarSecFinanceiras(findFaculdade);
												System.out.print("\nInforme o id do secretï¿½rio(a) financeiro(a) do(a) qual deseja atendimento: ");
												op = sc.nextInt();												
												SecFinanceira findSecFinanceira = faculdade.findSecFinanceira(op, findFaculdade);
												
												//List<Pessoa> findList = fila.findListPessoasSecFinancira(findSecFinanceira);
												
												System.out.println("\nAntes da solicitaï¿½ï¿½o: ");
												//secFinanceiro.getFilaPessoas().listarFila(findList);
												fila.listarFilaSecFinanceira(findSecFinanceira);
												
												List<Pessoa> findList = findSecFinanceira.getFilaPessoas().getFila();
												findList.add(findProfessor);
												
												System.out.println("\nDepois da solicitaï¿½ï¿½o: ");
												fila.listarFilaSecFinanceira(findSecFinanceira);
												
												break;
											}
											//Solicitar atendimento do gerente de sua agência
											case 5: {
												
												empresa.listarBancos();
												System.out.print("\nInforme o id do banco: ");
												op = sc.nextInt();												
												Banco findBanco = empresa.findBanco(op);
												
												banco.listarGerentes(findBanco);
												
												System.out.print("\nInforme o id do gerente do(a) qual deseja atendimento: ");
												op = sc.nextInt();												
												Gerente findGerente = banco.findGerente(op, findBanco);
												
												//List<Pessoa> findList = fila.findListPessoasGrente(findGerente);
																								
												System.out.println("\nAntes da solicitaï¿½ï¿½o: ");
												//findGerente.getFilaPessoas().listarFila(findList);
												
												List<Pessoa> findList = findGerente.getFilaPessoas().getFila();
												findList.add(findProfessor);
												
												System.out.println("\nDepois da solicitaï¿½ï¿½o: ");
												fila.listarFilaGerente(findGerente);
												
												break;
											}
											//Listar a fila de alunos aguardando atendimento e atender alunos
											case 6: {
												
												//List<Pessoa> findList = professor.getFilaAlunos().findListaAlunosProfessor(findProfessor);
												
												System.out.println("\nFila de alunos aguardando antes do atendimento: ");
												//professor.getFilaAlunos().listarFila(findList);
												fila.listarFilaProfessor(findProfessor);
												
												do {
													
													try {
														flag = Integer.parseInt(JOptionPane.showInputDialog("Informe a opcão desejada: "
																+ "\n01 Para atender o aluno que estï¿½ ocupando a 1º posiï¿½ï¿½o na fila: "
																+ "\n00 Para ir ao próximo menu: "));
														
														if(flag < 0 || flag > 1) {
															throw new ErroOpcaoException(0, 1);
														}
													}catch (Exception e) {
														e.printStackTrace();
													}
													
													op = flag;
													if(op == 1) {
														List<Pessoa> findList = findProfessor.getFilaAlunos().getFila();
														for(Pessoa p : findList) {
															if(findList.indexOf(p) == 0) {
																Pessoa findAluno = p;
																findList.remove(p);
															}
														}													
																											
														System.out.println("\nFila de alunos aguardando depois do atendimento: ");
														fila.listarFilaProfessor(findProfessor);
														
													}
													
												}while(flag != 0);
												flag = 1;
												break;
											}
											//Excluir os dados do professor
											case 7: {
												
												System.out.print("Informe 01 para confirmar a exclusão ");
												op = sc.nextInt();
												if(op == 1) {
													faculdade.removeProfessor(findProfessor);	
												}
												
												op = 0;
												break;
											}
											default:
												System.out.println("\nRepita a operação!");
											}
											
											
											
										}while(flag != 0);
										flag = 1;
									}													
																	
								}while(flag != 0);
								flag = 1;
								break;
							}
							default:
								System.out.println("\nRepita a operação!");
							}
							
						}while(flag != 0);							
						flag = 1;
						break;
					}
					//COODENADOR
					case 6: {
						do {
							
							try {
								flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
										+ "\n01 Para cadastrar um coordenador(a) \n"
										+ "\n02 Para consultar, alterar ou excluir dados de um(a) coordenador(a): "
										+ "\n00 Para retornar ao menu anterior: "));
								
								if(flag < 0 || flag > 2) {
									throw new ErroOpcaoException(0, 2);
								}
							}catch (Exception e) {
								e.printStackTrace();
							}
							
							
							op = flag;
							switch (op) {
							//Cadastrar um(a) coordenador(a)
							case 1: {
								
								do {
									
									empresa.listarFaculdades();
									System.out.print("Informe o id da faculdade para cadastro do coordenador: ");
									op = sc.nextInt();
									Faculdade findFaculdade = empresa.findFaculdade(op);
									
									System.out.print("\nInforme o nome do(a) coordenador(a): ");
									sc.nextLine();
									String name = sc.nextLine();
									
									System.out.print("\nInforme o CPF: ");
									sc.nextLine();
									String cpf = sc.nextLine();
									String funcao = "Coordenador";
									
									Coordenador newCoordenador = new Coordenador(++idPessoa, name, cpf, funcao);
									findFaculdade.addListaCoordenador(newCoordenador);
									
									flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
											+ "\n01 Para cadastrar outro(a) coordenador(a): "
											+ "\n00 Para retornar ao menu anterior: "));
									
								}while(flag != 0);
								flag = 1;
								break;
							}
							//Consultar, alterar ou excluir dados de um coordenador
							case 2: {
								
								empresa.listarFaculdades();
								System.out.print("Informe id da faculdade onde o(a) coordenador(a) ï¿½ cadastrado: ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								faculdade.listarCoordenadores(findFaculdade);
								
								try {
									flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
											+ "\n\nNome da faculdade: " + findFaculdade.getName()
											+ "\n\n01 Para listar dados pessoais de um(a) coordenador(a): "
											+ "\n00 Para retornar ao menu anterior: "));
									
									if(flag < 0 || flag > 1) {
										throw new ErroOpcaoException(0, 1);
									}
								}catch (Exception e) {
									e.printStackTrace();
								}
								
								op = flag;
								if(op == 1) {
									
									System.out.print("\nInforme id do(a) coordenador(a) para listar os dados pessoais: ");
									op = sc.nextInt();
									Coordenador findCoordenador = faculdade.findCoordenador(op, findFaculdade);	
									
									coordenador.listarDadosCoordenador(findCoordenador);
									
									do {
										
										try {
											flag = Integer.parseInt(JOptionPane.showInputDialog("Informe a opcão desejada: "
													+ "\n\nNome da faculdade: " + findFaculdade.getName()
													+ "\nNome do coordendor: " + findCoordenador.getName()
													+ "\n\n01 Para listar dados financeiros do(a) coordenador(a): "
													+ "\n02 Para criar uma conta bancária para o(a) coordenador(a): "
													+ "\n03 Para solicitar atendimento ao diretor: "
													+ "\n04 Para solicitar atendimento do secretï¿½rio(a) financeiro(a): "
													+ "\n05 Para solicitar atendimento do gerente de sua agência: "
													+ "\n06 Para listar a fila de alunos aguardando atendimento e atender alunos: "
													+ "\n07 Para listar a fila de professores aguardando atendimento e atender professores: "
													+ "\n08 Para excluir os dados do(a) coordenador(a): "
													+ "\n00 Para retornar ao menu anterior: "));
											
											if(flag < 0 || flag > 8) {
												throw new ErroOpcaoException(0, 8);
											}
										}catch (Exception e) {
											e.printStackTrace();
										}
										
										
										op = flag;
										switch (op) {
										//Listar dados financeiros do(a) coordenador(a)
										case 1: {
											
											coordenador.listarContasCoordenador(findCoordenador);
											
											break;
										}
										//Criar uma conta bancária para o(a) coordenador(a)
										case 2: {
											
											do {
												
												empresa.listarBancos();
												System.out.print("Informe o id do banco: \n");
												op = sc.nextInt();
												Banco findBanco = empresa.findBanco(op);
												
												banco.listarAgencias(findBanco);
												System.out.print("Informe o id da agência: \n");
												op = sc.nextInt();
												Agencia findAgencia = banco.findAgencia(op, findBanco);
												
												try {
													op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
															+ "\n\nNome do banco: " + findBanco.getName()
															+ "\nNome da agência: " + findAgencia.getNameAgencia()
															+ "\nNome do cliente: " + findCoordenador.getName()
															+ "\n\n01 Para cadastrar uma conta corrente "
															+ "\n02 Para cadastrar uma conta poupança"
															+ "\n00 Para retornar ao menu anterior"));	
													
													if(flag < 0 || flag > 2) {
														throw new ErroOpcaoException(0, 2);
													}
												}catch (Exception e) {
													e.printStackTrace();
												}
																																													
												if(op == 1) {
													ContaCorrente newContaCorrente = new ContaCorrente(++idConta, findCoordenador.getId(), findAgencia.getIdGerente(), null);
													findCoordenador.addContaCorrente(newContaCorrente	);
												}else
												if(op == 2){
													ContaPoupanca newContaPoupanca = new ContaPoupanca(++idConta, findCoordenador.getId(), findAgencia.getIdGerente());
													findCoordenador.addContaPoupanca(newContaPoupanca);
												}
												
												try { 
													flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
															+ "\n01 Para criar outra conta"
															+ "\n00 Para retornar ao menu anterior"));	
													
													if(flag < 0 || flag > 1) {
														throw new ErroOpcaoException(0, 1);
													}
												}catch (Exception e) {
													e.printStackTrace();
												}
												
											}while(flag != 0);
											flag = 1;
											break;
										}
										//Solicitar atendimento ao diretor
										case 3: {
											
											faculdade.listarDiretores(findFaculdade);
											System.out.print("\nInforme o id do diretor: ");
											op = sc.nextInt();											
											Diretor findDiretor = faculdade.findDiretor(op, findFaculdade);
											
											//List<Pessoa> findList = fila.findListPessoasDiretor(findDiretor); 
											
											System.out.println("\nAntes da solicitaï¿½ï¿½o: ");
											//findDiretor.getFilaPessoas().listarFila(findList);
											fila.listarFilaDiretor(findDiretor);
											
											List<Pessoa> findList = findDiretor.getFilaCoordenadores().getFila();
											findList.add(findCoordenador);
											
											System.out.println("\nDepois da solicitaï¿½ï¿½o: ");											
											fila.listarFilaDiretor(findDiretor);
											
											break;
										}
										//Solicitar atendimento do secretï¿½rio(a) financeiro(a)
										case 4: {
											
											faculdade.listarSecFinanceiras(findFaculdade);
											System.out.print("\nInforme o id do(a) secretï¿½rio(a) financeiro(a) do(a) qual deseja atendimento: ");
											op = sc.nextInt();											
											SecFinanceira findSecFinanceira = faculdade.findSecFinanceira(op, findFaculdade);
											
											//List<Pessoa> findList = fila.findListPessoasSecFinancira(findSecFinanceira);
																					
											System.out.println("\nAntes da solicitaï¿½ï¿½o: ");
											//findSecFinanceira.getFilaPessoas().listarFila(findList);
											fila.listarFilaSecFinanceira(findSecFinanceira);
											
											List<Pessoa> findList = findSecFinanceira.getFilaPessoas().getFila();
											findList.add(findCoordenador);
											
											System.out.println("\nDepois da solicitaï¿½ï¿½o: ");
											fila.listarFilaSecFinanceira(findSecFinanceira);
											
											break;
										}
										//Solicitar atendimento do(a) gerente de sua agência
										case 5: {
											
											empresa.listarBancos();
											System.out.print("\nInforme o id do banco: ");
											op = sc.nextInt();
											
											Banco findBanco = empresa.findBanco(op);
											
											banco.listarGerentes(findBanco);
											System.out.print("\nInforme o id do(a) gerente do(a) qual deseja atendimento: ");
											op = sc.nextInt();											
											Gerente findGerente = banco.findGerente(op, findBanco);
											
											//List<Pessoa> findList = fila.findListPessoasGrente(findGerente);
											
											System.out.println("\nAntes da solicitaï¿½ï¿½o: ");
											//findGerente.getFilaPessoas().listarFila(findList);
											fila.listarFilaGerente(findGerente);
											
											List<Pessoa> findList = findGerente.getFilaPessoas().getFila();
											findList.add(findCoordenador);
											
											System.out.println("\nDepois da solicitaï¿½ï¿½o: ");
											fila.listarFilaGerente(findGerente);
											
											break;
										}										
										//Listar a fila de alunos aguardando atendimento e atender aluno(a)
										case 6: {
											
											//List<Pessoa> findList = fila.findListaAlunosCoordenador(findCoordenador);
											
											System.out.println("\nAntes do atendimento");
											//findCoordenador.getFilaAlunos().listarFila(findList);
											fila.listarFilaCoordenadorA(findCoordenador);
											
											do {
												
												try {
													flag = Integer.parseInt(JOptionPane.showInputDialog("Informe a opcão desejada: "
															+ "\n\nNome da faculdade: " + findFaculdade.getName()
															+ "\nNome do coordendor: " + findCoordenador.getName()
															+ "\n\n01 Para atender o aluno(a) que ocupa a 1º posiï¿½ï¿½o na fila: "
															+ "\n00 Para retonar ao menu anteror: "));
													
													if(flag < 0 || flag > 1) {
														throw new ErroOpcaoException(0, 1);
													}
												}catch (Exception e) {
													e.printStackTrace();
												}
												
												List<Pessoa> findList = findCoordenador.getFilaAlunos().getFila();
												
												op = flag;
												for(Pessoa p : findList) {
													if(findList.indexOf(p) == 0) {
														findList.remove(p);
													}
												}						
												
											}while(flag != 0);
											flag = 1;																																						
											break;
										}
										//Listar a fila de professores aguardando atendimento e atender professor
										case 7: {
											
											//List<Pessoa> findList = fila.findListaProfessoresCoordenador(findCoordenador);
											
											System.out.println("\nAntes do atendimento: ");
											//findCoordenador.getFilaProfessores().listarFila(findList);
											fila.listarFilaCoordenadorP(findCoordenador);
											
											do {
												
												try {
													flag = Integer.parseInt(JOptionPane.showInputDialog("Informe a opcão desejada: "
															+ "\n\nNome da faculdade: " + findFaculdade.getName()
															+ "\nNome do coordendor: " + findCoordenador.getName()
															+ "\n\n01 Para atender o(a) professor(a) que ocupa a 1º posiï¿½ï¿½o na fila: "
															+ "\n00 Para ir ao próximo menu: "));
													
													if(flag < 0 || flag > 1) {
														throw new ErroOpcaoException(0, 1);
													}
												}catch (Exception e) {
													e.printStackTrace();
												}
												
												List<Pessoa> findList = findCoordenador.getFilaAlunos().getFila();
												
												op = flag;
												if(op == 1) {
													for(Pessoa p : findList) {
														if(findList.indexOf(p) == 0) {
															findList.remove(p);
														}
													}
												}
												System.out.println("\nDepois do atendimento: ");
												fila.listarFilaCoordenadorP(findCoordenador);
												
											}while(flag != 0);
											flag = 1;
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
											System.out.println("\nRepita a operação!");
										}
										
									}while(flag != 0);
									flag = 1;
								}
																																							
								break;
							}
							default:
								System.out.println("\nRepita a operação!");
							}
							
						}while(flag !=  0);						
						flag = 1;
						break;
					}
					//SECRETï¿½RIO(A) ACADEMICO(A)
					case 7: {
						
						do {
							
							try {
								flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
										+ "\n01 Para cadastrar um(a) secretï¿½rio(a) academico(a): "
										+ "\n02 Para consultar, alterar ou excluir dados de um(a) secretï¿½rio(a) academico(a): "
										+ "\n00 Para retornar ao menu anterior: "));
								
								if(flag < 0 || flag > 2) {
									throw new ErroOpcaoException(0, 2);
								}
							}catch (Exception e) {
								e.printStackTrace();
							}
							
							op = flag;
							switch (op) {
							//Cadastrar um(a) secretï¿½rio(a) academico(a)
							case 1: {
								
								do {
									
									empresa.listarFaculdades();
									System.out.print("Informe o id da faculdade para cadastro do(a) secretï¿½rio(a) academico(a): ");
									op = sc.nextInt();
									Faculdade findFaculdade = empresa.findFaculdade(op);
									
									System.out.print("\nInforme o nome do(a) secretï¿½rio(a) academico(a): ");
									sc.nextLine();
									String name = sc.nextLine();
									
									System.out.print("\nInforme o CPF: ");
									sc.nextLine();
									String cfp = sc.nextLine();
									String funcao = "Secretï¿½rio(a) academico(a)";
									
									SecAcademica newSecAcademica = new SecAcademica(++idPessoa, name, cfp, funcao);
									findFaculdade.addListaSecAcademica(newSecAcademica);
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("Informe a opcão desejada: "
												+ "\n\nNome da faculdade: " + findFaculdade.getName()
												+ "\n\n01 Para cadastrar outro(a) secretï¿½rio(a) academico(a): "
												+ "\n00 Para retonar ao menu anteror: "));
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.printStackTrace();
									}
									
								}while(flag != 0);									
								flag = 1;
								break;
							}
							//Consultar, alterar ou excluir dados de um secretï¿½rio(a) academico(a)
							case 2: {
								
								do {
									
									empresa.listarFaculdades();
									System.out.print("\nInforme id da faculdade onde o(a) secretï¿½rio(a) academico(a) ï¿½ cadastrado: ");
									op = sc.nextInt();
									Faculdade findFaculdade = empresa.findFaculdade(op);
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("Informe a opcão desejada: "
												+ "\n\nNome da faculdade: " + findFaculdade.getName()
												+ "\n\n01 Para listar dados pessoais de um(a) secretï¿½rio(a) academico(a): "
												+ "\n00 Para ir ao próximo menu: "));
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.printStackTrace();
									}
									
									//Listar dados pessoais de um(a) secretï¿½rio(a) academico(a)
									op = flag;
									if(op == 1) {
										
										System.out.print("\nInforme id do(a) secretï¿½rio(a) academico(a) para listar os dados pessoais: ");
										op = sc.nextInt();
										
										SecAcademica findSecAcademica = faculdade.findSecAcademica(op, findFaculdade);
										secAcademica.listarDadosSecAcademica(findSecAcademica);																		
										
										do {
											
											try {
												flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
														+ "\n\nNome da faculdade: " + findFaculdade.getName()
														+ "\nNome do(a) secretï¿½rio(a) academico(a): " + findSecAcademica.getName()
														+ "\n\n01 Para listar dados financeiros do(a) secretï¿½rio(a) academico(a): "
														+ "\n02 Para criar uma conta bancária para o(a) secretï¿½rio(a) academico(a): "
														+ "\n03 Para listar a fila de alunos(as) aguardando atendimento e atender alunos(as): "
														+ "\n04 Para solicitar atendimento do secretï¿½rio(a) financeiro(a): "
														+ "\n05 Para solicitar atendimento do gerente de sua agência: "
														+ "\n06 Para excluir os dados do secretï¿½rio(a) academico(a): "
														+ "\n00 Para retornar ao menu anterior: "));
												
												if(flag < 0 || flag > 6) {
													throw new ErroOpcaoException(0, 6);
												}
											}catch (Exception e) {
												e.printStackTrace();
											}
											
											op = flag;
											switch (op) {
											//Listar dados financeiros do secretï¿½rio(a) academico(a)
											case 1: {
												
												secAcademica.listarContasSecAcad(findSecAcademica);
												
												break;
											}
											//Criar conta bancária para o secretï¿½rio(a) academico(a)
											case 2: {											

												do {
													
													empresa.listarBancos();
													System.out.print("Informe o id do banco: ");
													op = sc.nextInt();
													Banco findBanco = empresa.findBanco(op);
													
													banco.listarAgencias(findBanco);
													System.out.print("Informe o id da agência: ");
													op = sc.nextInt();
													Agencia findAgencia = banco.findAgencia(op, findBanco);
													
													try {

														op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
																+ "\n\nNome do banco: " + findBanco.getName()
																+ "\nNome da agência: " + findAgencia.getNameAgencia()
																+ "\nNome do cliente: " + findSecAcademica.getName()
																+ "\n\n01 Para cadastrar uma conta corrente: "
																+ "\n02 Para cadastrar uma conta poupança: "));	
														
														if(flag < 1 || flag > 2) {
															throw new ErroOpcaoException(1, 2);
														}
													}catch (Exception e) {
														e.printStackTrace();
													}
													
													Integer id = ++idConta;
													if(op == 1) {
														ContaCorrente newContaCorrente = new ContaCorrente(id, findSecAcademica.getId(), findAgencia.getIdGerente(), null);
														findSecAcademica.addContaCorrente(newContaCorrente	);
													}else
													if(op == 2){
														ContaPoupanca newContaPoupanca = new ContaPoupanca(id, findSecAcademica.getId(), findAgencia.getIdGerente());
														findSecAcademica.addContaPoupanca(newContaPoupanca);
													}
													
													try {
														flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
																+ "\n01 Para criar outra conta"
																+ "\n00 Para retornar ao menu anterior"));
														
														if(flag < 0 || flag > 1) {
															throw new ErroOpcaoException(0, 1);
														}
													}catch (Exception e) {
														e.printStackTrace();
													}
													
												}while(flag != 0);
												flag = 1;
												break;
											}
											//Listar a fila de alunos aguardando atendimento e atender alunos
											case 3: {
												
												//List<Pessoa> findList = fila.findListPessoasSecAcademica(findSecAcademica);
												
												System.out.println("\nAntes do atendimento");
												//fila.listarFila(findList);
												fila.listarFilaSecAcademica(findSecAcademica);
												
												do {
													
													System.out.println("\nAntes do atendimento: ");
													//fila.listarFila(findSecAcademica);
													fila.listarFilaSecAcademica(findSecAcademica);
													
													try {
														flag = Integer.parseInt(JOptionPane.showInputDialog("Informe a opcão desejada: "
																+ "\n\nNome da faculdade: " + findFaculdade.getName()
																+ "\nNome do(a) secretï¿½rio(a) academico(a): " + findSecAcademica.getName()
																+ "\n\n01 Para atender o(a) aluno(a) que ocupa o 1º na fila: "
																+ "\n00 Para ir ao próximo menu: "));
														
														if(flag < 0 || flag > 1) {
															throw new ErroOpcaoException(0, 1);
														}
													}catch (Exception e) {
														e.printStackTrace();
													}
													
													List<Pessoa> findList = findSecAcademica.getFilaAlunos().getFila();
													
													op = flag;
													if(op == 1) {
														for(Pessoa p : findList) {
															if(findList.indexOf(p) == 0) {
																findList.remove(p);
															}
														}
														
														System.out.println("\nDepois do atendimento: ");
														fila.listarFilaSecAcademica(findSecAcademica);
														
													}			
													
												}while(flag != 0);
												
												break;
											}
											//Solicitar atendimento ao secretï¿½rio(a) financeiro(a)
											case 4: {
												
												faculdade.listarSecFinanceiras(findFaculdade);
												System.out.print("\nInforme o id do secretï¿½rio(a) financeiro(a) do(a) qual deseja atendimento: ");
												op = sc.nextInt();
												
												SecFinanceira findSecFinanceira = faculdade.findSecFinanceira(op, findFaculdade);
												
												//List<Pessoa> findList = fila.findListPessoasSecFinancira(findSecFinanceira);
												
												System.out.println("\nAntes da solicitaï¿½ï¿½o: ");
												//findSecFinanceira.getFilaPessoas().listarFila(findList);
												fila.listarFilaSecFinanceira(findSecFinanceira);
												
												List<Pessoa> findList = findSecFinanceira.getFilaPessoas().getFila();
												findList.add(findSecAcademica);
												
												System.out.println("\nDepois da solicitaï¿½ï¿½o: ");
												fila.listarFilaSecFinanceira(findSecFinanceira);
												
												break;
											}
											//Solicitar atendimento ao gerente de sua agência
											case 5: {
												
												empresa.listarBancos();
												System.out.print("\nInforme o id do banco: ");
												op = sc.nextInt();
												
												Banco findBanco = empresa.findBanco(op);
												
												banco.listarGerentes(findBanco);
												System.out.print("\nInforme o id do gerente do(a) qual deseja atendimento: ");
												op = sc.nextInt();
												
												Gerente findGerente = banco.findGerente(op, findBanco);
												
												//List<Pessoa> findList = findGerente.getFilaPessoas().findListPessoasGrente(findGerente);
																								
												System.out.println("\nAntes da solicitaï¿½ï¿½o: ");
												//findGerente.getFilaPessoas().listarFila(findList);
												fila.listarFilaGerente(findGerente);
												
												List<Pessoa> findList = findGerente.getFilaPessoas().getFila();
												findList.add(findSecAcademica);
												
												System.out.println("\nDepois da solicitaï¿½ï¿½o: ");
												fila.listarFilaGerente(findGerente);
												
												break;
											}
											//Excluir os dados do secretï¿½rio(a) academico(a)
											case 6: {
												
												System.out.print("Informe 01 para confirmar a exclusão \n");
												op = sc.nextInt();
												if(op == 1) {
													faculdade.removeSecAcademica(findSecAcademica);
												}
												
												break;
											}
											default:
												System.out.println("\nRepita a operação!");
											}
											
										}while(flag != 0);
										flag = 1;
									break;
								}

								}while(flag != 0);
								flag = 1;
							}								
							default:
								System.out.println("\nRepita a operação!");
							}
							
						}while(flag != 0);						
						flag = 1;
						break;
					}
					//SECRETï¿½RIO(A) FINANCEIRO(A)
					case 8: {
						
						do {
							
							try {
								flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
										+ "\n01 Para cadastrar um secretï¿½rio(a) financeiro(a): "
										+ "\n02 Para consultar, alterar ou excluir dados de um secretï¿½rio(a) financeiro(a): "
										+ "\n00 Para retornar ao menu anterior: "));
								
								if(flag < 0 || flag > 2) {
									throw new ErroOpcaoException(0, 2);
								}
							}catch (Exception e) {
								e.printStackTrace();
							}
							
							op = flag;
							switch (op) {
							//Cadastrar um(a) secretï¿½rio(a) financeiro(a)
							case 1: {
																
								empresa.listarFaculdades();
								System.out.print("Informe o id da faculdade para cadastro do secretï¿½rio(a) financeiro(a): ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								do {
									
									System.out.print("\nInforme o nome do(a) secretï¿½rio(a) financeiro(a): ");
									sc.nextLine();
									String name = sc.nextLine();
									
									System.out.print("\nInforme o CPF: ");
									sc.nextLine();
									String cfp = sc.nextLine();
									String funcao = "Secretï¿½rio(a) financeiro(a)";
									
									SecFinanceira newSecFinaceira = new SecFinanceira(++ idPessoa, name, cfp, funcao);
									findFaculdade.addSecFinanceira(newSecFinaceira);
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
												+ "\n\nNome da faculdade: " + findFaculdade.getName()
												+ "\n\n01 Para cadastrar outro(a) secretï¿½rio(a) financeiro(a): "
												+ "\n00 Para retornar ao menu anterior: "));
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.printStackTrace();
									}
									
								}while(flag != 0);
								flag = 1;
								break;
							}
							//Consultar, alterar ou excluir dados de um secretï¿½rio(a) financeiro(a)
							case 2: {
								
								empresa.listarFaculdades();
								System.out.print("\nInforme id da faculdade onde o secretï¿½rio(a) financeiro(a) ï¿½ cadastrado: ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								faculdade.listarSecFinanceiras(findFaculdade);
								
								do {															
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
												+ "\n\nNome da faculdade: " + findFaculdade.getName()
												+ "\n\n01 Para listar dados pessoais de um(a) secretï¿½rio(a) financeiro(a): "
												+ "\n00 Para ir ao próximo menu: "));
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.printStackTrace();
									}
									
									//Listar dados pessoais de um(a) secretï¿½rio(a) financeiro(a)
									op = flag;
									if(op == 1) {
										
										System.out.println("\nInforme id do secretï¿½rio(a) financeiro(a) para listar os dados pessoais: ");
										op = sc.nextInt();
										
										SecFinanceira findSecFinanceira = faculdade.findSecFinanceira(op, findFaculdade);
										secFinanceiro.listarDadosSecFinanceira(findSecFinanceira);
										
										do {
											
											try {
												flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
														+ "\n\nNome da faculdade: " + findFaculdade.getName()
														+ "\nNome do(a) secretï¿½rio(a) financeiro(a): " + findSecFinanceira.getName()
														+ "\n\n01 Para listar dados financeiros do secretï¿½rio(a) financeiro(a): "
														+ "\n02 Para criar uma conta bancária para o secretï¿½rio(a) financeiro(a): "
														+ "\n03 Para listar a fila de pessoas aguardando atendimento e atender pessoa: "
														+ "\n04 Para solicitar atendimento do gerente de sua agência: "
														+ "\n05 Para excluir os dados do secretï¿½rio(a) financeiro(a): "
														+ "\n00 Para retornar ao menu anterior: "));	
												
												if(flag < 0 || flag > 5) {
													throw new ErroOpcaoException(0, 5);
												}
											}catch (Exception e) {
												e.printStackTrace();
											}
											
											op = flag;
											switch (op) {
											//Listar dados financeiros do secretï¿½rio(a) financeiro(a)
											case 1: {
												
												secFinanceiro.listarContasSecFin(findSecFinanceira);
												
												break;
											}
											//Criar uma conta bancária para o secretï¿½rio(a) financeiro(a)
											case 2: {
												
												do {
													
													empresa.listarBancos();
													System.out.print("Informe o id do banco: ");
													op = sc.nextInt();
													Banco findBanco = empresa.findBanco(op);
													
													banco.listarAgencias(findBanco);
													System.out.print("Informe o id da agência: ");
													op = sc.nextInt();
													Agencia findAgencia = banco.findAgencia(op, findBanco);
													
													
													try {
														op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
																+ "\n\nNome do banco: " + findBanco.getName()
																+ "\nNome da agência: " + findAgencia.getNameAgencia()
																+ "\nNome do cliente: " + findSecFinanceira.getName()
																+ "\n\n01 Para cadastrar uma conta corrente: "
																+ "\n02 Para cadastrar uma conta poupança: "));	
														
														if(flag < 1 || flag > 2) {
															throw new ErroOpcaoException(1, 2);
														}
													}catch (Exception e) {
														e.printStackTrace();
													}
													
													Integer id = ++idConta;
													if(op == 1) {
														ContaCorrente newContaCorrente = new ContaCorrente(id, findSecFinanceira.getId(), findAgencia.getIdGerente(), null);
														findSecFinanceira.addContaCorrente(newContaCorrente	);
													}else
													if(op == 2){
														ContaPoupanca newContaPoupanca = new ContaPoupanca(id, findSecFinanceira.getId(), findAgencia.getIdGerente());
														findSecFinanceira.addContaPoupanca(newContaPoupanca);
													}
													
													try {
														flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
																+ "\n\n01 Para criar outra conta: "
																+ "\n00 Para retornar ao menu anterior: "));
														
														if(flag < 0 || flag > 1) {
															throw new ErroOpcaoException(0, 1);
														}
													}catch (Exception e) {
														e.printStackTrace();
													}
													
												}while(flag != 0);
												flag = 1;												
												break;
											}
											//Listar a fila de pessoas aguardando atendimento e atender pessoa
											case 3: {
												
												//List<Pessoa> findList = fila.findListPessoasSecFinancira(findSecFinanceira);
												
												System.out.println("\nAntes do atendimento");
												//findSecFinanceira.getFilaPessoas().listarFila(findList);
												fila.listarFilaSecFinanceira(findSecFinanceira);
												
												do {
													
													try {
														flag = Integer.parseInt(JOptionPane.showInputDialog("Informe a opcão desejada: "
																+ "\n\nNome da faculdade: " + findFaculdade.getName()
																+ "\nNome do(a) secretï¿½rio(a) financeiro(a): " + findSecFinanceira.getName()
																+ "\n\n01 Para atender o(a) aluno(a) que ocupa o 1º na fila: "
																+ "\n00 Para ir ao próximo menu: "));
														
														if(flag < 0 || flag > 1) {
															throw new ErroOpcaoException(0, 1);
														}
													}catch (Exception e) {
														e.printStackTrace();
													}
													
													List<Pessoa> findList = findSecFinanceira.getFilaPessoas().getFila();
													
													op = flag;
													if(op == 1) {
														for(Pessoa p : findList) {
															if(findList.indexOf(p) == 0) {
																findSecFinanceira.getFilaPessoas().getFila().remove(p);
															}
														}
													}			
													
												}while(flag != 0);
												
												break;
											}
											//Solicitar atendimento do gerente de sua agência
											case 4: {
												
												empresa.listarBancos();
												System.out.print("\nInforme o id do banco: ");
												op = sc.nextInt();
												
												Banco findBanco = empresa.findBanco(op);
												
												banco.listarGerentes(findBanco);
												System.out.print("\nInforme o id do gerente do(a) qual deseja atendimento: ");
												op = sc.nextInt();
												
												Gerente findGerente = banco.findGerente(op, findBanco);
												
												//List<Pessoa> findList = fila.findListPessoasGrente(findGerente);
																								
												System.out.println("\nAntes da solicitaï¿½ï¿½o: ");
												//findGerente.getFilaPessoas().listarFila(findList);
												fila.listarFilaGerente(findGerente);
												
												List<Pessoa> findList = findGerente.getFilaPessoas().getFila();
												findList.add(findSecFinanceira);
												
												System.out.println("\nDepois da solicitaï¿½ï¿½o: ");
												fila.listarFilaGerente(findGerente);
												
												break;
											}
											//Excluir os dados do secretï¿½rio(a) financeiro(a)
											case 5: {
												
												System.out.print("Informe 01 para confirmar a exclusão \n");
												op = sc.nextInt();
												if(op == 1) {
													findFaculdade.removeSecFinanceira(findSecFinanceira);
												}	
												
												break;
											}
											default:
												System.out.println("\nRepita a operação!");
											}
											
										}while(flag != 0);
										
									}
									
								}while(flag != 0);
								
								break;
							}
							default:
								System.out.println("\nRepita a operação!");
							}
							
						}while(flag != 0);
						flag = 1;
						break;
					}
					//DIRETOR
					case 9: {
						
						do {
							
							try {
								flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
										+ "\n01 Para cadastrar um(a) diretor(a): "
										+ "\n02 Para consultar, alterar ou excluir dados de um(a) diretor(a): "
										+ "\n00 Para retornar ao menu anterior: "));
								
								if(flag < 0 || flag > 1) {
									throw new ErroOpcaoException(0, 1);
								}
							}catch (Exception e) {
								e.getMessage();
							}
							
							op = flag;
							switch (op) {
							//Cadastrar um(a) diretor(a)
							case 1: {
								
								do {
									
									empresa.listarFaculdades();
									System.out.println("\nInforme o id da faculdade para cadastar o diretor:");
									op = sc.nextInt();
									
									Faculdade findFaculdade = faculdade.findFaculdade(op);
									
									System.out.print("\nInforme o nome do diretor: ");
									sc.nextLine();
									String name = sc.nextLine();
									System.out.print("\nInforme o CPF: ");
									sc.nextLine();
									String cpf = sc.nextLine();
									String funcao = "Diretor";
									
									Diretor newDiretor = new Diretor(++idPessoa, name, cpf, funcao);
									
									findFaculdade.addListaDiretor(newDiretor);
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
												+ "\n\nNome da faculdade: " + findFaculdade.getName()
												+ "\n\n01 Para cadastrar outro(a) diretor(a): "
												+ "\n00 Para retornar ao menu anterior: " ));	
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.getMessage();
									}
									
								}while(flag != 0);
								flag = 1;
								break;
							}
							//Consultar, alterar ou excluir dados de um(a) diretor(a)
							case 2: {
								
								empresa.listarFaculdades();
								System.out.print("\nInforme id da faculdade onde o(a) diretor(a) ï¿½ cadastrado(a): ");
								op = sc.nextInt();
								Faculdade findFaculdade = empresa.findFaculdade(op);
								
								faculdade.listarDiretores(findFaculdade);
								
								try {
									op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opcão desejada: "
											+ "\n\nNome da faculdade: " + findFaculdade.getName()
											+ "\n\n01 Para listar dados pessoais de um(a) diretor(a): "
											+ "\n00 Para retornar ao menu anterior: "));	
									
									if(flag < 0 || flag > 1) {
										throw new ErroOpcaoException(0, 1);
									}
								}catch (Exception e) {
									e.getMessage();
								}
								
								if(op == 1) {
									
									System.out.print("\nInforme o id do(a) diretor(a) para listar os dados pessoais: ");
									op = sc.nextInt();
									
									Diretor findDiretor = faculdade.findDiretor(op, findFaculdade);
									
									diretor.listarDadosDiretor(findDiretor);
									
									do {
										
										try {
											flag = Integer.parseInt(JOptionPane.showInputDialog("Informe a opcão desejada: "
													+ "\n\nNome da faculdade: " + findFaculdade.getName()
													+ "\nNome do diretor: " + findDiretor.getName()
													+ "\n\n01 Para listar dados financeiros do diretor: "
													+ "\n02 Para criar uma conta bancária para o diretor: "
													+ "\n03 Para listar a fila de coordenadores aguardando atendimento e atender coordenador: "
													+ "\n04 Para solicitar atendimento do gerente de sua agência: "
													+ "\n05 Para excluir os dados do diretor: "
													+ "\n00 Para retornar ao menu anterior: "));
											
											if(flag < 0 || flag > 5) {
												throw new ErroOpcaoException(0, 5);
											}
											
										}catch (Exception e) {
											e.getMessage();
										}
										
										op = flag;
										switch (op) {
										//Listar dados financeiros do diretor
										case 1: {
											
											diretor.listarContasDiretor(findDiretor);
											
											break;
										}
										//Criar uma conta bancária para o diretor
										case 2: {
											
											do {
												
												empresa.listarBancos();
												System.out.print("Informe o id do banco: ");
												op = sc.nextInt();
												Banco findBanco = empresa.findBanco(op);
												
												banco.listarAgencias(findBanco);
												System.out.print("Informe o id da agência: ");
												op = sc.nextInt();
												Agencia findAgencia = banco.findAgencia(op, findBanco);
												
												try {
													op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
															+ "\n\nNome do banco: " + findBanco.getName()
															+ "\nNome da agência: " + findAgencia.getNameAgencia()
															+ "\nNome do cliente: " + findDiretor.getName()
															+ "\n\n01 Para cadastrar uma conta corrente: "
															+ "\n02 Para cadastrar uma conta poupança: "));	
													
													if(flag < 1 || flag > 2) {
														throw new ErroOpcaoException(1, 2);
													}
												}catch (Exception e) {
													e.getMessage();
												}
																					
												
												Integer id = ++idConta;
												if(op == 1) {
													ContaCorrente newContaCorrente = new ContaCorrente(id, findDiretor.getId(), findAgencia.getIdGerente(), null);
													findDiretor.addContaCorrente(newContaCorrente	);
												}else
												if(op == 2){
													ContaPoupanca newContaPoupanca = new ContaPoupanca(id, findDiretor.getId(), findAgencia.getIdGerente());
													findDiretor.addContaPoupanca(newContaPoupanca);
												}
												
												try {
													flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
															+ "\n01 Para criar outra conta"
															+ "\n00 Para retornar ao menu anterior"));	
													
													if(flag < 0 || flag > 1) {
														throw new ErroOpcaoException(0, 1);
													}
												}catch (Exception e) {
													e.getMessage();
												}
												
											}while(flag != 0);
											flag = 1;
											break;
										}
										//Listar a fila de coordenadores aguardando atendimento e atender coordenador
										case 3: {
											
											//List<Pessoa> findList = fila.findListPessoasDiretor(findDiretor); 
											
											System.out.println("\nAntes do atendimento: ");
											//findDiretor.getFilaPessoas().listarFila(findList);
											fila.listarFilaDiretor(findDiretor);
											
											try {
												op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opcão desejada: "
														+ "\n\nNome da faculdade: " + findFaculdade.getName()
														+ "\nNome do(a) Diretor(a): " + findDiretor.getName()
														+ "\n\n01 Para atender ao 1º coordenador da fila: "
														+ "\n00 Para ir ao próximo menu: "));
												
												if(flag < 0 || flag > 1) {
													throw new ErroOpcaoException(0, 1);
												}
											}catch (Exception e) {
												e.getMessage();
											}
											
											List<Pessoa> findList = findDiretor.getFilaCoordenadores().getFila();
											
											if(op == 1) {
												for(Pessoa p : findList) {
													if(findList.indexOf(p) == 0) {
														findList.remove(p);
													}
												}
											}
											
											System.out.println("\nDepois do atendimento: ");
											fila.listarFilaDiretor(findDiretor);
											
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
											
											//List<Pessoa> findList = fila.findListPessoasDiretor(findDiretor);
																							
											System.out.println("\nAntes da solicitaï¿½ï¿½o: ");
											//findGerente.getFilaPessoas().listarFila(findList);
											fila.listarFilaGerente(findGerente);
											
											List<Pessoa> findList = findGerente.getFilaPessoas().getFila();
											findList.add(findDiretor);
											
											System.out.println("\nDepois da solicitaï¿½ï¿½o: ");
											fila.listarFilaGerente(findGerente);
											
											break;
										} 
										//Excluir os dados do diretor
										case 5: {
											
											System.out.println("Informe 01 para confirmar a exclusão \n");
											op = sc.nextInt();
											if(op == 1) {
												faculdade.removeListaDiretor(findDiretor);
											}
										
											break;
										}
										default:
											System.out.println("\nRepita a operação!");
										}
										
									}while(flag != 0);
									flag = 1;
								}
								
								break;
							}
							default:
								System.out.println("\nRepita a operação!");
							}
							
						}while(flag != 0);
						flag = 1;						
						break;
					}
					default:
						System.out.println("\nRepita a operação!");
					}
					
					
				}while(flag != 0);
				flag = 1;
				break;
			}
			//BANCO
			case 2:{
				//Cadastrar e consultar dados de um banco
				do {
					
					try {
						flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
								+ "\n01 Para cadastrar e consultar dados de um banco: "
								+ "\n02 Para cadastrar e consultar dados de uma agência: "
								+ "\n03 Para cadastrar e consultar dados de um presidente: "
								+ "\n04 Para cadastrar e consultar dados de um gerente: "
								+ "\n00 Para retornar ao menu anterior: "));
						
						if(flag < 0 || flag > 4) {
							throw new ErroOpcaoException(0, 4);
						}
					}catch (Exception e) {
						e.getMessage();
					}
					
					op = flag;
					switch (op) {
					//Cadastrar um banco
					case 1: {
						
						do {
							
							try {
								flag = Integer.parseInt(JOptionPane.showInputDialog("Informe a opcão desejada: "
										+ "\n01 Para cadastrar os dados do banco: "
										+ "\n02 Para nomear o presidente de uma empresa: "
										+ "\n00 Para retornar ao menu anterior: "));
								
								if(flag < 0 || flag > 2) {
									throw new ErroOpcaoException(0, 2);
								}
							}catch (Exception e) {
								e.getMessage();
							}
							
							//Cadastrar um banco
							op = flag;
							if(op == 1) {
								
								do {
									
									System.out.print("\nInforme o nome do banco: ");
									sc.nextLine();
									String name = sc.nextLine();
									
									System.out.print("\nInforme o CNPJ: ");
									sc.nextLine();
									String cnpj = sc.nextLine();
									
									Banco newBanco = new Banco(++idEmpresa, name, cnpj);
									empresa.addListaBanco(newBanco);
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
												+ "\n01 Para cadastrar outro banco: "
												+ "\n00 Para retornar ao menu anterior: "));
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.getMessage();
									}
									
								}while(flag != 0);
								flag = 1;
							}
							//Nomear presidente do banco
							else if(op == 2) {
								
								empresa.listarPresidentes();
								
								System.out.print("\nInforme o id do presidente a ser nomeado: ");
								op = sc.nextInt();							
								Presidente findPresidente = empresa.findPresidente(op);
								
								empresa.listarBancos();
								
								System.out.print("\nInforme o id do banco: ");
								op =sc.nextInt();
								Banco findBanco = empresa.findBanco(op);
								
								findBanco.setPresidente(findPresidente);
								
								System.out.println("\nPresidente do banco " + findBanco.getName());
								System.out.println("\nNome:               " + findBanco.getPresidente().getName());
							}	
							
						}while(flag != 0);
						flag = 1;						
						break;
					}
					//agência
					case 2: {
						do {
							
							try {
								flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
										+ "\n01 Para cadastrar uma agï¿½cia bancária: "
										+ "\n02 Para consultar, alterar ou excluir dados de uma agï¿½cia bancária: "
										+ "\n00 Para retornar ao menu anterior: "));
								
								if(flag < 0 || flag > 2) {
									throw new ErroOpcaoException(0, 2);
								}
							}catch (Exception e) {
								e.getMessage();
							}
							
							op = flag;
							switch (op) {
							//Cadastrar uma agï¿½cia bancária
							case 1: {
								
								do {
									
									empresa.listarBancos();
									System.out.print("\nInforme o id banco do qual a agência faz parte: ");
									op = sc.nextInt();
									Banco findBanco = empresa.findBanco(op);
									
									banco.listarGerentes(findBanco);
									System.out.print("\nInforme o id do gerente para assumir a gestï¿½o da agência: ");
									op = sc.nextInt();
									Gerente findGerente = banco.findGerente(op, findBanco);
									
									System.out.print("\nInforme o nome da agência: ");
									sc.nextLine();
									String name = sc.nextLine();
									
									Agencia newAgencia = new Agencia(findBanco.getId(), findBanco.getName(), findBanco.getCnpj(), ++idAgencia, name, findGerente.getId());
									banco.addListaAgencia(newAgencia);
									newAgencia.setGerente(findGerente);
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
												+ "\n01 Para cadastrar outra agência: "
												+ "\n00 Para retornar ao menu anterior: "));
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.getMessage();
									}
									
								}while(flag != 0);
								flag = 1;
								break;
							}
							//Consultar, alterar ou excluir dados de uma agï¿½cia bancária
							case 2: {
								
								empresa.listarBancos();
								System.out.print("\nInforme o id do banco para consultar dados de suaas agencias: ");
								op = sc.nextInt();
								Banco findBanco = empresa.findBanco(op);
								
								banco.listarAgencias(findBanco);
								
								System.out.print("\nInforme o id da agência a qual deseja listar as informações:");
								op = sc.nextInt();
								Agencia findAgencia = banco.findAgencia(op, findBanco);
								
								agencia.listarDadosAgencia(findAgencia, findBanco);
								
								
							}
							default:
								System.out.println("\nRepita a operação!");
							}
							
							
						}while(flag != 0);
						flag = 1;
						break;
					}
					//PRESIDENTE
					case 3: {
						
						do {
							
							try {
								op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
										+ "\n01 Para cadastrar um presidente: "
										+ "\n02 Para consultar, alterar ou excluir dados de um presidente: "
										+ "\n00 Para retornar ao menu anterior: "));
								
								if(flag < 0 || flag > 2) {
									throw new ErroOpcaoException(0, 2);
								}
							}catch (Exception e) {
								e.getMessage();
							}
							
							switch (op) {
							//Cadastrar um presidente
							case 1: {
								
								do {
									
									System.out.print("\nInforme o nome do presidente: ");
									sc.nextLine();
									String name = sc.nextLine();
									
									System.out.print("\nInforme o CPF: ");
									sc.nextLine();
									String cpf = sc.nextLine();
									String funcao = "Presidente";
									
									Presidente newPresidente = new Presidente(++idPessoa, name, cpf, funcao);
									empresa.addPresidente(newPresidente);
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
												+ "\n01 Para cadastrar outro presidente: "
												+ "\n00 Para retornar ao menu anterior: "));
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.getMessage();
									}
									
								}while(flag != 0);
								flag = 1;
								break;
							}
							//Consultar, alterar ou excluir dados de um presidente
							case 2: {
								
								empresa.listarPresidentes();
								
								System.out.print("\nInforme o id de um presidente para listar os dados pessoais: ");
								op = sc.nextInt();								
								Presidente findPresidente = empresa.findPresidente(op);
								
								presidente.listarDadosPresidente(findPresidente);
								
								do {
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "	
												+ "\n\nNome do presidente: " + findPresidente.getName()
												+ "\n\n01 Para listar informações financeiras do presidende: "
												+ "\n02 Para criar uma conta bancária para o presidente: "
												+ "\n03 Para excluir os dados de um presidente: "
												+ "\n00 Para retornar ao menu anterior: "));
										
										if(flag < 0 || flag > 3) {
											throw new ErroOpcaoException(0, 3);
										}
									}catch (Exception e) {
										e.getMessage();
									}
									
									op = flag;
									switch (op) {
									//Listar informações financeiras do presidende
									case 1: {
										
										presidente.listarContasPresidente(findPresidente);
										
										break;
									}
									//Criar uma conta bancária para o presidente
									case 2: {
										
										do {
											
											empresa.listarBancos();
											
											System.out.print("Informe o id do banco: \n");
											op = sc.nextInt();
											Banco findBanco = empresa.findBanco(op);
											
											banco.listarAgencias(findBanco);
											
											System.out.print("Informe o id da agência: \n");
											op = sc.nextInt();
											Agencia findAgencia = banco.findAgencia(op, findBanco);
											
											
											try { 
												op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opcão desejada: \n"
														+ "\n\nNome do banco: " + findBanco.getName()
														+ "\nNome da agência: " + findAgencia.getNameAgencia()
														+ "\nNome do cliente: " + findPresidente.getName()
														+ "01 Para cadastrar uma conta corrente \n"
														+ "02 Para cadastrar uma conta poupança"));			
												
												if(flag < 1 || flag > 2) {
													throw new ErroOpcaoException(1, 2);
												}
											}catch (Exception e) {
												e.getMessage();
											}
											
											if(op == 1) {
												ContaCorrente newContaCorrente = new ContaCorrente(++idConta, findPresidente.getId(), findAgencia.getIdGerente(), null);
												findPresidente.addContaCorrente(newContaCorrente	);
											}else
											if(op == 2){
												ContaPoupanca newContaPoupanca = new ContaPoupanca(++idConta, findPresidente.getId(), findAgencia.getIdGerente());
												findPresidente.addContaPoupanca(newContaPoupanca);
											}
											
											try {
												flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
														+ "\n01 Para criar outra conta"
														+ "\n00 Para retornar ao menu anterior"));
												
												if(flag < 0 || flag > 1) {
													throw new ErroOpcaoException(0, 1);
												}
											}catch (Exception e) {
												e.getMessage();
											}
											
										}while(flag != 0);
										flag = 1;
										break;
									}
									//Excluir os dados de um presidente
									case 3: {
										
										System.out.print("Informe 01 para confirmar a exclusão \n");
										op = sc.nextInt();
										if(op == 1) {
											empresa.removePresidente(findPresidente);	
										}
										
									op = 0;	
										
										break;
									}
									default:
										System.out.println("\nRepita a operação!");
									}
									
								}while(flag != 0);
								flag = 1;
								break;
							}
							default:
								System.out.println("\nRepita a operação!");
							}
							
							
						}while(flag != 0);
						flag = 1;
						break;
					}
					//GERENTE
					case 4: {
						
						do { 
							
							try {
								flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
										+ "\n01 Para cadastrar um gerente: "
										+ "\n02 Para consultar, alterar ou excluir dados de um gerente: "
										+ "\n00 Para retornar ao menu anterior: "));
								
								if(flag < 0 || flag > 2) {
									throw new ErroOpcaoException(0, 2);
								}
							}catch (Exception e) {
								e.getMessage();
							}
							
							op = flag;
							switch (op) {
							//Cadastrar um gerente
							case 1: {
								
								do {
									
									empresa.listarBancos();
									
									System.out.print("\nInforme o id do banco no qual o gente será cadastrado: ");
									op = sc.nextInt();
									Banco FindBanco = empresa.findBanco(op);
									
									banco.listarAgencias(FindBanco);
									
									System.out.print("\nInforme o id da agência na qual o gerente assumirá a gestão: ");
									op = sc.nextInt();
									Agencia findAgencia = banco.findAgencia(op, FindBanco);
									

									System.out.print("\nInforme o nome do gerente: ");
									sc.nextLine();
									String name = sc.nextLine();
									
									System.out.print("\nInforme o CPF: ");
									sc.nextLine();
									String cpf = sc.nextLine();
									String funcao = "gerente";
									
									Gerente newGerente = new Gerente(++idPessoa, name, cpf, funcao, idAgencia);
									
									findAgencia.setGerente(newGerente);
									FindBanco.addListaGerente(newGerente);		
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
												+ "\n01 Para cadastrar outro gerente: "
												+ "\n00 Para retornar ao menu anterior: "));
										
										if(flag < 0 || flag > 1) {
											throw new ErroOpcaoException(0, 1);
										}
									}catch (Exception e) {
										e.getMessage();
									}
									
								}while(flag != 0);
								flag = 1;															
								break;
							}
							//Consultar, alterar ou excluir dados de um gerente
							case 2: {
								
								empresa.listarBancos();
								
								System.out.print("\nInforme o id do banco para listar os gerentes: ");
								op = sc.nextInt();
								Banco FindBanco = empresa.findBanco(op);
								
								banco.listarGerentes(FindBanco);
								
								System.out.print("\nInforme o id de um gerente para listar os dados pessoais: ");
								op = sc.nextInt();
								Gerente findGerente = banco.findGerente(op, FindBanco);
								
								gerente.listarDadosGerente(findGerente);
								
								do {
									
									try {
										flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "	
												+ "\n\nNome do banco: " + FindBanco.getName()
												+ "\nNome do gerente: " + findGerente.getName()
												+ "\n\n01 Para listar informações financeiras do gerente: "
												+ "\n02 Para criar uma conta bancária para o gerente: "
												+ "\n03 Para listar pessoas aguardando na fila e realizar atendimento: "
												+ "\n04 Para excluir os dados de um gerente: "
												+ "\n00 Para retornar ao menu anterior: "));
										
										if(flag < 0 || flag > 3) {
											throw new ErroOpcaoException(0, 3);
										}
									}catch (Exception e) {
										e.getMessage();
									}
									
									op = flag;
									switch (op) {
									//Listar informações financeiras do gerente
									case 1: {
										
										gerente.listarContasGernte(findGerente);
										
										break;
									}
									//Criar uma conta bancária para o gerente
									case 2: {
										
										do {
											
											empresa.listarBancos();
											
											System.out.print("Informe o id do banco: \n");
											op = sc.nextInt();
											Banco findBanco = empresa.findBanco(op);
											
											banco.listarAgencias(findBanco);
											
											System.out.print("Informe o id da agência: \n");
											op = sc.nextInt();
											Agencia findAgencia = banco.findAgencia(op, findBanco);
											
											try {

												op = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
														+ "\n\nNome do banco: " + FindBanco.getName()
														+ "\nNome do gerente: " + findGerente.getName()
														+ "\n\n01 Para cadastrar uma conta corrente: "
														+ "\n02 Para cadastrar uma conta poupança: "));		
												
												if(flag < 1 || flag > 2) {
													throw new ErroOpcaoException(1, 2);
												}
											}catch (Exception e) {
												e.getMessage();
											}
											
											if(op == 1) {
												ContaCorrente newContaCorrente = new ContaCorrente(++idConta, findGerente.getId(), findAgencia.getIdGerente(), null);
												findGerente.addContaCorrente(newContaCorrente	);
											}else
											if(op == 2){
												ContaPoupanca newContaPoupanca = new ContaPoupanca(++idConta, findGerente.getId(), findAgencia.getIdGerente());
												findGerente.addContaPoupanca(newContaPoupanca);
											}
											
											try {
												flag = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a opcão desejada: "
														+ "\n01 Para criar outra conta: "
														+ "\n00 Para retornar ao menu anterior: "));	
												
												if(flag < 0 || flag > 1) {
													throw new ErroOpcaoException(0, 1);
												}
											}catch (Exception e) {
												e.getMessage();
											}
											
										}while(flag != 0);
										flag = 1;
										break;
									}
									//Listar pessoas aguardando na fila e realizar atendimento
									case 3: {
										
										//List<Pessoa> findList = fila.findListPessoasSecFinancira(findSecFinanceira);
										
										System.out.println("\nAntes do atendimento");
										//findSecFinanceira.getFilaPessoas().listarFila(findList);
										fila.listarFilaGerente(findGerente);
										
										do {
											
											try {
												flag = Integer.parseInt(JOptionPane.showInputDialog("Informe a opcão desejada: "
														+ "\n\nNome do banco: " + FindBanco.getName()
														+ "\nNome do(a) gerente: " + findGerente.getName()
														+ "\n\n01 Para atender a pessoa que ocupa o 1º na fila: "
														+ "\n00 Para ir ao próximo menu: "));
												
												if(flag < 0 || flag > 1) {
													throw new ErroOpcaoException(0, 1);
												}
											}catch (Exception e) {
												e.printStackTrace();
											}
											
											List<Pessoa> findList = findGerente.getFilaPessoas().getFila();
											
											op = flag;
											if(op == 1) {
												for(Pessoa p : findList) {
													if(findList.indexOf(p) == 0) {
														findGerente.getFilaPessoas().getFila().remove(p);
													}
												}
											}	
											
											System.out.println("\nDepois do atendimento");
											//findSecFinanceira.getFilaPessoas().listarFila(findList);
											fila.listarFilaGerente(findGerente);
											
										}while(flag != 0);
										
										break;
									}
									//Excluir os dados de um gerente
									case 4: {
										
										System.out.print("Informe 01 para confirmar a exclusão: ");
										op = sc.nextInt();
										if(op == 1) {
											banco.removeListaGerente(findGerente);	
										}
										
										break;
									}
									default:
										System.out.println("\nRepita a operação!");
									}
									
								}while(flag != 0);
								flag = 1;
								break;
							}
							default:
								System.out.println("\nRepita a operação!");
							}
							 
							
						}while(flag != 0);
						flag = 1;
						break;
					}
					default:
						System.out.println("\nRepita a operação!");
					}
					
				}while(flag != 0);
				flag = 1;						
				break;
			}
			default:
				System.out.println("\nRepita a operação!");
			}
			
			sc.close();

				
		}while(flag != 0);	
	}

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
