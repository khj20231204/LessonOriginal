public static void main(String[] args) {
		int i = 1;
		int j = 2;
		while(i<=6) {
			System.out.println(i+"단\t\t"+(i+1)+"단\t\t"+(i+2)+"단\t\t"+(i+3)+"단\t\t"+(i+4)+"단");
			while(j<=10) {
				System.out.println(i+"*"+j+"="+i*j+"\t\t"+(i+1)+"*"+j+"="+(i+1)*j+"\t\t"+(i+2)+"*"+j+"="+(i+2)*j+"\t\t"+(i+3)+"*"+j+"="+(i+3)*j+"\t\t"+(i+4)+"*"+j+"="+(i+4)*j);
				j++;
			}
			System.out.println(" ");
			i+=4;
			j=2;
			
		}

      for(int i=2 ; i<10 ; i+=5) {
			System.out.println(i+"단\t"+(i+1)+"단\t"+(i+2)+"단\t"+(i+3)+"단\t"+(i+4)+"단");
			for(int j=1 ; j<10 ; j++) {
				System.out.println(i*j+"\t"+(i+1)*j+"\t"+(i+2)*j+"\t"+(i+3)*j+"\t"+(i+4)*j);
			}
			System.out.println(" ");
		}
	}