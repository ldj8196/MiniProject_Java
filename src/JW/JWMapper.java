package JW;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import common.dto.Cargo;
import common.dto.Carrier;
import common.dto.Ordercompany;

@Mapper
public interface JWMapper {
 // 1. 로그인 맵퍼	
 @Select({ 
	 "SELECT obrn, opassword FROM ordercompany WHERE obrn = #{id} and opassword = #{pw}"
 
 })
 public Ordercompany ordercompanyLogin(@Param("id") String id, @Param("pw") String pw ) ;
 
 // 2. 회원가입 (join)
 @Insert({
	 " INSERT INTO ordercompany (OBRN, OPHONE, OPASSWORD, OADDRESS, OREGDATE, CHK, oname) ",
	 " VALUES (#{obrn}, #{ophone}, #{opassword}, #{oaddress}, CURRENT_DATE ,#{chk}, #{oname}) "
	 
 })
 public int ordercompanyjoin(Ordercompany oca);

//2. 회원가입 (join)
 @Insert({
	 " INSERT INTO carrier (CNAME, CBRN, CPHONE, CPASSWORD, CADDRESS, CREGDATE, CHK) ",
	 " VALUES (#{cname}, #{cbrn}, #{cphone}, #{cpassword}, #{caddress} , CURRENT_DATE, #{chk}) "
 })
 public int carrierjoin(Carrier c);
 @Select({ 
	 " SELECT * FROM ALLCOMPANYDATA "
 })	 
	 public List<Map<String,Object>> selectview();
	 
 //3. 비밀번호 찾기
 @Select({ 
 	" SELECT cbrn, cname, cphone FROM ALLCOMPANYDATA ",
 	" WHERE (cbrn = #{cbrn} AND cname = #{cname} AND cphone = #{cphone})"
 })
 public Map<String, Object> findpassword(@Param("cbrn") String brn , @Param("cname") String name, @Param("cphone") String phone );
 
//6. 회원정보변경
@Update({
	"UPDATE Ordercompany SET OPHONE = #{ophone}, OADDRESS = #{oaddress}, ONAME = #{oname} WHERE OBRN = #{obrn}"	
})
	public int ordercompanyUpdate(Ordercompany oco);

//6. 회원정보변경

@Update({
	" UPDATE carrier SET CNAME = #{cname}, CPHONE =  #{cphone}, CADDRESS = #{caddress} ",
	" WHERE CBRN = #{cbrn} "
		
})
	public int updatecarrier(Carrier c);

// 8. 화물정보조회

@Select({
	" SELECT CARGONUMBER, CARGOTYPE, CARGOWEIGHT " ,
	" FROM CARGO WHERE CARGONUMBER = #{cargonumber} "
})
// int  성공여뷰 list 2개이상  map 새로운 컬럼이 필요할 떄 dito에 없는 파일을 쓸때 cargo 1개 짜리
	public Cargo CargoSearch(String cargonumber);


@Select ({
	" SELECT CARGONUMBER, CARGOTYPE, CARGOWEIGHT FROM CARGO ", 
	" WHERE CARGONUMBER = #{cargonumber} and CARGOTYPE = #{cargotype} "
})
	public Cargo cargosearch2(Cargo cg);

	


@Select({
	" SELECT count(cargoweight) FROM cargo ",
	" WHERE cargoweight <= #{cargoweight} GROUP BY cargotype "
	
})
	public List<Map<String, Object>> cargoCount(int cargoweight);














}

















 
 

