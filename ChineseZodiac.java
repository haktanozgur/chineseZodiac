package com.haktanozgur.ChineseZodiac;

import java.util.Scanner;

public class ChineseZodiac {
	
/* zodiacName metodu içerisinde, switch-case yapısı kullanılarak,kullanıcıdan
 alınan yıl bilgisinin 12ye bölümünden kalan veriyi hesaplayarak, kullanıcıya
 Çin Zodyağı bilgisi döndürülür*/
	public static String zodiacName(int year) {
		
		String zodiacName = null;
		
		switch (year % 12) {
		case 0 : zodiacName = "Maymun"; break;
		case 1 : zodiacName = "Horoz"; break;
		case 2 : zodiacName = "Köpek"; break;
		case 3 : zodiacName = "Domuz"; break;
		case 4 : zodiacName = "Fare"; break;
		case 5 : zodiacName = "Öküz"; break;
		case 6 : zodiacName = "Kaplan"; break;
		case 7 : zodiacName = "Tavşan"; break;
		case 8 : zodiacName = "Ejderha"; break;
		case 9 : zodiacName = "Yılan"; break;
		case 10 : zodiacName = "At"; break;
		case 11 : zodiacName = "Koyun"; break;  
		}
		
		return zodiacName;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Doğum Yılınızı Giriniz : ");
		int year = scanner.nextInt();
		System.out.println("Çin Zodyağı Burcunuz : " + zodiacName(year));
	}
}
