package prac.springAssignment5;

import java.sql.*;
import java.util.List;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
public class App {

  public static void main(String[] args) {
	  ApplicationContext context = new ClassPathXmlApplicationContext("prac/springAssignment5/config.xml");
	  JdbcTemplate template = context.getBean("jdbcTemp", JdbcTemplate.class);
	  
	  trainer trainer1 = template.queryForObject("Select * from trainer where Trainer_ID=1001", new RowMapper<trainer>() {
		  public trainer mapRow(ResultSet rs , int rowNum) throws SQLException
		  {
			  trainer obj = new trainer(rs.getInt(1),rs.getString(2),rs.getString(3));
			  return obj;
		  }
	  }); 
	  System.out.println("Here are details of trainer_ID 1001 :  "+trainer1);
	  
	  //Getting details of all trainers
	  List<trainer> list = template.query("Select * from trainer",new RowMapper<trainer>() {
		@Override
		public trainer mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			return new trainer(rs.getInt(1),rs.getString(2),rs.getString(3));
		}
	  });
	  
	  System.out.println("Displaying all Trainers with their taken Sessions : ");
	  for(trainer obj : list)
	  {
		  System.out.println(">> "+obj.getName() +" ID : "+obj.getTrainer_id());
		  int id = obj.getTrainer_id();
		  System.out.println("Sessions Taken : ");
		  List<Session> sessions = template.query("Select * from session where Trainer_ID=?",new RowMapper<Session>() {
			@Override
			public Session mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new Session(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}
		  },id);
		  
		  if(sessions.size()>0)
		  {
			  for(Session tmp : sessions)
			  {
				  System.out.println("\t"+"Session Topic : "+tmp.getTopic()+" | Session Date : "+tmp.getDate());			  
			  }			  
		  }
		  else
			  System.out.println("\t"+"No Sessions taken");
	  
		  System.out.println();
	  }
		  
  }
}
