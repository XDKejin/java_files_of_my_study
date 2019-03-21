
/**
 *	this class is used for testing anonymous class
 * 
 * */

public class Parcel{
	
	
	public Wrapping wrapping(int x){
		//Base constructor call :
		return new Wrapping(x){
			public int value(){
				return super.value()*47;
			}
		};
	}//Semicolon required





	public static void main(String[] args){
		Parcel p = new Parcel();
		Wrapping w = p.wrapping(10);
		
	}


}


