package attackService;

import java.util.Scanner;

import attackDAO.AttackDAO;
import attackDTO.AttackDTO;

public class AttackServiceImpl {
	AttackDAO dao;
	public AttackServiceImpl() {
		dao = new AttackDAO();
		
	}
	Scanner input=new Scanner(System.in);

	public void display() {
		System.out.println("무기를 선택해주세요 :");
		System.out.println("1.장검");
		System.out.println("2.단검");
		System.out.println("3.대검");
		AttackDTO dto = new AttackDTO();
		System.out.print("선택해주세요 :");
		int select = input.nextInt();
		if(select==1) { 
			dto.setDamage_A(30);
			dto.setDmage_B(40);
			dto.setDamage_C(120);
		}
		if(select==2) {
			dto.setDamage_A(15);
			dto.setDmage_B(40);
			dto.setDamage_C(80);
		}
		if(select==3) {
			dto.setDamage_A(60);
			dto.setDmage_B(80);
			dto.setDamage_C(200);
		}
			
		dto.setBoss(100);
		attack(dto);
	}
	public void attack(AttackDTO dto) {
		boolean flag=true;
		int stage=1;
		while(flag) {
		System.out.println("1.찌르기");
		System.out.println("2.올려치기");
		System.out.println("3.스킬");
		System.out.print(">>>>>");
		int select =input.nextInt();
		if(select==1) dao.AttackMotion1(dto);
		else	if(select==2) dao.AttackMotion2(dto);
		else	if(select==3) dao.AttackSkill(dto);
		
		if(dto.getBoss()==0&&stage==1) {
			//flag=false;
			System.out.println("1단계 보스가 죽었습니다.");
			System.out.println("클리어 다음단계");
			
			
			dto.setBoss(500);
			stage++;
		}
		if(dto.getBoss()==0&&stage==2) {
			System.out.println("2단계 보스가 죽었습니다.");
			System.out.println("클리어 다음단계");
			dto.setBoss(1000);
			stage++;
			
		}
		if(dto.getBoss()==0&&stage==3) {
		System.out.println("모든 보스를 잡으셨습니다.");
		flag =false;}
		}
	}
}
	
	
