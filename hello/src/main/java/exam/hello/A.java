package exam.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@CrossOrigin(origins = "*")
@RestController
public class A {
	
	private B obj1;
	
	public A()
	{
		////System.out.println("A object created");
		
	}
	
	
	@Autowired
	public void setObj1(B obj1) {
		System.out.println("Controller : service is wired with Controller ");
		this.obj1 = obj1;
	}


//http:localhost:8080?x=1
	
	//http://localhost:8080/pw?x=1
	
	//http://localhost:8080/pw?x=10, you will get mobile no as zero
	
	//fetch by dept id
	
	@GetMapping("/fetchdeptid/{deptid}")
	public List<Account> fetchByIdC(@PathVariable int deptid) {
		
        
		List <Account> l = obj1.fetchById(deptid);
		
		return l;
		
	
		
	}
	
	
	@GetMapping("/countb")
	public int countbyBalance() {
		
        
		int l = obj1.countbyBalance();
		
		return l;
		
	
		
	}
	
	
	//Update 
	@PostMapping("/upd")
	public Account updateAccount(@RequestBody Account a)
	{
		 Account t = obj1.updateAccount(a);
		 
		 return t;
		
	}
	
	
	//delete
	
	//Update 
	
	@DeleteMapping("del")
	public int delete()
	{
		 int t = obj1.deleteby();
		 return t;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
