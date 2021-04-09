import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("hello JDBC");

        List<TestTable> testList = new ArrayList<TestTable>();

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("connection established");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        final String uri = "jdbc:sqlserver://192.168.0.105:65000;database=military_district;";
        final String login = "Andrey";
        final String password = "12345";
        final String ssl = "?useSSL = false";

        Connection connection = null;

        connection = DriverManager.getConnection(uri + ssl, login, password);

        Statement statement = null;
        statement = connection.createStatement();

        String queryGetAll = "SELECT * FROM Tanks";
        String queryGetById = "SELECT * FROM Tanks WHERE idTanks = '2'";
        String queryInsertInfo = "INSERT INTO Tanks VALUES (8, 'Т-99','47 т.','1100 к.с.',NULL, 135, '2А46-3')";
        String queryUpdateInfo = "UPDATE Tanks SET name = 'Т-82',  Combat_weight = '44 т.' WHERE idTanks='4'";
        String queryDeleteById = "DELETE FROM Tanks WHERE idTanks = '6'";
        String queryFetchData = "SELECT * FROM Tanks ORDER BY IdTanks OFFSET 1 ROWS FETCH NEXT 1 ROWS ONLY";
        String queryOrderData = "SELECT * FROM Tanks ORDER BY caliber_of_gun DESC";

        String queryCreateTable = "CREATE TABLE JavaTable (idNew INT PRIMARY KEY, columnOne nvarchar(MAX) NULL)";
        String queryAlterTable = "ALTER TABLE JavaTable ADD columnTwo nvarchar(MAX) NULL";
        String queryInsertIntoCreated = "INSERT INTO JavaTable VALUES (1, 'one', 'two')";
        String queryGetAllFromCreatedTable = "SELECT * FROM JavaTable";
        String queryUpdateCreated = "UPDATE JavaTable SET columnOne = 'updateF', columnTwo = 'updateS' WHERE idNew='1'";
        String queryDeleteCreatedTable = "DROP TABLE JavaTable";

        // SHOW TABLE
        /*ResultSet resultSet = null;
        resultSet = statement.executeQuery(queryGetAll);

        while (true) {
                if (!resultSet.next()) break;
                System.out.println(resultSet.getInt(1)
                        + "    " + resultSet.getString(2)
                        + "    " + resultSet.getString(3)
                        + "    " + resultSet.getString(4)
                        + "    " + resultSet.getString(5)
                        + "    " + resultSet.getString(6)
                        + "    " + resultSet.getString(7));

               testList.add(new TestTable(resultSet.getInt("IdTanks"),
                        resultSet.getString("name"),
                        resultSet.getString(3),
                        resultSet.getString(4),
                       resultSet.getString(5),
                       resultSet.getString(6),
                       resultSet.getString(7)));
        }
        System.out.println("\n");
            testList.stream().forEach(System.out::println);

        System.out.println("\n");*/


        /* ------ INSERT ROW INTO A TABLE ------ */
        /*int resultInsert = statement.executeUpdate(queryInsertInfo);
        if (resultInsert > 0) System.out.println("Row inserted");

        ResultSet resultSetIns = null;
        resultSetIns = statement.executeQuery(queryGetAll);
        while (true) {
            if (!resultSetIns.next()) break;
            System.out.println(resultSetIns.getInt(1) + "    " + resultSetIns.getString(2) + "    " + resultSetIns.getString(3)
                    + "    " + resultSetIns.getString(4)+ "    " + resultSetIns.getString(5)+ "    " + resultSetIns.getString(6)
                    + "    " + resultSetIns.getString(7));
        }*/
        /* ------------------------------------- */


        /* ------ UPDATE ROW IN A TABLE ------ */
        /*int resultUpdate = statement.executeUpdate(queryUpdateInfo);
        if (resultUpdate > 0) System.out.println("Row updated");

        ResultSet resultSetUpd = null;
        resultSetUpd = statement.executeQuery(queryGetAll);
        while (true) {
            if (!resultSetUpd.next()) break;
            System.out.println(resultSetUpd.getInt(1) + "    " + resultSetUpd.getString(2) + "    " + resultSetUpd.getString(3)+ "    " + resultSetUpd.getString(4)
            + "    " + resultSetUpd.getString(5)+ "    " + resultSetUpd.getString(6)+ "    " + resultSetUpd.getString(7));
        }*/
        /* --------------------------------- - */



        /* ------ DELETE FROM TABLE ------ */
        int resultDelete = statement.executeUpdate(queryDeleteById);
        if (resultDelete > 0) System.out.println("Row deleted");

        ResultSet resultSetDel = null;
        resultSetDel = statement.executeQuery(queryGetAll);
        while (true) {
            if (!resultSetDel.next()) break;
            System.out.println(resultSetDel.getInt(1) + "    " + resultSetDel.getString(2) + "    " + resultSetDel.getString(3)+ "    " + resultSetDel.getString(4)
            + "    " + resultSetDel.getString(5)+ "    " + resultSetDel.getString(6)+ "    " + resultSetDel.getString(7));

        }
        /* ------------------------------- */



        /* ------ SHOW RESULTS FROM TABLE WITH CONDITIONS ------ */
        /*
        ResultSet resultWhere = null;
        resultWhere = statement.executeQuery(queryGetById);

        while (true) {
                if (!resultWhere.next()) break;
                System.out.println(resultWhere.getInt(1) + "    " + resultWhere.getString(2) + "    " + resultWhere.getString(3)+ "    " + resultWhere.getString(4)
                + "    " + resultWhere.getString(5)+ "    " + resultWhere.getString(6)+ "    " + resultWhere.getString(7));
        }*/
        /* ----------------------------------------------------- */


        /* ------ FETCH DATA FROM TABLE WITH LIMITATIONS ------- */

        /*ResultSet resultFetch = null;
        resultFetch = statement.executeQuery(queryFetchData);

        while (true) {
                if (!resultFetch.next()) break;
                System.out.println(resultFetch.getInt(1) + "    " + resultFetch.getString(2) + "    " + resultFetch.getString(3)
                + "    " + resultFetch.getString(4)
                + "    " + resultFetch.getString(5)
                + "    " + resultFetch.getString(6)
                + "    " + resultFetch.getString(7));
        }*/
        /* ------------------------------------------------------ */


        /* ------ ORDER DATA FROM TABLE WITH LIMITATIONS ------- */

        /*ResultSet resultOrder = null;
        resultOrder = statement.executeQuery(queryOrderData);

        while (true) {
                if (!resultOrder.next()) break;
                System.out.println(resultOrder.getInt(1) + "    " + resultOrder.getString(2) + "    " + resultOrder.getString(3)
                + "    " + resultOrder.getString(4)
                + "    " + resultOrder.getString(5)
                + "    " + resultOrder.getString(6)
                + "    " + resultOrder.getString(7));
        }*/
        /* ------------------------------------------------------ */



        /* -------------------------------------------------------------2------------------------------------------------------------- */

        /* ------ CREATE NEW TABLE ------ */
        /*statement.executeUpdate(queryCreateTable);
        System.out.println("Table created");*/
        /* ------------------------------ */

        /* ------ ALTER EXISTING TABLE ------ */
       /*statement.executeUpdate(queryAlterTable);
        System.out.println("Table altered (added new column)");*/
        /* ---------------------------------- */

        /* ------ INSERT ROW INTO A NEW TABLE ------ */
        /*int resultInsert = statement.executeUpdate(queryInsertIntoCreated);
        if (resultInsert > 0) System.out.println("Row inserted");

        ResultSet resultSetIns = null;
        resultSetIns = statement.executeQuery(queryGetAllFromCreatedTable);
        while (true) {
            if (!resultSetIns.next()) break;
            System.out.println(resultSetIns.getInt(1) + "    " + resultSetIns.getString(2) + "    " + resultSetIns.getString(3));
        }*/
        /* ----------------------------------------- */


        /* ------ UPDATE ROW IN A NEW TABLE ------ */
        /*int resultInsert = statement.executeUpdate(queryUpdateCreated);
        if (resultInsert > 0) System.out.println("Row 1 updated");

        ResultSet resultSetIns = null;
        resultSetIns = statement.executeQuery(queryGetAllFromCreatedTable);
        while (true) {
            if (!resultSetIns.next()) break;
            System.out.println(resultSetIns.getInt(1) + "    " + resultSetIns.getString(2) + "    " + resultSetIns.getString(3));
        }*/
        /* --------------------------------------- */

        /* ------ DELETE NEW TABLE ------ */
        /*statement.executeUpdate(queryDeleteCreatedTable);
        System.out.println("Table deleted");*/
        /* ------------------------------ */

        connection.close();

    } // CRUD  ~  GetAll
}
