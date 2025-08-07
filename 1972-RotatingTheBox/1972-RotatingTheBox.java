// Last updated: 8/7/2025, 2:49:06 PM
class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int row=box.length , col=box[0].length;
        char [][] res=new char [col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++) res[i][j]='.';
        }
        HashMap<Integer,List<List<Integer>>> hmap=new HashMap<>();
        for(int i=0;i<row;i++){
            int noOfStones=0;
            for(int j=0;j<col;j++){
                if(box[i][j]=='#') noOfStones++;
                //if(box[i][j]=='.') res[j][i]='.';
                if(box[i][j]=='*'){
                    int n= row-1-i;
                    res[j][n]='*';
                    List<Integer> a=new ArrayList<>();
                    a.add(j);
                    a.add(noOfStones);
                    noOfStones =0;
                    if(!hmap.containsKey(n)){
                        List<List<Integer>> ans=new ArrayList <>();
                        ans.add (a);
                        hmap.put (n,ans);
                    }else{
                        List<List<Integer>> ans=hmap.get (n);
                        ans.add (a);
                        hmap.put (n,ans);


                    }


                }
            }
            if(noOfStones!=0){
                int n=row-1-i;
                if(!hmap.containsKey (n)){
                    List<List<Integer>> ans=new ArrayList<>();
                    List<Integer> a=new ArrayList <>();
                    a.add (col);
                    a.add (noOfStones);
                    ans.add (a);
                    hmap.put (n,ans );

                }else{
                    List<List<Integer>> ans=hmap.get (n);
                    List <Integer > a=new ArrayList <>();
                    a.add (col);a.add(noOfStones);
                    ans.add (a);
                    hmap.put (n,ans );
                }
            }

        }
        for(int n: hmap.keySet ()){
            System.out.println(n+" "+ hmap.get (n));
        }
        for(int coln:hmap.keySet ()){
            List<List<Integer>> ans= hmap.get (coln);
            for(List<Integer> ll: ans){
                int i= ll.get(0)- 1, numb=ll.get(1),j=coln-1 ;
                while(numb>0){
                    res[i][coln]='#';
                    numb--;
                    i--;
                }
            }
        }
        
        return res;

    }
}

















