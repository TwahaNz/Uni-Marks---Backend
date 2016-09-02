package exam4me.services.Impl.student;

import exam4me.domain.student.StudentAccount;
import exam4me.repositories.student.StudentAccountRepository;
import exam4me.services.StudentAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Admin on 2016/08/26.
 */

@Service
public class StudentAccountServiceImpl implements StudentAccountService {

    @Autowired
    private StudentAccountRepository studentAccountRepository;


    @Override
    public StudentAccount create(StudentAccount studentAccount) {
        return studentAccountRepository.save(studentAccount);
    }

    @Override
    public StudentAccount readById(Long id) {
        return studentAccountRepository.findOne(id);
    }

    @Override
    public Set<StudentAccount> readAll() {
        
        Set<StudentAccount> result = new HashSet<>();
        
        while (studentAccountRepository.findAll().iterator().hasNext()) {
            result.add(studentAccountRepository.findAll().iterator().next());
        }
        
        return result;
    }

    @Override
    public StudentAccount update(StudentAccount studentAccount) {
        return studentAccountRepository.save(studentAccount);
    }

    @Override
    public void delete(StudentAccount studentAccount) {
        studentAccountRepository.delete(studentAccount);
    }
}
