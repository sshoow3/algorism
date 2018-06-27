package com.study.algorithm;

public class Quest013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
아래에 50자리 숫자가 100개 있습니다. 이것을 모두 더한 값의 첫 10자리는 얼마입니까?

37107287533902102798797998220837590246510135740250
46376937677490009712648124896970078050417018260538
74324986199524741059474233309513058123726617309629
91942213363574161572522430563301811072406154908250
23067588207539346171171980310421047513778063246676
89261670696623633820136378418383684178734361726757
28112879812849979408065481931592621691275889832738
44274228917432520321923589422876796487670272189318
47451445736001306439091167216856844588711603153276
70386486105843025439939619828917593665686757934951
62176457141856560629502157223196586755079324193331
64906352462741904929101432445813822663347944758178
92575867718337217661963751590579239728245598838407
58203565325359399008402633568948830189458628227828
80181199384826282014278194139940567587151170094390
35398664372827112653829987240784473053190104293586
86515506006295864861532075273371959191420517255829
71693888707715466499115593487603532921714970056938
54370070576826684624621495650076471787294438377604
53282654108756828443191190634694037855217779295145
36123272525000296071075082563815656710885258350721
45876576172410976447339110607218265236877223636045
17423706905851860660448207621209813287860733969412
81142660418086830619328460811191061556940512689692
51934325451728388641918047049293215058642563049483
62467221648435076201727918039944693004732956340691
15732444386908125794514089057706229429197107928209
55037687525678773091862540744969844508330393682126
18336384825330154686196124348767681297534375946515
80386287592878490201521685554828717201219257766954
78182833757993103614740356856449095527097864797581
16726320100436897842553539920931837441497806860984
48403098129077791799088218795327364475675590848030
87086987551392711854517078544161852424320693150332
59959406895756536782107074926966537676326235447210
69793950679652694742597709739166693763042633987085
41052684708299085211399427365734116182760315001271
65378607361501080857009149939512557028198746004375
35829035317434717326932123578154982629742552737307
94953759765105305946966067683156574377167401875275
88902802571733229619176668713819931811048770190271
25267680276078003013678680992525463401061632866526
36270218540497705585629946580636237993140746255962
24074486908231174977792365466257246923322810917141
91430288197103288597806669760892938638285025333403
34413065578016127815921815005561868836468420090470
23053081172816430487623791969842487255036638784583
11487696932154902810424020138335124462181441773470
63783299490636259666498587618221225225512486764533
67720186971698544312419572409913959008952310058822
95548255300263520781532296796249481641953868218774
76085327132285723110424803456124867697064507995236
37774242535411291684276865538926205024910326572967
23701913275725675285653248258265463092207058596522
29798860272258331913126375147341994889534765745501
18495701454879288984856827726077713721403798879715
38298203783031473527721580348144513491373226651381
34829543829199918180278916522431027392251122869539
40957953066405232632538044100059654939159879593635
29746152185502371307642255121183693803580388584903
41698116222072977186158236678424689157993532961922
62467957194401269043877107275048102390895523597457
23189706772547915061505504953922979530901129967519
86188088225875314529584099251203829009407770775672
11306739708304724483816533873502340845647058077308
82959174767140363198008187129011875491310547126581
97623331044818386269515456334926366572897563400500
42846280183517070527831839425882145521227251250327
55121603546981200581762165212827652751691296897789
32238195734329339946437501907836945765883352399886
75506164965184775180738168837861091527357929701337
62177842752192623401942399639168044983993173312731
32924185707147349566916674687634660915035914677504
99518671430235219628894890102423325116913619626622
73267460800591547471830798392868535206946944540724
76841822524674417161514036427982273348055556214818
97142617910342598647204516893989422179826088076852
87783646182799346313767754307809363333018982642090
10848802521674670883215120185883543223812876952786
71329612474782464538636993009049310363619763878039
62184073572399794223406235393808339651327408011116
66627891981488087797941876876144230030984490851411
60661826293682836764744779239180335110989069790714
85786944089552990653640447425576083659976645795096
66024396409905389607120198219976047599490197230297
64913982680032973156037120041377903785566085089252
16730939319872750275468906903707539413042652315011
94809377245048795150954100921645863754710598436791
78639167021187492431995700641917969777599028300699
15368713711936614952811305876380278410754449733078
40789923115535562561142322423255033685442488917353
44889911501440648020369068063960672322193204149535
41503128880339536053299340368006977710650566631954
81234880673210146739058568557934581403627822703280
82616570773948327592232845941706525094512325230608
22918802058777319719839450180888072429661980811197
77158542502016545090413245809786882778948721859617
72107838435069186155435662884062257473692284509516
20849603980134001723930671666823555245252804609722
53503534226472524250874054075591789781264330331690

