package objectOrientated;

public class RoomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomClass closet=new RoomClass();
		RoomClass kitchen=new RoomClass();
		kitchen=closet;
		RoomClass basement=new RoomClass();
		closet=basement;
		closet.area();
	}

}
