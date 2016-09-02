package exam4me.repositories.subjects;

import exam4me.domain.subjects.DOS;
import exam4me.domain.year.ThirdYear;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin on 2016/09/02.
 */
@Repository
public interface DOSRepository extends CrudRepository<DOS, String> {
}
