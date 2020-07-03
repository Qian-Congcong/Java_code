import java.util.Scanner;

public class TestDemo {


	public static void main(String[] args) {
		
	}

	//5的阶乘的和  5! + 4! + 3! + 2! + 1!
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		//方法一
		/*int i = 1;
		int ret = 1;
		int sum = 0;
		while (i <= 5) {
			ret *= i;
			sum += ret;
			i++;
		}
		System.out.println(sum);*/

		//方法二
		int num = 1;
		int sum = 0;
		while (num <= 5) {
			int i = 1;
			int ret = 1;
			while (i <= num) {
				ret *= i;
				i++;
			}
			sum += ret;
			num++;
		}
		System.out.println(num);
		System.out.println(sum);
	}

	public static void main9(String[] args) {
		/*boolean a = true;
		switch (a) {
			case true:
			    System.out.println("1");
			    break;
			case false:
				System.out.println("2");
			    break;
			default:
			    System.out.println("请输入正确的数字！");
			    break;    
		}*/
	}

	public static void main8(String[] args) {
				//else 只会和最近的if 结合
		/*int x = 10;
		int y = 10;
		if (x == 10) {
			if (y == 10) {
				System.out.println("aaa");
			} else {
				System.out.println("bbb");
			}
		}*/
	}

	public static void main7(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()) {//hasNextInt()只是判断接收的是否为数字而不是接收数据
			int year = scan.nextInt();
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("是润年");
			}else {
				System.out.println("不是闰年");
			}
		}
	}

	public static void main6(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(a);

		String str = scan.next();
		System.out.println(str);*/

		Scanner scan = new Scanner(System.in);
		//int year = scan.nextInt();
		String str = scan.nextLine();
		//String str = scan.next();
		System.out.println(str);
			
	}

	public static void main5(String[] args) {
		/*int i = 10;
		i = i++;//反汇编
		System.out.println(i);*/

		/*int a = 10;
		int b = 20;
		System.out.println(!(a < b));
		boolean flg = true;
		System.out.println(!flg);
*/
		System.out.println(10 > 20 && 10 / 0 == 0);
		System.out.println(10 < 20 || 10 / 0 == 0);

	}

	public static void main4(String[] args) {
		/*System.out.println(10%3);
		System.out.println(-10%3);
		System.out.println(10%-3);
		System.out.println(-10%-3);*/

		//System.out.println(5/0);//异常
		int a = 10;
		int b = ++a;//a=11  b = a;
		System.out.println(b);//11
		int c = a++;//c = a;   a = a + 1;  12
		System.out.println(c);//11
	}

	public static void main3(String[] args) {
		System.out.println(5/2);
		System.out.println(5.0/2);
		System.out.println((float)5/2);
		System.out.println((float)(5/2));
	}

	public static void main2(String[] args) {
		/*int a = 10;
		int b = 20;
		int c = 30;
		int max = 0;
		int min = 0;*/
		//法一
		/*if (a < b) {
			if (b < c) {
				max = c;
			}else {
				max = b;
			}
		}else {
			if (a < c) {
				max = c;
			}else {
				max = a;
			}
		}
		System.out.println("最大值： " + max);
		System.out.printf("最大值： %d ", max);*/
		//法二
		/*if (a >= b && a >= c) {
			max = a;
		}else if (b >= a && b >= c) {
			max = b;
		}else if (c >= a && c >= b) {
			max = c;
		}

		if (a <= b && a <= c) {
			min = a;
		}else if (b <= a && b <= c) {
			min = b;
		}else if (c <= a && c <= b) {
			min = c;
		}
		System.out.println("最大值： " + max);
		System.out.println("最小值： " + min);
		System.out.printf("MAX： %d ", max);
		System.out.printf("MIN： %d ", min);*/
		//法三
		/*max =  a > b ? a : b;
		max = max > c ? max : c;
		System.out.println("MAX: " + max);
		min = a < b ? a : b;
		min = min < c ? min : c;
		System.out.println("MIN: " + min);*/

	}


	/**
	给定两个int变量，交换变量的值
	a、创建中间变量    b、不创建中间变量
	*/
	public static void main1(String[] args) {
	/*int a = 10;
	int b = 20;
	System.out.println(a);
	System.out.println(b);

	a = a^b;
	b = a^b;
	a = a^b;
	System.out.println(a);
	System.out.println(b);

	int num = 0;
	num = a;
	a = b;
	b = num;
	System.out.println(a);
	System.out.println(b);

	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println(a);
	System.out.println(b);*/
	}
}
