// Last updated: 8/7/2025, 2:43:35 PM
class Spreadsheet {
    HashMap<String,Integer> hmap;
    public Spreadsheet(int rows) {
        hmap=new HashMap<>();
    }
    
    public void setCell(String cell, int value) {
        hmap.put(cell,value);
    }
    
    public void resetCell(String cell) {
        hmap.put(cell,0);
    }
    
    public int getValue(String formula) {
        int n= formula.length();
        int i=1;
        while(formula.charAt(i)!='+') i++;
        String a=formula.substring(1,i), b=formula.substring(i+1);
        //System.out.println (a.charAt(0)+" ");
        int val1=0,val2=0;
        if(a.charAt(0)>='0' && a.charAt(0)<='9') val1=Integer.parseInt (a);
        else if(hmap.containsKey(a)) val1=hmap.get(a);

        if(b.charAt(0)>='0' && b.charAt(0)<='9') val2=Integer.parseInt(b);
        else if(hmap.containsKey(b)) val2=hmap.get(b);
        //System.out.println (a+" "+b);
        return val1+val2;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */