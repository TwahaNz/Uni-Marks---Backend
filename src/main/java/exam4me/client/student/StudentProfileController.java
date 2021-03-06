package exam4me.client.student;

import exam4me.domain.student.StudentProfile;
import exam4me.services.StudentProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by admin on 2016/09/01.
 */

@RestController
public class StudentProfileController {

    // Inject Service
    @Autowired
    private StudentProfileService studentProfileService;

    //-------------------Create a StudentProfile--------------------------------------------------------

    @RequestMapping(value = "/com/tnz/app/exam4me/account/profile", method = RequestMethod.POST)
    public ResponseEntity<StudentProfile> createStudentProfile(@RequestBody StudentProfile studentProfile, UriComponentsBuilder ucBuilder) {

        StudentProfile studProfile = studentProfileService.create(studentProfile);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/studentProfile/{id}").buildAndExpand(studentProfile.getId()).toUri());

        return new ResponseEntity<>(studProfile, HttpStatus.CREATED);

    }

    //-------------------Retrieve Single StudentProfile--------------------------------------------------------
    @RequestMapping(value = "/studentProfile/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StudentProfile> getStudentProfile(@PathVariable("id") long id) {

        StudentProfile studentProfile = studentProfileService.readById(id);

        if (studentProfile == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(studentProfile, HttpStatus.OK);

    }

    //------------------- Update a StudentProfile --------------------------------------------------------

    @RequestMapping(value = "/studentProfile/{id}", method = RequestMethod.PUT)
    public ResponseEntity<StudentProfile> updateStudentProfile(@PathVariable("id") long id, @RequestBody StudentProfile studentProfile) {

        StudentProfile currentStudentProfile = studentProfileService.readById(id);

        if (currentStudentProfile==null) {
            return new ResponseEntity<StudentProfile>(HttpStatus.NOT_FOUND);
        }

        StudentProfile updatedStudentProfile = new StudentProfile.Builder()
                .copyStudentProfile(currentStudentProfile)
                .setName(studentProfile.getName())
                .setSurname(studentProfile.getSurname())
                .build();

        studentProfileService.update(updatedStudentProfile);
        return new ResponseEntity<StudentProfile>(updatedStudentProfile, HttpStatus.OK);
    }

    //------------------- Delete a StudentProfile --------------------------------------------------------

    @RequestMapping(value = "/studentProfile/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<StudentProfile> deleteStudentProfile(@PathVariable("id") long id) {
        StudentProfile studentProfile = studentProfileService.readById(id);
        if (studentProfile == null) {
            return new ResponseEntity<StudentProfile>(HttpStatus.NOT_FOUND);
        }
        studentProfileService.delete(studentProfile);
        return new ResponseEntity<StudentProfile>(HttpStatus.NO_CONTENT);
    }
}
