package com.bridgelabz.greetingcontrollerapp.controller;

import com.bridgelabz.greetingcontrollerapp.model.Greeting;
import com.bridgelabz.greetingcontrollerapp.model.User;
import com.bridgelabz.greetingcontrollerapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

//    private  static final  String template = "Hello,%s,%s !";
//    private final AtomicLong counter = new AtomicLong();
//    both private transfer/use in service so comment

    @Autowired
    private IGreetingService greetingService;
    @GetMapping("/getdata")
    public Greeting greeting(@RequestParam(value = "fName", defaultValue = "Word!!") String fname,
                             @RequestParam (value = "lName", defaultValue = "")String lname){
//        return new Greeting(counter.incrementAndGet(),String.format(template,fname,lname));
        User user = new User();
        user.setFirstName(fname);
        user.setLastName(lname);
        return greetingService.addGreeting(user);

    }

    /**
     * Here,Using @GetMapping (value = {"/{id}"}) in  UC5 for get/find the data at position
     * "which data is available that id"
     * by using id in GreetingApp
     */


    @GetMapping(value = {"/{id}"})
    public Greeting greetingById(){
        long id = 0;
        return greetingService.getGreetingById(id);
    }
    /**
     * For Delete the data in Greeting app
     * @param id
     * Use @RequestMapping in UC8 for delete/remove the data
     * by using delete id at that position which data is available that position will be delete in Greeting App
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
//    @ResponseBody
    public void delete(@PathVariable long id ) {
         greetingService.delete(id);

    }
}
