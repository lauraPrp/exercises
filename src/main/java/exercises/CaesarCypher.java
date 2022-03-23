package  exercises;

public class CaesarCypher {

//private static 	String loAlphabet="abcdefghijklmnopqrstuvwxyz .,!?";
private static 	String loAlphabet="abcdefghijklmnopqrstuvwxyz";
private static 	String upAlphabet=loAlphabet.toUpperCase();
private static 	String loAlphabet2k="abcdefghijklmnopqrstuvwxyz";
private static 	String upAlphabet2k=loAlphabet2k.toUpperCase();

private static boolean isEven(int i) {
		if ((i % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}

	
public static String encrypt(String input,int key) {
StringBuilder encripted=new StringBuilder(input);

String loShiftedAlphabet = loAlphabet.substring(key)+loAlphabet.substring(0,key);
String upShiftedAlphabet = loShiftedAlphabet.toUpperCase();
String shiftedAlpha="";

System.out.println("Low:" + loAlphabet +"-");
System.out.println("UP:" + upAlphabet+"-");
for(int i=0;i<encripted.length();i++) {
	char currChar= encripted.charAt(i);
	char newChar='*';
	int idx=0;
			if(loAlphabet.indexOf(currChar)>=0){//is lowercase
				shiftedAlpha=loShiftedAlphabet;
				 idx= loAlphabet.indexOf(currChar);
				  newChar= shiftedAlpha.charAt(idx);
			}
			else if(upAlphabet.indexOf(currChar)>=0){//is uppercase
				shiftedAlpha=upShiftedAlphabet;
				 idx= upAlphabet.indexOf(currChar);
				  newChar= shiftedAlpha.charAt(idx);
			}
			else {
				//System.out.println("Char not found");
				 newChar= currChar;
				
			}	
			encripted.setCharAt(i, newChar);
	}
return encripted.toString();
}


public static String decrypt(String input,int key) {
StringBuilder encripted=new StringBuilder(input);
int key2=loAlphabet.length()-key;

String shiftedAlphabet = loAlphabet.substring(key2)+loAlphabet.substring(0,key2);
for(int i=0;i<encripted.length();i++) {
	char currChar= encripted.charAt(i);
	char newChar ='*';
	int idx= loAlphabet.indexOf(currChar);
	if(idx==-1)	idx= upAlphabet.indexOf(currChar);
	if(idx!=-1)  {		
		 shiftedAlphabet.charAt(idx);
        //Replace the ith character of encrypted with newChar
        if (Character.isLowerCase(currChar)) newChar=Character.toLowerCase(newChar);
        if (Character.isUpperCase(currChar)) newChar=Character.toUpperCase(newChar);
        ;
	}
	else 
	{
		newChar=currChar;
		//System.out.println("Char not found");
	}
	encripted.setCharAt(i, newChar);
}
return encripted.toString();
}
/*Write the method encryptTwoKeysthat has three parameters, a String named input,
and two integers named key1 and key2.This method returns a String that has been
encrypted using the following algorithm. Ã¹
Parameter key1is used to encrypt every other
character with the Caesar Cipher algorithm, starting with the first character, and key2is
used to encrypt every other character, starting with the second character. For example,
the call encryptTwoKeys(â€œFirst Legionâ€�, 23, 17)should return â€œCzojq
Ivdzleâ€�. Note the â€˜Fâ€™is encrypted with key 23, the first â€˜iâ€™with 17, the â€˜râ€™with 23,
and the â€˜sâ€™with 17, etc. Be sure to test this method*/
public static String  encrypt2keys(String input, int key1, int key2) {
	StringBuilder doubleEncrypted = new StringBuilder(input);
	String shiftedAlphabetK1 = loAlphabet2k.substring(key1)+loAlphabet2k.substring(0,key1);
	String shiftedAlphabetK2 = loAlphabet2k.substring(key2)+loAlphabet2k.substring(0,key2);
	String shiftedAlphabet="";
	char newChar = '*';
for(int i=0;i<doubleEncrypted.length();i++) {
	if(i==0||isEven(i)) {	
		shiftedAlphabet=shiftedAlphabetK1;
	}else { 
		shiftedAlphabet=shiftedAlphabetK2;
	}
	char currChar= doubleEncrypted.charAt(i);
	int idx= loAlphabet2k.indexOf(currChar);
	
	if(idx==-1)	{
		idx= upAlphabet2k.indexOf(currChar);
	}
	
	if(idx>-1) {	
		 newChar = shiftedAlphabet.charAt(idx);
        //Replace the ith character of encrypted with newChar
        if (Character.isLowerCase(currChar)) newChar=Character.toLowerCase(newChar);
        if (Character.isUpperCase(currChar)) newChar=Character.toUpperCase(newChar);
        
	}
	else {
		newChar=currChar;
		////System.out.println("Char not found");
	}
	doubleEncrypted.setCharAt(i, newChar);
}
	
	
return doubleEncrypted.toString();	
}



public static String  decrypt2keys(String input, int key1, int key2) {
	StringBuilder doubleEncrypted = new StringBuilder(input);
	String shiftedAlphabetK1 = loAlphabet2k.substring(key1)+loAlphabet2k.substring(0,key1);
	String shiftedAlphabetK2 = loAlphabet2k.substring(key2)+loAlphabet2k.substring(0,key2);
	String shiftedAlphabet="";
for(int i=0;i<doubleEncrypted.length();i++) {
	if(i==0||isEven(i)) {	
		shiftedAlphabet=shiftedAlphabetK1;
	}else { 
		shiftedAlphabet=shiftedAlphabetK2;
	}
	char currChar= doubleEncrypted.charAt(i);
	int idx= loAlphabet2k.indexOf(currChar);
	
	if(idx==-1)	{
		idx= upAlphabet2k.indexOf(currChar);
	}
	
	if(idx>-1) {	
		char newChar = shiftedAlphabet.charAt(idx);
        //Replace the ith character of encrypted with newChar
        if (Character.isLowerCase(currChar)) newChar=Character.toLowerCase(newChar);
        if (Character.isUpperCase(currChar)) newChar=Character.toUpperCase(newChar);
        doubleEncrypted.setCharAt(i, newChar);
	}
	else {
		//System.out.println("Char not found");
	}
}
	
	
return doubleEncrypted.toString();	
}
/*
Write the void method testCaesarthat has no parameters. This method should read a
file and encrypt the complete file using the Caesar Cipher algorithm, printing the
encrypted message. You may want to include the lines:
FileResource fr = new FileResource()Í¾
String message = fr.asString()Í¾
String encrypted = encrypt(message, key)Í¾
System.out.println("key is " + key + "\n" + encrypted)Í¾
*/


public static void main(String[] args) {
		// TODO Auto-generated method stub
	String tst= encrypt("FIRST LEGION ATTACK EAST FLANK!", 23);
	System.out.println(tst);
	/*String input= encrypt("Can you imagine life WITHOUT the internet AND computers in your pocket?", 15);
	String decript = decrypt(input, 5);
	System.out.println(input);
	System.out.println(decript);
	System.out.println("---------------------------");
	String inputDoubleKey=encrypt2keys("Can you imagine life WITHOUT the internet AND computers in your pocket?", 21, 18);
	System.out.println("String2k: "+inputDoubleKey);
	String inputDoubleKey2=encrypt2keys("Aal uttx hm aal Qtct Fhljha pl Wbdl Pvxvxlx",12, 2);
	
	System.out.println("decrypt2k: "+inputDoubleKey2);*/
	String input5= encrypt("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 15);
	System.out.println("input6 : "+input5);	

	String input6= encrypt2keys("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 8, 21);
			System.out.println("input6 : "+input6);	
}
}
