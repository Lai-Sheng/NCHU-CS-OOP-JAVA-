package app1;

public class book_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer pt = new Printer(); //將printer類別建立一個叫做pt的物件 這是語法 類別 物件名=new 建構子
		pt.sno=1234; //將1234指定給pt物件的sno屬性(剛剛下面有說sno是一個屬性) 屬性語法
		pt.hello();  //執行pt物件的hello語法 下面有說hello方法就是要印出序號
	}

}
	class Printer{    //類別Printer其實在這裡定義了! 所以剛剛別緊張
		public int sno;  //定義類別的整數屬性 
		public void hello() {   //這是Printer類別的一個公開方法，hello()是方法 (Java沒有函數)
		System.out.println("你好,Java");
		System.out.println("序號:"+sno);
		}
	}
