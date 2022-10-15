class RoomDemo{
	public static void main(String args[]){
	    
		double v= Room.volume(10,20.0,30.0);
		System.out.println("Volume of room is= "+v);
	}
}
	
		 class Room{
			double height;
			double breadth;
			double width;
			
			static double volume(double height, double breadth, double width){
				double volume=(height*breadth*width);
				return volume;
			}
		}
