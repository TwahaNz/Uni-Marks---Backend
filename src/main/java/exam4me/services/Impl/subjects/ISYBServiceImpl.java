package exam4me.services.Impl.subjects;

import exam4me.domain.subjects.ISYB;
import exam4me.domain.subjects.TP;
import exam4me.repositories.subjects.ISYBRepository;
import exam4me.repositories.subjects.TPRepository;
import exam4me.services.ISYBService;
import exam4me.services.TPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Admin on 2016/09/02.
 */

@Service
public class ISYBServiceImpl implements ISYBService {

    @Autowired
    ISYBRepository isybRepository;

    @Override
    public ISYB create(ISYB entity) {
        return null;
    }

    @Override
    public ISYB readById(String s) {
        return isybRepository.findOne(s);
    }

    @Override
    public Set<ISYB> readAll() {
        return null;
    }

    @Override
    public ISYB update(ISYB entity) {
        return null;
    }

    @Override
    public void delete(ISYB entity) {

    }
}
