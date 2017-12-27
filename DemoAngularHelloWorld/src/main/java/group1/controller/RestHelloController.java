package group1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHelloController {

	@RequestMapping(value = "/helloo/", method = RequestMethod.GET)
    public ResponseEntity<ABC> helloo() {
       
        return new ResponseEntity<ABC>(new ABC("Hello World"), HttpStatus.OK);
    }
	
	
}
class ABC{
	private String xxx;

	public String getXxx() {
		return xxx;
	}

	public void setXxx(String xxx) {
		this.xxx = xxx;
	}

	public ABC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ABC(String xxx) {
		super();
		this.xxx = xxx;
	}
	
	
	
}