package exam4me.domain.year;

import javax.persistence.Id;

/**
 * Created by Admin on 2016/09/02.
 */

@javax.persistence.Entity
public class ThirdYear {

    @Id
    private String studentNumber;

    public ThirdYear(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }
}
