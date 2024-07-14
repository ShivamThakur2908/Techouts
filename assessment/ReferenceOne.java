package assessment;

public class ReferenceOne {
	private String name;
	private int age;
	private int x,y;
	public ReferenceOne(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public ReferenceOne(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this)
		{
			return true;
		}
		if(!(obj instanceof ReferenceOne))
		{
			return false;
		}
		ReferenceOne refer = (ReferenceOne) obj;
		return this.x == refer.x && this.y == refer.y;
	}
}
