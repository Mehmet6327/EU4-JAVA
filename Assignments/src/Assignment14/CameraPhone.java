package Assignment14;

public class CameraPhone {
	    /*    Question-12
	
	     */
	    
	    int imageSize;
	    int memorySize;
	    
	    public CameraPhone(int imageSize, int memorySize) {
	        this.imageSize = imageSize;
	        this.memorySize = memorySize;
	    }
	    public int numPictures(){
	        return (memorySize * 1024) / imageSize;
	    }
	
}
