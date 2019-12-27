package exam.hello;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class B {
	
	private C obj1;
	
	
	@Autowired
	public void setObj1(C obj1) {
		System.out.println("Service : repository DAO  wired to service ");
		this.obj1 = obj1;
	}




	public B()
	{
		
		//System.out.println("B object created");
	}




	public List<Account> fetchById(int deptid) {
		// TODO Auto-generated method stub
  		List<Account> l = obj1.fetchbydeptid(deptid);
		
		return l;
	}
      
	
	public int countbyBalance() {
		// TODO Auto-generated method stub
  		int l = obj1.countNo();
		
		return l;
	}

	public int deleteby() {
		// TODO Auto-generated method stub
  		int l = obj1.deletebyCondition();
		
		return l;
	}


	public Account updateAccount(Account a) {
		
		Account t = null;
		
		if(obj1.existsById(a.getAccno()))
		
		{
		
		  t = obj1.save(a);
		 
		}
		else {
			
		   t = new Account(0,0,0,0);
			
		}
		
		return t;
	}





}
