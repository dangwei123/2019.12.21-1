给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> Row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||i==j){
                    Row.add(1);
                }else{
                    Row.add(0);
                }
            }
            res.add(Row);
        }

        for(int i=2;i<numRows;i++){
            for(int j=1;j<i;j++){
                List<Integer> cur=res.get(i);
                List<Integer> pre=res.get(i-1);
                cur.set(j,pre.get(j)+pre.get(j-1));
            }
        }
        return res;
    }
}