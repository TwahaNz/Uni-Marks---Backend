package exam4me.client.subjects;

import exam4me.domain.subjects.IRP;
import exam4me.domain.subjects.TP;
import exam4me.services.TPService;
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
public class TPController {

    @Autowired
    TPService tpService;

    @RequestMapping(value = "/student/tp/{studentNumber}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TP> getStudentAccount(@PathVariable("studentNumber") String studentNumber) {

        TP tp = tpService.readById(studentNumber);

        if (tp == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(tp, HttpStatus.OK);

    }
}
