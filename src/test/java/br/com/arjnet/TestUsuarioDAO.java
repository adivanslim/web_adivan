package br.com.arjnet;

import br.com.arjnet.persistencia.entidade.Usuario;
import br.com.arjnet.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testExcluir();
	}
	
	public static void testExcluir() {
		Usuario usu = new Usuario();
		usu.setId(4);
		
		// excluindo usuario no BD
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);

		System.out.println("excluido com sucesso");
	}
	
	public static void testAlterar() {
		// Alteraando o usuário
		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("jãozão da silva");
		usu.setLogin("jzaoss");
		usu.setSenha("12345678");
		// Alterando usuario no BD
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);

		System.out.println("Alterado com sucesso");
	}

	public static void testCadastrar() {
		// criando o usuário
		Usuario usu = new Usuario();
		usu.setNome("jãozão");
		usu.setLogin("jzao");
		usu.setSenha("123");
		// cadastrando usuario no BD
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);

		System.out.println("cadastrado com sucesso");
	}

}
