package lam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Kunden;

public class Spisok {
	public static 	List<Kunden> kundenList = new ArrayList<>(Arrays.asList( 
			 
			  new Kunden(  1,
			   "Hermon",
			   "Blumsom",
			   "hblumsom0@dyndns.org",
			   "Male",
			   "14.113.86.254"
			), 
			  new Kunden(  2,
			   "Jo",
			   "Leate",
			   "jleate1@sakura.ne.jp",
			   "Female",
			   "16.73.113.246"
			), 
			  new Kunden(  3,
			   "Milty",
			   "Winship",
			   "mwinship2@canalblog.com",
			   "Male",
			   "175.100.90.180"
			), 
			  new Kunden(  4,
			   "Fernanda",
			   "Epperson",
			   "fepperson3@biglobe.ne.jp",
			   "Female",
			   "234.38.113.167"
			), 
			  new Kunden(  5,
			   "Diane-marie",
			   "Thrustle",
			   "dthrustle4@mayoclinic.com",
			   "Female",
			   "237.152.166.242"
			), 
			  new Kunden(  6,
			   "Ignacius",
			   "Spurdens",
			   "ispurdens5@ameblo.jp",
			   "Male",
			   "76.237.181.194"
			), 
			  new Kunden(  7,
			   "Keith",
			   "Morris",
			   "kmorris6@abc.net.au",
			   "Male",
			   "180.198.217.119"
			), 
			  new Kunden(  8,
			   "Tamiko",
			   "Shuttleworth",
			   "tshuttleworth7@umich.edu",
			   "Female",
			   "198.3.158.204"
			), 
			  new Kunden(  9,
			   "Vonni",
			   "Stienton",
			   "vstienton8@last.fm",
			   "Female",
			   "46.212.75.22"
			), 
			  new Kunden(  10,
			   "Nichole",
			   "Siggins",
			   "nsiggins9@eepurl.com",
			   "Female",
			   "12.65.179.226"
			), 
			  new Kunden(  11,
			   "Nerta",
			   "Dunkley",
			   "ndunkleya@cmu.edu",
			   "Female",
			   "213.11.4.169"
			), 
			  new Kunden(  12,
			   "Lanie",
			   "Swadden",
			   "lswaddenb@shop-pro.jp",
			   "Male",
			   "32.229.92.128"
			), 
			  new Kunden(  13,
			   "Anette",
			   "Davidowich",
			   "adavidowichc@mapy.cz",
			   "Female",
			   "142.22.178.171"
			), 
			  new Kunden(  14,
			   "Lenore",
			   "Compston",
			   "lcompstond@odnoklassniki.ru",
			   "Female",
			   "163.52.113.111"
			), 
			  new Kunden(  15,
			   "Jasmina",
			   "Allwood",
			   "jallwoode@usda.gov",
			   "Female",
			   "200.215.222.221"
			), 
			  new Kunden(  16,
			   "Tobiah",
			   "Diprose",
			   "tdiprosef@wix.com",
			   "Male",
			   "32.40.230.39"
			), 
			  new Kunden(  17,
			   "Sarge",
			   "Carlon",
			   "scarlong@scientificamerican.com",
			   "Male",
			   "149.11.88.175"
			), 
			  new Kunden(  18,
			   "Jefferson",
			   "Piggrem",
			   "jpiggremh@paginegialle.it",
			   "Male",
			   "24.173.128.113"
			), 
			  new Kunden(  19,
			   "Gael",
			   "Bailie",
			   "gbailiei@imageshack.us",
			   "Female",
			   "79.151.93.237"
			), 
			  new Kunden(  20,
			   "Hunfredo",
			   "Thaw",
			   "hthawj@seattletimes.com",
			   "Male",
			   "244.118.168.177"
			), 
			  new Kunden(  21,
			   "Fredia",
			   "Frensche",
			   "ffrenschek@pen.io",
			   "Female",
			   "38.120.206.91"
			), 
			  new Kunden(  22,
			   "Philippine",
			   "De Ferraris",
			   "pdeferrarisl@1688.com",
			   "Female",
			   "0.231.66.143"
			), 
			  new Kunden(  23,
			   "Dorena",
			   "Pedroli",
			   "dpedrolim@mashable.com",
			   "Female",
			   "50.122.209.76"
			), 
			  new Kunden(  24,
			   "Berri",
			   "Woodier",
			   "bwoodiern@lycos.com",
			   "Female",
			   "91.147.15.40"
			), 
			  new Kunden(  25,
			   "Frederique",
			   "De Brett",
			   "fdebretto@nba.com",
			   "Female",
			   "75.219.191.244" )
			));
	
	
	public static 	List<Bumaga> listok = new ArrayList<>(Arrays.asList( 
			new Bumaga(1, "Amit"),
			new Bumaga(5, "Rahul"),
			new Bumaga(2, "Jai"),
			new Bumaga(6, "Amit"),
			new Bumaga(100, "Amit"),
			new Bumaga(101, "Vijay") ,
			new Bumaga(101, "Aga") ,
			new Bumaga(102, "Rahul") ,
			new Bumaga(1 , "privet") ,
			new Bumaga(1 , "kak dela") ,
			new Bumaga(5 , "bla bla") ,
			new Bumaga( 2, "huhu") 
			));
	
	public static Map<Integer, String> fillMap() {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		return map;

	}
}
