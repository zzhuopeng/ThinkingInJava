package chapter07;

/**
 * 
 * @ClassName: ExtendsConstructor
 * @Description: 7.2 继承：初始化基类：带参数的构造器（需要显示使用super）
 * @author zzp
 * @date 2018年9月1日 上午10:20:10
 *
 */
public class ExtendsConstructor extends BoardGame {
	public ExtendsConstructor() {
		super(11);
		System.out.println("ExtendsConstructor Constructor");
	}

	public static void main(String[] args) {
		ExtendsConstructor mExtendsConstructor = new ExtendsConstructor();
	}
}

class BoardGame extends Game {

	public BoardGame() {
		System.out.println("BoardGmae Constructor");
	}

	public BoardGame(int i) {
		super(1);
		System.out.println("BoardGmae Constructor" + i);
		// 需要调用父类的有参构造函数的话 必须在第一行
		// super(1);
	}
}

class Game {

	public Game() {
		System.out.println("Game Constructor");
	}

	public Game(int i) {
		System.out.println("Game Constructor" + i);
	}
}