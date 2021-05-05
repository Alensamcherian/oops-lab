public class Room
{
	int roomno;
	String roomtype;
	int roomarea;
	public Room()
	{
		roomno=10;
		roomtype="small";
		roomarea=650;
	}
	public Room(int rn,String tpe,int ar)
	{
		roomno=rn;
		roomtype=tpe;
		roomarea=ar;
	}
	void display()
	{
		System.out.println("room details=");
		System.out.println(roomno);
		System.out.println(roomtype);
		System.out.println(roomarea);
	}
	public static void main(String args[])
	{
		Room r=new Room();
		r.display();
		Room r2=new Room(36,"square",450);
		r2.display();
	}
}