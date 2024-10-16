package conecta;
import java.sql.*;
public class Conectar {
    private static Connection conexao_MySql = null;
    private static String localBD = "localhost"; // IP;
    private static String Link = "jdbc:mysql://" + localBD + ":3306/codecraft";
    private static final String usuario = "root";
    private static final String senha = "";
    
    // Método para fazer a conexão com um banco de dados MySql
    public Connection connectionMySql(){
        try{
            conexao_MySql = DriverManager.getConnection(Link, usuario, senha);
            // Classe de conexão com o método getConnection - Link da conexão, usuário e senha;
            System.out.println("Conexão OK!");
        }
        catch(SQLException e){
            throw new RuntimeException("Ocorreu um problema na conexão com o Banco de Dados", e);
        }
        return conexao_MySql;
    }
    
    public void consulta(Connection con){
        try{
            Statement instancia = con.createStatement();
            ResultSet rs = instancia.executeQuery("select * from aluno");
            System.out.println("Consulta ao banco:");
            while(rs.next()){
                System.out.println("Código: " + rs.getInt(1) + " - Nome: " + rs.getString(2) + " - Email: " + rs.getString(3) + " - Código da Cidade: " + rs.getInt(4));
            }
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public String BuscaCodnoBanco(int cod){
        Connection con = connectionMySql();
        String x = "";
        String sql = "select nome, email, cod from aluno where cod = ?";
        PreparedStatement preparedSmt;
        try{
            preparedSmt = con.prepareStatement(sql);
            // Efetua atroca do '?' pelos valores na query;
            preparedSmt.setInt(1, cod);
            ResultSet rs = preparedSmt.executeQuery();
            // Valida o resultado;
            while (rs.next()){
                int code = rs.getInt("cod");
                String name = rs.getString("nome");
                String email = rs.getString("email");
                System.out.println("Código: " + cod);
                System.out.println("Nome: " + name);
                System.out.println("E-mail: " + email);
                x = name;
            }
        }
        catch(SQLException e){
            // Todo Auto-generated catch block
            e.printStackTrace();
        }
        return x;
    }
    
    public boolean BuscaLogin(String login, String senha){
        Connection con = connectionMySql();
        boolean x = false;
        String sql = "select login, senha from log where login = ? and senha = ? ";
        PreparedStatement preparedSmt;
        try{
            preparedSmt = con.prepareStatement(sql);
            // Efetua a troca dos '?' pelos valores na query
            preparedSmt.setString(1, login);
            preparedSmt.setString(2, senha);
            ResultSet rs = preparedSmt.executeQuery(); // Query é para realizar consultas no banco de dados;
            // Valida o resultado
            while(rs.next()){
                String login1 = rs.getString("login");
                String senha2 = rs.getString("senha");
                
                System.out.println("Nome: " + login1);
                System.out.println("Senha: " + senha2);
                x = true;
            }
        }
        catch(SQLException e){
            // Todo Auto-generated catch block
            e.printStackTrace();
        }
        return x;
        
    }
    
    public boolean CadastroLogin(String login, String senha){
        Connection con = connectionMySql();
        boolean x = false;
        String sql = "INSERT INTO log (login, senha) VALUES (?, ?)";
        PreparedStatement preparedSmt;
        try{
            preparedSmt = con.prepareStatement(sql);
            // Efetua a troca dos '?' pelos valores na query;
            preparedSmt.setString(1, login);
            preparedSmt.setString(2, senha);
            int rs = preparedSmt.executeUpdate(); // Update é utilizado quando a função a ser realizada irá fazer alterações dentro do banco de dados;
            // O Update retorna a quantidade de linhas que foram afetadas após a execução;
            // Valida o resultado;
            if(rs > 0){ // Verifica se houve a inserção de dados;
                x = true;
            }
        }
        catch(SQLException e){
            // Todo Auto-generated catch block
            e.printStackTrace();
        }
        return x;
        
    }

    void closeConnectionMySql(Connection conexao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
