package demo1;
import java.util.Scanner;
public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name =sc.nextLine();
		
		//第一步：使用if分支结构判断输入是否为空，如果为空，提示用户"姓名不能为空"
		
		System.out.println("你好，"+name);
		sc.close();
		
		
	}

}
