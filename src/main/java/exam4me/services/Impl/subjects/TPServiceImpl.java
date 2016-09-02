package exam4me.services.Impl.subjects;

import exam4me.domain.subjects.DOS;
import exam4me.domain.subjects.TP;
import exam4me.repositories.subjects.DOSRepository;
import exam4me.repositories.subjects.TPRepository;
import exam4me.services.DOSService;
import exam4me.services.TPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Admin on 2016/09/02.
 */

@Service
public class TPServiceImpl implements TPService {

    @Autowired
    TPRepository tpRepository;

    @Override
    public TP create(TP entity) {
        return null;
    }

    @Override
    public TP readById(String s) {
        return tpRepository.findOne(s);
    }

    @Override
    public Set<TP> readAll() {
        return null;
    }

    @Override
    public TP update(TP entity) {
        return null;
    }

    @Override
    public void delete(TP entity) {

    }
}
