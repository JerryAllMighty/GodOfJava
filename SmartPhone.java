public class SmartPhone {
	private String status;
	private String phoneType;
	private String owner;


	public String getStatus(){
		return this.status;
	}
	
	public static void main(String[] args){
		SmartPhone sm = new SmartPhone();
		String status = sm.getStatus();
		System.out.print(status);
	}
}