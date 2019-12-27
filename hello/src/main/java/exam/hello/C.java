package exam.hello;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface C extends JpaRepository<Account, Integer> {
	
	//Mobile is entity class, Integer is primary key
	// hibernate will never work until you use concept called Primary key.
	
	//@Query("SELECT u FROM Mobile u WHERE u.imeino = 3")
	//Collection<Mobile> findAllActiveUsers();
//	 @Query("SELECT e FROM Employee e WHERE e.dept = :dept AND "
//	            + "(SELECT COUNT(DISTINCT e2.salary) FROM Employee e2 "
//	            + "WHERE e.salary < e2.salary AND e2.dept = :dept) < :topSalNum "
//	            + "ORDER BY e.salary DESC")
//	    List<Employee> findByDeptTopNSalaries(@Param("topSalNum") long topSalaryNum, @Param("dept") String dept);
	
	@Query("SELECT a From Account a where a.deptid = :deptid")
	List <Account> fetchbydeptid(@Param ("deptid") int deptid);
	
	 @Query("SELECT count(a.accno) From Account a where a.balance > 5000")
	 int countNo();
	 
	 @Transactional
	  @Modifying
	 @Query("DELETE From  Account a where a.balance > 13000")
	 int deletebyCondition();
	 
	 
		

}
