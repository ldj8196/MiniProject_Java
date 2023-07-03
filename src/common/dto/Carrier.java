package common.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Carrier {
	
	private String cname;
	private String cbrn;
	private String cphone;
	private String cpassword;
	private String caddress;
	private int chk;
	private Date cregdate;
	
}
