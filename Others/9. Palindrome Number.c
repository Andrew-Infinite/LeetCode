bool isPalindrome(int x){
    if (x<0){
        return false;
    }
    if(x<10){
        return true;
    }
    int sizeX=(int)(log10(x)+2);
    char strX[sizeX];
    sprintf(strX,"%d",x);
    
    
    for(int i=0;i<sizeX/2;i++){
        if(strX[i]!=strX[sizeX-i-2]){
            return false;
        }
    }
    return true;
}