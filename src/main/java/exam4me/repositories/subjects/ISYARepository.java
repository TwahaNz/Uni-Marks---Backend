package exam4me.repositories.subjects;

import exam4me.domain.subjects.ISYA;
import exam4me.domain.year.ThirdYear;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin on 2016/09/02.
 */
@Repository
public interface ISYARepository extends CrudRepository<ISYA, String> {
}
