package exceptions;

public class myProcessor {
	
	public String processor(String payload){
		if(true){
			throw new  RuntimeException("In java excpiont");
	}
		return "success";

}
}