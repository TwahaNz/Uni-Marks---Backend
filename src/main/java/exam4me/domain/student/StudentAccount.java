package exam4me.domain.student;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Admin on 2016/08/26.
 */

@javax.persistence.Entity
public class StudentAccount implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String studentEmail;
    private String studentPassword;

    private StudentAccount(){}

    public StudentAccount(Builder stud_builder){

        id = stud_builder.id;
        studentEmail = stud_builder.studentEmail;
        studentPassword = stud_builder.studentPassword;
    }

    public long getId() {

        return id;
    }

    public String getStudentEmail() {

        return studentEmail;
    }

    public String getStudentPassword() {
        return studentPassword;
    }


    public static class Builder{

        private long id;
        private String studentEmail;
        public String studentPassword;

        public Builder setId(long id) {

            this.id = id;

            return this;
        }

        public Builder setStudentEmail(String studentEmail) {

            this.studentEmail = studentEmail;

            return this;
        }

        public Builder copyStudent(StudentAccount studentAccount){

            id = studentAccount.id;
            studentEmail = studentAccount.studentEmail;
            studentPassword = studentAccount.studentPassword;

            return this;
        }

        public Builder setStudentPassword(String studentPassword) {

            this.studentPassword = studentPassword;
            return this;
        }

        public StudentAccount build(){

            return new StudentAccount(this);
        }
    }
}
