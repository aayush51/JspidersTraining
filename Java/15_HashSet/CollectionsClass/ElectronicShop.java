package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ElectronicShop {

	public static void main(String[] args) {

		HashSet<Mobile> mset = new HashSet<>();

		mset.add(new Mobile("OnePlus Nord 4 5G",8,128,5500,false,29998));
		mset.add(new Mobile("OnePlus Nord CE4 Lite 5G",8,128,5500,false,19999));
		mset.add(new Mobile("OnePlus 12",12,128,5400,false,59999));
		mset.add(new Mobile("OnePlus 12",12,128,5400,false,59999));
		mset.add(new Mobile("OnePlus 12",12,128,5400,false,59999));
		mset.add(new Mobile("Samsung Galaxy S21 FE 5G",8,256,4500,false,25999));
		mset.add(new Mobile("Samsung Galaxy S24 Ultra 5G",12,512,5000,false,133999));
		mset.add(new Mobile("Samsung Galaxy S24 5G",8,256,4000,false,67999));
		mset.add(new Mobile("Samsung Galaxy S24+ 5G",12,256,4500,false,77999));
		mset.add(new Mobile("Redmi 13 5G",6,128,5030,true,13999));
		mset.add(new Mobile("Redmi 12 5G",8,256,5000,true,13999));
		mset.add(new Mobile("Redmi 13C 5G",4,128,5000,true,10499));
		mset.add(new Mobile("iPhone 13",8,256,5000,true,59300));
		mset.add(new Mobile("Honor 200 5G",8,256,5200,true,33998));
		
//		for (Mobile mobile : mset) {
//			System.out.println(mobile);
//		}
//		System.out.println(mset);
		
//		Collections.binarySearch(mset,"Redmi");
//		Collections.sort(mset);
		System.out.println(Collections.frequency(mset, mset));
		System.out.println(Collections.max(mset));
		System.out.println(Collections.min(mset));
		
		System.out.println();
//		System.out.println(Collections.reverse(mset));
//		System.out.println(Collections.rotate(mset, 5));
//		System.out.println(Collections.shuffle(mset));
		
		ArrayList<Mobile> mlist = new ArrayList<>(mset);
		Collections.sort(mlist);
		for (Mobile m : mlist) {
			System.out.println(m);
		}
		
	}
}
