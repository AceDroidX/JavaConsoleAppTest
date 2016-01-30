import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		System.out.println("你好世界！");

		Test test1=new Test();
		test1.test("+","xs");
		
		//Test.test
		
		Test test2=new Test();
		Scanner shuru1 = new Scanner(System.in);
		System.out.println("是否继续测试？");
		System.out.println("选择+-*/(继续)或stop(终止)");
		test2.test(shuru1.next(),"pd");
		System.out.println("\n");
	}
}

class Test
{
	public void test(String a,String b)
	{
		this.test1=a;
		this.test2=b;
		switch(b)
		{
			case "xs":
				this.xianshi();
				break;
			
			case "pd"://判断
				this.moshi();
				break;
		}
	}
	
	void moshi()
	{
		if(this.test2=="pd")
		{
			if(test1=="stop")
			{
				java.lang.System.exit(0);
			}
			this.test(test1,"xs");
		}
		
		switch(test1)
		{
			case "+":
				this.plus();
				break;

			case "-":
				this.minus();
				break;

			case "*":

				break;

			case "/":

				break;

			case "stop":
				java.lang.System.exit(0);
				break;

			default:
				System.out.println("请输入正确字符(+-*/)");
				break;
		}
	}
	
	void xianshi()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("输入数字：");
		this.number1 = input.nextDouble();
		System.out.println("\n");
		
		System.out.println("输入第二个数字：");
		this.number2 = input.nextDouble();
		System.out.println("\n");
		
		this.moshi();
		
		System.out.printf("\n两数运算得: %f", this.product);
		System.out.println("\n");
	}
	
	void plus()
	{
		this.product = this.number1 + this.number2;
	}
	void minus()
	{
		this.product=this.number1-this.number2;
	}
	
	String test1;
	String test2;
	
	double number1;
	double number2;
	double product;
	//
	//return this.test1;
}
