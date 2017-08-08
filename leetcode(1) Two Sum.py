
def twoSum(nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        ans=[]
        hashmap={}
        cnt=len(nums)
        for i in range(cnt):
            temp=hashmap.get(nums[i])
            if temp!=None:
                if nums[i]*2==target:
                    ans.append(temp)
                    ans.append(i)
                    return ans
            else:
                temp = hashmap.get(target - nums[i])
                if temp!=None:
                    ans.append(hashmap[target-nums[i]])
                    ans.append(i)
                    return ans
                else:
                    hashmap[nums[i]] = i;




NUMS=[]
for i in range(4):
    fuck=input()
    NUMS.append(fuck)
    print "fuck"

print NUMS
ANS=twoSum(NUMS,9)
print ANS[0]
print ANS[1]

a=input()