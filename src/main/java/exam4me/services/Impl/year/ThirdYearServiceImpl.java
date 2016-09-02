package exam4me.services.Impl.year;

import exam4me.domain.year.ThirdYear;
import exam4me.repositories.year.ThirdYearRepository;
import exam4me.services.ThirdYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Admin on 2016/09/02.
 */

@Service
public class ThirdYearServiceImpl implements ThirdYearService {

    @Autowired
    ThirdYearRepository thirdYearRepository;

    @Override
    public ThirdYear create(ThirdYear entity) {
        return null;
    }

    @Override
    public ThirdYear readById(String s) {
        return thirdYearRepository.findOne(s);
    }

    @Override
    public Set<ThirdYear> readAll() {
        return null;
    }

    @Override
    public ThirdYear update(ThirdYear entity) {
        return null;
    }

    @Override
    public void delete(ThirdYear entity) {

    }
}
