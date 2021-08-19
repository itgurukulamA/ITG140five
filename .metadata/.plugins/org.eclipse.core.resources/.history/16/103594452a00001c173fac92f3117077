class Table{
	synchronized void printTable(int n) {
		for(int i=1;i<5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class abc extends Thread{
	Table t;
	abc(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(5);
	}
}
class def extends Thread{
	Table t;
	def(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(100);
	}
}

public class TestSynchronization {

	public static void main(String[] args) {
		Table obj = new Table();
		abc t1=new abc(obj);
		def t2=new def(obj);
		t1.start();
		t2.start();
	}

}
