package common;

import common.dto.Carrier;
import common.dto.OrderCargo;
import common.dto.Ordercompany;

public interface OrcaService {
	
	// 1. 로그인 기능 입력값 id, pw
	public int OrcaLogin(String id, String pw);
	// 2. 회사 회원가입 기능
	public int CompanyOrcajoin(Ordercompany company);
	// 2-1. 운송업체 회원가입 기능
	public int CarrierOrcajoin(Carrier carrier);
	// 3. 비밀번호 찾기 기능
	public int OrcaFindPassword(String id, String name, String phone, String newpw );
	// 4. Orca 메인창
	public void OrcaMain();
	// 5. 마이 페이지 정보 수정
	public int OrcaMypage(String name, String pw, String address, String phone);
	// 6. 화물 조회
	public void OrcaSelectCargo(String cargoNo, String cargoType, int cargoweight );
	// 7. 항구 조회
	public void OrcaSelectHarbor(String name);
	// 8. 선박 조회
	public void OrcaSelectShip(String shipNo, int shipWeight, String shipType );
	// 9. 주문 접수
	public int OrcaInsertOrder(OrderCargo ordercargo);
	// 10. 운임료 조회
	public int OrcashipCharge(int weight);
	// 11. 화물료 조회
	public int OrcaCargoCharge(int weight);
	
}
