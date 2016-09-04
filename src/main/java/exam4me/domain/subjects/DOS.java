package exam4me.domain.subjects;

import javax.persistence.Id;

/**
 * Created by Admin on 2016/09/02.
 */

@javax.persistence.Entity
public class DOS {

    @Id
    private String studentNumber;
    private String term1;
    private String term2;
    private String term3;
    private String term4;

    public DOS(){}

    public DOS(String studentNumber, String term1, String term2, String term3, String term4) {
        this.studentNumber = studentNumber;
        this.term1 = term1;
        this.term2 = term2;
        this.term3 = term3;
        this.term4 = term4;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getTerm1() {
        return term1;
    }

    public String getTerm2() {
        return term2;
    }

    public String getTerm3() {
        return term3;
    }

    public String getTerm4() {
        return term4;
    }
}
