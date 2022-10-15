class Ex6{
public static void main(String args[]){
	Box box1 = new Box(5,6,7);
	Box box2 = new Box(8,9,10);
	
	box1.getArea();
	box1.getVolume();
	box2.getArea();
	box2.getVolume();
	
}
}
	class Box{
		int height;
		int width;
		int breadth;
	
		Box(){}
		
		Box(int height, int width, int breadth){
			this.height=height;
			this.width = width;
			this.breadth= breadth;
		}
			
			void getVolume(){
				int vol=(height*width*breadth);
				System.out.println("volume= "+vol);
			}
			
			void getArea(){
				int area=((2*height)+(2*width)+(2*breadth));
				System.out.println("area= "+area);
			}	
	}