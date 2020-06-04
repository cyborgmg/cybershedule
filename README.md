import br.com.dummy.shedule.Shedulable;
import br.com.dummy.shedule.Shedule;

public class SheduleMain implements Shedulable{
	
	Shedule shedule;

	public static void main(String[] args) {
		
		SheduleMain sheduleMain = new SheduleMain();
		
		sheduleMain.shedule = new Shedule(sheduleMain, 45);
		sheduleMain.shedule.start("SheduleMain");
		
	}

	@Override
	public void execute() {
		
		try{ Thread.sleep(500000); } catch (InterruptedException e) {}
		
		System.out.println("*********************execute ");
		
	}

}