package exam4me.client.student;

import exam4me.domain.student.StudentAccount;
import exam4me.services.StudentAccountService;
import exam4me.services.others.CustomConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Set;

/**
 * Created by hashcode on 2016/07/27.
 */

@RestController
public class StudentAccountController {

    // Inject Service
    @Autowired
    private StudentAccountService studentAccountService;

    //-------------------Create a StudentAccount--------------------------------------------------------

    @RequestMapping(value = "/com/tnz/app/exam4me/account/", method = RequestMethod.POST)
    public ResponseEntity<StudentAccount> createStudentAccount(@RequestBody StudentAccount studentAccount, UriComponentsBuilder ucBuilder) {

        StudentAccount studAccount = studentAccountService.create(studentAccount);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/studentAccount/{id}").buildAndExpand(studentAccount.getId()).toUri());

        return new ResponseEntity<>(studAccount, HttpStatus.CREATED);

    }

        //-------------------Retrieve Single StudentAccount--------------------------------------------------------
    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StudentAccount> getStudentAccount(@PathVariable("id") long id) {

        StudentAccount studentAccount = studentAccountService.readById(id);

        if (studentAccount == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(studentAccount, HttpStatus.OK);

    }

    @RequestMapping(value = "/studentAccount/", method = RequestMethod.POST)
    public ResponseEntity<StudentAccount> getStudentAccountByDetails(@RequestBody StudentAccount studentAccount, UriComponentsBuilder ucBuilder) {

        studentAccount = CustomConnection.find_by_details(studentAccount.getStudentEmail(), studentAccount.getStudentPassword());

//        HttpHeaders headers = new HttpHeaders();
//       headers.setLocation(ucBuilder.path("/studentAccount/{id}").buildAndExpand(studentAccount.getId()).toUri());

        return new ResponseEntity<>(studentAccount, HttpStatus.CREATED);
    }

    //-------------------Retrieve All StudentAccounts--------------------------------------------------------

    @RequestMapping(value = "/studentAccounts/", method = RequestMethod.GET)

    public ResponseEntity<Set<StudentAccount>> getStudentAccounts() {

        Set<StudentAccount> studentAccounts = studentAccountService.readAll();
        if(studentAccounts.isEmpty()){
            return new ResponseEntity<Set<StudentAccount>>(HttpStatus.NO_CONTENT);// OR HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<Set<StudentAccount>>(studentAccounts, HttpStatus.OK);

    }

    //------------------- Update a StudentAccount --------------------------------------------------------

    @RequestMapping(value = "/studentAccount/{id}", method = RequestMethod.PUT)
    public ResponseEntity<StudentAccount> updateStudentAccount(@PathVariable("id") long id, @RequestBody StudentAccount studentAccount) {

        StudentAccount currentStudentAccount = studentAccountService.readById(id);

        if (currentStudentAccount==null) {
            return new ResponseEntity<StudentAccount>(HttpStatus.NOT_FOUND);
        }
        StudentAccount updatedStudentAccount = new StudentAccount.Builder()
                .copyStudent(currentStudentAccount)
                .setStudentEmail(studentAccount.getStudentEmail())
                .setStudentPassword(studentAccount.getStudentPassword())
                .build();

        studentAccountService.update(updatedStudentAccount);
        return new ResponseEntity<StudentAccount>(updatedStudentAccount, HttpStatus.OK);
    }

    //------------------- Delete a StudentAccount --------------------------------------------------------

    @RequestMapping(value = "/studentAccount/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<StudentAccount> deleteStudentAccount(@PathVariable("id") long id) {
        StudentAccount studentAccount = studentAccountService.readById(id);
        if (studentAccount == null) {
            return new ResponseEntity<StudentAccount>(HttpStatus.NOT_FOUND);
        }
        studentAccountService.delete(studentAccount);
        return new ResponseEntity<StudentAccount>(HttpStatus.NO_CONTENT);
    }

}
