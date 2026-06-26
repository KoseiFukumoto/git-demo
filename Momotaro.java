public class Momotaro {
	public static void main(String[] args) {
		System.out.println("少し未来のお話。");

		// 誰が居た？
		String name1 = "おじいさん"; // 1
		String name2 = "おばあさん"; // 2
		System.out.println(name1 + "と" + name2 + "が暮らしていました。");

		// name1はどこへ行った？
		String place1 = "山"; // 3
		System.out.print("ある日," + name1 + "は" + place1 + "へ");

		// name1は何をした？
		String do1 = "芝刈り"; // 4
		System.out.println(do1 + "に,");

		// name2はどこへ行った？
		String place2 = "川"; // 5
		System.out.print(name2 + "は" + place2 + "へ");

		// name2は何をした？
		String do2 = "洗濯"; // 6
		System.out.println(do2 + "をしに行きました。");

		// 何が現れた？
		String thing = "桃"; // 7
		System.out.println(name2 + "が" + place2 + "で" + do2 + "をしていると大きな"+ thing + "が流れてきました。");
		System.out.println(name2 + "は" + thing + "を家に持って帰って割ってみることにしました。");

		System.out.println(thing + "を割ろうとすると中から元気な男の子が出てきました。");
		System.out.println("二人はその子を" + thing + "太郎と名付け、大切に育てました。");

		// 敵は誰？
		String enemy = "鬼"; // 8
		System.out.println("やがて" + thing + "太郎は立派に育ち" + enemy + "退治に出かけました。");

		// 誰を味方にした？
		String ally = "キジ"; // 9
		System.out.println(thing + "太郎は道中でイヌ、サル、" + ally + "を仲間にしました。");
		System.out.println(thing + "太郎達は力を合わせ見事" + enemy + "に勝利しました！");

		// 最後に何をした？
		String oti = "幸せに暮らしました。"; // 10
		System.out.println(thing + "太郎は仲間とともに村へ帰り、" + oti);
		System.out.println("めでたしめでたし");

	}
}
