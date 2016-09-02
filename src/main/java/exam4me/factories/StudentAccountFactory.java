package exam4me.factories;


import exam4me.domain.student.StudentAccount;

/**
 * Created by Admin on 2016/08/21.
 */

public class StudentAccountFactory {

    public static StudentAccount getStudentAccount(String studentEmail, String studentPassword){

        return new StudentAccount.Builder()
                .setStudentEmail(studentEmail)
                .setStudentPassword(studentPassword)
                .build();
    }

    public static StudentAccount getStudentAccount(long id, String studentEmail, String studentPassword) {

        return new StudentAccount.Builder()
                .setId(id)
                .setStudentEmail(studentEmail)
                .setStudentPassword(studentPassword)
                .build();
    }
}
