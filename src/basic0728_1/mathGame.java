package basic0728_1;

import java.util.Scanner;

public class mathGame {
	static int score = 0;
	static int answer = -1;
	public static void main(String[] args) {

		System.out.println("��� ������ �����մϴ�.");
		System.out.println("���̵� ����(1~5) : ");
		Scanner sc = new Scanner(System.in);
		int level = sc.nextInt();
		
		if(level >0 && level <= 5) {
			
		
		int mul = 1;
		for(int i = 0; i < level; i++)
			mul*=10;
		
		mathGame(mul,level);
		System.out.println("���� ����");
		System.out.println("���� : " + score);
		
		}
		else System.out.println("1~5�߿����� �Է��ϼ���.");
	}
	
	static void mathGame(int mul, int level) {

		Scanner sc = new Scanner(System.in);
		int num1 = (int)(Math.random()*mul);
		int num2 = (int)(Math.random()*mul);
		int num3 = num1 + num2;
		System.out.printf("%d + %d = ", num1, num2);

		long start = System.currentTimeMillis();
		long end = start + 2*1000*level; // 60 seconds * 1000 ms/sec
		answer = sc.nextInt();
		while (System.currentTimeMillis() < end)
		{
			if(answer == num3) {
				score += 10;
				mathGame(mul,level);
			}else {
				break;
			}
		}
	
	}

}
