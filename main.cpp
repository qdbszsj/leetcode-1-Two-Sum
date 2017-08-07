#include <iostream>
#include <bits/stdc++.h>
#include <ext/hash_map>
using namespace __gnu_cxx;
using namespace std;


//vector<int> twoSum(vector<int>& nums, int target) {
//
//    vector<int>output;
//    int cnt=nums.size();
//    hash_map<int,int>myHashMap;
//    hash_map<int,int>::iterator a;
//    for(int i=0;i<cnt;i++){
//        a=myHashMap.find(nums[i]);
//        if(a!=myHashMap.end()){
//            if(nums[i]*2==target){
//                output.push_back(a->second);
//                output.push_back(i);
//                return output;
//            }
//        }
//        else{
//            a=myHashMap.find(target-nums[i]);
//            if(a==myHashMap.end()){
//                myHashMap.insert(make_pair(nums[i],i));
//            }
//            else{
//                output.push_back(a->second);
//                output.push_back(i);
//                return output;
//            }
//        }
//    }
//}

vector<int> twoSum(vector<int>& nums, int target) {

    vector<int>output;
    int cnt=nums.size();
    for(int i=0;i<cnt;i++){
        for(int j=0;j<cnt;j++){
            if(j==i)continue;
            if(nums[i]+nums[j]==target){
                output.push_back(i);
                output.push_back(j);
                return output;
            }
        }
    }
}
int main()
{
    vector<int>input;
    vector<int>ans;
    for(int i=0;i<3;i++){
        int fuck;
        cin>>fuck;
        input.push_back(fuck);
    }

    ans=twoSum(input,9);
    cout<<ans[0]<<" "<<ans[1]<<endl;
    return 0;
}
