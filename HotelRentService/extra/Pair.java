package extra;

public class Pair<K,V> {
	K roomNo;
	V c;
	public Pair(K roomNo, V c) {
		this.roomNo = roomNo;
		this.c = c;
	}
	public K getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(K roomNo) {
		this.roomNo = roomNo;
	}
	public V getC() {
		return c;
	}
	public void setC(V c) {
		this.c = c;
	}
}
