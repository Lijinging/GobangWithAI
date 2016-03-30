
public class chessSituation {
	public enum chessType{c_double,c_signle,c_jump,c_dead};
	public chessType type;
	public int continueN;
	public chessSituation(){
		this.continueN=0;
		this.type=chessType.c_double;
	}
}
