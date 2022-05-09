package main;

public class RomanNumerals {

	public static void main(String[] args) {
		
		int num = 1305;
		String Roman = convertRoman(num);
		convertNumber(Roman);
	}
	
	public static void convertNumber(String Roman) {
		String RN = Roman;
		int count = 0;
		int countM = 0;
		int countMrow = 0;
		int countD = 0;
		int countC = 0;
		int countCrow = 0;
		int countL = 0;
		int countX = 0;
		int countXrow = 0;
		int countV = 0;
		int countI = 0;
		int countIrow = 0;
		
		String arr[] = RN.split("");	
		int size = arr.length;
				
		for(int i = 0; i < size; i++){
			if(arr[i].equalsIgnoreCase("M")&& countMrow < 3 && countM < 1){
				count = count + 1000;
				countMrow = countMrow + 1;
			}else if(arr[i].equalsIgnoreCase("D")&& countD == 0){
				count = count + 500;
				countD = 1;
			}else if(arr[i].equalsIgnoreCase("C")&& countCrow < 3 && countC < 1){
				if(i+1 < size) {
					if(arr[i+1].equalsIgnoreCase("M")) {
						count = count + 900;
						countC = 1;
						countM = 1;
						i = i + 1;
					}else if(arr[i+1].equalsIgnoreCase("D")) {
						count = count + 400;
						i = i + 1;
						countC = 1;
						countD = 1;
					}else {
						count = count + 100;
						countCrow = countCrow + 1;
					}
				}else {
					count = count + 100;
				}
			}else if(arr[i].equalsIgnoreCase("L")&& countL == 0){
				count = count + 50;
				countL = 1;
			}else if(arr[i].equalsIgnoreCase("X")&& countXrow < 3 && countX < 1){
				if(i+1 < size) {
					if(arr[i+1].equalsIgnoreCase("C")) {
						count = count + 90;
						i = i + 1;
						countX = 1;
						countC = 1;
					}else if(arr[i+1].equalsIgnoreCase("L")) {
						count = count + 40;
						i = i + 1;
						countX = 1;
						countL = 1;
					}else {
						count = count + 10;
						countXrow = countXrow + 1;
					}
				}else {
					count = count + 10;
				}
			}else if(arr[i].equalsIgnoreCase("V")&& countV == 0){
				count = count + 5;
				countV = 1;
			}else if(arr[i].equalsIgnoreCase("I")&& countIrow < 3 && countI < 1){
				if(i+1 < size) {
					if(arr[i+1].equalsIgnoreCase("X")) {
						count = count + 9;
						i = i + 1;
						countI = 1;
						countX = 1;
					}else if(arr[i+1].equalsIgnoreCase("V")) {
						count = count + 4;
						i = i + 1;
						countI = 1;
						countV = 1;
					}else {
						count = count + 1;
						countIrow = countIrow + 1;
					}
				}else {
					count = count + 1;
				}
			}else {
				System.out.println("Wrong Charater(s)");
				System.exit(0);
			}
		}
		System.out.println(count);
	}
	
	public static String convertRoman( int number){
		int num = number;
		String Rnum = "";
		if(num <= 3999) {
		while(num > 0) {
			if(num - 1000 >= 0) {
				Rnum = Rnum+"M";
				num = num - 1000;
			}else if(num - 900 >=0) {
				Rnum = Rnum+"CM";
				num = num - 900;
			}else if(num - 500 >=0) {
				Rnum = Rnum+"D";
				num = num - 500;
			}else if(num - 400 >=0) {
				Rnum = Rnum+"CD";
				num = num - 400;
			}else if(num - 100 >=0) {
				Rnum = Rnum+"C";
				num = num - 100;
			}else if(num - 90 >=0) {
				Rnum = Rnum+"XC";
				num = num - 90;
			}else if(num - 50 >=0) {
				Rnum = Rnum+"L";
				num = num - 50;
			}else if(num - 40 >=0) {
				Rnum = Rnum+"XL";
				num = num - 40;
			}else if(num - 10 >=0) {
				Rnum = Rnum+"X";
				num = num - 10;
			}else if(num - 9 >=0) {
				Rnum = Rnum+"IX";
				num = num - 9;
			}else if(num - 5 >=0) {
				Rnum = Rnum+"V";
				num = num - 5;
			}else if(num - 4 >=0) {
				Rnum = Rnum+"IV";
				num = num - 4;
			}else if(num - 1 >=0) {
				Rnum = Rnum+"I";
				num = num - 1;
			}
		}
		System.out.println(Rnum);
		}else {
		System.out.println("Number too large");
		}
		return Rnum;
	}

}
