public class SantoshException extends Exception{

  public SantoshException(){
    super(" Error: fullname is required ");
  }
  public SantoshException(String message){
  super(message);
 }
}