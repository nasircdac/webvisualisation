package exam.hello;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class D {

	
	//please before running D.java ensure server is running.
	
	public static void main(String[] args) {
		// suppose postman goes to post office
	
		String url = "http://localhost:7700/";
		
		RestTemplate t = new RestTemplate();
		 
		//fetchbydeptID
	  //  List <Account> x = new ArrayList<Account>();
		
	    List<Account>  l =  t.getForObject(url+"fetchdeptid/3",List.class);
	    if (l.isEmpty())
	    {
 	    	System.out.println("Account Details not found");
	    	
	    }else {
	    	
	    	//System.out.println(l);
	    	
	    	Iterator itr = l.iterator();
	    	while(itr.hasNext())
	    	{
	    		System.out.println(itr.next());
	    	}
	    	
	    	
	    }
	    
	    
	    //Update check
	    
	    Account z = new Account(3,456,6000,4);
	    
	   try {
		   
		Account a =  t.postForObject(url+"/upd", z, Account.class);
		if(a.getAccno() == 0)
		{
			System.out.println("Account not found to be updated");
		}else {
			
			System.out.println("Updated Successfully!!  "+a);
		}
		
		
	} catch (RestClientException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   
	 //delete by id 
	   
	   try {
		   
		// t.getForObject(url+"/del", )
	} catch (RestClientException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	 
	    
	    
	    
		
	   
	   
	   
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
