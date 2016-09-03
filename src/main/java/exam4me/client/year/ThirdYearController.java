package exam4me.client.year;

import exam4me.domain.subjects.TP;
import exam4me.domain.year.ThirdYear;
import exam4me.services.ThirdYearService;
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
public class ThirdYearController {

    @Autowired
    ThirdYearService thirdYearService;

    @RequestMapping(value = "/student/{studentNumber}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ThirdYear> getStudentAccount(@PathVariable("studentNumber") String studentNumber) {

        ThirdYear thirdYear = thirdYearService.readById(studentNumber);

        if (thirdYear == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(thirdYear, HttpStatus.OK);

    }
}
