# Last updated: 8/7/2025, 3:01:09 PM
class Solution:
    def reverse(self, x: int) -> int:
        
            if x>0:
                sum=0
                while x:
                    sum=sum*10+(x%10)
                    x//=10
                if sum>=-2147483648 and sum<=2147483647:
                    return sum
                else:
                    return 0
            else:
                
                sum=0
                m=-x
                while m:
                    sum=sum*10+(m%10)
                    m//=10
                m=-sum
                if m>=-2147483648 and m<=2147483647:
                    return m
                else:
                    return 0
       
            
                
    
        
            
        