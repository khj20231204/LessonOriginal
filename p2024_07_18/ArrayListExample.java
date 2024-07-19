package p2024_07_18;

import java.util.ArrayList;
import java.util.List;

// p582
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 제네릭(Generic): 한가지 자료형의 데이터만 저장할 수 있다.
		List<String> list = new ArrayList<String>();  // 업캐스팅
		
		// boolean add(Object e)
		list.add("Java");
		list.add("JDBC");
		list.add("Servle/JSP");
		list.add(2, "Database");  // 인덱스 2번에 Database 삽입
		list.add("iBatis");
//		list.add(5);              // 에러발생
		
		int size = list.size();   // size(): 컬렉션의 원소의 갯수
		System.out.println("총 객체수:"+ size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: "+ skill);
		System.out.println();

		// Object get(int index)
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+ str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBatis");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+ str);
		}	

	}

}
