package common.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Schedule {
	
	private String scheduleno;
	private String departureharbor;
	private String arrivalharbor;
	private Date departuretime;
	private Date arrivaltime;
	
}
