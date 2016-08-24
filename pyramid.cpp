#include <iostream>
#include <string>
using namespace std;

int main()
{
        int num;
        cin>>num;
        int space=num-1;
        for(int i = 0; i < num; i++)
        {
            for(int j = 0; j < space;j++){
                    cout<<" ";
                   
            }
             space--;
            for(int k = 0; k < (2*i)+1 ;k++){
                    cout<<"*";
                    }
            cout<<endl;
        }
}
