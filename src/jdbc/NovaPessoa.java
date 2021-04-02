package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class NovaPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o nome: ");
		String nome = scan.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		
		stmt.execute();
		
		scan.close();
	}
}
