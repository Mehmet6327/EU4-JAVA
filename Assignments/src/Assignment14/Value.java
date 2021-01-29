package Assignment14;

public class Value {
    /*    Question-8
     */
    boolean modifiedFlag;
    boolean objCreated;
    int lastValueP;
    int lastValueQ;
    
    public Value(int p) {
        objCreated = true;
        lastValueP = p;
    }
    
    public Value() {
    
    }
    
    public boolean wasModified() {
        return modifiedFlag;
    }
    
    public int getVal() {
        if (modifiedFlag) {
            return lastValueQ;
        } else if (objCreated) {
            return lastValueP;
        } else {
            return 0;
        }
    }
    
    public void setVal(int q) {
        modifiedFlag = true;
        lastValueQ = q;
    }
}