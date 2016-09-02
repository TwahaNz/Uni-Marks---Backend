package exam4me.repositories.student;

import exam4me.domain.student.StudentProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2016/09/01.
 */

@Repository
public interface StudentProfileRepository extends CrudRepository<StudentProfile, Long> {
}
