int inserir (int k, int x, int n, int v[]) {
 int j;
 j = n;
 while (j > k) {
   j = j - 1;
   v[j] = v[j-1];
 };
 v[k] = x;
 return n + 1;
}

int remover (int k, int n, int v[]) {
  int j;
  j = k + 1;
  while(j < n) {
    j = j + 1;
    v[j-1] = v[j]
  };
  return n-1;
}
