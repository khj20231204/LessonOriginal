package p2024_07_18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 590 ~ 591
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<String>();	// 업캐스팅
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servelet/JSP");
		set.add("Java");			// 중복된 데이터는 저장되지 않는다.
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("총 객체수:"+ size); //총 객체수:4
		
		// 반복자 iterator: Java	Servelet/JSP	JDBC	iBatis	
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.print(element+"\t");
		}
		System.out.println();
		
		set.remove("JDBC");
		set.remove("iBatis");
		System.out.println("총 객체수:"+ set.size()); //총 객체수:2
		
		// 반복자 iterator: Java	Servelet/JSP
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.print(element+"\t");
		}
		System.out.println();	
		
		set.clear();		// 모든 객체를 삭제하고 컬렉션을 비워준다.
		
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}	
		
	}

}
