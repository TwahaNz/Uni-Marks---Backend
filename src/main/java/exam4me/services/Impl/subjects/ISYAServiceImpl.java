package exam4me.services.Impl.subjects;

import exam4me.domain.subjects.ISYA;
import exam4me.domain.subjects.TP;
import exam4me.repositories.subjects.ISYARepository;
import exam4me.repositories.subjects.TPRepository;
import exam4me.services.ISYAService;
import exam4me.services.TPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Admin on 2016/09/02.
 */

@Service
public class ISYAServiceImpl implements ISYAService {

    @Autowired
    ISYARepository isyaRepository;

    @Override
    public ISYA create(ISYA entity) {
        return null;
    }

    @Override
    public ISYA readById(String s) {
        return isyaRepository.findOne(s);
    }

    @Override
    public Set<ISYA> readAll() {
        return null;
    }

    @Override
    public ISYA update(ISYA entity) {
        return null;
    }

    @Override
    public void delete(ISYA entity) {

    }
}
