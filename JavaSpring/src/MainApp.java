import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class MainApp {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		DataSource dataSource = (DataSource) context.getBean("dataSource");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		String SQL = "select first_name from EMPLOYEES where employee_id = ? and salary = ?";
		String name = jdbcTemplate.queryForObject(SQL, new Object[]{107,4200}, String.class);
		
		System.out.println("name: " + name);
		
		SQL = "select * from EMPLOYEES where employee_id = ?";
		Emp emp = jdbcTemplate.queryForObject(SQL, new Object[]{108}, new EmpMapper());
		
		System.out.println("emp: " + emp);
		
		SQL = "select * from EMPLOYEES";
		List<Emp> emps = jdbcTemplate.query(SQL, new EmpMapper());
		
		for(Emp emprec:emps){
			System.out.println(emprec);
		}
		
		SQL = "insert into EMPLOYEES values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(SQL, new Object[]{200, "Raj", "Guy", "raja@gmail.com", null, "01-JAN-2010", "111", 11000, null, null, null});
		
		SQL = "update EMPLOYEES set first_name = ? where employee_id = ?";
		jdbcTemplate.update(SQL, new Object[]{"Raja", 200});
	}
}
