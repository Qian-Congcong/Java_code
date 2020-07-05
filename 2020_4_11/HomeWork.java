//import java.util.Scanner;
import java.util.*;

public class HomeWork {
	/**
	输出一个整数的每一位.
	*/
	public static void  is_Print (int n) {
		if (n < 0) {//当输入一个负数时，先把它变成整数。
			System.out.println("!");
			n = -n;
		}
		if (n > 9) {
			is_Print(n / 10);//递归
		}
		System.out.print((n%10) +" ");//打印个位数
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		is_Print(num);
		scan.close();
	}

	/**
	 获取一个数二进制序列中所有的偶数位和奇数位，分别输出二进制序列
	*/
	public static void main13(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		System.out.println(Integer.toBinaryString(value));
		//0000 0000 0000 0000 0000 0000 0000 0000  32位
		//32 31 30 ……                       3 2 1
		System.out.println("奇数序列");
        for (int i = 30; i >= 0; i -= 2) {
        	System.out.print((value >> i) & 1);
        }
        System.out.println("");
        System.out.println("偶数序列");
        for (int i = 31; i >= 1; i -= 2) {
        	System.out.print((value >> i) & 1);
        }
	}


	/**
	完成猜数字游戏
	*/
	public static void main12(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Random random = new Random();
		int randNum = random.nextInt(100)+100;//[0-100)  +100表示[100-200) 
		while (true) {
			System.out.println("请输入你猜的数字:>");
			int num = scan.nextInt();
			if (num < randNum) {
				System.out.println("你猜小了");
			}else if (num == randNum) {
				System.out.println("你猜对了");
				break;
			}else {
				System.out.println("你猜大了");
			}
		}
	}

	/**
	写一个函数返回参数二进制中 1 的个数 比如：15  0000 1111  4个1
	*/
	public static int HomeWork(int num) {
		/*int count=0;
        while(num > 0) {
            if((num & 1) == 1) {
                count++;
            }
            num=num>>1;
        }
        return count;*/
        int count=0;
        while(num > 0) {
            if(num%2==1) {
                count++;
            }
            num/=2;
        }
        return count;
    }

	public static void main11(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

        System.out.println(Integer.toBinaryString(n));
        //toBinaryString()方法返回int变量的二进制表示的字符串。
        System.out.println(HomeWork(n));
        scan.close();
	}

	/**
	编写代码模拟三次密码输入的场景。最多能输入三次密码，密码正确，
	提示“登陆成功”，密码错误，可以重新输入，最多输入三次。三次均错，
	则提示退出程序
	*/
	public static void main10(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = 3;
		while (count != 0) {
			System.out.println("请输入密码：>");
			String password = scan.nextLine();
			if (password.equals("123456")) {
				System.out.println("密码正确，登陆成功！");
				break;
			}else {
				System.out.println("输入错误！");
				count--;
			}
		}
		if (count == 0) {
			System.out.println("退出程序！");
		}
	}

	/**
	求出0~999之间的所有“水仙花数”并输出。（“水仙花数”是指一个三位数，
	其各位数字的立方和确好等于该数本身，如：153 = 1^3 + 5^3 + 3^3,
	则153是一个“水仙花数”。）
	*/
	public static void main9(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//int num = scan.nextInt();
		for (int num = 1; num <= 999; num++) {
			int tmp = num;
			int count = 0;
			//153 / 10 = 15 && 153 % 10 = 3
			while (tmp != 0) {
			tmp = tmp / 10;
			count++;
			} 
			//System.out.println(count);
			int sum = 0;
			tmp = num;
			while (tmp != 0) {
				sum = sum + (int)Math.pow(tmp%10, count);
				tmp = tmp / 10;
			}
			if (sum == num) {
				System.out.print(sum +" ");
			}
		}
		
	}

	/**
	编写程序数一下 1到 100 的所有整数中出现多少个数字9。
	*/
	public static void main8(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			//i / 10 == 9 || i % 10 == 9
			if (i / 10 == 9) {
				count++;
				System.out.print(i +" ");
			}
			if (i % 10 == 9) {
				count++;
				System.out.print(i +" ");
			}
		}
		System.out.println();
		System.out.print(count);
	}

	/**
	计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
	*/
	public static void main7(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		double sum = 0;
		int flag = 1;
		for(int i = 1; i <= num; i++) {
			sum = sum + 1.0/i * flag;
			flag = -flag;
		}
		System.out.println(sum);
	}

	/**
	求两个正整数的最大公约数
	*/
	public static void main6(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		//方法一
		/*int min = (num1 < num2 ? num1 : num2);

		while (true) {
			if (num1%min == 0 && num2%min == 0) {
				System.out.println(min + "最大公约数！");
				break;
			}
			min--;
		}*/

		//方法二
		int c = num2; 
		while (num1 % num2 != 0) {
			c = num1 % num2;
			num1 = num2;
			num2 = c;
		}
		System.out.println(c + "最大公约数！");
	}

 	/**
	输出乘法口诀表
 	*/
	public static void main5(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i +"*"+ j +"="+ i*j +" ");
			}
			System.out.println();
		}
	}

	/**
	输出 1000 - 2000 之间所有的闰年
	*/
	public static void main4(String[] args) {

		for (int year = 1000; year <= 2000; year++) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year);
			}
		}
	}

	/**
	 打印 1 - 100 之间所有的素数
	*/
	public static void main3(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i = 2;
		for (; i <= num; i++) {
			int j = 2;
			for (; j <= (int)Math.sqrt(i); j++) {
				if (i % j == 0){
					break;
				}
			}
			if (j > (int)Math.sqrt(i)) {
				System.out.println(i);
			}
		}
	}

	/**
	判定一个数字是否是素数
	*/
	public static void main2(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		/*
		if (num > 1) {
			int count = 0;
			for (int i = 2; i < num; i++) {
				if (num % i != 0) {
					//System.out.println("不是素数！");
					count++;
				}	
			}
			if (count == (num - 2)) {
				System.out.println("是素数！");
			}else {
				System.out.println("不是素数！");
			}
		}else {
			System.out.println("输入错误！");
		}*/

		/*
		int i = 0;
		for (i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				break;
			}
		}
		if (i > num/2) {
			System.out.println(num + "是素数！");
		}else {
			System.out.println(num + "不是素数！");
		}*/

		int i = 0;
		for (i = 2; i <= (int)Math.sqrt(num); i++) {
			if (num % i == 0) {
				break;
			}
		}
		if (i > (int)Math.sqrt(num)) {
			System.out.println(num + "是素数！");
		}else {
			System.out.println(num + "不是素数！");
		}
	}

	/**
	根据年龄，来打印出当前年龄的人是少年（低于18），青年（19-28），中年（29-55），老年（56以上）
	*/
	public static void main1(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (0 < num && num <= 18) {
			System.out.println("少年！");
		}else if (19 <= num && num <= 28) {
			System.out.println("青年！");		
		}else if (29 <= num && num <= 55) {
			System.out.println("中年！");		
		}else {
			System.out.println("老年！");		
		}

	}
}