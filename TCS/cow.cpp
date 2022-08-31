#include <bits/stdc++.h>
using namespace std;

int main() {
    int n,m,k,l;
    cin>>n>>m;
    
    vector<pair<int,int>> v1, v2;
    for(int i=0;i<n;i++){
        cin>>k>>l;
        v1.push_back({k,l});
    }
    for(int i=0;i<m;i++){
        cin>>k>>l;
        v2.push_back({k,l});
    }
    
    int d1=0,d2=0,i1=0,i2=0;
    
    int ans=0;
    
    while(i1<n && i2<m){
        if(v2[i2].second > v1[i1].second){
            ans = max(ans, v2[i2].second - v1[i1].second);
        }
        
        if((d1+v1[i1].first) < (d2+v2[i2].first)){
            d1+=v1[i1].first;
            i1++;
        }
        else if((d1+v1[i1].first) > (d2+v2[i2].first)){
            d2 += v2[i2].first;
            i2++;
        }
        else {
            d1+=v1[i1].first, d2+=v2[i2].first;
            i1++, i2++;
        }
    }
    
    cout<<ans<<endl;
    
    return 0;
}