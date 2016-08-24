#include<iostream>
using namepsace std;
int main()
{
  int row,col,mat[1000];
  cin>>row>>col;
  for(int i = 0; i < row; i++)
  {
    for(int j = 0; j < col; j++)
    {
      cin>>mat[i][j];
    }
  }
  int sum = 0;
  for(int i = 1; i < row-1; i++)
  {
    for(int j = 1; j < col-1; j++)
    {
      sum = sum + mat[i][j];
    }
  }
  cout<<sum;
}
