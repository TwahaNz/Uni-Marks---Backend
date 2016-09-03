package exam4me.client.subjects;

import exam4me.domain.subjects.DOS;
import exam4me.domain.subjects.IRP;
import exam4me.services.DOSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 2016/09/02.
 */

@RestController
public class DOSController {

    @Autowired
    DOSService dosService;

    @RequestMapping(value = "/student/dos/{studentNumber}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DOS> getStudentAccountcleaer
            (@PathVariable("studentNumber") String studentNumber) {

        DOS dos = dosService.readById(studentNumber);

        if (dos == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(dos, HttpStatus.OK);

    }
}
