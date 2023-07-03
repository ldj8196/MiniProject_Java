package JW;

import java.security.MessageDigest;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import common.MyBatis;
import common.dto.Cargo;
import common.dto.Carrier;
import common.dto.Ordercompany;

class UnitTest {
	
	JWMapper mapper = MyBatis.getSqlSession().getMapper(JWMapper.class);
	
	public String hashPW(String pw, String id) {
	      try {
	         // 1. Hash알고리즘 SHA-256, 단방향 aa => 3jif3j43kj34kjk34jk43jjk34
	         MessageDigest md = MessageDigest.getInstance("SHA-256");
	         md.update((pw + id).getBytes());
	           
	         byte[] pwdSalt = md.digest();
	           StringBuffer sb = new StringBuffer();
	           for(byte b : pwdSalt) {
	               sb.append(String.format("%02x", b));
	           }
	           String result = sb.toString();
	          
	           return result;
	      }
	      catch (Exception e) {
	         e.printStackTrace();
	         return null;
	      }
	   }
	
	@Test
	void OrcaLogin() {
		String id = "6028120456";
		String pw = hashPW("0004",id);
		Ordercompany o = mapper.ordercompanyLogin(id, pw);
		System.out.println(o);
		
	}
	
	@Test
	void Orcajoin() {
		Ordercompany o = new Ordercompany();
		o.setObrn("1234");
		o.setOphone("010-0000-0000");
		o.setOpassword(hashPW("0004","1234"));
		o.setOaddress("부산 남구");
		o.setChk(1);
		o.setOname("부산교통공사");
		
		int oc = mapper.ordercompanyjoin(o);
		System.out.println(oc);
		
		
	}


	@Test
	void Orcacarrier() {
		Carrier c = new Carrier();
		c.setCname("홍길동");
		c.setCbrn("235");
		c.setCphone("010-4544");
		c.setCpassword(hashPW("4544", "235"));	
		
		c.setCaddress("부산");
		c.setChk(1);
		
		int OrcaBox = mapper.carrierjoin(c);
		System.out.println(OrcaBox);
	}

	@Test
	void UpdateOC() {
		Ordercompany oc = new Ordercompany();
		oc.setOphone("010-4533");
		oc.setOaddress("부산 용당");
		oc.setOname("산학협력");
		oc.setObrn("6028120456");
		
		
		int Ordercompany = mapper.ordercompanyUpdate(oc);
		System.out.println(Ordercompany);
		
		
	}
	
	@Test
	void UpdateC() {
		Carrier c = new Carrier();
		
		c.setCname("준우산업");
		c.setCphone("010-4567-1234");
		c.setCaddress("부산수영구망미동");
		c.setCbrn("BSK3374");
		
		int ret = mapper.updatecarrier(c);
		System.out.println( ret );
		
//		System.out.println( mapper.updatecarrier(c) );


	
	}
	
	@Test
	void Selectfindpassword() {
		String cbrn   =  ("6028120456");
		String cname  =  ("산학협력");
		String cphone =  ("010-4533");
		
		System.out.println(mapper.findpassword(cbrn, cname, cphone));
		
	}
	@Test
	void cargoTest() {
		Cargo c = new Cargo();
		c.setCargonumber("1001");
		c.setCargotype("기체");
		
		c = mapper.cargosearch2(c);
		System.out.println( c );
	}
	
	
	@Test
	void cargoSearch() {
		
		String cargonumber = "1000";
		Cargo c = mapper.CargoSearch(cargonumber);
		System.out.println(c.toString());
	}
	
	@Test
	void selectview() {
		List<Map<String,Object>> list = mapper.selectview();
		for(Map<String,Object> list_each : list) {
			System.out.println(list_each.toString());
		}
	}
	
	@Test
	void cargoCountTest() {
		int cargoweight = 1000;
		List<Map<String, Object>> list = mapper.cargoCount(cargoweight);
		for(Map<String, Object> map : list) {
			System.out.println(map);
		}
		
	}
	
	
	
}


