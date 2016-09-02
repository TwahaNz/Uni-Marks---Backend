package exam4me.services.Impl.subjects;

import exam4me.domain.subjects.IRP;
import exam4me.repositories.subjects.IRPRepository;
import exam4me.services.IRPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Admin on 2016/09/02.
 */

@Service
public class IRPServiceImpl implements IRPService {

    @Autowired
    IRPRepository iRPRepository;

    @Override
    public IRP create(IRP entity) {
        return null;
    }

    @Override
    public IRP readById(String s) {
        return iRPRepository.findOne(s);
    }

    @Override
    public Set<IRP> readAll() {
        return null;
    }

    @Override
    public IRP update(IRP entity) {
        return null;
    }

    @Override
    public void delete(IRP entity) {

    }
}
