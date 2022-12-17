import java.sql.*;
public class ConexaoMySQL {
    
    public static String URL = "jdbc:mysql://127.0.0.1:3306/orcamento";
    public static String USER = "root";
    public static String PWD = "admin";

    private Connection dbcon = null;
    private Statement sqlmanager = null;
    private ResultSet resultsql = null;

    public void OpenDatabase(){
        try {
            dbcon = DriverManager.getConnection(URL, USER, PWD);
            System.out.println("Conectado com sucesso em: "+URL);
            sqlmanager = dbcon.createStatement();
        } catch (Exception e) {
            System.out.println("Error on connect: "+e.getMessage());
        }
    }
    public void CloseDatabase() throws SQLException{
        sqlmanager.close();
        dbcon.close();
    }
    public int ExecutarQuery(String sql){
        try {
            return sqlmanager.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Error on connect: "+e.getMessage());
        }
        return -1;
    }
}
