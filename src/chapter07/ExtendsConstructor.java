package chapter07;

/**
 * 
 * @ClassName: ExtendsConstructor
 * @Description: 7.2 �̳У���ʼ�����ࣺ�������Ĺ���������Ҫ��ʾʹ��super��
 * @author zzp
 * @date 2018��9��1�� ����10:20:10
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
		// ��Ҫ���ø�����вι��캯���Ļ� �����ڵ�һ��
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