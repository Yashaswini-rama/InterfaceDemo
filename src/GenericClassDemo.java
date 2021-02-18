class Sample<T>  //generic class
{
	private T data;
	
	

	public Sample(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
public class GenericClassDemo {

	public static void main(String[] args) {

		Sample<Integer> s1=new Sample<Integer>(15);
		//s1.setData(15);
		System.out.println("Display from generic class of type integer"+s1.getData());
		
		Sample<String> s2=new Sample<String>("Java");
		//s2.setData(15);
		System.out.println("Display from generic class of type string"+s2.getData());
		
		Sample<Float> s3=new Sample<Float>(120.35f);
		//s3.setData(15);
		System.out.println("Display from generic class of type integer"+s3.getData());
		
	}

}
