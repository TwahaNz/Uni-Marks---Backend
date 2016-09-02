package exam4me.client.subjects;

import exam4me.domain.subjects.ISYA;
import exam4me.domain.subjects.ISYB;
import exam4me.services.ISYAService;
import exam4me.services.ISYBService;
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
public class ISYBController {

    @Autowired
    ISYBService isybService;

    @RequestMapping(value = "/student/isyb/{student_number}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ISYB> getStudentAccount(@PathVariable("studentNumber") String studentNumber) {

        ISYB isyb = isybService.readById(studentNumber);

        if (isyb == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(isyb, HttpStatus.OK);

    }
}
