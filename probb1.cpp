#include<iostream>

using namespace std;

int partition(int a[], int l, int r){
  int p, i, j, t;
  p = l;
  i = l;
  j = r;
  while(i<j){
   while((a[ i ] <= a[ p ]) && (i<r)){
     i++;
   }
   while(a[ j ] > a[ p ]){
     j--;
   }
   if(i<j){
    t=a[ i ];
    a[ i ] = a[ j ];
    a[ j ] = t;
    }
  }
  t=a[ p ];
  a[ p ] = a[ j ];
  a[ j ] = t;
  return j;
}
 void quicksort(int a[], int l, int r){
  int s;
  if(l < r){
   s=partition(a,l,r);
   quicksort(a, l, s-1);
   quicksort(a, s+1, r);
  }
}

int main(){
 int t,n;
 unsigned long long int ans;
 cin>>t;
 while(t--){
  cin>>n;
  ans=0;
  int arr[n];
  for(int i=0;i<n;++i){
   cin>>arr[i];
   }
  quicksort(arr,0,n-1);
  for(int i=1;i<n-1;++i){

     ans+=((arr[i]*arr[i-(arr[i]-1)])+(arr[i]*arr[i+1])-(arr[i+1]*arr[i-(arr[i]-1)]));
  }
    cout<<ans<<"\n";
 }
return 0;
}
