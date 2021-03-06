package exam4me.services.others;

import exam4me.domain.student.StudentAccount;
import exam4me.factories.StudentAccountFactory;

import java.sql.*;

/**
 * Created by Admin on 2016/09/03.
 */
public class CustomConnection {

    public CustomConnection(){}

    public static StudentAccount find_by_details(String email, String password) {

        try {

            String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String user = "root";
            String pass = "";

            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM test.student_account WHERE student_email='" +  email + "' AND student_password='" + password + "';");

            if (resultset.next()) {
                return StudentAccountFactory.getStudentAccount(resultset.getLong(1), email, password);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
