package lam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Kunden;

public class MapTrening {
 
	
			public static void main(String[] args) {
//	    Map<Integer, String> map= fillMap();  rfr
				Map<String, String> map = new HashMap<>();
		/* gruoping name => email*/
				List<Kunden> listok = KundeList.kundenRepeatList;

//				nameEmailList(map, listok);
//				genderNameList
				for (Kunden kun  : listok) {
					if(map.get(kun.getGender()) == null) {
						map.put(kun.getGender(), kun.getFname());
					} else {
						map.put(kun.getGender(), map.get(kun.getGender()) + " \n\t " + kun.getFname());
					}
				}
 
//			
				
				map.forEach( (a, b) -> System.out.println(a + "==> " + b +"\n") );


	
			} //
			
			
			 /** gruoping gender  => Name  	genderNameList(map, listok); */
			private static void genderNameList(Map<String, String> map, List<Kunden> listok) {
				for (Kunden kun  : listok) {
					if(map.get(kun.getGender()) == null) {
						map.put(kun.getGender(), kun.getFname());
					} else {
						map.put(kun.getGender(), map.get(kun.getGender()) + " \n\t" + kun.getEmail());
					}
				}
			}
			
			 /** gruoping name => email*/
			private static void nameEmailList(Map<String, String> map, List<Kunden> listok) {
				for (Kunden kunden : listok) {
					if(map.get(kunden.getFname())== null) {
						map.put(kunden.getFname(), kunden.getEmail());
					}else {
						map.put(kunden.getFname(), map.get(kunden.getFname()) + " \n\t" + kunden.getEmail());
					}
				}
			}

			// 				grouppingNumerNames(map);
			private static void grouppingNumerNames(Map<Integer, String> map) {
				// number => name
				for (Bumaga buma : Spisok.listok) {
					int key = buma.getNomer();
					if (map.get(key) == null) {
						map.put(key, buma.getName());
					} else {
						map.put(key, map.get(key) +  " " +buma.getName());
					}
				}
				
				
			}


}