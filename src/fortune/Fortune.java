package fortune;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fortune {

	public static void main(String[] args){
		int innum = 0;
		String[] color = {"白", "黒", "赤", "緑", "黄", "青", "茶", "紫", "橙", "灰"};
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
			
			for(int i = 0; ; ) {
				
				if(i == 0) {
					System.out.print("1～100までの範囲の整数値を入力してください : ");
					innum = Integer.parseInt(br.readLine());
					i++;
				} else {
					System.out.print("1～100までの範囲の整数値を再度入力してください : ");
					innum = Integer.parseInt(br.readLine());
				}
				
				if(1 <= innum && innum <= 100) {
					break;
				}
			}
		} catch (IOException e) {
			System.out.println("入力処理の失敗が発生しました。");
		}
		
		double fn1 = innum * 10;
		
		while(10 <= fn1) {
			fn1 = fn1 / (Math.random() * 10);
		}
		
		System.out.print("おみくじの結果は");
		
		try {
			
			for(int j = 0; j < 3; j++) {
				System.out.print(".");
				Thread.sleep(1000);
			}
			
			if(fn1 >= 8) {
				System.out.println("大吉！");
			} else if(fn1 >= 6) {
				System.out.println("中吉！");
			} else if(fn1 >= 4) {
				System.out.println("小吉！");
			} else if(fn1 >= 2) {
				System.out.println("吉");
			} else {
				System.out.println("凶");
			}
			
			int luckycolornum = ((int)(fn1 * 10)) % 10;
			
			System.out.println("ラッキーカラーは " + color[luckycolornum] + "色です！");
			
		} catch(InterruptedException e) {
			System.out.println("割り込みが発生しました。");
		}

	}

}
