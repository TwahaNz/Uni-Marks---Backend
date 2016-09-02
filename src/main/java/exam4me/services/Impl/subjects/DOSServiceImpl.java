package exam4me.services.Impl.subjects;

import exam4me.domain.subjects.DOS;
import exam4me.domain.subjects.IRP;
import exam4me.repositories.subjects.DOSRepository;
import exam4me.repositories.subjects.IRPRepository;
import exam4me.services.DOSService;
import exam4me.services.IRPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Admin on 2016/09/02.
 */

@Service
public class DOSServiceImpl implements DOSService {

    @Autowired
    DOSRepository dosRepository;

    @Override
    public DOS create(DOS entity) {
        return null;
    }

    @Override
    public DOS readById(String s) {
        return dosRepository.findOne(s);
    }

    @Override
    public Set<DOS> readAll() {
        return null;
    }

    @Override
    public DOS update(DOS entity) {
        return null;
    }

    @Override
    public void delete(DOS entity) {

    }
}
