package Practice_Thread;

public class Runnble implements Runnable{
	
	public String name;
	public int idNo;
	public int marksObtain;
	public int totalMarks;
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setIdNo(int idNo) {
		this.idNo=idNo;
	}
	
	public int getIdNo() {
		return idNo;
	}
	
	public void setMarksObtain(int marksObtain) {
		this.marksObtain=marksObtain;
	}
	
	public int getMarksObtain() {
		return marksObtain;
	}
	
	public void setTotalMarks(int totalMarks) {
		this.totalMarks=totalMarks;
	}
	
	public int getTotalMarks() {
		return totalMarks;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int a=getMarksObtain()*100;
		int b=a/getTotalMarks()
		
	}
	
	


	}

}
