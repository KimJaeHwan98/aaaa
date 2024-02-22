package attack;

import java.util.Scanner;

import attackService.AttackService;
import attackService.AttackServiceImpl;

public class MainClass {
	public static void main(String[] args) {
		AttackServiceImpl service = new AttackServiceImpl();
		service.display();
		
	}
}
