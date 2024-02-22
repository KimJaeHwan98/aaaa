package attackDAO;

import java.util.ArrayList;

import attackDTO.AttackDTO;
import attackService.AttackService;

public class AttackDAO implements AttackService{
public static ArrayList<AttackDTO> arr;

static {
	arr = new ArrayList<>();
}
public void AttackMotion1(AttackDTO dto) {
	System.out.println("찌르기");
	dto.setBoss(dto.getBoss()-dto.getDamage_A());
	System.out.println("남은 보스 채력:"+dto.getBoss());
}
public void AttackMotion2(AttackDTO dto) {
	System.out.println("올려치기");
	dto.setBoss(dto.getBoss()-dto.getDmage_B());
	System.out.println("남은 보스 채력:"+dto.getBoss());	
}
public void AttackSkill(AttackDTO dto) {
	System.out.println("스킬");
	dto.setBoss(dto.getBoss()-dto.getDamage_C());
	System.out.println("남은 보스 채력:"+dto.getBoss());
	

}
}
