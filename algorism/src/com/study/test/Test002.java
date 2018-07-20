package com.study.test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Test002 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		String temp1 = "00208915M2002100020180720143848                                                                                                       00E                                                                                   RQ1753104323        17032716550816B100454b6bd07e527d5321c9212e3e277d44636bbe7cef3 31TEST                          0264879306     0260209533     16943 경기 용인시 수지구 광교마을로 90 상현동,광교마을휴먼시아41단지 4104동 2104호                                                                                                                            0122017040520170405140000000003250000020180716                                  0201윤재중                        820823        )              01040410074    16943 경기 용인시 수지구 광교마을로 904104동 2104호 (상현동,광교마을휴먼>시아41단지)                                                                                                                           한국토지주택공사                                                          02                                                                                                                                                                                                                                                                                                                                                                  00 00우리용인            양형준              031-8009-0055  031)8009-0057  본점                                                                  112018-07-16 사후전송 테스트 1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ";
		String temp2 = "00208915M2002100020180720092421                                                                                                       00E                                                                                   RQ1869133224        18021216043132B10045934b07d350d3eb2990d6f31ee74665be830225851 11TEST                          0264879306                    03711 서울 서대문구 가재울미래로 2 남가좌동,DMC파크뷰자이 103동 404호                                                                                                                                         0112017071120170711110000000005630000020170706                                  0201조세호                        591221        02)112211      01089851907    03112 서울 서대문구 가재울로 45111-910 (남가좌동,남가우동미래아파트)                                                                                                                                          (주)Test                                                                  02                                                                                                                                                                                                                                                                                                                                                                  00 00서서울              김태우              02-374-8054    02)306-8845    남가좌                                                                11사후 의뢰와 전문 비교 테스트조사나가지 말아주세요                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ";

		// charsets(temp1);
		// charsets(temp2);
		System.out.println("정상");
		textEncodingLength(temp1);
		System.out.println("==========================");
		System.out.println("==========================");
		System.out.println("==========================");
		System.out.println("==========================");
		System.out.println("==========================");
		System.out.println("==========================");
		System.out.println("==========================");
		
		System.out.println("오작동");
		textEncodingLength(temp2);

	}

	public static void textEncodingLength(String temp) {
		String[] charsets = { "UTF-8", "EUC-KR", "ISO-8859-1", "CP1251",
				"KSC5601" };
		for (int i = 0; i < charsets.length; i++) {
			try {
				byte[] b = temp.getBytes(charsets[i]);
				System.out.println("=========" + charsets[i] + "=========");
				System.out.println("문자열 길이 : " + new String(b).length());
				System.out.println("바이트 길이 : " + b.length);
				// System.out.println("");
				System.out.println("=========" + charsets[i] + "=========");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void charsets(String text)
			throws UnsupportedEncodingException {
		String encode = "";
		String[] charsets = { "UTF-8", "EUC-KR", "ISO-8859-1", "CP1251",
				"KSC5601" };
		for (String charset : charsets) {
			encode = URLEncoder.encode(text, charset);
			// log.info("origin["+text+"], "+"encoded["+encode+"], charset["+charset+"]"
			// );
			if (text.length() < 30) {
				System.out.println("origin[" + text + "], " + "encoded["
						+ encode + "], charset[" + charset + "]");
			} else {
				System.out.println("origin[" + text + "], " + "charset["
						+ charset + "]");
			}

		}
	}

}
