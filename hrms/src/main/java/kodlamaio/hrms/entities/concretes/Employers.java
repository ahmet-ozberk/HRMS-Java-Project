package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="employers")
public class Employers {
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="company_name")
	private String company_name;
	
	@Column(name="web_sites")
	private String web_sites;
	
	@Column(name="phone")
	private String phone;

}
