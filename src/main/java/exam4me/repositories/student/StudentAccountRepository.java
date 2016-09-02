package exam4me.repositories.student;

import exam4me.domain.student.StudentAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin on 2016/08/26.
 */

@Repository
public interface StudentAccountRepository extends CrudRepository<StudentAccount, Long> {

}
