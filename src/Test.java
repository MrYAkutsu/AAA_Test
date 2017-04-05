import java.math.BigDecimal;

public class Test {
	public static void main(String[] args) {
		// ----------------------------------------
		// 計算処理（整数（short型））
		// ----------------------------------------
		try {
			// 初期処理
			short nNumber = 0;
			// 計算処理（0.3を10回加算）
			for (int i = 0; i < 10; i++) {
				nNumber += (short) 0.3;
			}
			// 結果表示（正常時）
			System.out.println("結果（short型）     ：" + String.valueOf(nNumber));
		} catch (Exception e) {
			// 結果表示（エラー発生時）
			System.out.println("結果です。（short型）     ：" + e.toString());
		}
		// ----------------------------------------
		// 計算処理（整数（int型））
		// ----------------------------------------
		try {
			// 初期処理
			int nNumber = 0;
			// 計算処理（0.3を10回加算）
			for (int i = 0; i < 10; i++) {
				nNumber += (int) 0.3;
			}
			// 結果表示（正常時）
			System.out.println("結果（int型）       ：" + String.valueOf(nNumber));
		} catch (Exception e) {
			// 結果表示（エラー発生時）
			System.out.println("結果（int型）       ：" + e.toString());
		}
		// ----------------------------------------
		// 計算処理（整数（long型））
		// ----------------------------------------
		try {
			// 初期処理
			long nNumber = 0;
			// 計算処理（0.3を10回加算）
			for (int i = 0; i < 10; i++) {
				nNumber += (long) 0.3;
			}
			// 結果表示（正常時）
			System.out.println("結果（long型）      ：" + String.valueOf(nNumber));
		} catch (Exception e) {
			// 結果表示（エラー発生時）
			System.out.println("結果（long型）      ：" + e.toString());
		}
		// ----------------------------------------
		// 計算処理（浮動小数点（float型））
		// ----------------------------------------
		try {
			// 初期処理
			float nNumber = 0;
			// 計算処理（0.3を10回加算）
			for (int i = 0; i < 10; i++) {
				nNumber += (float) 0.3;
			}
			// 結果表示（正常時）
			System.out.println("結果（float型）     ：" + String.valueOf(nNumber));
		} catch (Exception e) {
			// 結果表示（エラー発生時）
			System.out.println("結果（float型）     ：" + e.toString());
		}
		// ----------------------------------------
		// 計算処理（浮動小数点（double型））
		// ----------------------------------------
		try {
			// 初期処理
			double nNumber = 0;
			// 計算処理（0.3を10回加算）
			for (int i = 0; i < 10; i++) {
				nNumber += (double) 0.3;
			}
			// 結果表示（正常時）
			System.out.println("結果（double型）    ：" + String.valueOf(nNumber));
		} catch (Exception e) {
			// 結果表示（エラー発生時）
			System.out.println("結果（double型）    ：" + e.toString());
		}
		// ----------------------------------------
		// 計算処理（固定小数点（BigDecimal型））
		// ----------------------------------------
		try {
			// 初期処理
			BigDecimal nNumber = new BigDecimal((double) 0);
			// 計算処理（0.3を10回加算）
			for (int i = 0; i < 10; i++) {
				nNumber = nNumber.add(new BigDecimal((double) 0.3));
			}
			// 結果表示（正常時）
			System.out.println("結果（BigDecimal型）：" + nNumber.toString());
		} catch (Exception e) {
			// 結果表示（エラー発生時）
			System.out.println("結果（BigDecimal型）：" + e.toString());
		}
		// ----------------------------------------
		// 計算処理（固定小数点（BigDecimal型））
		// ----------------------------------------
		try {
			// 初期処理
			BigDecimal nNumber = new BigDecimal("0");
			// 計算処理（0.3を10回加算）
			for (int i = 0; i < 10; i++) {
				nNumber = nNumber.add(new BigDecimal("0.3"));
			}
			// 結果表示（正常時）
			System.out.println("結果（BigDecimal型）：" + nNumber.toString());
		} catch (Exception e) {
			// 結果表示（エラー発生時）
			System.out.println("結果（BigDecimal型）：" + e.toString());
		}
		// ----------------------------------------
		// 計算処理（文字列（String型））
		// ----------------------------------------
		try {
			// 初期処理
			String sNumber = "0";
			// 計算処理（0.3を10回加算）
			for (int i = 0; i < 10; i++) {
				sNumber += "0.3";
			}
			// 結果表示（正常時）
			System.out.println("結果（String型）    ：" + sNumber);
		} catch (Exception e) {
			// 結果表示（エラー発生時）
			System.out.println("結果（String型）    ：" + e.toString());
		}
		System.exit(0);
	}
}