*/		
		String[] temp1 =new String[100];
		
		temp1[0] = "37107287533902102798797998220837590246510135740250"; 
		temp1[1] = "46376937677490009712648124896970078050417018260538"; 
		temp1[2] = "74324986199524741059474233309513058123726617309629"; 
		temp1[3] = "91942213363574161572522430563301811072406154908250"; 
		temp1[4] = "23067588207539346171171980310421047513778063246676"; 
		temp1[5] = "89261670696623633820136378418383684178734361726757"; 
		temp1[6] = "28112879812849979408065481931592621691275889832738"; 
		temp1[7] = "44274228917432520321923589422876796487670272189318"; 
		temp1[8] = "47451445736001306439091167216856844588711603153276"; 
		temp1[9] = "70386486105843025439939619828917593665686757934951"; 
		temp1[10] = "62176457141856560629502157223196586755079324193331";
		temp1[11] = "64906352462741904929101432445813822663347944758178";
		temp1[12] = "92575867718337217661963751590579239728245598838407";
		temp1[13] = "58203565325359399008402633568948830189458628227828";
		temp1[14] = "80181199384826282014278194139940567587151170094390";
		temp1[15] = "35398664372827112653829987240784473053190104293586";
		temp1[16] = "86515506006295864861532075273371959191420517255829";
		temp1[17] = "71693888707715466499115593487603532921714970056938";
		temp1[18] = "54370070576826684624621495650076471787294438377604";
		temp1[19] = "53282654108756828443191190634694037855217779295145";
		temp1[20] = "36123272525000296071075082563815656710885258350721";
		temp1[21] = "45876576172410976447339110607218265236877223636045";
		temp1[22] = "17423706905851860660448207621209813287860733969412";
		temp1[23] = "81142660418086830619328460811191061556940512689692";
		temp1[24] = "51934325451728388641918047049293215058642563049483";
		temp1[25] = "62467221648435076201727918039944693004732956340691";
		temp1[26] = "15732444386908125794514089057706229429197107928209";
		temp1[27] = "55037687525678773091862540744969844508330393682126";
		temp1[28] = "18336384825330154686196124348767681297534375946515";
		temp1[29] = "80386287592878490201521685554828717201219257766954";
		temp1[30] = "78182833757993103614740356856449095527097864797581";
		temp1[31] = "16726320100436897842553539920931837441497806860984";
		temp1[32] = "48403098129077791799088218795327364475675590848030";
		temp1[33] = "87086987551392711854517078544161852424320693150332";
		temp1[34] = "59959406895756536782107074926966537676326235447210";
		temp1[35] = "69793950679652694742597709739166693763042633987085";
		temp1[36] = "41052684708299085211399427365734116182760315001271";
		temp1[37] = "65378607361501080857009149939512557028198746004375";
		temp1[38] = "35829035317434717326932123578154982629742552737307";
		temp1[39] = "94953759765105305946966067683156574377167401875275";
		temp1[40] = "88902802571733229619176668713819931811048770190271";
		temp1[41] = "25267680276078003013678680992525463401061632866526";
		temp1[42] = "36270218540497705585629946580636237993140746255962";
		temp1[43] = "24074486908231174977792365466257246923322810917141";
		temp1[44] = "91430288197103288597806669760892938638285025333403";
		temp1[45] = "34413065578016127815921815005561868836468420090470";
		temp1[46] = "23053081172816430487623791969842487255036638784583";
		temp1[47] = "11487696932154902810424020138335124462181441773470";
		temp1[48] = "63783299490636259666498587618221225225512486764533";
		temp1[49] = "67720186971698544312419572409913959008952310058822";
		temp1[50] = "95548255300263520781532296796249481641953868218774";
		temp1[51] = "76085327132285723110424803456124867697064507995236";
		temp1[52] = "37774242535411291684276865538926205024910326572967";
		temp1[53] = "23701913275725675285653248258265463092207058596522";
		temp1[54] = "29798860272258331913126375147341994889534765745501";
		temp1[55] = "18495701454879288984856827726077713721403798879715";
		temp1[56] = "38298203783031473527721580348144513491373226651381";
		temp1[57] = "34829543829199918180278916522431027392251122869539";
		temp1[58] = "40957953066405232632538044100059654939159879593635";
		temp1[59] = "29746152185502371307642255121183693803580388584903";
		temp1[60] = "41698116222072977186158236678424689157993532961922";
		temp1[61] = "62467957194401269043877107275048102390895523597457";
		temp1[62] = "23189706772547915061505504953922979530901129967519";
		temp1[63] = "86188088225875314529584099251203829009407770775672";
		temp1[64] = "11306739708304724483816533873502340845647058077308";
		temp1[65] = "82959174767140363198008187129011875491310547126581";
		temp1[66] = "97623331044818386269515456334926366572897563400500";
		temp1[67] = "42846280183517070527831839425882145521227251250327";
		temp1[68] = "55121603546981200581762165212827652751691296897789";
		temp1[69] = "32238195734329339946437501907836945765883352399886";
		temp1[70] = "75506164965184775180738168837861091527357929701337";
		temp1[71] = "62177842752192623401942399639168044983993173312731";
		temp1[72] = "32924185707147349566916674687634660915035914677504";
		temp1[73] = "99518671430235219628894890102423325116913619626622";
		temp1[74] = "73267460800591547471830798392868535206946944540724";
		temp1[75] = "76841822524674417161514036427982273348055556214818";
		temp1[76] = "97142617910342598647204516893989422179826088076852";
		temp1[77] = "87783646182799346313767754307809363333018982642090";
		temp1[78] = "10848802521674670883215120185883543223812876952786";
		temp1[79] = "71329612474782464538636993009049310363619763878039";
		temp1[80] = "62184073572399794223406235393808339651327408011116";
		temp1[81] = "66627891981488087797941876876144230030984490851411";
		temp1[82] = "60661826293682836764744779239180335110989069790714";
		temp1[83] = "85786944089552990653640447425576083659976645795096";
		temp1[84] = "66024396409905389607120198219976047599490197230297";
		temp1[85] = "64913982680032973156037120041377903785566085089252";
		temp1[86] = "16730939319872750275468906903707539413042652315011";
		temp1[87] = "94809377245048795150954100921645863754710598436791";
		temp1[88] = "78639167021187492431995700641917969777599028300699";
		temp1[89] = "15368713711936614952811305876380278410754449733078";
		temp1[90] = "40789923115535562561142322423255033685442488917353";
		temp1[91] = "44889911501440648020369068063960672322193204149535";
		temp1[92] = "41503128880339536053299340368006977710650566631954";
		temp1[93] = "81234880673210146739058568557934581403627822703280";
		temp1[94] = "82616570773948327592232845941706525094512325230608";
		temp1[95] = "22918802058777319719839450180888072429661980811197";
		temp1[96] = "77158542502016545090413245809786882778948721859617";
		temp1[97] = "72107838435069186155435662884062257473692284509516";
		temp1[98] = "20849603980134001723930671666823555245252804609722";
		temp1[99] = "53503534226472524250874054075591789781264330331690";
		
		
		int temp  = 0 ;
		
		int result[] = new int[50];
		
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 100; j++) {
				temp += Integer.parseInt(temp1[j].substring(temp1[j].length()-(i+1), temp1[j].length()-i)) ;
//				System.out.print(temp1[j].substring(temp1[j].length()-(i+1), temp1[j].length()-i) + " ");
			}
			System.out.println("\n"+i+":"+temp);
			
			result[i] = temp;
			
			temp =0;
		}
		long result2 = 0;
		int a = 49;
		while (true) {
			result2 = result2 *10;
			result2 += result[a];
			
			
			if (result2>=10000000000000L) {
				break;
			}else {
				a--;
			}
			
		}
		
		System.out.println(result2);

		
	}

}