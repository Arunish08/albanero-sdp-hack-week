import java.util.Scanner;

public class Day3Question26 {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Integer : ");
			int num=s.nextInt();
			int[] arr=new int[String.valueOf(num).length()];
			int temp,i=0;
			int check=num;
			//int a=String.valueOf(num).length();
			//System.out.println(a);
			while(num!=0) {
				temp=num%10;
				arr[i]=temp;
				num=num/10;
				i++;
			}
			/*for(int j=0;j<i;j++) {
				System.out.println(arr[j]);
			}*/
			//System.out.println(num);
			boolean flag=true;
			if(check<0){
				flag=false;
			}
			else {
			for(int j=1;j<i;j++)
			{
				if(arr[j-1]!=arr[j])
				{
					flag=false;
				}
			}
			}
			System.out.println(flag);

	}

}
