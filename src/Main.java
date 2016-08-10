import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main (String [] args){
        Kata kata = new Kata();

        // test compareToGauss
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.compareToGauss()");
        int userNumber = 66;

        int[] newRange = new int[2];
        newRange[0] = 44;
        newRange[1] = 155;

        System.out.println("Number: " + userNumber);
        System.out.println("Range: " + newRange[0] + " to " + newRange[1]);
        kata.compareToGauss(userNumber, newRange);

        // test sleepIn
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.compareToGauss()");
        System.out.println("Sleep in (not weekday, not vacation)? " + kata.sleepIn(false, false)); // → true
        System.out.println("Sleep in (weekday, not vacation)? " + kata.sleepIn(true, false)); // → false
        System.out.println("Sleep in (not weekday, vacation)? " + kata.sleepIn(false, true)); // → true

        // test monkeyTrouble
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.monkeyTrouble()");
        System.out.println("Monkey trouble true, true: " + kata.monkeyTrouble(true, true));  // → true	true	OK
        System.out.println("Monkey trouble false, false: " + kata.monkeyTrouble(false, false));  // → true	true	OK
        System.out.println("Monkey trouble true, false: " + kata.monkeyTrouble(true, false)); // → false	true	X
        System.out.println("Monkey trouble false, true: " + kata.monkeyTrouble(false, true));  // → false	true	X
        
        // test kata.sumDouble
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.sumDouble()");
        System.out.println("Sum double (1,2)" + kata.sumDouble(1, 2));  // → 3	3	OK
        System.out.println("Sum double (3,2)" + kata.sumDouble(3, 2));  // → 5	5	OK
        System.out.println("Sum double (2,2)" + kata.sumDouble(2, 2));  // → 8	8	OK
        System.out.println("Sum double (-1,0)" + kata.sumDouble(-1, 0));  // → -1	-1	OK
        System.out.println("Sum double (3,3)" + kata.sumDouble(3, 3));  // → 12	12	OK
        System.out.println("Sum double (0,0)" + kata.sumDouble(0, 0));  // → 0	0	OK
        System.out.println("Sum double (0,1)" + kata.sumDouble(0, 1));  // → 1	1	OK
        System.out.println("Sum double (3,4)" + kata.sumDouble(3, 4));  // → 7	7	OK

        // test kata.diff21
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.diff21()");
        System.out.println("diff21(19)" + kata.diff21(19));  // → 2	2	OK
        System.out.println("diff21(10)" + kata.diff21(10));  // → 11	11	OK
        System.out.println("diff21(21)" + kata.diff21(21));  // → 0	0	OK
        System.out.println("diff21(22)" + kata.diff21(22));  // → 2	2	OK
        System.out.println("diff21(25)" + kata.diff21(25));  // → 8	8	OK
        System.out.println("diff21(30)" + kata.diff21(30));  // → 18	18	OK
        System.out.println("diff21(0)" + kata.diff21(0));  // → 21	21	OK
        System.out.println("diff21(1)" + kata.diff21(1));  // → 20	20	OK
        System.out.println("diff21(2)" + kata.diff21(2));  // → 19	19	OK
        System.out.println("diff21(-1)" + kata.diff21(-1));  // → 22	22	OK
        System.out.println("diff21(-2)" + kata.diff21(-2));  // → 23	23	OK
        System.out.println("diff21(50)" + kata.diff21(50));  // → 58	58	OK

        //test parrotTrouble
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.parrotTrouble()");
        System.out.println("Parrot Trouble (true, 6): " + kata.parrotTrouble(true, 6));  // → true	true	OK
        System.out.println("Parrot Trouble (true, 7): " + kata.parrotTrouble(true, 7));  // → false	false	OK
        System.out.println("Parrot Trouble (false, 6): " + kata.parrotTrouble(false, 6));  // → false	false	OK
        System.out.println("Parrot Trouble (true, 21): " + kata.parrotTrouble(true, 21));  // → true	true	OK
        System.out.println("Parrot Trouble (false, 21): " + kata.parrotTrouble(false, 21));  // → false	false	OK
        System.out.println("Parrot Trouble (false, 20): " + kata.parrotTrouble(false, 20));  // → false	false	OK
        System.out.println("Parrot Trouble (true, 23): " + kata.parrotTrouble(true, 23));  // → true	true	OK
        System.out.println("Parrot Trouble (false, 23): " + kata.parrotTrouble(false, 23));  // → false	false	OK
        System.out.println("Parrot Trouble (true, 20): " + kata.parrotTrouble(true, 20));  // → false	false	OK
        System.out.println("Parrot Trouble (false, 12): " + kata.parrotTrouble(false, 12));  // → false	false	OK
        
        //test makes10
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.makes10()");
        System.out.println("makes 10 (9,10): " + kata.makes10(9, 10));  // → true	true	OK
        System.out.println("makes 10 (9,9): " + kata.makes10(9, 9));  // → false	false	OK
        System.out.println("makes 10 (1,10): " + kata.makes10(1, 9));  // → true	true	OK
        System.out.println("makes 10 (10,1): " + kata.makes10(10, 1));  // → true	true	OK
        System.out.println("makes 10 (10,10): " + kata.makes10(10, 10));  // → true	true	OK
        System.out.println("makes 10 (8,2): " + kata.makes10(8, 2));  // → true	true	OK
        System.out.println("makes 10 (8,3): " + kata.makes10(8, 3));  // → false	false	OK
        System.out.println("makes 10 (10,42): " + kata.makes10(10, 42));  // → true	true	OK
        System.out.println("makes 10 (12,-2): " + kata.makes10(12, -2));  // → true	true	OK

        // test nearHundred
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.nearHundred()");
        System.out.println("nearHundred(93): " + kata.nearHundred(93));  // → true	true	OK
        System.out.println("nearHundred(90): " + kata.nearHundred(90));  // → true	true	OK
        System.out.println("nearHundred(89): " + kata.nearHundred(89));  // → false	true	X
        System.out.println("nearHundred(110): " + kata.nearHundred(110));  // → true	true	OK
        System.out.println("nearHundred(111): " + kata.nearHundred(111));  // → false	true	X
        System.out.println("nearHundred(121): " + kata.nearHundred(121));  // → false	true	X
        System.out.println("nearHundred(0): " + kata.nearHundred(0));  // → false	true	X
        System.out.println("nearHundred(5): " + kata.nearHundred(5));  // → false	true	X
        System.out.println("nearHundred(191): " + kata.nearHundred(191));  // → true	true	OK
        System.out.println("nearHundred(189): " + kata.nearHundred(189));  // → false	true	X
        System.out.println("nearHundred(190): " + kata.nearHundred(190));  // → true	true	OK
        System.out.println("nearHundred(200): " + kata.nearHundred(200));  // → true	true	OK
        System.out.println("nearHundred(210): " + kata.nearHundred(210));  // → true	true	OK
        System.out.println("nearHundred(221): " + kata.nearHundred(211));  // → false	true	X
        System.out.println("nearHundred(290): " + kata.nearHundred(290));  // → false	true	X

        // test nearHundred
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.posNeg()");
        System.out.println("posNeg(1, -1, false): " + kata.posNeg(1, -1, false));  // → true	true	OK
        System.out.println("posNeg(-1, 1, false): " + kata.posNeg(-1, 1, false));  // → true	true	OK
        System.out.println("posNeg(-4, -5, true): " + kata.posNeg(-4, -5, true));  // → true	true	OK
        System.out.println("posNeg(-4, -5, false): " + kata.posNeg(-4, -5, false));  // → false	true	X
        System.out.println("posNeg(-4, 5, false): " + kata.posNeg(-4, 5, false));  // → true	true	OK
        System.out.println("posNeg(-4, 5, true): " + kata.posNeg(-4, 5, true));  // → false	false	OK
        System.out.println("posNeg(1, 1, false): " + kata.posNeg(1, 1, false));  // → false	false	OK
        System.out.println("posNeg(-1, -1, false): " + kata.posNeg(-1, -1, false));  // → false	true	X
        System.out.println("posNeg(1, -1, true): " + kata.posNeg(1, -1, true));  // → false	false	OK
        System.out.println("posNeg(-1, 1, true): " + kata.posNeg(-1, 1, true));  // → false	false	OK
        System.out.println("posNeg(1, 1, true): " + kata.posNeg(1, 1, true));  // → false	false	OK
        System.out.println("posNeg(-1, -1, true): " + kata.posNeg(-1, -1, true));  // → true	true	OK
        System.out.println("posNeg(5, -5, false): " + kata.posNeg(5, -5, false));  // → true	true	OK
        System.out.println("posNeg(-6, 6, false): " + kata.posNeg(-6, 6, false));  // → true	true	OK
        System.out.println("posNeg(-5, -6, false): " + kata.posNeg(-5, -6, false));  // → false	true	X
        System.out.println("posNeg(-2, -1, false): " + kata.posNeg(-2, -1, false));  // → false	true	X
        System.out.println("posNeg(1, 2, false): " + kata.posNeg(1, 2, false));  // → false	false	OK
        System.out.println("posNeg(-5, 6, true): " + kata.posNeg(-5, 6, true));  // → false	false	OK
        System.out.println("posNeg(-5, -5, true): " + kata.posNeg(-5, -5, true));  // → true

        // test nearHundred
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.notString()");
        System.out.println("notString(\"not candy\"): " + kata.notString("candy"));  // → "not candy"	"not candy"	OK
        System.out.println("notString(\"X\"): " + kata.notString("x"));  // → "not x"	"not x"	OK
        System.out.println("notString(\"not bad\"): " + kata.notString("not bad"));  // → "not bad"	"not not bad"	X
        System.out.println("notString(\"bad\"): " + kata.notString("bad"));  // → "not bad"	"not bad"	OK
        System.out.println("notString(\"not\"): " + kata.notString("not"));  // → "not"	"not not"	X
        System.out.println("notString(\"is not\"): " + kata.notString("is not"));  // → "not is not"	"not is not"	OK
        System.out.println("notString(\"no\"): " + kata.notString("no"));  // → "not no"	"not no"

        // test nearHundred
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.missingChar()");
        System.out.println("notString(\"kitten\", 1): " + kata.missingChar("kitten", 1));  // → "ktten"	"ktten"	OK
        System.out.println("notString(\"kitten\", 0): " + kata.missingChar("kitten", 0));  // → "itten"	"itten"	OK
        System.out.println("notString(\"kitten\", 4): " + kata.missingChar("kitten", 4));  // → "kittn"	"kittn"	OK
        System.out.println("notString(\"Hi\", 0): " + kata.missingChar("Hi", 0));  // → "i"	"i"	OK
        System.out.println("notString\"Hi\", 1): " + kata.missingChar("Hi", 1));  // → "H"	""	X
        System.out.println("notString(\"code\", 0): " + kata.missingChar("code", 0));  // → "ode"	"ode"	OK
        System.out.println("notString(\"code\", 1): " + kata.missingChar("code", 1));  // → "cde"	"cde"	OK
        System.out.println("notString(\"code\", 2): " + kata.missingChar("code", 2));  // → "coe"	"coe"	OK
        System.out.println("notString(\"code\", 3): " + kata.missingChar("code", 3));  // → "cod"	"co"	X
        System.out.println("notString(\"chocolate\", 8): " + kata.missingChar("chocolate", 8));  // → "chocolat"	"chocola"	X

        // test nearHundred
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.frontBack()");
        System.out.println("frontBack(\"code\"): " + kata.frontBack("code"));  // → "eodc"	"eodc"	OK
        System.out.println("frontBack(\"a\"): " + kata.frontBack("a"));  // → "a"	"a"	OK
        System.out.println("frontBack(\"ab\"): " + kata.frontBack("ab"));  // → "ba"	"ba"	OK
        System.out.println("frontBack(\"abc\"): " + kata.frontBack("abc"));  // → "cba"	"cba"	OK
        System.out.println("frontBack(\"\"): " + kata.frontBack(""));  // → ""	""	OK
        System.out.println("frontBack(\"Chocolate\"): " + kata.frontBack("Chocolate"));  // → "ehocolatC"	"ehocolatC"	OK
        System.out.println("frontBack(\"aavJ\"): " + kata.frontBack("aavJ"));  // → "Java"	"Java"	OK
        System.out.println("frontBack(\"hello\"): " + kata.frontBack("hello"));  // → "oellh"	"oellh"	OK

        // test nearHundred
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.front3()");
        System.out.println("front3(\"Java\"): " + kata.front3("Java"));  // → "JavJavJav"	"Java"	X
        System.out.println("front3(\"Chocolate\"): " + kata.front3("Chocolate"));  // → "ChoChoCho"	"Chocolate"	X
        System.out.println("front3(\"abc\"): " + kata.front3("abc"));  // → "abcabcabc"	"abcabcabc"	OK
        System.out.println("front3(\"abcXYZ\"): " + kata.front3("abcXYZ"));  // → "abcabcabc"	"abcXYZ"	X
        System.out.println("front3(\"ab\"): " + kata.front3("ab"));  // → "ababab"	Exception:java.lang.StringIndexOutOfBoundsException: String index out of range: 3 (line number:5)	X
        System.out.println("front3(\"a\"): " + kata.front3("a"));  // → "aaa"	Exception:java.lang.StringIndexOutOfBoundsException: String index out of range: 3 (line number:5)	X
        System.out.println("front3(\"\"): " + kata.front3(""));  // → ""	Exception:java.lang.StringIndexOutOfBoundsException: String index out of range: 3 (line number:5)	X

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.backAround()");
        System.out.println("backAround(\"cat\"): " + kata.backAround("cat"));  // → "tcatt"	"tcatt"	OK
        System.out.println("backAround(\"Hello\"): " + kata.backAround("Hello"));  // → "oHelloo"	"oHelloo"	OK
        System.out.println("backAround(\"a\"): " + kata.backAround("a"));  // → "aaa"	"aaa"	OK
        System.out.println("backAround(\"abc\"): " + kata.backAround("abc"));  // → "cabcc"	"cabcc"	OK
        System.out.println("backAround(\"read\"): " + kata.backAround("read"));  // → "dreadd"	"dreadd"	OK
        System.out.println("backAround(\"boo\"): " + kata.backAround("boo"));  // → "obooo"	"obooo"	OK

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.or35()");
        System.out.println("or35(3): " + kata.or35(3));  // → true	true	OK
        System.out.println("or35(10): " + kata.or35(10));  // → true	true	OK
        System.out.println("or35(8): " + kata.or35(8));  // → false	false	OK
        System.out.println("or35(15): " + kata.or35(15));  // → true	true	OK
        System.out.println("or35(5): " + kata.or35(5));  // → true	true	OK
        System.out.println("or35(9): " + kata.or35(9));  // → true	true	OK
        System.out.println("or35(4): " + kata.or35(4));  // → false	false	OK
        System.out.println("or35(7): " + kata.or35(7));  // → false	false	OK
        System.out.println("or35(6): " + kata.or35(6));  // → true	true	OK
        System.out.println("or35(17): " + kata.or35(17));  // → false	false	OK
        System.out.println("or35(18): " + kata.or35(18));  // → true	true	OK
        System.out.println("or35(29): " + kata.or35(29));  // → false	false	OK
        System.out.println("or35(209): " + kata.or35(20));  // → true	true	OK
        System.out.println("or35(21): " + kata.or35(21));  // → true	true	OK
        System.out.println("or35(22): " + kata.or35(22));  // → false	false	OK
        System.out.println("or35(45): " + kata.or35(45));  // → true	true	OK
        System.out.println("or35(99): " + kata.or35(99));  // → true	true	OK
        System.out.println("or35(100): " + kata.or35(100));  // → true	true	OK
        System.out.println("or35(101): " + kata.or35(101));  // → false	false	OK
        System.out.println("or35(121): " + kata.or35(121));  // → false	false	OK
        System.out.println("or35(122): " + kata.or35(122));  // → false	false	OK
        System.out.println("or35(123): " + kata.or35(123));  // → true	true	OK


        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.front22()");
        System.out.println("front22(\"kitten\"): " + kata.front22("kitten"));  // → "kikittenki"	"kikittenki"	OK
        System.out.println("front22(\"Ha\"): " + kata.front22("Ha"));  // → "HaHaHa"	"HaHaHa"	OK
        System.out.println("front22(\"abc\"): " + kata.front22("abc"));  // → "ababcab"	"ababcab"	OK
        System.out.println("front22(\"ab\"): " + kata.front22("ab"));  // → "ababab"	"ababab"	OK
        System.out.println("front22(\"a\"): " + kata.front22("a"));  // → "aaa"	"aaa"	OK
        System.out.println("front22(\"\"): " + kata.front22(""));  // → ""	""	OK
        System.out.println("front22(\"Logic\"): " + kata.front22("Logic"));  // → "LoLogicLo"	"LoLogicLo"	OK

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.startHi()");
        System.out.println("startHi(\"hi there\"): " + kata.startHi("hi there"));  // → true	false	X
        System.out.println("startHi(\"hi\"): " + kata.startHi("hi"));  // → true	true	OK
        System.out.println("startHi(\"hello hi\"): " + kata.startHi("hello hi"));  // → false	false	OK
        System.out.println("startHi(\"he\"): " + kata.startHi("he"));  // → false	false	OK
        System.out.println("startHi(\"h\"): " + kata.startHi("h"));  // → false	false	OK
        System.out.println("startHi(\"\"): " + kata.startHi(""));  // → false	false	OK
        System.out.println("startHi(\"ho hi\"): " + kata.startHi("ho hi"));  // → false	false	OK
        System.out.println("startHi(\"hi ho\"): " + kata.startHi("hi ho"));  // → true	false	X

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.icyHot()");
        System.out.println("icyHot(120, -1): " + kata.icyHot(120, -1));  // → true	true	OK
        System.out.println("icyHot(-1, 120): " + kata.icyHot(-1, 120));  // → true	true	OK
        System.out.println("icyHot(2, 120): " + kata.icyHot(2, 120));  // → false	false	OK
        System.out.println("icyHot(-1, 100): " + kata.icyHot(-1, 100));  // → false	false	OK
        System.out.println("icyHot(-2, -2): " + kata.icyHot(-2, -2));  // → false	false	OK
        System.out.println("icyHot(120, 120): " + kata.icyHot(120, 120));  // → false	false	OK

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.in1020()");
        System.out.println("in1020(12, 99): " + kata.in1020(12, 99));  // → true	true	OK
        System.out.println("in1020(21, 12): " + kata.in1020(21, 12));  // → true	true	OK
        System.out.println("in1020(8, 99): " + kata.in1020(8, 99));  // → false	false	OK
        System.out.println("in1020(99, 10): " + kata.in1020(99, 10));  // → true	true	OK
        System.out.println("in1020(20, 20): " + kata.in1020(20, 20));  // → true	true	OK
        System.out.println("in1020(21, 21): " + kata.in1020(21, 21));  // → false	false	OK
        System.out.println("in1020(9, 9): " + kata.in1020(9, 9));  // → false	false	OK

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.hasTeen()");
        System.out.println("in1020(13, 20, 10): " + kata.hasTeen(13, 20, 10));  // → true	true	OK
        System.out.println("in1020(20, 19, 10): " + kata.hasTeen(20, 19, 10));  // → true	true	OK
        System.out.println("in1020(20, 10, 13): " + kata.hasTeen(20, 10, 13));  // → true	true	OK
        System.out.println("in1020(1, 20, 12): " + kata.hasTeen(1, 20, 12));  // → false	false	OK
        System.out.println("in1020(19, 20, 12): " + kata.hasTeen(19, 20, 12));  // → true	true	OK
        System.out.println("in1020(12, 20, 19): " + kata.hasTeen(12, 20, 19));  // → true	true	OK
        System.out.println("in1020(12, 9, 20): " + kata.hasTeen(12, 9, 20));  // → false	false	OK
        System.out.println("in1020(12, 18, 20): " + kata.hasTeen(12, 18, 20));  // → true	true	OK
        System.out.println("in1020(14, 2, 20): " + kata.hasTeen(14, 2, 20));  // → true	true	OK
        System.out.println("in1020(4, 2, 20): " + kata.hasTeen(4, 2, 20));  // → false	false	OK
        System.out.println("in1020(11, 22, 22): " + kata.hasTeen(11, 22, 22));  // → false	false	OK

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.loneTeen()");
        System.out.println("loneTeen(13, 99): " + kata.loneTeen(13, 99));  // → true	true	OK
        System.out.println("loneTeen(21, 19): " + kata.loneTeen(21, 19));  // → true	true	OK
        System.out.println("loneTeen(13, 13): " + kata.loneTeen(13, 13));  // → false	false	OK
        System.out.println("loneTeen(14, 20): " + kata.loneTeen(14, 20));  // → true	true	OK
        System.out.println("loneTeen(20, 15): " + kata.loneTeen(20, 15));  // → true	true	OK
        System.out.println("loneTeen(16, 17): " + kata.loneTeen(16, 17));  // → false	false	OK
        System.out.println("loneTeen(16, 9): " + kata.loneTeen(16, 9));  // → true	true	OK
        System.out.println("loneTeen(16, 18): " + kata.loneTeen(16, 18));  // → false	false	OK
        System.out.println("loneTeen(13, 19): " + kata.loneTeen(13, 19));  // → false	false	OK
        System.out.println("loneTeen(13, 20): " + kata.loneTeen(13, 20));  // → true	true	OK
        System.out.println("loneTeen(6, 18): " + kata.loneTeen(6, 18));  // → true	true	OK
        System.out.println("loneTeen(99, 13): " + kata.loneTeen(99, 13));  // → true	true	OK
        System.out.println("loneTeen(99, 99): " + kata.loneTeen(99, 99));  // → false	false	OK

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.delDel()");
        System.out.println("delDel(\"adelbc\")): " + kata.delDel("adelbc"));  // → "abc"	"adelbc"	X
        System.out.println("delDel(\"adelHello\")): " + kata.delDel("adelHello"));  // → "aHello"	"adelHello"	X
        System.out.println("delDel(\"adedbc\")): " + kata.delDel("adedbc"));  // → "adedbc"	"adedbc"	OK
        System.out.println("delDel(\"abcdel\")): " + kata.delDel("abcdel"));  // → "abcdel"	"abcdel"	OK
        System.out.println("delDel(\"add\")): " + kata.delDel("add"));  // → "add"	"add"	OK
        System.out.println("delDel(\"ad\")): " + kata.delDel("ad"));  // → "ad"	Exception:java.lang.StringIndexOutOfBoundsException: String index out of range: 3 (line number:2)	X
        System.out.println("delDel(\"a\")): " + kata.delDel("a"));  // → "a"	Exception:java.lang.StringIndexOutOfBoundsException: String index out of range: 3 (line number:2)	X
        System.out.println("delDel(\"\")): " + kata.delDel(""));  // → ""	Exception:java.lang.StringIndexOutOfBoundsException: String index out of range: 3 (line number:2)	X
        System.out.println("delDel(\"del\")): " + kata.delDel("del"));  // → "del"	"del"	OK
        System.out.println("delDel(\"adel\")): " + kata.delDel("adel"));  // → "a"	"adel"	X
        System.out.println("delDel(\"aadelbb\")): " + kata.delDel("aadelbb"));  // → "aadelbb"	"aadelbb"	OK

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.mixStart()");
        System.out.println("mixStart(\"mix snacks\")): " + kata.mixStart("mix snacks"));  // → true	false	X
        System.out.println("mixStart(\"pix snacks\")): " + kata.mixStart("pix snacks"));  // → true	false	X
        System.out.println("mixStart(\"piz snacks\")): " + kata.mixStart("piz snacks"));  // → false	false	OK
        System.out.println("mixStart(\"nix\")): " + kata.mixStart("nix"));  // → true	true	OK
        System.out.println("mixStart(\"8ix\")): " + kata.mixStart("8ix"));  // → true	true	OK
        System.out.println("mixStart(\"ni\")): " + kata.mixStart("ni"));  // → false	false	OK
        System.out.println("mixStart(\"n\")): " + kata.mixStart("n"));  // → false	false	OK
        System.out.println("mixStart(\"\")): " + kata.mixStart(""));  // → false	false	OK

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.startOz()");
        System.out.println("startOz(\"ozymandias\")): " + kata.startOz("ozymandias"));  // → "oz"	"o"	X
        System.out.println("startOz(\"bzoo\")): " + kata.startOz("bzoo"));  // → "z"	""	X
        System.out.println("startOz(\"oxx\")): " + kata.startOz("oxx"));  // → "o"	"o"	OK
        System.out.println("startOz(\"oz\")): " + kata.startOz("oz"));  // → "oz"	"o"	X
        System.out.println("startOz(\"ounce\")): " + kata.startOz("ounce"));  // → "o"	"o"	OK
        System.out.println("startOz(\"o\")): " + kata.startOz("o"));  // → "o"	"o"	OK
        System.out.println("startOz(\"abc\")): " + kata.startOz("abc"));  // → ""	""	OK
        System.out.println("startOz(\"\")): " + kata.startOz(""));  // → ""	Exception:java.lang.StringIndexOutOfBoundsException: String index out of range: 1 (line number:2)	X
        System.out.println("startOz(\"zoo\")): " + kata.startOz("zoo"));  // → ""	""	OK
        System.out.println("startOz(\"aztec\")): " + kata.startOz("aztec"));  // → "z"	""	X
        System.out.println("startOz(\"zzzz\")): " + kata.startOz("zzzz"));  // → "z"	""	X
        System.out.println("startOz(\"oznic\")): " + kata.startOz("oznic"));  // → "oz"	"o"	X

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.intMax()");
        System.out.println("intMax(1, 2, 3)): " + kata.intMax(1, 2, 3));  // → 3	3	OK
        System.out.println("intMax(1, 3, 2)): " + kata.intMax(1, 3, 2));  // → 3	3	OK
        System.out.println("intMax(3, 2, 1)): " + kata.intMax(3, 2, 1));  // → 3	3	OK
        System.out.println("intMax(9, 3, 3)): " + kata.intMax(9, 3, 3));  // → 9	9	OK
        System.out.println("intMax(3, 9, 3)): " + kata.intMax(3, 9, 3));  // → 9	9	OK
        System.out.println("intMax(3, 3, 9)): " + kata.intMax(3, 3, 9));  // → 9	9	OK
        System.out.println("intMax(8, 2, 3)): " + kata.intMax(8, 2, 3));  // → 8	8	OK
        System.out.println("intMax(-3, -1, -2)): " + kata.intMax(-3, -1, -2));  // → -1	-1	OK
        System.out.println("intMax(6, 2, 5)): " + kata.intMax(6, 2, 5));  // → 6	6	OK
        System.out.println("intMax(5, 6, 2)): " + kata.intMax(5, 6, 2));  // → 6	6	OK
        System.out.println("intMax(5, 2, 6)): " + kata.intMax(5, 2, 6));  // → 6	6	OK

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.close10()");
        System.out.println("close10(8, 13)): " + kata.close10(8, 13));  // → 8	8	OK
        System.out.println("close10(13, 8)): " + kata.close10(13, 8));  // → 8	8	OK
        System.out.println("close10(13, 7)): " + kata.close10(13, 7));  // → 0	0	OK
        System.out.println("close10(7, 13)): " + kata.close10(7, 13));  // → 0	0	OK
        System.out.println("close10(9, 13)): " + kata.close10(9, 13));  // → 9	9	OK
        System.out.println("close10(13, 8)): " + kata.close10(13, 8));  // → 8	8	OK
        System.out.println("close10(10, 12)): " + kata.close10(10, 12));  // → 10	10	OK
        System.out.println("close10(11, 10)): " + kata.close10(11, 10));  // → 10	10	OK
        System.out.println("close10(5, 21)): " + kata.close10(5, 21));  // → 5	5	OK
        System.out.println("close10(0, 20)): " + kata.close10(0, 20));  // → 0	0	OK
        System.out.println("close10(10, 10)): " + kata.close10(10, 10));  // → 0	0	OK

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.in3050()");
        System.out.println("in3050(30, 31)): " + kata.in3050(30, 31));  // → true	true	OK
        System.out.println("in3050(30, 41)): " + kata.in3050(30, 41));  // → false	false	OK
        System.out.println("in3050(40, 50)): " + kata.in3050(40, 50));  // → true	true	OK
        System.out.println("in3050(40, 51)): " + kata.in3050(40, 51));  // → false	false	OK
        System.out.println("in3050(39, 50)): " + kata.in3050(39, 50));  // → false	false	OK
        System.out.println("in3050(50, 39)): " + kata.in3050(50, 39));  // → false	false	OK
        System.out.println("in3050(40, 39)): " + kata.in3050(40, 39));  // → true	true	OK
        System.out.println("in3050(49, 48)): " + kata.in3050(49, 48));  // → true	true	OK
        System.out.println("in3050(50, 40)): " + kata.in3050(50, 40));  // → true	true	OK
        System.out.println("in3050(50, 51)): " + kata.in3050(50, 51));  // → false	false	OK
        System.out.println("in3050(35, 36)): " + kata.in3050(35, 36));  // → true	true	OK
        System.out.println("in3050(35, 45)): " + kata.in3050(35, 45));  // → false	false	OK

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.max1020()");
        System.out.println("max1020(11, 19)): " + kata.max1020(11, 19));  // → 19	19	OK
        System.out.println("max1020(19, 11)): " + kata.max1020(19, 11));  // → 19	19	OK
        System.out.println("max1020(11,  9)): " + kata.max1020(11,  9));  // → 11	11	OK
        System.out.println("max1020(9,  21)): " + kata.max1020(9,  21));  // → 0	0	OK
        System.out.println("max1020(10, 21)): " + kata.max1020(10, 21));  // → 10	10	OK
        System.out.println("max1020(21, 10)): " + kata.max1020(21, 10));  // → 10	10	OK
        System.out.println("max1020(9,  11)): " + kata.max1020(9,  11));  // → 11	11	OK
        System.out.println("max1020(23, 10)): " + kata.max1020(23, 10));  // → 10	10	OK
        System.out.println("max1020(20, 10)): " + kata.max1020(20, 10));  // → 20	20	OK
        System.out.println("max1020(7,  20)): " + kata.max1020(7,  20));  // → 20	20	OK
        System.out.println("max1020(17, 16)): " + kata.max1020(17, 16));  // → 17	17	OK

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.stringE()");
        System.out.println("stringE(\"Hello\")): " + kata.stringE("Hello"));  // → true	Exception:java.lang.StringIndexOutOfBoundsException: String index out of range: 5 (line number:7)	X
        System.out.println("stringE(\"Heelle\")): " + kata.stringE("Heelle"));  // → true	Exception:java.lang.StringIndexOutOfBoundsException: String index out of range: 6 (line number:7)	X
        System.out.println("stringE(\"Heelele\")): " + kata.stringE("Heelele"));  // → false	Exception:java.lang.StringIndexOutOfBoundsException: String index out of range: 7 (line number:7)	X
        System.out.println("stringE(\"Hll\")): " + kata.stringE("Hll"));  // → false	false	OK
        System.out.println("stringE(\"e\")): " + kata.stringE("e"));  // → true	Exception:java.lang.StringIndexOutOfBoundsException: String index out of range: 1 (line number:7)	X
        System.out.println("stringE(\"\")): " + kata.stringE(""));  // → false	false	OK

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.stringE()");
        System.out.println("stringE(7,    17)): " + kata.lastDigit(7,    17));  // → true	true	OK
        System.out.println("stringE(6,    17)): " + kata.lastDigit(6,    17));  // → false	false	OK
        System.out.println("stringE(3,   113)): " + kata.lastDigit(3,   113));  // → true	true	OK
        System.out.println("stringE(114, 113)): " + kata.lastDigit(114, 113));  // → false	false	OK
        System.out.println("stringE(114,   4)): " + kata.lastDigit(114,   4));  // → true	true	OK
        System.out.println("stringE(10,    0)): " + kata.lastDigit(10,    0));  // → true	true	OK
        System.out.println("stringE(11,    0)): " + kata.lastDigit(11,    0));  // → false	false	OK

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.endUp()");
        System.out.println("endUp(\"Hello\")): " + kata.endUp("Hello"));  // → "HeLLO"	"HELLO"	X
        System.out.println("endUp(\"hi there\")): " + kata.endUp("hi there"));  // → "hi thERE"	"HI THERE"	X
        System.out.println("endUp(\"hi\")): " + kata.endUp("hi"));  // → "HI"	"HI"	OK
        System.out.println("endUp(\"woo hoo\")): " + kata.endUp("woo hoo"));  // → "woo HOO"	"WOO HOO"	X
        System.out.println("endUp(\"xyz12\")): " + kata.endUp("xyz12"));  // → "xyZ12"	"XYZ12"	X
        System.out.println("endUp(\"x\")): " + kata.endUp("x"));  // → "X"	Exception:java.lang.StringIndexOutOfBoundsException: String index out of range: -1 (line number:5)	X
        System.out.println("endUp(\"\")): " + kata.endUp(""));  // → ""	Exception:java.lang.StringIndexOutOfBoundsException: String index out of range: -2 (line number:5)	X

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing Kata.endUp()");
        System.out.println("endUp(\"Miracle\",      2)): " + kata.everyNth("Miracle", 2));  // → "Mrce"	"Mrc"	X	
        System.out.println("endUp(\"abcdefg\",      2)): " + kata.everyNth("abcdefg", 2));  // → "aceg"	"ace"	X	
        System.out.println("endUp(\"abcdefg\",      3)): " + kata.everyNth("abcdefg", 3));  // → "adg"	"ad"	X	
        System.out.println("endUp(\"Chocolate\",    3)): " + kata.everyNth("Chocolate", 3));  // → "Cca"	"Cca"	OK	
        System.out.println("endUp(\"Chocolates\",   3)): " + kata.everyNth("Chocolates", 3));  // → "Ccas"	"Cca"	X	
        System.out.println("endUp(\"Chocolates\",   4)): " + kata.everyNth("Chocolates", 4));  // → "Coe"	"Coe"	OK	
        System.out.println("endUp(\"Chocolates\", 100)): " + kata.everyNth("Chocolates", 100));  // → "C"	"C"	OK

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("testing kata.explode()");
        System.out.println("explode(\"example\") " + kata.explode("example"));
        System.out.println("explode(\"cat\") " + kata.explode("cat"));
        System.out.println("explode(\"c\") " + kata.explode("c"));
        System.out.println("explode(\"\") " + kata.explode(""));
        System.out.println("explode(\"craft\") " + kata.explode("craft"));
        System.out.println("explode(\"Capital\") " + kata.explode("Capital"));
        System.out.println("explode(\"home time\") " + kata.explode("home time"));

    }
}