package exam4me.services.Impl.student;

import exam4me.domain.student.StudentProfile;
import exam4me.repositories.student.StudentProfileRepository;
import exam4me.services.StudentProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 2016/09/01.
 */

@Service
public class StudentProfileServiceImpl implements StudentProfileService {

    @Autowired
    private StudentProfileRepository studentProfileRepository;


    @Override
    public StudentProfile create(StudentProfile studentProfile) {
        return studentProfileRepository.save(studentProfile);
    }

    @Override
    public StudentProfile readById(Long id) {
        return studentProfileRepository.findOne(id);
    }

    @Override
    public Set<StudentProfile> readAll() {

        Set<StudentProfile> result = new HashSet<>();

        while (studentProfileRepository.findAll().iterator().hasNext()) {
            result.add(studentProfileRepository.findAll().iterator().next());
        }

        return result;
    }

    @Override
    public StudentProfile update(StudentProfile studentProfile) {
        return studentProfileRepository.save(studentProfile);
    }

    @Override
    public void delete(StudentProfile studentProfile) {
        studentProfileRepository.delete(studentProfile);
    }
}
